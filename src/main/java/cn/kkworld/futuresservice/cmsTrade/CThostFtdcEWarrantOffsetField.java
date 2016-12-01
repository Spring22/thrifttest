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

public class CThostFtdcEWarrantOffsetField implements org.apache.thrift.TBase<CThostFtdcEWarrantOffsetField, CThostFtdcEWarrantOffsetField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcEWarrantOffsetField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcEWarrantOffsetField");

  private static final org.apache.thrift.protocol.TField TRADING_DAY_FIELD_DESC = new org.apache.thrift.protocol.TField("tradingDay", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField INVESTOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("investorID", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EXCHANGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("exchangeID", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField INSTRUMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("instrumentID", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField DIRECTION_FIELD_DESC = new org.apache.thrift.protocol.TField("direction", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField HEDGE_FLAG_FIELD_DESC = new org.apache.thrift.protocol.TField("hedgeFlag", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField VOLUME_FIELD_DESC = new org.apache.thrift.protocol.TField("volume", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcEWarrantOffsetFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcEWarrantOffsetFieldTupleSchemeFactory());
  }

  public String tradingDay; // required
  public String brokerID; // required
  public String investorID; // required
  public String exchangeID; // required
  public String instrumentID; // required
  public String direction; // required
  public String hedgeFlag; // required
  public int volume; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRADING_DAY((short)1, "tradingDay"),
    BROKER_ID((short)2, "brokerID"),
    INVESTOR_ID((short)3, "investorID"),
    EXCHANGE_ID((short)4, "exchangeID"),
    INSTRUMENT_ID((short)5, "instrumentID"),
    DIRECTION((short)6, "direction"),
    HEDGE_FLAG((short)7, "hedgeFlag"),
    VOLUME((short)8, "volume");

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
        case 2: // BROKER_ID
          return BROKER_ID;
        case 3: // INVESTOR_ID
          return INVESTOR_ID;
        case 4: // EXCHANGE_ID
          return EXCHANGE_ID;
        case 5: // INSTRUMENT_ID
          return INSTRUMENT_ID;
        case 6: // DIRECTION
          return DIRECTION;
        case 7: // HEDGE_FLAG
          return HEDGE_FLAG;
        case 8: // VOLUME
          return VOLUME;
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
  private static final int __VOLUME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRADING_DAY, new org.apache.thrift.meta_data.FieldMetaData("tradingDay", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcTradeDateType")));
    tmpMap.put(_Fields.BROKER_ID, new org.apache.thrift.meta_data.FieldMetaData("brokerID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcBrokerIDType")));
    tmpMap.put(_Fields.INVESTOR_ID, new org.apache.thrift.meta_data.FieldMetaData("investorID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInvestorIDType")));
    tmpMap.put(_Fields.EXCHANGE_ID, new org.apache.thrift.meta_data.FieldMetaData("exchangeID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcExchangeIDType")));
    tmpMap.put(_Fields.INSTRUMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("instrumentID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInstrumentIDType")));
    tmpMap.put(_Fields.DIRECTION, new org.apache.thrift.meta_data.FieldMetaData("direction", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcDirectionType")));
    tmpMap.put(_Fields.HEDGE_FLAG, new org.apache.thrift.meta_data.FieldMetaData("hedgeFlag", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcHedgeFlagType")));
    tmpMap.put(_Fields.VOLUME, new org.apache.thrift.meta_data.FieldMetaData("volume", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcVolumeType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcEWarrantOffsetField.class, metaDataMap);
  }

  public CThostFtdcEWarrantOffsetField() {
  }

  public CThostFtdcEWarrantOffsetField(
    String tradingDay,
    String brokerID,
    String investorID,
    String exchangeID,
    String instrumentID,
    String direction,
    String hedgeFlag,
    int volume)
  {
    this();
    this.tradingDay = tradingDay;
    this.brokerID = brokerID;
    this.investorID = investorID;
    this.exchangeID = exchangeID;
    this.instrumentID = instrumentID;
    this.direction = direction;
    this.hedgeFlag = hedgeFlag;
    this.volume = volume;
    setVolumeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcEWarrantOffsetField(CThostFtdcEWarrantOffsetField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTradingDay()) {
      this.tradingDay = other.tradingDay;
    }
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetInvestorID()) {
      this.investorID = other.investorID;
    }
    if (other.isSetExchangeID()) {
      this.exchangeID = other.exchangeID;
    }
    if (other.isSetInstrumentID()) {
      this.instrumentID = other.instrumentID;
    }
    if (other.isSetDirection()) {
      this.direction = other.direction;
    }
    if (other.isSetHedgeFlag()) {
      this.hedgeFlag = other.hedgeFlag;
    }
    this.volume = other.volume;
  }

  public CThostFtdcEWarrantOffsetField deepCopy() {
    return new CThostFtdcEWarrantOffsetField(this);
  }

  @Override
  public void clear() {
    this.tradingDay = null;
    this.brokerID = null;
    this.investorID = null;
    this.exchangeID = null;
    this.instrumentID = null;
    this.direction = null;
    this.hedgeFlag = null;
    setVolumeIsSet(false);
    this.volume = 0;
  }

  public String getTradingDay() {
    return this.tradingDay;
  }

  public CThostFtdcEWarrantOffsetField setTradingDay(String tradingDay) {
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

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcEWarrantOffsetField setBrokerID(String brokerID) {
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

  public CThostFtdcEWarrantOffsetField setInvestorID(String investorID) {
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

  public String getExchangeID() {
    return this.exchangeID;
  }

  public CThostFtdcEWarrantOffsetField setExchangeID(String exchangeID) {
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

  public String getInstrumentID() {
    return this.instrumentID;
  }

  public CThostFtdcEWarrantOffsetField setInstrumentID(String instrumentID) {
    this.instrumentID = instrumentID;
    return this;
  }

  public void unsetInstrumentID() {
    this.instrumentID = null;
  }

  /** Returns true if field instrumentID is set (has been assigned a value) and false otherwise */
  public boolean isSetInstrumentID() {
    return this.instrumentID != null;
  }

  public void setInstrumentIDIsSet(boolean value) {
    if (!value) {
      this.instrumentID = null;
    }
  }

  public String getDirection() {
    return this.direction;
  }

  public CThostFtdcEWarrantOffsetField setDirection(String direction) {
    this.direction = direction;
    return this;
  }

  public void unsetDirection() {
    this.direction = null;
  }

  /** Returns true if field direction is set (has been assigned a value) and false otherwise */
  public boolean isSetDirection() {
    return this.direction != null;
  }

  public void setDirectionIsSet(boolean value) {
    if (!value) {
      this.direction = null;
    }
  }

  public String getHedgeFlag() {
    return this.hedgeFlag;
  }

  public CThostFtdcEWarrantOffsetField setHedgeFlag(String hedgeFlag) {
    this.hedgeFlag = hedgeFlag;
    return this;
  }

  public void unsetHedgeFlag() {
    this.hedgeFlag = null;
  }

  /** Returns true if field hedgeFlag is set (has been assigned a value) and false otherwise */
  public boolean isSetHedgeFlag() {
    return this.hedgeFlag != null;
  }

  public void setHedgeFlagIsSet(boolean value) {
    if (!value) {
      this.hedgeFlag = null;
    }
  }

  public int getVolume() {
    return this.volume;
  }

  public CThostFtdcEWarrantOffsetField setVolume(int volume) {
    this.volume = volume;
    setVolumeIsSet(true);
    return this;
  }

  public void unsetVolume() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VOLUME_ISSET_ID);
  }

  /** Returns true if field volume is set (has been assigned a value) and false otherwise */
  public boolean isSetVolume() {
    return EncodingUtils.testBit(__isset_bitfield, __VOLUME_ISSET_ID);
  }

  public void setVolumeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VOLUME_ISSET_ID, value);
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

    case EXCHANGE_ID:
      if (value == null) {
        unsetExchangeID();
      } else {
        setExchangeID((String)value);
      }
      break;

    case INSTRUMENT_ID:
      if (value == null) {
        unsetInstrumentID();
      } else {
        setInstrumentID((String)value);
      }
      break;

    case DIRECTION:
      if (value == null) {
        unsetDirection();
      } else {
        setDirection((String)value);
      }
      break;

    case HEDGE_FLAG:
      if (value == null) {
        unsetHedgeFlag();
      } else {
        setHedgeFlag((String)value);
      }
      break;

    case VOLUME:
      if (value == null) {
        unsetVolume();
      } else {
        setVolume((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRADING_DAY:
      return getTradingDay();

    case BROKER_ID:
      return getBrokerID();

    case INVESTOR_ID:
      return getInvestorID();

    case EXCHANGE_ID:
      return getExchangeID();

    case INSTRUMENT_ID:
      return getInstrumentID();

    case DIRECTION:
      return getDirection();

    case HEDGE_FLAG:
      return getHedgeFlag();

    case VOLUME:
      return Integer.valueOf(getVolume());

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
    case BROKER_ID:
      return isSetBrokerID();
    case INVESTOR_ID:
      return isSetInvestorID();
    case EXCHANGE_ID:
      return isSetExchangeID();
    case INSTRUMENT_ID:
      return isSetInstrumentID();
    case DIRECTION:
      return isSetDirection();
    case HEDGE_FLAG:
      return isSetHedgeFlag();
    case VOLUME:
      return isSetVolume();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcEWarrantOffsetField)
      return this.equals((CThostFtdcEWarrantOffsetField)that);
    return false;
  }

  public boolean equals(CThostFtdcEWarrantOffsetField that) {
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

    boolean this_present_exchangeID = true && this.isSetExchangeID();
    boolean that_present_exchangeID = true && that.isSetExchangeID();
    if (this_present_exchangeID || that_present_exchangeID) {
      if (!(this_present_exchangeID && that_present_exchangeID))
        return false;
      if (!this.exchangeID.equals(that.exchangeID))
        return false;
    }

    boolean this_present_instrumentID = true && this.isSetInstrumentID();
    boolean that_present_instrumentID = true && that.isSetInstrumentID();
    if (this_present_instrumentID || that_present_instrumentID) {
      if (!(this_present_instrumentID && that_present_instrumentID))
        return false;
      if (!this.instrumentID.equals(that.instrumentID))
        return false;
    }

    boolean this_present_direction = true && this.isSetDirection();
    boolean that_present_direction = true && that.isSetDirection();
    if (this_present_direction || that_present_direction) {
      if (!(this_present_direction && that_present_direction))
        return false;
      if (!this.direction.equals(that.direction))
        return false;
    }

    boolean this_present_hedgeFlag = true && this.isSetHedgeFlag();
    boolean that_present_hedgeFlag = true && that.isSetHedgeFlag();
    if (this_present_hedgeFlag || that_present_hedgeFlag) {
      if (!(this_present_hedgeFlag && that_present_hedgeFlag))
        return false;
      if (!this.hedgeFlag.equals(that.hedgeFlag))
        return false;
    }

    boolean this_present_volume = true;
    boolean that_present_volume = true;
    if (this_present_volume || that_present_volume) {
      if (!(this_present_volume && that_present_volume))
        return false;
      if (this.volume != that.volume)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcEWarrantOffsetField other) {
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
    lastComparison = Boolean.valueOf(isSetInstrumentID()).compareTo(other.isSetInstrumentID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstrumentID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instrumentID, other.instrumentID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDirection()).compareTo(other.isSetDirection());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDirection()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.direction, other.direction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHedgeFlag()).compareTo(other.isSetHedgeFlag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHedgeFlag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hedgeFlag, other.hedgeFlag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVolume()).compareTo(other.isSetVolume());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVolume()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.volume, other.volume);
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
    StringBuilder sb = new StringBuilder("CThostFtdcEWarrantOffsetField(");
    boolean first = true;

    sb.append("tradingDay:");
    if (this.tradingDay == null) {
      sb.append("null");
    } else {
      sb.append(this.tradingDay);
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
    sb.append("investorID:");
    if (this.investorID == null) {
      sb.append("null");
    } else {
      sb.append(this.investorID);
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
    sb.append("instrumentID:");
    if (this.instrumentID == null) {
      sb.append("null");
    } else {
      sb.append(this.instrumentID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("direction:");
    if (this.direction == null) {
      sb.append("null");
    } else {
      sb.append(this.direction);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hedgeFlag:");
    if (this.hedgeFlag == null) {
      sb.append("null");
    } else {
      sb.append(this.hedgeFlag);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("volume:");
    sb.append(this.volume);
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

  private static class CThostFtdcEWarrantOffsetFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcEWarrantOffsetFieldStandardScheme getScheme() {
      return new CThostFtdcEWarrantOffsetFieldStandardScheme();
    }
  }

  private static class CThostFtdcEWarrantOffsetFieldStandardScheme extends StandardScheme<CThostFtdcEWarrantOffsetField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcEWarrantOffsetField struct) throws org.apache.thrift.TException {
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
          case 2: // BROKER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.brokerID = iprot.readString();
              struct.setBrokerIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INVESTOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.investorID = iprot.readString();
              struct.setInvestorIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXCHANGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exchangeID = iprot.readString();
              struct.setExchangeIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // INSTRUMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.instrumentID = iprot.readString();
              struct.setInstrumentIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DIRECTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.direction = iprot.readString();
              struct.setDirectionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // HEDGE_FLAG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hedgeFlag = iprot.readString();
              struct.setHedgeFlagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // VOLUME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.volume = iprot.readI32();
              struct.setVolumeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcEWarrantOffsetField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tradingDay != null) {
        oprot.writeFieldBegin(TRADING_DAY_FIELD_DESC);
        oprot.writeString(struct.tradingDay);
        oprot.writeFieldEnd();
      }
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
      if (struct.exchangeID != null) {
        oprot.writeFieldBegin(EXCHANGE_ID_FIELD_DESC);
        oprot.writeString(struct.exchangeID);
        oprot.writeFieldEnd();
      }
      if (struct.instrumentID != null) {
        oprot.writeFieldBegin(INSTRUMENT_ID_FIELD_DESC);
        oprot.writeString(struct.instrumentID);
        oprot.writeFieldEnd();
      }
      if (struct.direction != null) {
        oprot.writeFieldBegin(DIRECTION_FIELD_DESC);
        oprot.writeString(struct.direction);
        oprot.writeFieldEnd();
      }
      if (struct.hedgeFlag != null) {
        oprot.writeFieldBegin(HEDGE_FLAG_FIELD_DESC);
        oprot.writeString(struct.hedgeFlag);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VOLUME_FIELD_DESC);
      oprot.writeI32(struct.volume);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcEWarrantOffsetFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcEWarrantOffsetFieldTupleScheme getScheme() {
      return new CThostFtdcEWarrantOffsetFieldTupleScheme();
    }
  }

  private static class CThostFtdcEWarrantOffsetFieldTupleScheme extends TupleScheme<CThostFtdcEWarrantOffsetField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcEWarrantOffsetField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTradingDay()) {
        optionals.set(0);
      }
      if (struct.isSetBrokerID()) {
        optionals.set(1);
      }
      if (struct.isSetInvestorID()) {
        optionals.set(2);
      }
      if (struct.isSetExchangeID()) {
        optionals.set(3);
      }
      if (struct.isSetInstrumentID()) {
        optionals.set(4);
      }
      if (struct.isSetDirection()) {
        optionals.set(5);
      }
      if (struct.isSetHedgeFlag()) {
        optionals.set(6);
      }
      if (struct.isSetVolume()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetTradingDay()) {
        oprot.writeString(struct.tradingDay);
      }
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetInvestorID()) {
        oprot.writeString(struct.investorID);
      }
      if (struct.isSetExchangeID()) {
        oprot.writeString(struct.exchangeID);
      }
      if (struct.isSetInstrumentID()) {
        oprot.writeString(struct.instrumentID);
      }
      if (struct.isSetDirection()) {
        oprot.writeString(struct.direction);
      }
      if (struct.isSetHedgeFlag()) {
        oprot.writeString(struct.hedgeFlag);
      }
      if (struct.isSetVolume()) {
        oprot.writeI32(struct.volume);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcEWarrantOffsetField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.tradingDay = iprot.readString();
        struct.setTradingDayIsSet(true);
      }
      if (incoming.get(1)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.investorID = iprot.readString();
        struct.setInvestorIDIsSet(true);
      }
      if (incoming.get(3)) {
        struct.exchangeID = iprot.readString();
        struct.setExchangeIDIsSet(true);
      }
      if (incoming.get(4)) {
        struct.instrumentID = iprot.readString();
        struct.setInstrumentIDIsSet(true);
      }
      if (incoming.get(5)) {
        struct.direction = iprot.readString();
        struct.setDirectionIsSet(true);
      }
      if (incoming.get(6)) {
        struct.hedgeFlag = iprot.readString();
        struct.setHedgeFlagIsSet(true);
      }
      if (incoming.get(7)) {
        struct.volume = iprot.readI32();
        struct.setVolumeIsSet(true);
      }
    }
  }

}

