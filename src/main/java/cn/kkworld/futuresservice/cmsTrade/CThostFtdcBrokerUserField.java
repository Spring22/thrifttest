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

public class CThostFtdcBrokerUserField implements org.apache.thrift.TBase<CThostFtdcBrokerUserField, CThostFtdcBrokerUserField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcBrokerUserField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcBrokerUserField");

  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField USER_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("userType", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField IS_ACTIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("isActive", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField IS_USING_OTP_FIELD_DESC = new org.apache.thrift.protocol.TField("isUsingOTP", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcBrokerUserFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcBrokerUserFieldTupleSchemeFactory());
  }

  public String brokerID; // required
  public String userID; // required
  public String userName; // required
  public String userType; // required
  public int isActive; // required
  public int isUsingOTP; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BROKER_ID((short)1, "brokerID"),
    USER_ID((short)2, "userID"),
    USER_NAME((short)3, "userName"),
    USER_TYPE((short)4, "userType"),
    IS_ACTIVE((short)5, "isActive"),
    IS_USING_OTP((short)6, "isUsingOTP");

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
        case 3: // USER_NAME
          return USER_NAME;
        case 4: // USER_TYPE
          return USER_TYPE;
        case 5: // IS_ACTIVE
          return IS_ACTIVE;
        case 6: // IS_USING_OTP
          return IS_USING_OTP;
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
  private static final int __ISACTIVE_ISSET_ID = 0;
  private static final int __ISUSINGOTP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BROKER_ID, new org.apache.thrift.meta_data.FieldMetaData("brokerID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcBrokerIDType")));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcUserIDType")));
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcUserNameType")));
    tmpMap.put(_Fields.USER_TYPE, new org.apache.thrift.meta_data.FieldMetaData("userType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcUserTypeType")));
    tmpMap.put(_Fields.IS_ACTIVE, new org.apache.thrift.meta_data.FieldMetaData("isActive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcBoolType")));
    tmpMap.put(_Fields.IS_USING_OTP, new org.apache.thrift.meta_data.FieldMetaData("isUsingOTP", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcBoolType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcBrokerUserField.class, metaDataMap);
  }

  public CThostFtdcBrokerUserField() {
  }

  public CThostFtdcBrokerUserField(
    String brokerID,
    String userID,
    String userName,
    String userType,
    int isActive,
    int isUsingOTP)
  {
    this();
    this.brokerID = brokerID;
    this.userID = userID;
    this.userName = userName;
    this.userType = userType;
    this.isActive = isActive;
    setIsActiveIsSet(true);
    this.isUsingOTP = isUsingOTP;
    setIsUsingOTPIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcBrokerUserField(CThostFtdcBrokerUserField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetUserID()) {
      this.userID = other.userID;
    }
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
    if (other.isSetUserType()) {
      this.userType = other.userType;
    }
    this.isActive = other.isActive;
    this.isUsingOTP = other.isUsingOTP;
  }

  public CThostFtdcBrokerUserField deepCopy() {
    return new CThostFtdcBrokerUserField(this);
  }

  @Override
  public void clear() {
    this.brokerID = null;
    this.userID = null;
    this.userName = null;
    this.userType = null;
    setIsActiveIsSet(false);
    this.isActive = 0;
    setIsUsingOTPIsSet(false);
    this.isUsingOTP = 0;
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcBrokerUserField setBrokerID(String brokerID) {
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

  public CThostFtdcBrokerUserField setUserID(String userID) {
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

  public String getUserName() {
    return this.userName;
  }

  public CThostFtdcBrokerUserField setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  public String getUserType() {
    return this.userType;
  }

  public CThostFtdcBrokerUserField setUserType(String userType) {
    this.userType = userType;
    return this;
  }

  public void unsetUserType() {
    this.userType = null;
  }

  /** Returns true if field userType is set (has been assigned a value) and false otherwise */
  public boolean isSetUserType() {
    return this.userType != null;
  }

  public void setUserTypeIsSet(boolean value) {
    if (!value) {
      this.userType = null;
    }
  }

  public int getIsActive() {
    return this.isActive;
  }

  public CThostFtdcBrokerUserField setIsActive(int isActive) {
    this.isActive = isActive;
    setIsActiveIsSet(true);
    return this;
  }

  public void unsetIsActive() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISACTIVE_ISSET_ID);
  }

  /** Returns true if field isActive is set (has been assigned a value) and false otherwise */
  public boolean isSetIsActive() {
    return EncodingUtils.testBit(__isset_bitfield, __ISACTIVE_ISSET_ID);
  }

  public void setIsActiveIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISACTIVE_ISSET_ID, value);
  }

  public int getIsUsingOTP() {
    return this.isUsingOTP;
  }

  public CThostFtdcBrokerUserField setIsUsingOTP(int isUsingOTP) {
    this.isUsingOTP = isUsingOTP;
    setIsUsingOTPIsSet(true);
    return this;
  }

  public void unsetIsUsingOTP() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISUSINGOTP_ISSET_ID);
  }

  /** Returns true if field isUsingOTP is set (has been assigned a value) and false otherwise */
  public boolean isSetIsUsingOTP() {
    return EncodingUtils.testBit(__isset_bitfield, __ISUSINGOTP_ISSET_ID);
  }

  public void setIsUsingOTPIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISUSINGOTP_ISSET_ID, value);
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

    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((String)value);
      }
      break;

    case USER_TYPE:
      if (value == null) {
        unsetUserType();
      } else {
        setUserType((String)value);
      }
      break;

    case IS_ACTIVE:
      if (value == null) {
        unsetIsActive();
      } else {
        setIsActive((Integer)value);
      }
      break;

    case IS_USING_OTP:
      if (value == null) {
        unsetIsUsingOTP();
      } else {
        setIsUsingOTP((Integer)value);
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

    case USER_NAME:
      return getUserName();

    case USER_TYPE:
      return getUserType();

    case IS_ACTIVE:
      return Integer.valueOf(getIsActive());

    case IS_USING_OTP:
      return Integer.valueOf(getIsUsingOTP());

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
    case USER_NAME:
      return isSetUserName();
    case USER_TYPE:
      return isSetUserType();
    case IS_ACTIVE:
      return isSetIsActive();
    case IS_USING_OTP:
      return isSetIsUsingOTP();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcBrokerUserField)
      return this.equals((CThostFtdcBrokerUserField)that);
    return false;
  }

  public boolean equals(CThostFtdcBrokerUserField that) {
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

    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    boolean this_present_userType = true && this.isSetUserType();
    boolean that_present_userType = true && that.isSetUserType();
    if (this_present_userType || that_present_userType) {
      if (!(this_present_userType && that_present_userType))
        return false;
      if (!this.userType.equals(that.userType))
        return false;
    }

    boolean this_present_isActive = true;
    boolean that_present_isActive = true;
    if (this_present_isActive || that_present_isActive) {
      if (!(this_present_isActive && that_present_isActive))
        return false;
      if (this.isActive != that.isActive)
        return false;
    }

    boolean this_present_isUsingOTP = true;
    boolean that_present_isUsingOTP = true;
    if (this_present_isUsingOTP || that_present_isUsingOTP) {
      if (!(this_present_isUsingOTP && that_present_isUsingOTP))
        return false;
      if (this.isUsingOTP != that.isUsingOTP)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcBrokerUserField other) {
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
    lastComparison = Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserType()).compareTo(other.isSetUserType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userType, other.userType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsActive()).compareTo(other.isSetIsActive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsActive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isActive, other.isActive);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsUsingOTP()).compareTo(other.isSetIsUsingOTP());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsUsingOTP()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isUsingOTP, other.isUsingOTP);
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
    StringBuilder sb = new StringBuilder("CThostFtdcBrokerUserField(");
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
    sb.append("userName:");
    if (this.userName == null) {
      sb.append("null");
    } else {
      sb.append(this.userName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userType:");
    if (this.userType == null) {
      sb.append("null");
    } else {
      sb.append(this.userType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isActive:");
    sb.append(this.isActive);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isUsingOTP:");
    sb.append(this.isUsingOTP);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CThostFtdcBrokerUserFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcBrokerUserFieldStandardScheme getScheme() {
      return new CThostFtdcBrokerUserFieldStandardScheme();
    }
  }

  private static class CThostFtdcBrokerUserFieldStandardScheme extends StandardScheme<CThostFtdcBrokerUserField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcBrokerUserField struct) throws org.apache.thrift.TException {
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
          case 3: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.setUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USER_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userType = iprot.readString();
              struct.setUserTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_ACTIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.isActive = iprot.readI32();
              struct.setIsActiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // IS_USING_OTP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.isUsingOTP = iprot.readI32();
              struct.setIsUsingOTPIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcBrokerUserField struct) throws org.apache.thrift.TException {
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
      if (struct.userName != null) {
        oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
        oprot.writeString(struct.userName);
        oprot.writeFieldEnd();
      }
      if (struct.userType != null) {
        oprot.writeFieldBegin(USER_TYPE_FIELD_DESC);
        oprot.writeString(struct.userType);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_ACTIVE_FIELD_DESC);
      oprot.writeI32(struct.isActive);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_USING_OTP_FIELD_DESC);
      oprot.writeI32(struct.isUsingOTP);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcBrokerUserFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcBrokerUserFieldTupleScheme getScheme() {
      return new CThostFtdcBrokerUserFieldTupleScheme();
    }
  }

  private static class CThostFtdcBrokerUserFieldTupleScheme extends TupleScheme<CThostFtdcBrokerUserField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcBrokerUserField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBrokerID()) {
        optionals.set(0);
      }
      if (struct.isSetUserID()) {
        optionals.set(1);
      }
      if (struct.isSetUserName()) {
        optionals.set(2);
      }
      if (struct.isSetUserType()) {
        optionals.set(3);
      }
      if (struct.isSetIsActive()) {
        optionals.set(4);
      }
      if (struct.isSetIsUsingOTP()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetUserID()) {
        oprot.writeString(struct.userID);
      }
      if (struct.isSetUserName()) {
        oprot.writeString(struct.userName);
      }
      if (struct.isSetUserType()) {
        oprot.writeString(struct.userType);
      }
      if (struct.isSetIsActive()) {
        oprot.writeI32(struct.isActive);
      }
      if (struct.isSetIsUsingOTP()) {
        oprot.writeI32(struct.isUsingOTP);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcBrokerUserField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userID = iprot.readString();
        struct.setUserIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.userName = iprot.readString();
        struct.setUserNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.userType = iprot.readString();
        struct.setUserTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.isActive = iprot.readI32();
        struct.setIsActiveIsSet(true);
      }
      if (incoming.get(5)) {
        struct.isUsingOTP = iprot.readI32();
        struct.setIsUsingOTPIsSet(true);
      }
    }
  }

}

