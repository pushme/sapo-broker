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

class Authentication implements TBase<Authentication._Fields>, java.io.Serializable, Cloneable, Comparable<Authentication> {
  private static final TStruct STRUCT_DESC = new TStruct("Authentication");

  private static final TField ACTION_ID_FIELD_DESC = new TField("action_id", TType.STRING, (short)1);
  private static final TField AUTHENTICATION_TYPE_FIELD_DESC = new TField("authentication_type", TType.STRING, (short)2);
  private static final TField TOKEN_FIELD_DESC = new TField("token", TType.STRING, (short)3);
  private static final TField USER_ID_FIELD_DESC = new TField("user_id", TType.STRING, (short)4);
  private static final TField ROLES_FIELD_DESC = new TField("roles", TType.LIST, (short)5);

  public String action_id;
  public String authentication_type;
  public byte[] token;
  public String user_id;
  public List<String> roles;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ACTION_ID((short)1, "action_id"),
    AUTHENTICATION_TYPE((short)2, "authentication_type"),
    TOKEN((short)3, "token"),
    USER_ID((short)4, "user_id"),
    ROLES((short)5, "roles");

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
    put(_Fields.AUTHENTICATION_TYPE, new FieldMetaData("authentication_type", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.TOKEN, new FieldMetaData("token", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.USER_ID, new FieldMetaData("user_id", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.ROLES, new FieldMetaData("roles", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(Authentication.class, metaDataMap);
  }

  public Authentication() {
  }

  public Authentication(
    byte[] token)
  {
    this();
    this.token = token;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Authentication(Authentication other) {
    if (other.isSetAction_id()) {
      this.action_id = other.action_id;
    }
    if (other.isSetAuthentication_type()) {
      this.authentication_type = other.authentication_type;
    }
    if (other.isSetToken()) {
      this.token = new byte[other.token.length];
      System.arraycopy(other.token, 0, token, 0, other.token.length);
    }
    if (other.isSetUser_id()) {
      this.user_id = other.user_id;
    }
    if (other.isSetRoles()) {
      List<String> __this__roles = new ArrayList<String>();
      for (String other_element : other.roles) {
        __this__roles.add(other_element);
      }
      this.roles = __this__roles;
    }
  }

  public Authentication deepCopy() {
    return new Authentication(this);
  }

  @Deprecated
  public Authentication clone() {
    return new Authentication(this);
  }

  public String getAction_id() {
    return this.action_id;
  }

  public Authentication setAction_id(String action_id) {
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

  public String getAuthentication_type() {
    return this.authentication_type;
  }

  public Authentication setAuthentication_type(String authentication_type) {
    this.authentication_type = authentication_type;
    return this;
  }

  public void unsetAuthentication_type() {
    this.authentication_type = null;
  }

  /** Returns true if field authentication_type is set (has been asigned a value) and false otherwise */
  public boolean isSetAuthentication_type() {
    return this.authentication_type != null;
  }

  public void setAuthentication_typeIsSet(boolean value) {
    if (!value) {
      this.authentication_type = null;
    }
  }

  public byte[] getToken() {
    return this.token;
  }

  public Authentication setToken(byte[] token) {
    this.token = token;
    return this;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been asigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  public String getUser_id() {
    return this.user_id;
  }

  public Authentication setUser_id(String user_id) {
    this.user_id = user_id;
    return this;
  }

  public void unsetUser_id() {
    this.user_id = null;
  }

  /** Returns true if field user_id is set (has been asigned a value) and false otherwise */
  public boolean isSetUser_id() {
    return this.user_id != null;
  }

  public void setUser_idIsSet(boolean value) {
    if (!value) {
      this.user_id = null;
    }
  }

  public int getRolesSize() {
    return (this.roles == null) ? 0 : this.roles.size();
  }

  public java.util.Iterator<String> getRolesIterator() {
    return (this.roles == null) ? null : this.roles.iterator();
  }

  public void addToRoles(String elem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(elem);
  }

  public List<String> getRoles() {
    return this.roles;
  }

  public Authentication setRoles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public void unsetRoles() {
    this.roles = null;
  }

  /** Returns true if field roles is set (has been asigned a value) and false otherwise */
  public boolean isSetRoles() {
    return this.roles != null;
  }

  public void setRolesIsSet(boolean value) {
    if (!value) {
      this.roles = null;
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

    case AUTHENTICATION_TYPE:
      if (value == null) {
        unsetAuthentication_type();
      } else {
        setAuthentication_type((String)value);
      }
      break;

    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((byte[])value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUser_id();
      } else {
        setUser_id((String)value);
      }
      break;

    case ROLES:
      if (value == null) {
        unsetRoles();
      } else {
        setRoles((List<String>)value);
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

    case AUTHENTICATION_TYPE:
      return getAuthentication_type();

    case TOKEN:
      return getToken();

    case USER_ID:
      return getUser_id();

    case ROLES:
      return getRoles();

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
    case AUTHENTICATION_TYPE:
      return isSetAuthentication_type();
    case TOKEN:
      return isSetToken();
    case USER_ID:
      return isSetUser_id();
    case ROLES:
      return isSetRoles();
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
    if (that instanceof Authentication)
      return this.equals((Authentication)that);
    return false;
  }

  public boolean equals(Authentication that) {
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

    boolean this_present_authentication_type = true && this.isSetAuthentication_type();
    boolean that_present_authentication_type = true && that.isSetAuthentication_type();
    if (this_present_authentication_type || that_present_authentication_type) {
      if (!(this_present_authentication_type && that_present_authentication_type))
        return false;
      if (!this.authentication_type.equals(that.authentication_type))
        return false;
    }

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!java.util.Arrays.equals(this.token, that.token))
        return false;
    }

    boolean this_present_user_id = true && this.isSetUser_id();
    boolean that_present_user_id = true && that.isSetUser_id();
    if (this_present_user_id || that_present_user_id) {
      if (!(this_present_user_id && that_present_user_id))
        return false;
      if (!this.user_id.equals(that.user_id))
        return false;
    }

    boolean this_present_roles = true && this.isSetRoles();
    boolean that_present_roles = true && that.isSetRoles();
    if (this_present_roles || that_present_roles) {
      if (!(this_present_roles && that_present_roles))
        return false;
      if (!this.roles.equals(that.roles))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Authentication other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Authentication typedOther = (Authentication)other;

    lastComparison = Boolean.valueOf(isSetAction_id()).compareTo(isSetAction_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(action_id, typedOther.action_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetAuthentication_type()).compareTo(isSetAuthentication_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(authentication_type, typedOther.authentication_type);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetToken()).compareTo(isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(token, typedOther.token);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetUser_id()).compareTo(isSetUser_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(user_id, typedOther.user_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetRoles()).compareTo(isSetRoles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(roles, typedOther.roles);
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
          case AUTHENTICATION_TYPE:
            if (field.type == TType.STRING) {
              this.authentication_type = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case TOKEN:
            if (field.type == TType.STRING) {
              this.token = iprot.readBinary();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case USER_ID:
            if (field.type == TType.STRING) {
              this.user_id = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case ROLES:
            if (field.type == TType.LIST) {
              {
                TList _list5 = iprot.readListBegin();
                this.roles = new ArrayList<String>(_list5.size);
                for (int _i6 = 0; _i6 < _list5.size; ++_i6)
                {
                  String _elem7;
                  _elem7 = iprot.readString();
                  this.roles.add(_elem7);
                }
                iprot.readListEnd();
              }
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
    if (this.authentication_type != null) {
      if (isSetAuthentication_type()) {
        oprot.writeFieldBegin(AUTHENTICATION_TYPE_FIELD_DESC);
        oprot.writeString(this.authentication_type);
        oprot.writeFieldEnd();
      }
    }
    if (this.token != null) {
      oprot.writeFieldBegin(TOKEN_FIELD_DESC);
      oprot.writeBinary(this.token);
      oprot.writeFieldEnd();
    }
    if (this.user_id != null) {
      if (isSetUser_id()) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(this.user_id);
        oprot.writeFieldEnd();
      }
    }
    if (this.roles != null) {
      if (isSetRoles()) {
        oprot.writeFieldBegin(ROLES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.roles.size()));
          for (String _iter8 : this.roles)
          {
            oprot.writeString(_iter8);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Authentication(");
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
    if (isSetAuthentication_type()) {
      if (!first) sb.append(", ");
      sb.append("authentication_type:");
      if (this.authentication_type == null) {
        sb.append("null");
      } else {
        sb.append(this.authentication_type);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
        int __token_size = Math.min(this.token.length, 128);
        for (int i = 0; i < __token_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.token[i]).length() > 1 ? Integer.toHexString(this.token[i]).substring(Integer.toHexString(this.token[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.token[i]).toUpperCase());
        }
        if (this.token.length > 128) sb.append(" ...");
    }
    first = false;
    if (isSetUser_id()) {
      if (!first) sb.append(", ");
      sb.append("user_id:");
      if (this.user_id == null) {
        sb.append("null");
      } else {
        sb.append(this.user_id);
      }
      first = false;
    }
    if (isSetRoles()) {
      if (!first) sb.append(", ");
      sb.append("roles:");
      if (this.roles == null) {
        sb.append("null");
      } else {
        sb.append(this.roles);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

