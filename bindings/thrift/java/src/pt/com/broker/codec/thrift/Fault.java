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
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Fault implements org.apache.thrift.TBase<Fault, Fault._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Fault");

  private static final org.apache.thrift.protocol.TField ACTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("action_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FAULT_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("fault_code", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField FAULT_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("fault_message", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField FAULT_DETAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("fault_detail", org.apache.thrift.protocol.TType.STRING, (short)4);

  public String action_id;
  public String fault_code;
  public String fault_message;
  public String fault_detail;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACTION_ID((short)1, "action_id"),
    FAULT_CODE((short)2, "fault_code"),
    FAULT_MESSAGE((short)3, "fault_message"),
    FAULT_DETAIL((short)4, "fault_detail");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ACTION_ID
          return ACTION_ID;
        case 2: // FAULT_CODE
          return FAULT_CODE;
        case 3: // FAULT_MESSAGE
          return FAULT_MESSAGE;
        case 4: // FAULT_DETAIL
          return FAULT_DETAIL;
        default:
          return null;
      }
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION_ID, new org.apache.thrift.meta_data.FieldMetaData("action_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FAULT_CODE, new org.apache.thrift.meta_data.FieldMetaData("fault_code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FAULT_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("fault_message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FAULT_DETAIL, new org.apache.thrift.meta_data.FieldMetaData("fault_detail", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Fault.class, metaDataMap);
  }

  public Fault() {
  }

  public Fault(
    String fault_code,
    String fault_message)
  {
    this();
    this.fault_code = fault_code;
    this.fault_message = fault_message;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Fault(Fault other) {
    if (other.isSetAction_id()) {
      this.action_id = other.action_id;
    }
    if (other.isSetFault_code()) {
      this.fault_code = other.fault_code;
    }
    if (other.isSetFault_message()) {
      this.fault_message = other.fault_message;
    }
    if (other.isSetFault_detail()) {
      this.fault_detail = other.fault_detail;
    }
  }

  public Fault deepCopy() {
    return new Fault(this);
  }

  @Override
  public void clear() {
    this.action_id = null;
    this.fault_code = null;
    this.fault_message = null;
    this.fault_detail = null;
  }

  public String getAction_id() {
    return this.action_id;
  }

  public Fault setAction_id(String action_id) {
    this.action_id = action_id;
    return this;
  }

  public void unsetAction_id() {
    this.action_id = null;
  }

  /** Returns true if field action_id is set (has been assigned a value) and false otherwise */
  public boolean isSetAction_id() {
    return this.action_id != null;
  }

  public void setAction_idIsSet(boolean value) {
    if (!value) {
      this.action_id = null;
    }
  }

  public String getFault_code() {
    return this.fault_code;
  }

  public Fault setFault_code(String fault_code) {
    this.fault_code = fault_code;
    return this;
  }

  public void unsetFault_code() {
    this.fault_code = null;
  }

  /** Returns true if field fault_code is set (has been assigned a value) and false otherwise */
  public boolean isSetFault_code() {
    return this.fault_code != null;
  }

  public void setFault_codeIsSet(boolean value) {
    if (!value) {
      this.fault_code = null;
    }
  }

  public String getFault_message() {
    return this.fault_message;
  }

  public Fault setFault_message(String fault_message) {
    this.fault_message = fault_message;
    return this;
  }

  public void unsetFault_message() {
    this.fault_message = null;
  }

  /** Returns true if field fault_message is set (has been assigned a value) and false otherwise */
  public boolean isSetFault_message() {
    return this.fault_message != null;
  }

  public void setFault_messageIsSet(boolean value) {
    if (!value) {
      this.fault_message = null;
    }
  }

  public String getFault_detail() {
    return this.fault_detail;
  }

  public Fault setFault_detail(String fault_detail) {
    this.fault_detail = fault_detail;
    return this;
  }

  public void unsetFault_detail() {
    this.fault_detail = null;
  }

  /** Returns true if field fault_detail is set (has been assigned a value) and false otherwise */
  public boolean isSetFault_detail() {
    return this.fault_detail != null;
  }

  public void setFault_detailIsSet(boolean value) {
    if (!value) {
      this.fault_detail = null;
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

    case FAULT_CODE:
      if (value == null) {
        unsetFault_code();
      } else {
        setFault_code((String)value);
      }
      break;

    case FAULT_MESSAGE:
      if (value == null) {
        unsetFault_message();
      } else {
        setFault_message((String)value);
      }
      break;

    case FAULT_DETAIL:
      if (value == null) {
        unsetFault_detail();
      } else {
        setFault_detail((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION_ID:
      return getAction_id();

    case FAULT_CODE:
      return getFault_code();

    case FAULT_MESSAGE:
      return getFault_message();

    case FAULT_DETAIL:
      return getFault_detail();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTION_ID:
      return isSetAction_id();
    case FAULT_CODE:
      return isSetFault_code();
    case FAULT_MESSAGE:
      return isSetFault_message();
    case FAULT_DETAIL:
      return isSetFault_detail();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Fault)
      return this.equals((Fault)that);
    return false;
  }

  public boolean equals(Fault that) {
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

    boolean this_present_fault_code = true && this.isSetFault_code();
    boolean that_present_fault_code = true && that.isSetFault_code();
    if (this_present_fault_code || that_present_fault_code) {
      if (!(this_present_fault_code && that_present_fault_code))
        return false;
      if (!this.fault_code.equals(that.fault_code))
        return false;
    }

    boolean this_present_fault_message = true && this.isSetFault_message();
    boolean that_present_fault_message = true && that.isSetFault_message();
    if (this_present_fault_message || that_present_fault_message) {
      if (!(this_present_fault_message && that_present_fault_message))
        return false;
      if (!this.fault_message.equals(that.fault_message))
        return false;
    }

    boolean this_present_fault_detail = true && this.isSetFault_detail();
    boolean that_present_fault_detail = true && that.isSetFault_detail();
    if (this_present_fault_detail || that_present_fault_detail) {
      if (!(this_present_fault_detail && that_present_fault_detail))
        return false;
      if (!this.fault_detail.equals(that.fault_detail))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Fault other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Fault typedOther = (Fault)other;

    lastComparison = Boolean.valueOf(isSetAction_id()).compareTo(typedOther.isSetAction_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action_id, typedOther.action_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFault_code()).compareTo(typedOther.isSetFault_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFault_code()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fault_code, typedOther.fault_code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFault_message()).compareTo(typedOther.isSetFault_message());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFault_message()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fault_message, typedOther.fault_message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFault_detail()).compareTo(typedOther.isSetFault_detail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFault_detail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fault_detail, typedOther.fault_detail);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ACTION_ID
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.action_id = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // FAULT_CODE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.fault_code = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // FAULT_MESSAGE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.fault_message = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // FAULT_DETAIL
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.fault_detail = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.action_id != null) {
      if (isSetAction_id()) {
        oprot.writeFieldBegin(ACTION_ID_FIELD_DESC);
        oprot.writeString(this.action_id);
        oprot.writeFieldEnd();
      }
    }
    if (this.fault_code != null) {
      oprot.writeFieldBegin(FAULT_CODE_FIELD_DESC);
      oprot.writeString(this.fault_code);
      oprot.writeFieldEnd();
    }
    if (this.fault_message != null) {
      oprot.writeFieldBegin(FAULT_MESSAGE_FIELD_DESC);
      oprot.writeString(this.fault_message);
      oprot.writeFieldEnd();
    }
    if (this.fault_detail != null) {
      if (isSetFault_detail()) {
        oprot.writeFieldBegin(FAULT_DETAIL_FIELD_DESC);
        oprot.writeString(this.fault_detail);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Fault(");
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
    sb.append("fault_code:");
    if (this.fault_code == null) {
      sb.append("null");
    } else {
      sb.append(this.fault_code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fault_message:");
    if (this.fault_message == null) {
      sb.append("null");
    } else {
      sb.append(this.fault_message);
    }
    first = false;
    if (isSetFault_detail()) {
      if (!first) sb.append(", ");
      sb.append("fault_detail:");
      if (this.fault_detail == null) {
        sb.append("null");
      } else {
        sb.append(this.fault_detail);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

