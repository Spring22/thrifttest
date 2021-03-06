/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.kkworld.futuresservice.cmsTrade;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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

public class CThostFtdcUserPasswordUpdateField implements org.apache.thrift.TBase<CThostFtdcUserPasswordUpdateField, CThostFtdcUserPasswordUpdateField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcUserPasswordUpdateField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcUserPasswordUpdateField");

  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField OLD_PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("oldPassword", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField NEW_PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("newPassword", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcUserPasswordUpdateFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcUserPasswordUpdateFieldTupleSchemeFactory());
  }

  public String brokerID; // required
  public String userID; // required
  public String oldPassword; // required
  public String newPassword; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BROKER_ID((short)1, "brokerID"),
    USER_ID((short)2, "userID"),
    OLD_PASSWORD((short)3, "oldPassword"),
    NEW_PASSWORD((short)4, "newPassword");

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
        case 1: // BROKER_ID
          return BROKER_ID;
        case 2: // USER_ID
          return USER_ID;
        case 3: // OLD_PASSWORD
          return OLD_PASSWORD;
        case 4: // NEW_PASSWORD
          return NEW_PASSWORD;
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
    tmpMap.put(_Fields.BROKER_ID, new org.apache.thrift.meta_data.FieldMetaData("brokerID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcBrokerIDType")));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcUserIDType")));
    tmpMap.put(_Fields.OLD_PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("oldPassword", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcPasswordType")));
    tmpMap.put(_Fields.NEW_PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("newPassword", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcPasswordType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcUserPasswordUpdateField.class, metaDataMap);
  }

  public CThostFtdcUserPasswordUpdateField() {
  }

  public CThostFtdcUserPasswordUpdateField(
    String brokerID,
    String userID,
    String oldPassword,
    String newPassword)
  {
    this();
    this.brokerID = brokerID;
    this.userID = userID;
    this.oldPassword = oldPassword;
    this.newPassword = newPassword;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcUserPasswordUpdateField(CThostFtdcUserPasswordUpdateField other) {
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetUserID()) {
      this.userID = other.userID;
    }
    if (other.isSetOldPassword()) {
      this.oldPassword = other.oldPassword;
    }
    if (other.isSetNewPassword()) {
      this.newPassword = other.newPassword;
    }
  }

  public CThostFtdcUserPasswordUpdateField deepCopy() {
    return new CThostFtdcUserPasswordUpdateField(this);
  }

  @Override
  public void clear() {
    this.brokerID = null;
    this.userID = null;
    this.oldPassword = null;
    this.newPassword = null;
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcUserPasswordUpdateField setBrokerID(String brokerID) {
    this.brokerID = brokerID;
    return this;
  }

  public void unsetBrokerID() {
    this.brokerID = null;
  }

  /** Returns true if field brokerID is set (has been assigned a value) and false otherwise */
  public boolean isSetBrokerID() {
    return this.brokerID != null;
  }

  public void setBrokerIDIsSet(boolean value) {
    if (!value) {
      this.brokerID = null;
    }
  }

  public String getUserID() {
    return this.userID;
  }

  public CThostFtdcUserPasswordUpdateField setUserID(String userID) {
    this.userID = userID;
    return this;
  }

  public void unsetUserID() {
    this.userID = null;
  }

  /** Returns true if field userID is set (has been assigned a value) and false otherwise */
  public boolean isSetUserID() {
    return this.userID != null;
  }

  public void setUserIDIsSet(boolean value) {
    if (!value) {
      this.userID = null;
    }
  }

  public String getOldPassword() {
    return this.oldPassword;
  }

  public CThostFtdcUserPasswordUpdateField setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

  public void unsetOldPassword() {
    this.oldPassword = null;
  }

  /** Returns true if field oldPassword is set (has been assigned a value) and false otherwise */
  public boolean isSetOldPassword() {
    return this.oldPassword != null;
  }

  public void setOldPasswordIsSet(boolean value) {
    if (!value) {
      this.oldPassword = null;
    }
  }

  public String getNewPassword() {
    return this.newPassword;
  }

  public CThostFtdcUserPasswordUpdateField setNewPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  public void unsetNewPassword() {
    this.newPassword = null;
  }

  /** Returns true if field newPassword is set (has been assigned a value) and false otherwise */
  public boolean isSetNewPassword() {
    return this.newPassword != null;
  }

  public void setNewPasswordIsSet(boolean value) {
    if (!value) {
      this.newPassword = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BROKER_ID:
      if (value == null) {
        unsetBrokerID();
      } else {
        setBrokerID((String)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserID();
      } else {
        setUserID((String)value);
      }
      break;

    case OLD_PASSWORD:
      if (value == null) {
        unsetOldPassword();
      } else {
        setOldPassword((String)value);
      }
      break;

    case NEW_PASSWORD:
      if (value == null) {
        unsetNewPassword();
      } else {
        setNewPassword((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BROKER_ID:
      return getBrokerID();

    case USER_ID:
      return getUserID();

    case OLD_PASSWORD:
      return getOldPassword();

    case NEW_PASSWORD:
      return getNewPassword();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BROKER_ID:
      return isSetBrokerID();
    case USER_ID:
      return isSetUserID();
    case OLD_PASSWORD:
      return isSetOldPassword();
    case NEW_PASSWORD:
      return isSetNewPassword();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcUserPasswordUpdateField)
      return this.equals((CThostFtdcUserPasswordUpdateField)that);
    return false;
  }

  public boolean equals(CThostFtdcUserPasswordUpdateField that) {
    if (that == null)
      return false;

    boolean this_present_brokerID = true && this.isSetBrokerID();
    boolean that_present_brokerID = true && that.isSetBrokerID();
    if (this_present_brokerID || that_present_brokerID) {
      if (!(this_present_brokerID && that_present_brokerID))
        return false;
      if (!this.brokerID.equals(that.brokerID))
        return false;
    }

    boolean this_present_userID = true && this.isSetUserID();
    boolean that_present_userID = true && that.isSetUserID();
    if (this_present_userID || that_present_userID) {
      if (!(this_present_userID && that_present_userID))
        return false;
      if (!this.userID.equals(that.userID))
        return false;
    }

    boolean this_present_oldPassword = true && this.isSetOldPassword();
    boolean that_present_oldPassword = true && that.isSetOldPassword();
    if (this_present_oldPassword || that_present_oldPassword) {
      if (!(this_present_oldPassword && that_present_oldPassword))
        return false;
      if (!this.oldPassword.equals(that.oldPassword))
        return false;
    }

    boolean this_present_newPassword = true && this.isSetNewPassword();
    boolean that_present_newPassword = true && that.isSetNewPassword();
    if (this_present_newPassword || that_present_newPassword) {
      if (!(this_present_newPassword && that_present_newPassword))
        return false;
      if (!this.newPassword.equals(that.newPassword))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcUserPasswordUpdateField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBrokerID()).compareTo(other.isSetBrokerID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBrokerID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.brokerID, other.brokerID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserID()).compareTo(other.isSetUserID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userID, other.userID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOldPassword()).compareTo(other.isSetOldPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOldPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oldPassword, other.oldPassword);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNewPassword()).compareTo(other.isSetNewPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newPassword, other.newPassword);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CThostFtdcUserPasswordUpdateField(");
    boolean first = true;

    sb.append("brokerID:");
    if (this.brokerID == null) {
      sb.append("null");
    } else {
      sb.append(this.brokerID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userID:");
    if (this.userID == null) {
      sb.append("null");
    } else {
      sb.append(this.userID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("oldPassword:");
    if (this.oldPassword == null) {
      sb.append("null");
    } else {
      sb.append(this.oldPassword);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("newPassword:");
    if (this.newPassword == null) {
      sb.append("null");
    } else {
      sb.append(this.newPassword);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class CThostFtdcUserPasswordUpdateFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcUserPasswordUpdateFieldStandardScheme getScheme() {
      return new CThostFtdcUserPasswordUpdateFieldStandardScheme();
    }
  }

  private static class CThostFtdcUserPasswordUpdateFieldStandardScheme extends StandardScheme<CThostFtdcUserPasswordUpdateField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcUserPasswordUpdateField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BROKER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.brokerID = iprot.readString();
              struct.setBrokerIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userID = iprot.readString();
              struct.setUserIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OLD_PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.oldPassword = iprot.readString();
              struct.setOldPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NEW_PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.newPassword = iprot.readString();
              struct.setNewPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcUserPasswordUpdateField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.brokerID != null) {
        oprot.writeFieldBegin(BROKER_ID_FIELD_DESC);
        oprot.writeString(struct.brokerID);
        oprot.writeFieldEnd();
      }
      if (struct.userID != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userID);
        oprot.writeFieldEnd();
      }
      if (struct.oldPassword != null) {
        oprot.writeFieldBegin(OLD_PASSWORD_FIELD_DESC);
        oprot.writeString(struct.oldPassword);
        oprot.writeFieldEnd();
      }
      if (struct.newPassword != null) {
        oprot.writeFieldBegin(NEW_PASSWORD_FIELD_DESC);
        oprot.writeString(struct.newPassword);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcUserPasswordUpdateFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcUserPasswordUpdateFieldTupleScheme getScheme() {
      return new CThostFtdcUserPasswordUpdateFieldTupleScheme();
    }
  }

  private static class CThostFtdcUserPasswordUpdateFieldTupleScheme extends TupleScheme<CThostFtdcUserPasswordUpdateField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcUserPasswordUpdateField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBrokerID()) {
        optionals.set(0);
      }
      if (struct.isSetUserID()) {
        optionals.set(1);
      }
      if (struct.isSetOldPassword()) {
        optionals.set(2);
      }
      if (struct.isSetNewPassword()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetUserID()) {
        oprot.writeString(struct.userID);
      }
      if (struct.isSetOldPassword()) {
        oprot.writeString(struct.oldPassword);
      }
      if (struct.isSetNewPassword()) {
        oprot.writeString(struct.newPassword);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcUserPasswordUpdateField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userID = iprot.readString();
        struct.setUserIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.oldPassword = iprot.readString();
        struct.setOldPasswordIsSet(true);
      }
      if (incoming.get(3)) {
        struct.newPassword = iprot.readString();
        struct.setNewPasswordIsSet(true);
      }
    }
  }

}

