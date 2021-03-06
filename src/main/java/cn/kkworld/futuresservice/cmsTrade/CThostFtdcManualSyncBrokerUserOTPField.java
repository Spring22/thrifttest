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

public class CThostFtdcManualSyncBrokerUserOTPField implements org.apache.thrift.TBase<CThostFtdcManualSyncBrokerUserOTPField, CThostFtdcManualSyncBrokerUserOTPField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcManualSyncBrokerUserOTPField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcManualSyncBrokerUserOTPField");

  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField O_TPTYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("oTPType", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField FIRST_OTP_FIELD_DESC = new org.apache.thrift.protocol.TField("firstOTP", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField SECOND_OTP_FIELD_DESC = new org.apache.thrift.protocol.TField("secondOTP", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcManualSyncBrokerUserOTPFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcManualSyncBrokerUserOTPFieldTupleSchemeFactory());
  }

  public String brokerID; // required
  public String userID; // required
  public String oTPType; // required
  public String firstOTP; // required
  public String secondOTP; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BROKER_ID((short)1, "brokerID"),
    USER_ID((short)2, "userID"),
    O_TPTYPE((short)3, "oTPType"),
    FIRST_OTP((short)4, "firstOTP"),
    SECOND_OTP((short)5, "secondOTP");

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
        case 3: // O_TPTYPE
          return O_TPTYPE;
        case 4: // FIRST_OTP
          return FIRST_OTP;
        case 5: // SECOND_OTP
          return SECOND_OTP;
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
    tmpMap.put(_Fields.O_TPTYPE, new org.apache.thrift.meta_data.FieldMetaData("oTPType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcOTPTypeType")));
    tmpMap.put(_Fields.FIRST_OTP, new org.apache.thrift.meta_data.FieldMetaData("firstOTP", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcPasswordType")));
    tmpMap.put(_Fields.SECOND_OTP, new org.apache.thrift.meta_data.FieldMetaData("secondOTP", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcPasswordType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcManualSyncBrokerUserOTPField.class, metaDataMap);
  }

  public CThostFtdcManualSyncBrokerUserOTPField() {
  }

  public CThostFtdcManualSyncBrokerUserOTPField(
    String brokerID,
    String userID,
    String oTPType,
    String firstOTP,
    String secondOTP)
  {
    this();
    this.brokerID = brokerID;
    this.userID = userID;
    this.oTPType = oTPType;
    this.firstOTP = firstOTP;
    this.secondOTP = secondOTP;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcManualSyncBrokerUserOTPField(CThostFtdcManualSyncBrokerUserOTPField other) {
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetUserID()) {
      this.userID = other.userID;
    }
    if (other.isSetOTPType()) {
      this.oTPType = other.oTPType;
    }
    if (other.isSetFirstOTP()) {
      this.firstOTP = other.firstOTP;
    }
    if (other.isSetSecondOTP()) {
      this.secondOTP = other.secondOTP;
    }
  }

  public CThostFtdcManualSyncBrokerUserOTPField deepCopy() {
    return new CThostFtdcManualSyncBrokerUserOTPField(this);
  }

  @Override
  public void clear() {
    this.brokerID = null;
    this.userID = null;
    this.oTPType = null;
    this.firstOTP = null;
    this.secondOTP = null;
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcManualSyncBrokerUserOTPField setBrokerID(String brokerID) {
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

  public CThostFtdcManualSyncBrokerUserOTPField setUserID(String userID) {
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

  public String getOTPType() {
    return this.oTPType;
  }

  public CThostFtdcManualSyncBrokerUserOTPField setOTPType(String oTPType) {
    this.oTPType = oTPType;
    return this;
  }

  public void unsetOTPType() {
    this.oTPType = null;
  }

  /** Returns true if field oTPType is set (has been assigned a value) and false otherwise */
  public boolean isSetOTPType() {
    return this.oTPType != null;
  }

  public void setOTPTypeIsSet(boolean value) {
    if (!value) {
      this.oTPType = null;
    }
  }

  public String getFirstOTP() {
    return this.firstOTP;
  }

  public CThostFtdcManualSyncBrokerUserOTPField setFirstOTP(String firstOTP) {
    this.firstOTP = firstOTP;
    return this;
  }

  public void unsetFirstOTP() {
    this.firstOTP = null;
  }

  /** Returns true if field firstOTP is set (has been assigned a value) and false otherwise */
  public boolean isSetFirstOTP() {
    return this.firstOTP != null;
  }

  public void setFirstOTPIsSet(boolean value) {
    if (!value) {
      this.firstOTP = null;
    }
  }

  public String getSecondOTP() {
    return this.secondOTP;
  }

  public CThostFtdcManualSyncBrokerUserOTPField setSecondOTP(String secondOTP) {
    this.secondOTP = secondOTP;
    return this;
  }

  public void unsetSecondOTP() {
    this.secondOTP = null;
  }

  /** Returns true if field secondOTP is set (has been assigned a value) and false otherwise */
  public boolean isSetSecondOTP() {
    return this.secondOTP != null;
  }

  public void setSecondOTPIsSet(boolean value) {
    if (!value) {
      this.secondOTP = null;
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

    case O_TPTYPE:
      if (value == null) {
        unsetOTPType();
      } else {
        setOTPType((String)value);
      }
      break;

    case FIRST_OTP:
      if (value == null) {
        unsetFirstOTP();
      } else {
        setFirstOTP((String)value);
      }
      break;

    case SECOND_OTP:
      if (value == null) {
        unsetSecondOTP();
      } else {
        setSecondOTP((String)value);
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

    case O_TPTYPE:
      return getOTPType();

    case FIRST_OTP:
      return getFirstOTP();

    case SECOND_OTP:
      return getSecondOTP();

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
    case O_TPTYPE:
      return isSetOTPType();
    case FIRST_OTP:
      return isSetFirstOTP();
    case SECOND_OTP:
      return isSetSecondOTP();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcManualSyncBrokerUserOTPField)
      return this.equals((CThostFtdcManualSyncBrokerUserOTPField)that);
    return false;
  }

  public boolean equals(CThostFtdcManualSyncBrokerUserOTPField that) {
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

    boolean this_present_oTPType = true && this.isSetOTPType();
    boolean that_present_oTPType = true && that.isSetOTPType();
    if (this_present_oTPType || that_present_oTPType) {
      if (!(this_present_oTPType && that_present_oTPType))
        return false;
      if (!this.oTPType.equals(that.oTPType))
        return false;
    }

    boolean this_present_firstOTP = true && this.isSetFirstOTP();
    boolean that_present_firstOTP = true && that.isSetFirstOTP();
    if (this_present_firstOTP || that_present_firstOTP) {
      if (!(this_present_firstOTP && that_present_firstOTP))
        return false;
      if (!this.firstOTP.equals(that.firstOTP))
        return false;
    }

    boolean this_present_secondOTP = true && this.isSetSecondOTP();
    boolean that_present_secondOTP = true && that.isSetSecondOTP();
    if (this_present_secondOTP || that_present_secondOTP) {
      if (!(this_present_secondOTP && that_present_secondOTP))
        return false;
      if (!this.secondOTP.equals(that.secondOTP))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcManualSyncBrokerUserOTPField other) {
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
    lastComparison = Boolean.valueOf(isSetOTPType()).compareTo(other.isSetOTPType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOTPType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oTPType, other.oTPType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFirstOTP()).compareTo(other.isSetFirstOTP());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirstOTP()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.firstOTP, other.firstOTP);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecondOTP()).compareTo(other.isSetSecondOTP());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecondOTP()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.secondOTP, other.secondOTP);
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
    StringBuilder sb = new StringBuilder("CThostFtdcManualSyncBrokerUserOTPField(");
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
    sb.append("oTPType:");
    if (this.oTPType == null) {
      sb.append("null");
    } else {
      sb.append(this.oTPType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("firstOTP:");
    if (this.firstOTP == null) {
      sb.append("null");
    } else {
      sb.append(this.firstOTP);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("secondOTP:");
    if (this.secondOTP == null) {
      sb.append("null");
    } else {
      sb.append(this.secondOTP);
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

  private static class CThostFtdcManualSyncBrokerUserOTPFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcManualSyncBrokerUserOTPFieldStandardScheme getScheme() {
      return new CThostFtdcManualSyncBrokerUserOTPFieldStandardScheme();
    }
  }

  private static class CThostFtdcManualSyncBrokerUserOTPFieldStandardScheme extends StandardScheme<CThostFtdcManualSyncBrokerUserOTPField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcManualSyncBrokerUserOTPField struct) throws org.apache.thrift.TException {
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
          case 3: // O_TPTYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.oTPType = iprot.readString();
              struct.setOTPTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FIRST_OTP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.firstOTP = iprot.readString();
              struct.setFirstOTPIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SECOND_OTP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.secondOTP = iprot.readString();
              struct.setSecondOTPIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcManualSyncBrokerUserOTPField struct) throws org.apache.thrift.TException {
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
      if (struct.oTPType != null) {
        oprot.writeFieldBegin(O_TPTYPE_FIELD_DESC);
        oprot.writeString(struct.oTPType);
        oprot.writeFieldEnd();
      }
      if (struct.firstOTP != null) {
        oprot.writeFieldBegin(FIRST_OTP_FIELD_DESC);
        oprot.writeString(struct.firstOTP);
        oprot.writeFieldEnd();
      }
      if (struct.secondOTP != null) {
        oprot.writeFieldBegin(SECOND_OTP_FIELD_DESC);
        oprot.writeString(struct.secondOTP);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcManualSyncBrokerUserOTPFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcManualSyncBrokerUserOTPFieldTupleScheme getScheme() {
      return new CThostFtdcManualSyncBrokerUserOTPFieldTupleScheme();
    }
  }

  private static class CThostFtdcManualSyncBrokerUserOTPFieldTupleScheme extends TupleScheme<CThostFtdcManualSyncBrokerUserOTPField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcManualSyncBrokerUserOTPField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBrokerID()) {
        optionals.set(0);
      }
      if (struct.isSetUserID()) {
        optionals.set(1);
      }
      if (struct.isSetOTPType()) {
        optionals.set(2);
      }
      if (struct.isSetFirstOTP()) {
        optionals.set(3);
      }
      if (struct.isSetSecondOTP()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetUserID()) {
        oprot.writeString(struct.userID);
      }
      if (struct.isSetOTPType()) {
        oprot.writeString(struct.oTPType);
      }
      if (struct.isSetFirstOTP()) {
        oprot.writeString(struct.firstOTP);
      }
      if (struct.isSetSecondOTP()) {
        oprot.writeString(struct.secondOTP);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcManualSyncBrokerUserOTPField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userID = iprot.readString();
        struct.setUserIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.oTPType = iprot.readString();
        struct.setOTPTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.firstOTP = iprot.readString();
        struct.setFirstOTPIsSet(true);
      }
      if (incoming.get(4)) {
        struct.secondOTP = iprot.readString();
        struct.setSecondOTPIsSet(true);
      }
    }
  }

}

