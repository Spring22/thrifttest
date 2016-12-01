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

public class CThostFtdcBrokerUserOTPParamField implements org.apache.thrift.TBase<CThostFtdcBrokerUserOTPParamField, CThostFtdcBrokerUserOTPParamField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcBrokerUserOTPParamField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcBrokerUserOTPParamField");

  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField O_TPVENDORS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("oTPVendorsID", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SERIAL_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("serialNumber", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField AUTH_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("authKey", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField LAST_DRIFT_FIELD_DESC = new org.apache.thrift.protocol.TField("lastDrift", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField LAST_SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("lastSuccess", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField O_TPTYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("oTPType", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcBrokerUserOTPParamFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcBrokerUserOTPParamFieldTupleSchemeFactory());
  }

  public String brokerID; // required
  public String userID; // required
  public String oTPVendorsID; // required
  public String serialNumber; // required
  public String authKey; // required
  public int lastDrift; // required
  public int lastSuccess; // required
  public String oTPType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BROKER_ID((short)1, "brokerID"),
    USER_ID((short)2, "userID"),
    O_TPVENDORS_ID((short)3, "oTPVendorsID"),
    SERIAL_NUMBER((short)4, "serialNumber"),
    AUTH_KEY((short)5, "authKey"),
    LAST_DRIFT((short)6, "lastDrift"),
    LAST_SUCCESS((short)7, "lastSuccess"),
    O_TPTYPE((short)8, "oTPType");

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
        case 3: // O_TPVENDORS_ID
          return O_TPVENDORS_ID;
        case 4: // SERIAL_NUMBER
          return SERIAL_NUMBER;
        case 5: // AUTH_KEY
          return AUTH_KEY;
        case 6: // LAST_DRIFT
          return LAST_DRIFT;
        case 7: // LAST_SUCCESS
          return LAST_SUCCESS;
        case 8: // O_TPTYPE
          return O_TPTYPE;
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
  private static final int __LASTDRIFT_ISSET_ID = 0;
  private static final int __LASTSUCCESS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BROKER_ID, new org.apache.thrift.meta_data.FieldMetaData("brokerID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcBrokerIDType")));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcUserIDType")));
    tmpMap.put(_Fields.O_TPVENDORS_ID, new org.apache.thrift.meta_data.FieldMetaData("oTPVendorsID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcOTPVendorsIDType")));
    tmpMap.put(_Fields.SERIAL_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("serialNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcSerialNumberType")));
    tmpMap.put(_Fields.AUTH_KEY, new org.apache.thrift.meta_data.FieldMetaData("authKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcAuthKeyType")));
    tmpMap.put(_Fields.LAST_DRIFT, new org.apache.thrift.meta_data.FieldMetaData("lastDrift", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcLastDriftType")));
    tmpMap.put(_Fields.LAST_SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("lastSuccess", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcLastSuccessType")));
    tmpMap.put(_Fields.O_TPTYPE, new org.apache.thrift.meta_data.FieldMetaData("oTPType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcOTPTypeType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcBrokerUserOTPParamField.class, metaDataMap);
  }

  public CThostFtdcBrokerUserOTPParamField() {
  }

  public CThostFtdcBrokerUserOTPParamField(
    String brokerID,
    String userID,
    String oTPVendorsID,
    String serialNumber,
    String authKey,
    int lastDrift,
    int lastSuccess,
    String oTPType)
  {
    this();
    this.brokerID = brokerID;
    this.userID = userID;
    this.oTPVendorsID = oTPVendorsID;
    this.serialNumber = serialNumber;
    this.authKey = authKey;
    this.lastDrift = lastDrift;
    setLastDriftIsSet(true);
    this.lastSuccess = lastSuccess;
    setLastSuccessIsSet(true);
    this.oTPType = oTPType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcBrokerUserOTPParamField(CThostFtdcBrokerUserOTPParamField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetUserID()) {
      this.userID = other.userID;
    }
    if (other.isSetOTPVendorsID()) {
      this.oTPVendorsID = other.oTPVendorsID;
    }
    if (other.isSetSerialNumber()) {
      this.serialNumber = other.serialNumber;
    }
    if (other.isSetAuthKey()) {
      this.authKey = other.authKey;
    }
    this.lastDrift = other.lastDrift;
    this.lastSuccess = other.lastSuccess;
    if (other.isSetOTPType()) {
      this.oTPType = other.oTPType;
    }
  }

  public CThostFtdcBrokerUserOTPParamField deepCopy() {
    return new CThostFtdcBrokerUserOTPParamField(this);
  }

  @Override
  public void clear() {
    this.brokerID = null;
    this.userID = null;
    this.oTPVendorsID = null;
    this.serialNumber = null;
    this.authKey = null;
    setLastDriftIsSet(false);
    this.lastDrift = 0;
    setLastSuccessIsSet(false);
    this.lastSuccess = 0;
    this.oTPType = null;
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcBrokerUserOTPParamField setBrokerID(String brokerID) {
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

  public CThostFtdcBrokerUserOTPParamField setUserID(String userID) {
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

  public String getOTPVendorsID() {
    return this.oTPVendorsID;
  }

  public CThostFtdcBrokerUserOTPParamField setOTPVendorsID(String oTPVendorsID) {
    this.oTPVendorsID = oTPVendorsID;
    return this;
  }

  public void unsetOTPVendorsID() {
    this.oTPVendorsID = null;
  }

  /** Returns true if field oTPVendorsID is set (has been assigned a value) and false otherwise */
  public boolean isSetOTPVendorsID() {
    return this.oTPVendorsID != null;
  }

  public void setOTPVendorsIDIsSet(boolean value) {
    if (!value) {
      this.oTPVendorsID = null;
    }
  }

  public String getSerialNumber() {
    return this.serialNumber;
  }

  public CThostFtdcBrokerUserOTPParamField setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  public void unsetSerialNumber() {
    this.serialNumber = null;
  }

  /** Returns true if field serialNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetSerialNumber() {
    return this.serialNumber != null;
  }

  public void setSerialNumberIsSet(boolean value) {
    if (!value) {
      this.serialNumber = null;
    }
  }

  public String getAuthKey() {
    return this.authKey;
  }

  public CThostFtdcBrokerUserOTPParamField setAuthKey(String authKey) {
    this.authKey = authKey;
    return this;
  }

  public void unsetAuthKey() {
    this.authKey = null;
  }

  /** Returns true if field authKey is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthKey() {
    return this.authKey != null;
  }

  public void setAuthKeyIsSet(boolean value) {
    if (!value) {
      this.authKey = null;
    }
  }

  public int getLastDrift() {
    return this.lastDrift;
  }

  public CThostFtdcBrokerUserOTPParamField setLastDrift(int lastDrift) {
    this.lastDrift = lastDrift;
    setLastDriftIsSet(true);
    return this;
  }

  public void unsetLastDrift() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTDRIFT_ISSET_ID);
  }

  /** Returns true if field lastDrift is set (has been assigned a value) and false otherwise */
  public boolean isSetLastDrift() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTDRIFT_ISSET_ID);
  }

  public void setLastDriftIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTDRIFT_ISSET_ID, value);
  }

  public int getLastSuccess() {
    return this.lastSuccess;
  }

  public CThostFtdcBrokerUserOTPParamField setLastSuccess(int lastSuccess) {
    this.lastSuccess = lastSuccess;
    setLastSuccessIsSet(true);
    return this;
  }

  public void unsetLastSuccess() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTSUCCESS_ISSET_ID);
  }

  /** Returns true if field lastSuccess is set (has been assigned a value) and false otherwise */
  public boolean isSetLastSuccess() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTSUCCESS_ISSET_ID);
  }

  public void setLastSuccessIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTSUCCESS_ISSET_ID, value);
  }

  public String getOTPType() {
    return this.oTPType;
  }

  public CThostFtdcBrokerUserOTPParamField setOTPType(String oTPType) {
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

    case O_TPVENDORS_ID:
      if (value == null) {
        unsetOTPVendorsID();
      } else {
        setOTPVendorsID((String)value);
      }
      break;

    case SERIAL_NUMBER:
      if (value == null) {
        unsetSerialNumber();
      } else {
        setSerialNumber((String)value);
      }
      break;

    case AUTH_KEY:
      if (value == null) {
        unsetAuthKey();
      } else {
        setAuthKey((String)value);
      }
      break;

    case LAST_DRIFT:
      if (value == null) {
        unsetLastDrift();
      } else {
        setLastDrift((Integer)value);
      }
      break;

    case LAST_SUCCESS:
      if (value == null) {
        unsetLastSuccess();
      } else {
        setLastSuccess((Integer)value);
      }
      break;

    case O_TPTYPE:
      if (value == null) {
        unsetOTPType();
      } else {
        setOTPType((String)value);
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

    case O_TPVENDORS_ID:
      return getOTPVendorsID();

    case SERIAL_NUMBER:
      return getSerialNumber();

    case AUTH_KEY:
      return getAuthKey();

    case LAST_DRIFT:
      return Integer.valueOf(getLastDrift());

    case LAST_SUCCESS:
      return Integer.valueOf(getLastSuccess());

    case O_TPTYPE:
      return getOTPType();

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
    case O_TPVENDORS_ID:
      return isSetOTPVendorsID();
    case SERIAL_NUMBER:
      return isSetSerialNumber();
    case AUTH_KEY:
      return isSetAuthKey();
    case LAST_DRIFT:
      return isSetLastDrift();
    case LAST_SUCCESS:
      return isSetLastSuccess();
    case O_TPTYPE:
      return isSetOTPType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcBrokerUserOTPParamField)
      return this.equals((CThostFtdcBrokerUserOTPParamField)that);
    return false;
  }

  public boolean equals(CThostFtdcBrokerUserOTPParamField that) {
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

    boolean this_present_oTPVendorsID = true && this.isSetOTPVendorsID();
    boolean that_present_oTPVendorsID = true && that.isSetOTPVendorsID();
    if (this_present_oTPVendorsID || that_present_oTPVendorsID) {
      if (!(this_present_oTPVendorsID && that_present_oTPVendorsID))
        return false;
      if (!this.oTPVendorsID.equals(that.oTPVendorsID))
        return false;
    }

    boolean this_present_serialNumber = true && this.isSetSerialNumber();
    boolean that_present_serialNumber = true && that.isSetSerialNumber();
    if (this_present_serialNumber || that_present_serialNumber) {
      if (!(this_present_serialNumber && that_present_serialNumber))
        return false;
      if (!this.serialNumber.equals(that.serialNumber))
        return false;
    }

    boolean this_present_authKey = true && this.isSetAuthKey();
    boolean that_present_authKey = true && that.isSetAuthKey();
    if (this_present_authKey || that_present_authKey) {
      if (!(this_present_authKey && that_present_authKey))
        return false;
      if (!this.authKey.equals(that.authKey))
        return false;
    }

    boolean this_present_lastDrift = true;
    boolean that_present_lastDrift = true;
    if (this_present_lastDrift || that_present_lastDrift) {
      if (!(this_present_lastDrift && that_present_lastDrift))
        return false;
      if (this.lastDrift != that.lastDrift)
        return false;
    }

    boolean this_present_lastSuccess = true;
    boolean that_present_lastSuccess = true;
    if (this_present_lastSuccess || that_present_lastSuccess) {
      if (!(this_present_lastSuccess && that_present_lastSuccess))
        return false;
      if (this.lastSuccess != that.lastSuccess)
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

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcBrokerUserOTPParamField other) {
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
    lastComparison = Boolean.valueOf(isSetOTPVendorsID()).compareTo(other.isSetOTPVendorsID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOTPVendorsID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oTPVendorsID, other.oTPVendorsID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSerialNumber()).compareTo(other.isSetSerialNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSerialNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serialNumber, other.serialNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAuthKey()).compareTo(other.isSetAuthKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authKey, other.authKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastDrift()).compareTo(other.isSetLastDrift());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastDrift()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastDrift, other.lastDrift);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastSuccess()).compareTo(other.isSetLastSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastSuccess, other.lastSuccess);
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
    StringBuilder sb = new StringBuilder("CThostFtdcBrokerUserOTPParamField(");
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
    sb.append("oTPVendorsID:");
    if (this.oTPVendorsID == null) {
      sb.append("null");
    } else {
      sb.append(this.oTPVendorsID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("serialNumber:");
    if (this.serialNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.serialNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("authKey:");
    if (this.authKey == null) {
      sb.append("null");
    } else {
      sb.append(this.authKey);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastDrift:");
    sb.append(this.lastDrift);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastSuccess:");
    sb.append(this.lastSuccess);
    first = false;
    if (!first) sb.append(", ");
    sb.append("oTPType:");
    if (this.oTPType == null) {
      sb.append("null");
    } else {
      sb.append(this.oTPType);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CThostFtdcBrokerUserOTPParamFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcBrokerUserOTPParamFieldStandardScheme getScheme() {
      return new CThostFtdcBrokerUserOTPParamFieldStandardScheme();
    }
  }

  private static class CThostFtdcBrokerUserOTPParamFieldStandardScheme extends StandardScheme<CThostFtdcBrokerUserOTPParamField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcBrokerUserOTPParamField struct) throws org.apache.thrift.TException {
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
          case 3: // O_TPVENDORS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.oTPVendorsID = iprot.readString();
              struct.setOTPVendorsIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SERIAL_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serialNumber = iprot.readString();
              struct.setSerialNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AUTH_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.authKey = iprot.readString();
              struct.setAuthKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LAST_DRIFT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.lastDrift = iprot.readI32();
              struct.setLastDriftIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // LAST_SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.lastSuccess = iprot.readI32();
              struct.setLastSuccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // O_TPTYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.oTPType = iprot.readString();
              struct.setOTPTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcBrokerUserOTPParamField struct) throws org.apache.thrift.TException {
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
      if (struct.oTPVendorsID != null) {
        oprot.writeFieldBegin(O_TPVENDORS_ID_FIELD_DESC);
        oprot.writeString(struct.oTPVendorsID);
        oprot.writeFieldEnd();
      }
      if (struct.serialNumber != null) {
        oprot.writeFieldBegin(SERIAL_NUMBER_FIELD_DESC);
        oprot.writeString(struct.serialNumber);
        oprot.writeFieldEnd();
      }
      if (struct.authKey != null) {
        oprot.writeFieldBegin(AUTH_KEY_FIELD_DESC);
        oprot.writeString(struct.authKey);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LAST_DRIFT_FIELD_DESC);
      oprot.writeI32(struct.lastDrift);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_SUCCESS_FIELD_DESC);
      oprot.writeI32(struct.lastSuccess);
      oprot.writeFieldEnd();
      if (struct.oTPType != null) {
        oprot.writeFieldBegin(O_TPTYPE_FIELD_DESC);
        oprot.writeString(struct.oTPType);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcBrokerUserOTPParamFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcBrokerUserOTPParamFieldTupleScheme getScheme() {
      return new CThostFtdcBrokerUserOTPParamFieldTupleScheme();
    }
  }

  private static class CThostFtdcBrokerUserOTPParamFieldTupleScheme extends TupleScheme<CThostFtdcBrokerUserOTPParamField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcBrokerUserOTPParamField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBrokerID()) {
        optionals.set(0);
      }
      if (struct.isSetUserID()) {
        optionals.set(1);
      }
      if (struct.isSetOTPVendorsID()) {
        optionals.set(2);
      }
      if (struct.isSetSerialNumber()) {
        optionals.set(3);
      }
      if (struct.isSetAuthKey()) {
        optionals.set(4);
      }
      if (struct.isSetLastDrift()) {
        optionals.set(5);
      }
      if (struct.isSetLastSuccess()) {
        optionals.set(6);
      }
      if (struct.isSetOTPType()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetUserID()) {
        oprot.writeString(struct.userID);
      }
      if (struct.isSetOTPVendorsID()) {
        oprot.writeString(struct.oTPVendorsID);
      }
      if (struct.isSetSerialNumber()) {
        oprot.writeString(struct.serialNumber);
      }
      if (struct.isSetAuthKey()) {
        oprot.writeString(struct.authKey);
      }
      if (struct.isSetLastDrift()) {
        oprot.writeI32(struct.lastDrift);
      }
      if (struct.isSetLastSuccess()) {
        oprot.writeI32(struct.lastSuccess);
      }
      if (struct.isSetOTPType()) {
        oprot.writeString(struct.oTPType);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcBrokerUserOTPParamField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userID = iprot.readString();
        struct.setUserIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.oTPVendorsID = iprot.readString();
        struct.setOTPVendorsIDIsSet(true);
      }
      if (incoming.get(3)) {
        struct.serialNumber = iprot.readString();
        struct.setSerialNumberIsSet(true);
      }
      if (incoming.get(4)) {
        struct.authKey = iprot.readString();
        struct.setAuthKeyIsSet(true);
      }
      if (incoming.get(5)) {
        struct.lastDrift = iprot.readI32();
        struct.setLastDriftIsSet(true);
      }
      if (incoming.get(6)) {
        struct.lastSuccess = iprot.readI32();
        struct.setLastSuccessIsSet(true);
      }
      if (incoming.get(7)) {
        struct.oTPType = iprot.readString();
        struct.setOTPTypeIsSet(true);
      }
    }
  }

}

