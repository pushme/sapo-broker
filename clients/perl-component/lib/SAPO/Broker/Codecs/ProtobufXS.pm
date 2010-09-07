package SAPO::Broker::Codecs::ProtobufXS;

use SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom;
use SAPO::Broker::Messages;
use SAPO::Broker::Transport;
use Readonly;
use Carp qw(carp croak);

use strict;
use warnings;

Readonly::Scalar my $ENCODING_TYPE => 1;    #Protobuf encoding type

Readonly::Hash my %_string2kind => (
    'TOPIC'         => SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::DestinationType::TOPIC(),
    'QUEUE'         => SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::DestinationType::QUEUE(),
    'VIRTUAL_QUEUE' => SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::DestinationType::VIRTUAL_QUEUE(),
);

Readonly::Hash my %_kind2string => reverse(%_string2kind);

sub new {
    my ($class) = @_;
    return bless {}, $class;
}

sub name {
    return 'Protobuf';
}

sub _string2kind($) {
    my ($kind) = @_;

    my $res = $_string2kind{$kind};
    if ( defined $res ) {
        return $res;
    } else {
        croak("Unknown kind $kind");
    }
}

sub _kind2string($) {
    my ($kind) = @_;

    my $res = $_kind2string{$kind};
    if ( defined $res ) {
        return $res;
    } else {
        croak("Unknown kind $kind");
        return;
    }
}

sub serialize_publish($) {
    my ($message) = @_;

    local $message->{'destination_type'} = _string2kind( $message->{'destination_type'} );
    my $broker_message = $message->message();

    #XXX ugly kludge (is this needed in the protobuf codec?)
    if ( not defined $broker_message->expiration() ) {
        $broker_message->expiration(-1);
    }

    return SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom->new( {
            'action' => {
                'publish'     => $message,
                'action_type' => SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::Action::ActionType::PUBLISH()
            },
        } );

}

sub serialize_poll($) {
    my ($message) = @_;

    return SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom->new( {
            'action' => {
                'publish'     => $message,
                'action_type' => SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::Action::ActionType::POLL()
            },
        } );
}

sub parse_accepted($) {
    my ($action) = @_;

    return SAPO::Broker::Messages::Accepted( $action->accepted()->to_hashref );
}

sub serialize_acknowledge($) {
    my ($message) = @_;

    return SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom->new( {
            'action' => {
                'ack_message' => $message,

                'action_type' =>
                    SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::Action::ActionType::ACKNOWLEDGE_MESSAGE(),

            } } );
}

sub serialize_subscribe($) {
    my ($message) = @_;

    local $message->{'destination_type'} = _string2kind( $message->{'destination_type'} );

    return SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom->new( {
            'action' => {
                'subscribe'   => $message,
                'action_type' => SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::Action::ActionType::SUBSCRIBE()
            },
        } );
}

sub serialize_unsubscribe($) {
    my ($message) = @_;

    local $message->{'destination_type'} = _string2kind( $message->{'destination_type'} );

    return SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom->new( {
            'action' => {
                'unsubscribe' => $message,
                'action_type' => SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::Action::ActionType::UNSUBSCRIBE()
            },
        } );
}

sub parse_notification($) {
    my ($action) = @_;

    my $notification = SAPO::Broker::Messages::Notification->new( $action->notification()->to_hashref() );
    my $message      = $notification->message();
    $message->{'id'}           = $message->{'message_id'};
    $notification->{'message'} = SAPO::Broker::Messages::Message->new($message);

    #now cast the actual message containing the payload
    $notification->message( SAPO::Broker::Messages::Message->new($message) );
    return $notification;
}

sub parse_fault($) {
    my ($action) = @_;

    return SAPO::Broker::Messages::Fault( $action->fault()->to_hashref );
}

sub serialize_ping($) {
    my ($message) = @_;

    return SAPO::Broker::Codecs::Autogen::ProtobufXS::Ping->new( {
            'action' => {
                'ping'        => $message,
                'action_type' => SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::Action::ActionType::PING()
            },
        } );
}

sub parse_pong($) {
    my ($action) = @_;

    return SAPO::Broker::Messages::Pong( $action->pong()->to_hashref );
}

sub serialize_authentication($) {
    my ($message) = @_;

    return SAPO::Broker::Codecs::Autogen::ProtobufXS::Authentication->new( {
            'action' => {
                'auth'        => $message,
                'action_type' => SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::Action::ActionType::AUTH()
            },
        } );
}

my %__dispatch_serialize = (
    'SAPO::Broker::Messages::Publish'        => \&serialize_publish,
    'SAPO::Broker::Messages::Poll'           => \&serialize_poll,
    'SAPO::Broker::Messages::Acknowledge'    => \&serialize_acknowledge,
    'SAPO::Broker::Messages::Subscribe'      => \&serialize_subscribe,
    'SAPO::Broker::Messages::Unsubscribe'    => \&serialize_unsubscribe,
    'SAPO::Broker::Messages::Ping'           => \&serialize_ping,
    'SAPO::Broker::Messages::Authentication' => \&serialize_authentication,
);

my %__dispatch_deserialize = (
    SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::Action::ActionType::NOTIFICATION() => \&parse_notification,
    SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::Action::ActionType::FAULT()        => \&parse_fault,
    SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::Action::ActionType::PONG()         => \&parse_pong,
    SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom::Action::ActionType::ACCEPTED()     => \&parse_accepted,
);

sub serialize {
    my ( $self, $message ) = @_;

    #try to find the serializer
    #could use ref but I wan't to make this robust to serialize subclasses of broker messages
    #since there are few classes, iterating should not be much slower that using the hash table

    while ( my ( $class, $serializer ) = each(%__dispatch_serialize) ) {
        if ( $message->isa($class) ) {

            #reset the hash iterator
            scalar keys(%__dispatch_serialize);

            my $atom    = $serializer->($message);
            my $payload = $atom->pack();

            return SAPO::Broker::Transport::Message->new(
                type    => $ENCODING_TYPE,
                version => 1,
                payload => $payload
            );
        }
    }

    croak("Can't serialize $message");
    return;
} ## end sub serialize

sub __deserialize {
    my ( $self, $payload ) = @_;

    return SAPO::Broker::Codecs::Autogen::ProtobufXS::Atom->new($payload);
}

sub deserialize {
    my ( $self, $payload ) = @_;

    my $atom   = $self->__deserialize($payload);
    my $action = $atom->action();

    my $deserialize = $__dispatch_deserialize{ $action->action_type() };
    if ($deserialize) {
        return $deserialize->($action);
    } else {
        croak( "Unknown action_type " . $action->action_type() . ". Can't deserialize" );
        return;
    }
}

1;