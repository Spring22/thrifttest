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

public class CThostFtdcTradingCodeField implements org.apache.thrift.TBase<CThostFtdcTradingCodeField, CThostFtdcTradingCodeField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcTradingCodeField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcTradingCodeField");

  private static final org.apache.thrift.protocol.TField INVESTOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("investorID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXCHANGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("exchangeID", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CLIENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("clientID", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField IS_ACTIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("isActive", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField CLIENT_IDTYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("clientIDType", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcTradingCodeFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcTradingCodeFieldTupleSchemeFactory());
  }

  public String investorID; // required
  public String brokerID; // required
  public String exchangeID; // required
  public String clientID; // required
  public int isActive; // required
  public String clientIDType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INVESTOR_ID((short)1, "investorID"),
    BROKER_ID((short)2, "brokerID"),
    EXCHANGE_ID((short)3, "exchangeID"),
    CLIENT_ID((short)4, "clientID"),
    IS_ACTIVE((short)5, "isActive"),
    CLIENT_IDTYPE((short)6, "clientIDType");

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
        case 1: // INVESTOR_ID
          return INVESTOR_ID;
        case 2: // BROKER_ID
          return BROKER_ID;
        case 3: // EXCHANGE_ID
          return EXCHANGE_ID;
        case 4: // CLIENT_ID
          return CLIENT_ID;
        case 5: // IS_ACTIVE
          return IS_ACTIVE;
        case 6: // CLIENT_IDTYPE
          return CLIENT_IDTYPE;
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
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INVESTOR_ID, new org.apache.thrift.meta_data.FieldMetaData("investorID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInvestorIDType")));
    tmpMap.put(_Fields.BROKER_ID, new org.apache.thrift.meta_data.FieldMetaData("brokerID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcBrokerIDType")));
    tmpMap.put(_Fields.EXCHANGE_ID, new org.apache.thrift.meta_data.FieldMetaData("exchangeID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcExchangeIDType")));
    tmpMap.put(_Fields.CLIENT_ID, new org.apache.thrift.meta_data.FieldMetaData("clientID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcClientIDType")));
    tmpMap.put(_Fields.IS_ACTIVE, new org.apache.thrift.meta_data.FieldMetaData("isActive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcBoolType")));
    tmpMap.put(_Fields.CLIENT_IDTYPE, new org.apache.thrift.meta_data.FieldMetaData("clientIDType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcClientIDTypeType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcTradingCodeField.class, metaDataMap);
  }

  public CThostFtdcTradingCodeField() {
  }

  public CThostFtdcTradingCodeField(
    String investorID,
    String brokerID,
    String exchangeID,
    String clientID,
    int isActive,
    String clientIDType)
  {
    this();
    this.investorID = investorID;
    this.brokerID = brokerID;
    this.exchangeID = exchangeID;
    this.clientID = clientID;
    this.isActive = isActive;
    setIsActiveIsSet(true);
    this.clientIDType = clientIDType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcTradingCodeField(CThostFtdcTradingCodeField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetInvestorID()) {
      this.investorID = other.investorID;
    }
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetExchangeID()) {
      this.exchangeID = other.exchangeID;
    }
    if (other.isSetClientID()) {
      this.clientID = other.clientID;
    }
    this.isActive = other.isActive;
    if (other.isSetClientIDType()) {
      this.clientIDType = other.clientIDType;
    }
  }

  public CThostFtdcTradingCodeField deepCopy() {
    return new CThostFtdcTradingCodeField(this);
  }

  @Override
  public void clear() {
    this.investorID = null;
    this.brokerID = null;
    this.exchangeID = null;
    this.clientID = null;
    setIsActiveIsSet(false);
    this.isActive = 0;
    this.clientIDType = null;
  }

  public String getInvestorID() {
    return this.investorID;
  }

  public CThostFtdcTradingCodeField setInvestorID(String investorID) {
    this.investorID = investorID;
    return this;
  }

  public void unsetInvestorID() {
    this.investorID = null;
  }

  /** Returns true if field investorID is set (has been assigned a value) and false otherwise */
  public boolean isSetInvestorID() {
    return this.investorID != null;
  }

  public void setInvestorIDIsSet(boolean value) {
    if (!value) {
      this.investorID = null;
    }
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcTradingCodeField setBrokerID(String brokerID) {
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

  public String getExchangeID() {
    return this.exchangeID;
  }

  public CThostFtdcTradingCodeField setExchangeID(String exchangeID) {
    this.exchangeID = exchangeID;
    return this;
  }

  public void unsetExchangeID() {
    this.exchangeID = null;
  }

  /** Returns true if field exchangeID is set (has been assigned a value) and false otherwise */
  public boolean isSetExchangeID() {
    return this.exchangeID != null;
  }

  public void setExchangeIDIsSet(boolean value) {
    if (!value) {
      this.exchangeID = null;
    }
  }

  public String getClientID() {
    return this.clientID;
  }

  public CThostFtdcTradingCodeField setClientID(String clientID) {
    this.clientID = clientID;
    return this;
  }

  public void unsetClientID() {
    this.clientID = null;
  }

  /** Returns true if field clientID is set (has been assigned a value) and false otherwise */
  public boolean isSetClientID() {
    return this.clientID != null;
  }

  public void setClientIDIsSet(boolean value) {
    if (!value) {
      this.clientID = null;
    }
  }

  public int getIsActive() {
    return this.isActive;
  }

  public CThostFtdcTradingCodeField setIsActive(int isActive) {
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

  public String getClientIDType() {
    return this.clientIDType;
  }

  public CThostFtdcTradingCodeField setClientIDType(String clientIDType) {
    this.clientIDType = clientIDType;
    return this;
  }

  public void unsetClientIDType() {
    this.clientIDType = null;
  }

  /** Returns true if field clientIDType is set (has been assigned a value) and false otherwise */
  public boolean isSetClientIDType() {
    return this.clientIDType != null;
  }

  public void setClientIDTypeIsSet(boolean value) {
    if (!value) {
      this.clientIDType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INVESTOR_ID:
      if (value == null) {
        unsetInvestorID();
      } else {
        setInvestorID((String)value);
      }
      break;

    case BROKER_ID:
      if (value == null) {
        unsetBrokerID();
      } else {
        setBrokerID((String)value);
      }
      break;

    case EXCHANGE_ID:
      if (value == null) {
        unsetExchangeID();
      } else {
        setExchangeID((String)value);
      }
      break;

    case CLIENT_ID:
      if (value == null) {
        unsetClientID();
      } else {
        setClientID((String)value);
      }
      break;

    case IS_ACTIVE:
      if (value == null) {
        unsetIsActive();
      } else {
        setIsActive((Integer)value);
      }
      break;

    case CLIENT_IDTYPE:
      if (value == null) {
        unsetClientIDType();
      } else {
        setClientIDType((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INVESTOR_ID:
      return getInvestorID();

    case BROKER_ID:
      return getBrokerID();

    case EXCHANGE_ID:
      return getExchangeID();

    case CLIENT_ID:
      return getClientID();

    case IS_ACTIVE:
      return Integer.valueOf(getIsActive());

    case CLIENT_IDTYPE:
      return getClientIDType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INVESTOR_ID:
      return isSetInvestorID();
    case BROKER_ID:
      return isSetBrokerID();
    case EXCHANGE_ID:
      return isSetExchangeID();
    case CLIENT_ID:
      return isSetClientID();
    case IS_ACTIVE:
      return isSetIsActive();
    case CLIENT_IDTYPE:
      return isSetClientIDType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcTradingCodeField)
      return this.equals((CThostFtdcTradingCodeField)that);
    return false;
  }

  public boolean equals(CThostFtdcTradingCodeField that) {
    if (that == null)
      return false;

    boolean this_present_investorID = true && this.isSetInvestorID();
    boolean that_present_investorID = true && that.isSetInvestorID();
    if (this_present_investorID || that_present_investorID) {
      if (!(this_present_investorID && that_present_investorID))
        return false;
      if (!this.investorID.equals(that.investorID))
        return false;
    }

    boolean this_present_brokerID = true && this.isSetBrokerID();
    boolean that_present_brokerID = true && that.isSetBrokerID();
    if (this_present_brokerID || that_present_brokerID) {
      if (!(this_present_brokerID && that_present_brokerID))
        return false;
      if (!this.brokerID.equals(that.brokerID))
        return false;
    }

    boolean this_present_exchangeID = true && this.isSetExchangeID();
    boolean that_present_exchangeID = true && that.isSetExchangeID();
    if (this_present_exchangeID || that_present_exchangeID) {
      if (!(this_present_exchangeID && that_present_exchangeID))
        return false;
      if (!this.exchangeID.equals(that.exchangeID))
        return false;
    }

    boolean this_present_clientID = true && this.isSetClientID();
    boolean that_present_clientID = true && that.isSetClientID();
    if (this_present_clientID || that_present_clientID) {
      if (!(this_present_clientID && that_present_clientID))
        return false;
      if (!this.clientID.equals(that.clientID))
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

    boolean this_present_clientIDType = true && this.isSetClientIDType();
    boolean that_present_clientIDType = true && that.isSetClientIDType();
    if (this_present_clientIDType || that_present_clientIDType) {
      if (!(this_present_clientIDType && that_present_clientIDType))
        return false;
      if (!this.clientIDType.equals(that.clientIDType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcTradingCodeField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetInvestorID()).compareTo(other.isSetInvestorID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvestorID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.investorID, other.investorID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetExchangeID()).compareTo(other.isSetExchangeID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExchangeID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exchangeID, other.exchangeID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClientID()).compareTo(other.isSetClientID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClientID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clientID, other.clientID);
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
    lastComparison = Boolean.valueOf(isSetClientIDType()).compareTo(other.isSetClientIDType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClientIDType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clientIDType, other.clientIDType);
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
    StringBuilder sb = new StringBuilder("CThostFtdcTradingCodeField(");
    boolean first = true;

    sb.append("investorID:");
    if (this.investorID == null) {
      sb.append("null");
    } else {
      sb.append(this.investorID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("brokerID:");
    if (this.brokerID == null) {
      sb.append("null");
    } else {
      sb.append(this.brokerID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("exchangeID:");
    if (this.exchangeID == null) {
      sb.append("null");
    } else {
      sb.append(this.exchangeID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("clientID:");
    if (this.clientID == null) {
      sb.append("null");
    } else {
      sb.append(this.clientID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isActive:");
    sb.append(this.isActive);
    first = false;
    if (!first) sb.append(", ");
    sb.append("clientIDType:");
    if (this.clientIDType == null) {
      sb.append("null");
    } else {
      sb.append(this.clientIDType);
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

  private static class CThostFtdcTradingCodeFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcTradingCodeFieldStandardScheme getScheme() {
      return new CThostFtdcTradingCodeFieldStandardScheme();
    }
  }

  private static class CThostFtdcTradingCodeFieldStandardScheme extends StandardScheme<CThostFtdcTradingCodeField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcTradingCodeField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INVESTOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.investorID = iprot.readString();
              struct.setInvestorIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BROKER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.brokerID = iprot.readString();
              struct.setBrokerIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXCHANGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exchangeID = iprot.readString();
              struct.setExchangeIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CLIENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clientID = iprot.readString();
              struct.setClientIDIsSet(true);
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
          case 6: // CLIENT_IDTYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clientIDType = iprot.readString();
              struct.setClientIDTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcTradingCodeField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.investorID != null) {
        oprot.writeFieldBegin(INVESTOR_ID_FIELD_DESC);
        oprot.writeString(struct.investorID);
        oprot.writeFieldEnd();
      }
      if (struct.brokerID != null) {
        oprot.writeFieldBegin(BROKER_ID_FIELD_DESC);
        oprot.writeString(struct.brokerID);
        oprot.writeFieldEnd();
      }
      if (struct.exchangeID != null) {
        oprot.writeFieldBegin(EXCHANGE_ID_FIELD_DESC);
        oprot.writeString(struct.exchangeID);
        oprot.writeFieldEnd();
      }
      if (struct.clientID != null) {
        oprot.writeFieldBegin(CLIENT_ID_FIELD_DESC);
        oprot.writeString(struct.clientID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_ACTIVE_FIELD_DESC);
      oprot.writeI32(struct.isActive);
      oprot.writeFieldEnd();
      if (struct.clientIDType != null) {
        oprot.writeFieldBegin(CLIENT_IDTYPE_FIELD_DESC);
        oprot.writeString(struct.clientIDType);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcTradingCodeFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcTradingCodeFieldTupleScheme getScheme() {
      return new CThostFtdcTradingCodeFieldTupleScheme();
    }
  }

  private static class CThostFtdcTradingCodeFieldTupleScheme extends TupleScheme<CThostFtdcTradingCodeField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcTradingCodeField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetInvestorID()) {
        optionals.set(0);
      }
      if (struct.isSetBrokerID()) {
        optionals.set(1);
      }
      if (struct.isSetExchangeID()) {
        optionals.set(2);
      }
      if (struct.isSetClientID()) {
        optionals.set(3);
      }
      if (struct.isSetIsActive()) {
        optionals.set(4);
      }
      if (struct.isSetClientIDType()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetInvestorID()) {
        oprot.writeString(struct.investorID);
      }
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetExchangeID()) {
        oprot.writeString(struct.exchangeID);
      }
      if (struct.isSetClientID()) {
        oprot.writeString(struct.clientID);
      }
      if (struct.isSetIsActive()) {
        oprot.writeI32(struct.isActive);
      }
      if (struct.isSetClientIDType()) {
        oprot.writeString(struct.clientIDType);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcTradingCodeField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.investorID = iprot.readString();
        struct.setInvestorIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.exchangeID = iprot.readString();
        struct.setExchangeIDIsSet(true);
      }
      if (incoming.get(3)) {
        struct.clientID = iprot.readString();
        struct.setClientIDIsSet(true);
      }
      if (incoming.get(4)) {
        struct.isActive = iprot.readI32();
        struct.setIsActiveIsSet(true);
      }
      if (incoming.get(5)) {
        struct.clientIDType = iprot.readString();
        struct.setClientIDTypeIsSet(true);
      }
    }
  }

}
