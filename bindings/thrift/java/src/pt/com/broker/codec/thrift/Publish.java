/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package pt.com.broker.codec.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

class Publish implements TBase<Publish._Fields>, java.io.Serializable, Cloneable, Comparable<Publish> {
  private static final TStruct STRUCT_DESC = new TStruct("Publish");

  private static final TField ACTION_ID_FIELD_DESC = new TField("action_id", TType.STRING, (short)1);
  private static final TField DESTINATION_TYPE_FIELD_DESC = new TField("destination_type", TType.I32, (short)2);
  private static final TField DESTINATION_FIELD_DESC = new TField("destination", TType.STRING, (short)3);
  private static final TField MESSAGE_FIELD_DESC = new TField("message", TType.STRUCT, (short)4);

  public String action_id;
  /**
   * 
   * @see DestinationType
   */
  public DestinationType destination_type;
  public String destination;
  public BrokerMessage message;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ACTION_ID((short)1, "action_id"),
    /**
     * 
     * @see DestinationType
     */
    DESTINATION_TYPE((short)2, "destination_type"),
    DESTINATION((short)3, "destination"),
    MESSAGE((short)4, "message");

    private static final Map<Integer, _Fields> byId = new HashMap<Integer, _Fields>();
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byId.put((int)field._thriftId, field);
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      return byId.get(fieldId);
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new EnumMap<_Fields, FieldMetaData>(_Fields.class) {{
    put(_Fields.ACTION_ID, new FieldMetaData("action_id", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.DESTINATION_TYPE, new FieldMetaData("destination_type", TFieldRequirementType.DEFAULT, 
        new EnumMetaData(TType.ENUM, DestinationType.class)));
    put(_Fields.DESTINATION, new FieldMetaData("destination", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.MESSAGE, new FieldMetaData("message", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, BrokerMessage.class)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(Publish.class, metaDataMap);
  }

  public Publish() {
  }

  public Publish(
    DestinationType destination_type,
    String destination,
    BrokerMessage message)
  {
    this();
    this.destination_type = destination_type;
    this.destination = destination;
    this.message = message;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Publish(Publish other) {
    if (other.isSetAction_id()) {
      this.action_id = other.action_id;
    }
    if (other.isSetDestination_type()) {
      this.destination_type = other.destination_type;
    }
    if (other.isSetDestination()) {
      this.destination = other.destination;
    }
    if (other.isSetMessage()) {
      this.message = new BrokerMessage(other.message);
    }
  }

  public Publish deepCopy() {
    return new Publish(this);
  }

  @Deprecated
  public Publish clone() {
    return new Publish(this);
  }

  public String getAction_id() {
    return this.action_id;
  }

  public Publish setAction_id(String action_id) {
    this.action_id = action_id;
    return this;
  }

  public void unsetAction_id() {
    this.action_id = null;
  }

  /** Returns true if field action_id is set (has been asigned a value) and false otherwise */
  public boolean isSetAction_id() {
    return this.action_id != null;
  }

  public void setAction_idIsSet(boolean value) {
    if (!value) {
      this.action_id = null;
    }
  }

  /**
   * 
   * @see DestinationType
   */
  public DestinationType getDestination_type() {
    return this.destination_type;
  }

  /**
   * 
   * @see DestinationType
   */
  public Publish setDestination_type(DestinationType destination_type) {
    this.destination_type = destination_type;
    return this;
  }

  public void unsetDestination_type() {
    this.destination_type = null;
  }

  /** Returns true if field destination_type is set (has been asigned a value) and false otherwise */
  public boolean isSetDestination_type() {
    return this.destination_type != null;
  }

  public void setDestination_typeIsSet(boolean value) {
    if (!value) {
      this.destination_type = null;
    }
  }

  public String getDestination() {
    return this.destination;
  }

  public Publish setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public void unsetDestination() {
    this.destination = null;
  }

  /** Returns true if field destination is set (has been asigned a value) and false otherwise */
  public boolean isSetDestination() {
    return this.destination != null;
  }

  public void setDestinationIsSet(boolean value) {
    if (!value) {
      this.destination = null;
    }
  }

  public BrokerMessage getMessage() {
    return this.message;
  }

  public Publish setMessage(BrokerMessage message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been asigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTION_ID:
      if (value == null) {
        unsetAction_id();
      } else {
        setAction_id((String)value);
      }
      break;

    case DESTINATION_TYPE:
      if (value == null) {
        unsetDestination_type();
      } else {
        setDestination_type((DestinationType)value);
      }
      break;

    case DESTINATION:
      if (value == null) {
        unsetDestination();
      } else {
        setDestination((String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((BrokerMessage)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION_ID:
      return getAction_id();

    case DESTINATION_TYPE:
      return getDestination_type();

    case DESTINATION:
      return getDestination();

    case MESSAGE:
      return getMessage();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case ACTION_ID:
      return isSetAction_id();
    case DESTINATION_TYPE:
      return isSetDestination_type();
    case DESTINATION:
      return isSetDestination();
    case MESSAGE:
      return isSetMessage();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Publish)
      return this.equals((Publish)that);
    return false;
  }

  public boolean equals(Publish that) {
    if (that == null)
      return false;

    boolean this_present_action_id = true && this.isSetAction_id();
    boolean that_present_action_id = true && that.isSetAction_id();
    if (this_present_action_id || that_present_action_id) {
      if (!(this_present_action_id && that_present_action_id))
        return false;
      if (!this.action_id.equals(that.action_id))
        return false;
    }

    boolean this_present_destination_type = true && this.isSetDestination_type();
    boolean that_present_destination_type = true && that.isSetDestination_type();
    if (this_present_destination_type || that_present_destination_type) {
      if (!(this_present_destination_type && that_present_destination_type))
        return false;
      if (!this.destination_type.equals(that.destination_type))
        return false;
    }

    boolean this_present_destination = true && this.isSetDestination();
    boolean that_present_destination = true && that.isSetDestination();
    if (this_present_destination || that_present_destination) {
      if (!(this_present_destination && that_present_destination))
        return false;
      if (!this.destination.equals(that.destination))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Publish other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Publish typedOther = (Publish)other;

    lastComparison = Boolean.valueOf(isSetAction_id()).compareTo(isSetAction_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(action_id, typedOther.action_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDestination_type()).compareTo(isSetDestination_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(destination_type, typedOther.destination_type);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDestination()).compareTo(isSetDestination());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(destination, typedOther.destination);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(message, typedOther.message);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      _Fields fieldId = _Fields.findByThriftId(field.id);
      if (fieldId == null) {
        TProtocolUtil.skip(iprot, field.type);
      } else {
        switch (fieldId) {
          case ACTION_ID:
            if (field.type == TType.STRING) {
              this.action_id = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case DESTINATION_TYPE:
            if (field.type == TType.I32) {
              this.destination_type = DestinationType.findByValue(iprot.readI32());
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case DESTINATION:
            if (field.type == TType.STRING) {
              this.destination = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case MESSAGE:
            if (field.type == TType.STRUCT) {
              this.message = new BrokerMessage();
              this.message.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
        }
        iprot.readFieldEnd();
      }
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.action_id != null) {
      if (isSetAction_id()) {
        oprot.writeFieldBegin(ACTION_ID_FIELD_DESC);
        oprot.writeString(this.action_id);
        oprot.writeFieldEnd();
      }
    }
    if (this.destination_type != null) {
      oprot.writeFieldBegin(DESTINATION_TYPE_FIELD_DESC);
      oprot.writeI32(this.destination_type.getValue());
      oprot.writeFieldEnd();
    }
    if (this.destination != null) {
      oprot.writeFieldBegin(DESTINATION_FIELD_DESC);
      oprot.writeString(this.destination);
      oprot.writeFieldEnd();
    }
    if (this.message != null) {
      oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
      this.message.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Publish(");
    boolean first = true;

    if (isSetAction_id()) {
      sb.append("action_id:");
      if (this.action_id == null) {
        sb.append("null");
      } else {
        sb.append(this.action_id);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("destination_type:");
    if (this.destination_type == null) {
      sb.append("null");
    } else {
      String destination_type_name = destination_type.name();
      if (destination_type_name != null) {
        sb.append(destination_type_name);
        sb.append(" (");
      }
      sb.append(this.destination_type);
      if (destination_type_name != null) {
        sb.append(")");
      }
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("destination:");
    if (this.destination == null) {
      sb.append("null");
    } else {
      sb.append(this.destination);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

