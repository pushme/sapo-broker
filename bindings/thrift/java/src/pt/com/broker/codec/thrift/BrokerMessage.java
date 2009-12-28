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

class BrokerMessage implements TBase<BrokerMessage._Fields>, java.io.Serializable, Cloneable, Comparable<BrokerMessage> {
  private static final TStruct STRUCT_DESC = new TStruct("BrokerMessage");

  private static final TField MESSAGE_ID_FIELD_DESC = new TField("message_id", TType.STRING, (short)1);
  private static final TField PAYLOAD_FIELD_DESC = new TField("payload", TType.STRING, (short)2);
  private static final TField EXPIRATION_FIELD_DESC = new TField("expiration", TType.I64, (short)3);
  private static final TField TIMESTAMP_FIELD_DESC = new TField("timestamp", TType.I64, (short)4);

  public String message_id;
  public byte[] payload;
  public long expiration;
  public long timestamp;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    MESSAGE_ID((short)1, "message_id"),
    PAYLOAD((short)2, "payload"),
    EXPIRATION((short)3, "expiration"),
    TIMESTAMP((short)4, "timestamp");

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
  private static final int __EXPIRATION_ISSET_ID = 0;
  private static final int __TIMESTAMP_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new EnumMap<_Fields, FieldMetaData>(_Fields.class) {{
    put(_Fields.MESSAGE_ID, new FieldMetaData("message_id", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.PAYLOAD, new FieldMetaData("payload", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.EXPIRATION, new FieldMetaData("expiration", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(BrokerMessage.class, metaDataMap);
  }

  public BrokerMessage() {
  }

  public BrokerMessage(
    byte[] payload)
  {
    this();
    this.payload = payload;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BrokerMessage(BrokerMessage other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetMessage_id()) {
      this.message_id = other.message_id;
    }
    if (other.isSetPayload()) {
      this.payload = new byte[other.payload.length];
      System.arraycopy(other.payload, 0, payload, 0, other.payload.length);
    }
    this.expiration = other.expiration;
    this.timestamp = other.timestamp;
  }

  public BrokerMessage deepCopy() {
    return new BrokerMessage(this);
  }

  @Deprecated
  public BrokerMessage clone() {
    return new BrokerMessage(this);
  }

  public String getMessage_id() {
    return this.message_id;
  }

  public BrokerMessage setMessage_id(String message_id) {
    this.message_id = message_id;
    return this;
  }

  public void unsetMessage_id() {
    this.message_id = null;
  }

  /** Returns true if field message_id is set (has been asigned a value) and false otherwise */
  public boolean isSetMessage_id() {
    return this.message_id != null;
  }

  public void setMessage_idIsSet(boolean value) {
    if (!value) {
      this.message_id = null;
    }
  }

  public byte[] getPayload() {
    return this.payload;
  }

  public BrokerMessage setPayload(byte[] payload) {
    this.payload = payload;
    return this;
  }

  public void unsetPayload() {
    this.payload = null;
  }

  /** Returns true if field payload is set (has been asigned a value) and false otherwise */
  public boolean isSetPayload() {
    return this.payload != null;
  }

  public void setPayloadIsSet(boolean value) {
    if (!value) {
      this.payload = null;
    }
  }

  public long getExpiration() {
    return this.expiration;
  }

  public BrokerMessage setExpiration(long expiration) {
    this.expiration = expiration;
    setExpirationIsSet(true);
    return this;
  }

  public void unsetExpiration() {
    __isset_bit_vector.clear(__EXPIRATION_ISSET_ID);
  }

  /** Returns true if field expiration is set (has been asigned a value) and false otherwise */
  public boolean isSetExpiration() {
    return __isset_bit_vector.get(__EXPIRATION_ISSET_ID);
  }

  public void setExpirationIsSet(boolean value) {
    __isset_bit_vector.set(__EXPIRATION_ISSET_ID, value);
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public BrokerMessage setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bit_vector.clear(__TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been asigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return __isset_bit_vector.get(__TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bit_vector.set(__TIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MESSAGE_ID:
      if (value == null) {
        unsetMessage_id();
      } else {
        setMessage_id((String)value);
      }
      break;

    case PAYLOAD:
      if (value == null) {
        unsetPayload();
      } else {
        setPayload((byte[])value);
      }
      break;

    case EXPIRATION:
      if (value == null) {
        unsetExpiration();
      } else {
        setExpiration((Long)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE_ID:
      return getMessage_id();

    case PAYLOAD:
      return getPayload();

    case EXPIRATION:
      return new Long(getExpiration());

    case TIMESTAMP:
      return new Long(getTimestamp());

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case MESSAGE_ID:
      return isSetMessage_id();
    case PAYLOAD:
      return isSetPayload();
    case EXPIRATION:
      return isSetExpiration();
    case TIMESTAMP:
      return isSetTimestamp();
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
    if (that instanceof BrokerMessage)
      return this.equals((BrokerMessage)that);
    return false;
  }

  public boolean equals(BrokerMessage that) {
    if (that == null)
      return false;

    boolean this_present_message_id = true && this.isSetMessage_id();
    boolean that_present_message_id = true && that.isSetMessage_id();
    if (this_present_message_id || that_present_message_id) {
      if (!(this_present_message_id && that_present_message_id))
        return false;
      if (!this.message_id.equals(that.message_id))
        return false;
    }

    boolean this_present_payload = true && this.isSetPayload();
    boolean that_present_payload = true && that.isSetPayload();
    if (this_present_payload || that_present_payload) {
      if (!(this_present_payload && that_present_payload))
        return false;
      if (!java.util.Arrays.equals(this.payload, that.payload))
        return false;
    }

    boolean this_present_expiration = true && this.isSetExpiration();
    boolean that_present_expiration = true && that.isSetExpiration();
    if (this_present_expiration || that_present_expiration) {
      if (!(this_present_expiration && that_present_expiration))
        return false;
      if (this.expiration != that.expiration)
        return false;
    }

    boolean this_present_timestamp = true && this.isSetTimestamp();
    boolean that_present_timestamp = true && that.isSetTimestamp();
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BrokerMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BrokerMessage typedOther = (BrokerMessage)other;

    lastComparison = Boolean.valueOf(isSetMessage_id()).compareTo(isSetMessage_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(message_id, typedOther.message_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetPayload()).compareTo(isSetPayload());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(payload, typedOther.payload);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetExpiration()).compareTo(isSetExpiration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(expiration, typedOther.expiration);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(timestamp, typedOther.timestamp);
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
          case MESSAGE_ID:
            if (field.type == TType.STRING) {
              this.message_id = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case PAYLOAD:
            if (field.type == TType.STRING) {
              this.payload = iprot.readBinary();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case EXPIRATION:
            if (field.type == TType.I64) {
              this.expiration = iprot.readI64();
              setExpirationIsSet(true);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case TIMESTAMP:
            if (field.type == TType.I64) {
              this.timestamp = iprot.readI64();
              setTimestampIsSet(true);
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
    if (this.message_id != null) {
      if (isSetMessage_id()) {
        oprot.writeFieldBegin(MESSAGE_ID_FIELD_DESC);
        oprot.writeString(this.message_id);
        oprot.writeFieldEnd();
      }
    }
    if (this.payload != null) {
      oprot.writeFieldBegin(PAYLOAD_FIELD_DESC);
      oprot.writeBinary(this.payload);
      oprot.writeFieldEnd();
    }
    if (isSetExpiration()) {
      oprot.writeFieldBegin(EXPIRATION_FIELD_DESC);
      oprot.writeI64(this.expiration);
      oprot.writeFieldEnd();
    }
    if (isSetTimestamp()) {
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(this.timestamp);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BrokerMessage(");
    boolean first = true;

    if (isSetMessage_id()) {
      sb.append("message_id:");
      if (this.message_id == null) {
        sb.append("null");
      } else {
        sb.append(this.message_id);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("payload:");
    if (this.payload == null) {
      sb.append("null");
    } else {
        int __payload_size = Math.min(this.payload.length, 128);
        for (int i = 0; i < __payload_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.payload[i]).length() > 1 ? Integer.toHexString(this.payload[i]).substring(Integer.toHexString(this.payload[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.payload[i]).toUpperCase());
        }
        if (this.payload.length > 128) sb.append(" ...");
    }
    first = false;
    if (isSetExpiration()) {
      if (!first) sb.append(", ");
      sb.append("expiration:");
      sb.append(this.expiration);
      first = false;
    }
    if (isSetTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("timestamp:");
      sb.append(this.timestamp);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

