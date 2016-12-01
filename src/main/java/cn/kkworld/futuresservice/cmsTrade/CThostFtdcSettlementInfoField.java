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

public class CThostFtdcSettlementInfoField implements org.apache.thrift.TBase<CThostFtdcSettlementInfoField, CThostFtdcSettlementInfoField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcSettlementInfoField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcSettlementInfoField");

  private static final org.apache.thrift.protocol.TField TRADING_DAY_FIELD_DESC = new org.apache.thrift.protocol.TField("tradingDay", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SETTLEMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("settlementID", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField INVESTOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("investorID", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField SEQUENCE_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("sequenceNo", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcSettlementInfoFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcSettlementInfoFieldTupleSchemeFactory());
  }

  public String tradingDay; // required
  public int settlementID; // required
  public String brokerID; // required
  public String investorID; // required
  public int sequenceNo; // required
  public String content; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRADING_DAY((short)1, "tradingDay"),
    SETTLEMENT_ID((short)2, "settlementID"),
    BROKER_ID((short)3, "brokerID"),
    INVESTOR_ID((short)4, "investorID"),
    SEQUENCE_NO((short)5, "sequenceNo"),
    CONTENT((short)6, "content");

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
        case 1: // TRADING_DAY
          return TRADING_DAY;
        case 2: // SETTLEMENT_ID
          return SETTLEMENT_ID;
        case 3: // BROKER_ID
          return BROKER_ID;
        case 4: // INVESTOR_ID
          return INVESTOR_ID;
        case 5: // SEQUENCE_NO
          return SEQUENCE_NO;
        case 6: // CONTENT
          return CONTENT;
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
  private static final int __SETTLEMENTID_ISSET_ID = 0;
  private static final int __SEQUENCENO_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRADING_DAY, new org.apache.thrift.meta_data.FieldMetaData("tradingDay", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcDateType")));
    tmpMap.put(_Fields.SETTLEMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("settlementID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcSettlementIDType")));
    tmpMap.put(_Fields.BROKER_ID, new org.apache.thrift.meta_data.FieldMetaData("brokerID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcBrokerIDType")));
    tmpMap.put(_Fields.INVESTOR_ID, new org.apache.thrift.meta_data.FieldMetaData("investorID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInvestorIDType")));
    tmpMap.put(_Fields.SEQUENCE_NO, new org.apache.thrift.meta_data.FieldMetaData("sequenceNo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcSequenceNoType")));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcContentType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcSettlementInfoField.class, metaDataMap);
  }

  public CThostFtdcSettlementInfoField() {
  }

  public CThostFtdcSettlementInfoField(
    String tradingDay,
    int settlementID,
    String brokerID,
    String investorID,
    int sequenceNo,
    String content)
  {
    this();
    this.tradingDay = tradingDay;
    this.settlementID = settlementID;
    setSettlementIDIsSet(true);
    this.brokerID = brokerID;
    this.investorID = investorID;
    this.sequenceNo = sequenceNo;
    setSequenceNoIsSet(true);
    this.content = content;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcSettlementInfoField(CThostFtdcSettlementInfoField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTradingDay()) {
      this.tradingDay = other.tradingDay;
    }
    this.settlementID = other.settlementID;
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetInvestorID()) {
      this.investorID = other.investorID;
    }
    this.sequenceNo = other.sequenceNo;
    if (other.isSetContent()) {
      this.content = other.content;
    }
  }

  public CThostFtdcSettlementInfoField deepCopy() {
    return new CThostFtdcSettlementInfoField(this);
  }

  @Override
  public void clear() {
    this.tradingDay = null;
    setSettlementIDIsSet(false);
    this.settlementID = 0;
    this.brokerID = null;
    this.investorID = null;
    setSequenceNoIsSet(false);
    this.sequenceNo = 0;
    this.content = null;
  }

  public String getTradingDay() {
    return this.tradingDay;
  }

  public CThostFtdcSettlementInfoField setTradingDay(String tradingDay) {
    this.tradingDay = tradingDay;
    return this;
  }

  public void unsetTradingDay() {
    this.tradingDay = null;
  }

  /** Returns true if field tradingDay is set (has been assigned a value) and false otherwise */
  public boolean isSetTradingDay() {
    return this.tradingDay != null;
  }

  public void setTradingDayIsSet(boolean value) {
    if (!value) {
      this.tradingDay = null;
    }
  }

  public int getSettlementID() {
    return this.settlementID;
  }

  public CThostFtdcSettlementInfoField setSettlementID(int settlementID) {
    this.settlementID = settlementID;
    setSettlementIDIsSet(true);
    return this;
  }

  public void unsetSettlementID() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SETTLEMENTID_ISSET_ID);
  }

  /** Returns true if field settlementID is set (has been assigned a value) and false otherwise */
  public boolean isSetSettlementID() {
    return EncodingUtils.testBit(__isset_bitfield, __SETTLEMENTID_ISSET_ID);
  }

  public void setSettlementIDIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SETTLEMENTID_ISSET_ID, value);
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcSettlementInfoField setBrokerID(String brokerID) {
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

  public String getInvestorID() {
    return this.investorID;
  }

  public CThostFtdcSettlementInfoField setInvestorID(String investorID) {
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

  public int getSequenceNo() {
    return this.sequenceNo;
  }

  public CThostFtdcSettlementInfoField setSequenceNo(int sequenceNo) {
    this.sequenceNo = sequenceNo;
    setSequenceNoIsSet(true);
    return this;
  }

  public void unsetSequenceNo() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEQUENCENO_ISSET_ID);
  }

  /** Returns true if field sequenceNo is set (has been assigned a value) and false otherwise */
  public boolean isSetSequenceNo() {
    return EncodingUtils.testBit(__isset_bitfield, __SEQUENCENO_ISSET_ID);
  }

  public void setSequenceNoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEQUENCENO_ISSET_ID, value);
  }

  public String getContent() {
    return this.content;
  }

  public CThostFtdcSettlementInfoField setContent(String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRADING_DAY:
      if (value == null) {
        unsetTradingDay();
      } else {
        setTradingDay((String)value);
      }
      break;

    case SETTLEMENT_ID:
      if (value == null) {
        unsetSettlementID();
      } else {
        setSettlementID((Integer)value);
      }
      break;

    case BROKER_ID:
      if (value == null) {
        unsetBrokerID();
      } else {
        setBrokerID((String)value);
      }
      break;

    case INVESTOR_ID:
      if (value == null) {
        unsetInvestorID();
      } else {
        setInvestorID((String)value);
      }
      break;

    case SEQUENCE_NO:
      if (value == null) {
        unsetSequenceNo();
      } else {
        setSequenceNo((Integer)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRADING_DAY:
      return getTradingDay();

    case SETTLEMENT_ID:
      return Integer.valueOf(getSettlementID());

    case BROKER_ID:
      return getBrokerID();

    case INVESTOR_ID:
      return getInvestorID();

    case SEQUENCE_NO:
      return Integer.valueOf(getSequenceNo());

    case CONTENT:
      return getContent();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRADING_DAY:
      return isSetTradingDay();
    case SETTLEMENT_ID:
      return isSetSettlementID();
    case BROKER_ID:
      return isSetBrokerID();
    case INVESTOR_ID:
      return isSetInvestorID();
    case SEQUENCE_NO:
      return isSetSequenceNo();
    case CONTENT:
      return isSetContent();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcSettlementInfoField)
      return this.equals((CThostFtdcSettlementInfoField)that);
    return false;
  }

  public boolean equals(CThostFtdcSettlementInfoField that) {
    if (that == null)
      return false;

    boolean this_present_tradingDay = true && this.isSetTradingDay();
    boolean that_present_tradingDay = true && that.isSetTradingDay();
    if (this_present_tradingDay || that_present_tradingDay) {
      if (!(this_present_tradingDay && that_present_tradingDay))
        return false;
      if (!this.tradingDay.equals(that.tradingDay))
        return false;
    }

    boolean this_present_settlementID = true;
    boolean that_present_settlementID = true;
    if (this_present_settlementID || that_present_settlementID) {
      if (!(this_present_settlementID && that_present_settlementID))
        return false;
      if (this.settlementID != that.settlementID)
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

    boolean this_present_investorID = true && this.isSetInvestorID();
    boolean that_present_investorID = true && that.isSetInvestorID();
    if (this_present_investorID || that_present_investorID) {
      if (!(this_present_investorID && that_present_investorID))
        return false;
      if (!this.investorID.equals(that.investorID))
        return false;
    }

    boolean this_present_sequenceNo = true;
    boolean that_present_sequenceNo = true;
    if (this_present_sequenceNo || that_present_sequenceNo) {
      if (!(this_present_sequenceNo && that_present_sequenceNo))
        return false;
      if (this.sequenceNo != that.sequenceNo)
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcSettlementInfoField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTradingDay()).compareTo(other.isSetTradingDay());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTradingDay()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tradingDay, other.tradingDay);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSettlementID()).compareTo(other.isSetSettlementID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSettlementID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.settlementID, other.settlementID);
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
    lastComparison = Boolean.valueOf(isSetSequenceNo()).compareTo(other.isSetSequenceNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequenceNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sequenceNo, other.sequenceNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
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
    StringBuilder sb = new StringBuilder("CThostFtdcSettlementInfoField(");
    boolean first = true;

    sb.append("tradingDay:");
    if (this.tradingDay == null) {
      sb.append("null");
    } else {
      sb.append(this.tradingDay);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("settlementID:");
    sb.append(this.settlementID);
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
    sb.append("investorID:");
    if (this.investorID == null) {
      sb.append("null");
    } else {
      sb.append(this.investorID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sequenceNo:");
    sb.append(this.sequenceNo);
    first = false;
    if (!first) sb.append(", ");
    sb.append("content:");
    if (this.content == null) {
      sb.append("null");
    } else {
      sb.append(this.content);
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

  private static class CThostFtdcSettlementInfoFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcSettlementInfoFieldStandardScheme getScheme() {
      return new CThostFtdcSettlementInfoFieldStandardScheme();
    }
  }

  private static class CThostFtdcSettlementInfoFieldStandardScheme extends StandardScheme<CThostFtdcSettlementInfoField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcSettlementInfoField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRADING_DAY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tradingDay = iprot.readString();
              struct.setTradingDayIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SETTLEMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.settlementID = iprot.readI32();
              struct.setSettlementIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BROKER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.brokerID = iprot.readString();
              struct.setBrokerIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INVESTOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.investorID = iprot.readString();
              struct.setInvestorIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SEQUENCE_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sequenceNo = iprot.readI32();
              struct.setSequenceNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcSettlementInfoField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tradingDay != null) {
        oprot.writeFieldBegin(TRADING_DAY_FIELD_DESC);
        oprot.writeString(struct.tradingDay);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SETTLEMENT_ID_FIELD_DESC);
      oprot.writeI32(struct.settlementID);
      oprot.writeFieldEnd();
      if (struct.brokerID != null) {
        oprot.writeFieldBegin(BROKER_ID_FIELD_DESC);
        oprot.writeString(struct.brokerID);
        oprot.writeFieldEnd();
      }
      if (struct.investorID != null) {
        oprot.writeFieldBegin(INVESTOR_ID_FIELD_DESC);
        oprot.writeString(struct.investorID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SEQUENCE_NO_FIELD_DESC);
      oprot.writeI32(struct.sequenceNo);
      oprot.writeFieldEnd();
      if (struct.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        oprot.writeString(struct.content);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcSettlementInfoFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcSettlementInfoFieldTupleScheme getScheme() {
      return new CThostFtdcSettlementInfoFieldTupleScheme();
    }
  }

  private static class CThostFtdcSettlementInfoFieldTupleScheme extends TupleScheme<CThostFtdcSettlementInfoField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcSettlementInfoField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTradingDay()) {
        optionals.set(0);
      }
      if (struct.isSetSettlementID()) {
        optionals.set(1);
      }
      if (struct.isSetBrokerID()) {
        optionals.set(2);
      }
      if (struct.isSetInvestorID()) {
        optionals.set(3);
      }
      if (struct.isSetSequenceNo()) {
        optionals.set(4);
      }
      if (struct.isSetContent()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetTradingDay()) {
        oprot.writeString(struct.tradingDay);
      }
      if (struct.isSetSettlementID()) {
        oprot.writeI32(struct.settlementID);
      }
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetInvestorID()) {
        oprot.writeString(struct.investorID);
      }
      if (struct.isSetSequenceNo()) {
        oprot.writeI32(struct.sequenceNo);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcSettlementInfoField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.tradingDay = iprot.readString();
        struct.setTradingDayIsSet(true);
      }
      if (incoming.get(1)) {
        struct.settlementID = iprot.readI32();
        struct.setSettlementIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(3)) {
        struct.investorID = iprot.readString();
        struct.setInvestorIDIsSet(true);
      }
      if (incoming.get(4)) {
        struct.sequenceNo = iprot.readI32();
        struct.setSequenceNoIsSet(true);
      }
      if (incoming.get(5)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
    }
  }

}
