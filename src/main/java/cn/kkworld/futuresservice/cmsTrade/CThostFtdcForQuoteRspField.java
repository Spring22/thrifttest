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

public class CThostFtdcForQuoteRspField implements org.apache.thrift.TBase<CThostFtdcForQuoteRspField, CThostFtdcForQuoteRspField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcForQuoteRspField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcForQuoteRspField");

  private static final org.apache.thrift.protocol.TField TRADING_DAY_FIELD_DESC = new org.apache.thrift.protocol.TField("tradingDay", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INSTRUMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("instrumentID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField FOR_QUOTE_SYS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("forQuoteSysID", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField FOR_QUOTE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("forQuoteTime", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ACTION_DAY_FIELD_DESC = new org.apache.thrift.protocol.TField("actionDay", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField EXCHANGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("exchangeID", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcForQuoteRspFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcForQuoteRspFieldTupleSchemeFactory());
  }

  public String tradingDay; // required
  public String instrumentID; // required
  public String forQuoteSysID; // required
  public String forQuoteTime; // required
  public String actionDay; // required
  public String exchangeID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRADING_DAY((short)1, "tradingDay"),
    INSTRUMENT_ID((short)2, "instrumentID"),
    FOR_QUOTE_SYS_ID((short)3, "forQuoteSysID"),
    FOR_QUOTE_TIME((short)4, "forQuoteTime"),
    ACTION_DAY((short)5, "actionDay"),
    EXCHANGE_ID((short)6, "exchangeID");

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
        case 2: // INSTRUMENT_ID
          return INSTRUMENT_ID;
        case 3: // FOR_QUOTE_SYS_ID
          return FOR_QUOTE_SYS_ID;
        case 4: // FOR_QUOTE_TIME
          return FOR_QUOTE_TIME;
        case 5: // ACTION_DAY
          return ACTION_DAY;
        case 6: // EXCHANGE_ID
          return EXCHANGE_ID;
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
    tmpMap.put(_Fields.TRADING_DAY, new org.apache.thrift.meta_data.FieldMetaData("tradingDay", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcDateType")));
    tmpMap.put(_Fields.INSTRUMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("instrumentID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInstrumentIDType")));
    tmpMap.put(_Fields.FOR_QUOTE_SYS_ID, new org.apache.thrift.meta_data.FieldMetaData("forQuoteSysID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcOrderSysIDType")));
    tmpMap.put(_Fields.FOR_QUOTE_TIME, new org.apache.thrift.meta_data.FieldMetaData("forQuoteTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcTimeType")));
    tmpMap.put(_Fields.ACTION_DAY, new org.apache.thrift.meta_data.FieldMetaData("actionDay", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcDateType")));
    tmpMap.put(_Fields.EXCHANGE_ID, new org.apache.thrift.meta_data.FieldMetaData("exchangeID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcExchangeIDType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcForQuoteRspField.class, metaDataMap);
  }

  public CThostFtdcForQuoteRspField() {
  }

  public CThostFtdcForQuoteRspField(
    String tradingDay,
    String instrumentID,
    String forQuoteSysID,
    String forQuoteTime,
    String actionDay,
    String exchangeID)
  {
    this();
    this.tradingDay = tradingDay;
    this.instrumentID = instrumentID;
    this.forQuoteSysID = forQuoteSysID;
    this.forQuoteTime = forQuoteTime;
    this.actionDay = actionDay;
    this.exchangeID = exchangeID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcForQuoteRspField(CThostFtdcForQuoteRspField other) {
    if (other.isSetTradingDay()) {
      this.tradingDay = other.tradingDay;
    }
    if (other.isSetInstrumentID()) {
      this.instrumentID = other.instrumentID;
    }
    if (other.isSetForQuoteSysID()) {
      this.forQuoteSysID = other.forQuoteSysID;
    }
    if (other.isSetForQuoteTime()) {
      this.forQuoteTime = other.forQuoteTime;
    }
    if (other.isSetActionDay()) {
      this.actionDay = other.actionDay;
    }
    if (other.isSetExchangeID()) {
      this.exchangeID = other.exchangeID;
    }
  }

  public CThostFtdcForQuoteRspField deepCopy() {
    return new CThostFtdcForQuoteRspField(this);
  }

  @Override
  public void clear() {
    this.tradingDay = null;
    this.instrumentID = null;
    this.forQuoteSysID = null;
    this.forQuoteTime = null;
    this.actionDay = null;
    this.exchangeID = null;
  }

  public String getTradingDay() {
    return this.tradingDay;
  }

  public CThostFtdcForQuoteRspField setTradingDay(String tradingDay) {
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

  public String getInstrumentID() {
    return this.instrumentID;
  }

  public CThostFtdcForQuoteRspField setInstrumentID(String instrumentID) {
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

  public String getForQuoteSysID() {
    return this.forQuoteSysID;
  }

  public CThostFtdcForQuoteRspField setForQuoteSysID(String forQuoteSysID) {
    this.forQuoteSysID = forQuoteSysID;
    return this;
  }

  public void unsetForQuoteSysID() {
    this.forQuoteSysID = null;
  }

  /** Returns true if field forQuoteSysID is set (has been assigned a value) and false otherwise */
  public boolean isSetForQuoteSysID() {
    return this.forQuoteSysID != null;
  }

  public void setForQuoteSysIDIsSet(boolean value) {
    if (!value) {
      this.forQuoteSysID = null;
    }
  }

  public String getForQuoteTime() {
    return this.forQuoteTime;
  }

  public CThostFtdcForQuoteRspField setForQuoteTime(String forQuoteTime) {
    this.forQuoteTime = forQuoteTime;
    return this;
  }

  public void unsetForQuoteTime() {
    this.forQuoteTime = null;
  }

  /** Returns true if field forQuoteTime is set (has been assigned a value) and false otherwise */
  public boolean isSetForQuoteTime() {
    return this.forQuoteTime != null;
  }

  public void setForQuoteTimeIsSet(boolean value) {
    if (!value) {
      this.forQuoteTime = null;
    }
  }

  public String getActionDay() {
    return this.actionDay;
  }

  public CThostFtdcForQuoteRspField setActionDay(String actionDay) {
    this.actionDay = actionDay;
    return this;
  }

  public void unsetActionDay() {
    this.actionDay = null;
  }

  /** Returns true if field actionDay is set (has been assigned a value) and false otherwise */
  public boolean isSetActionDay() {
    return this.actionDay != null;
  }

  public void setActionDayIsSet(boolean value) {
    if (!value) {
      this.actionDay = null;
    }
  }

  public String getExchangeID() {
    return this.exchangeID;
  }

  public CThostFtdcForQuoteRspField setExchangeID(String exchangeID) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRADING_DAY:
      if (value == null) {
        unsetTradingDay();
      } else {
        setTradingDay((String)value);
      }
      break;

    case INSTRUMENT_ID:
      if (value == null) {
        unsetInstrumentID();
      } else {
        setInstrumentID((String)value);
      }
      break;

    case FOR_QUOTE_SYS_ID:
      if (value == null) {
        unsetForQuoteSysID();
      } else {
        setForQuoteSysID((String)value);
      }
      break;

    case FOR_QUOTE_TIME:
      if (value == null) {
        unsetForQuoteTime();
      } else {
        setForQuoteTime((String)value);
      }
      break;

    case ACTION_DAY:
      if (value == null) {
        unsetActionDay();
      } else {
        setActionDay((String)value);
      }
      break;

    case EXCHANGE_ID:
      if (value == null) {
        unsetExchangeID();
      } else {
        setExchangeID((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRADING_DAY:
      return getTradingDay();

    case INSTRUMENT_ID:
      return getInstrumentID();

    case FOR_QUOTE_SYS_ID:
      return getForQuoteSysID();

    case FOR_QUOTE_TIME:
      return getForQuoteTime();

    case ACTION_DAY:
      return getActionDay();

    case EXCHANGE_ID:
      return getExchangeID();

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
    case INSTRUMENT_ID:
      return isSetInstrumentID();
    case FOR_QUOTE_SYS_ID:
      return isSetForQuoteSysID();
    case FOR_QUOTE_TIME:
      return isSetForQuoteTime();
    case ACTION_DAY:
      return isSetActionDay();
    case EXCHANGE_ID:
      return isSetExchangeID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcForQuoteRspField)
      return this.equals((CThostFtdcForQuoteRspField)that);
    return false;
  }

  public boolean equals(CThostFtdcForQuoteRspField that) {
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

    boolean this_present_instrumentID = true && this.isSetInstrumentID();
    boolean that_present_instrumentID = true && that.isSetInstrumentID();
    if (this_present_instrumentID || that_present_instrumentID) {
      if (!(this_present_instrumentID && that_present_instrumentID))
        return false;
      if (!this.instrumentID.equals(that.instrumentID))
        return false;
    }

    boolean this_present_forQuoteSysID = true && this.isSetForQuoteSysID();
    boolean that_present_forQuoteSysID = true && that.isSetForQuoteSysID();
    if (this_present_forQuoteSysID || that_present_forQuoteSysID) {
      if (!(this_present_forQuoteSysID && that_present_forQuoteSysID))
        return false;
      if (!this.forQuoteSysID.equals(that.forQuoteSysID))
        return false;
    }

    boolean this_present_forQuoteTime = true && this.isSetForQuoteTime();
    boolean that_present_forQuoteTime = true && that.isSetForQuoteTime();
    if (this_present_forQuoteTime || that_present_forQuoteTime) {
      if (!(this_present_forQuoteTime && that_present_forQuoteTime))
        return false;
      if (!this.forQuoteTime.equals(that.forQuoteTime))
        return false;
    }

    boolean this_present_actionDay = true && this.isSetActionDay();
    boolean that_present_actionDay = true && that.isSetActionDay();
    if (this_present_actionDay || that_present_actionDay) {
      if (!(this_present_actionDay && that_present_actionDay))
        return false;
      if (!this.actionDay.equals(that.actionDay))
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

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcForQuoteRspField other) {
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
    lastComparison = Boolean.valueOf(isSetForQuoteSysID()).compareTo(other.isSetForQuoteSysID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForQuoteSysID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.forQuoteSysID, other.forQuoteSysID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetForQuoteTime()).compareTo(other.isSetForQuoteTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForQuoteTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.forQuoteTime, other.forQuoteTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActionDay()).compareTo(other.isSetActionDay());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActionDay()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.actionDay, other.actionDay);
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
    StringBuilder sb = new StringBuilder("CThostFtdcForQuoteRspField(");
    boolean first = true;

    sb.append("tradingDay:");
    if (this.tradingDay == null) {
      sb.append("null");
    } else {
      sb.append(this.tradingDay);
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
    sb.append("forQuoteSysID:");
    if (this.forQuoteSysID == null) {
      sb.append("null");
    } else {
      sb.append(this.forQuoteSysID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("forQuoteTime:");
    if (this.forQuoteTime == null) {
      sb.append("null");
    } else {
      sb.append(this.forQuoteTime);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("actionDay:");
    if (this.actionDay == null) {
      sb.append("null");
    } else {
      sb.append(this.actionDay);
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

  private static class CThostFtdcForQuoteRspFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcForQuoteRspFieldStandardScheme getScheme() {
      return new CThostFtdcForQuoteRspFieldStandardScheme();
    }
  }

  private static class CThostFtdcForQuoteRspFieldStandardScheme extends StandardScheme<CThostFtdcForQuoteRspField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcForQuoteRspField struct) throws org.apache.thrift.TException {
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
          case 2: // INSTRUMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.instrumentID = iprot.readString();
              struct.setInstrumentIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FOR_QUOTE_SYS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.forQuoteSysID = iprot.readString();
              struct.setForQuoteSysIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FOR_QUOTE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.forQuoteTime = iprot.readString();
              struct.setForQuoteTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ACTION_DAY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.actionDay = iprot.readString();
              struct.setActionDayIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EXCHANGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exchangeID = iprot.readString();
              struct.setExchangeIDIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcForQuoteRspField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tradingDay != null) {
        oprot.writeFieldBegin(TRADING_DAY_FIELD_DESC);
        oprot.writeString(struct.tradingDay);
        oprot.writeFieldEnd();
      }
      if (struct.instrumentID != null) {
        oprot.writeFieldBegin(INSTRUMENT_ID_FIELD_DESC);
        oprot.writeString(struct.instrumentID);
        oprot.writeFieldEnd();
      }
      if (struct.forQuoteSysID != null) {
        oprot.writeFieldBegin(FOR_QUOTE_SYS_ID_FIELD_DESC);
        oprot.writeString(struct.forQuoteSysID);
        oprot.writeFieldEnd();
      }
      if (struct.forQuoteTime != null) {
        oprot.writeFieldBegin(FOR_QUOTE_TIME_FIELD_DESC);
        oprot.writeString(struct.forQuoteTime);
        oprot.writeFieldEnd();
      }
      if (struct.actionDay != null) {
        oprot.writeFieldBegin(ACTION_DAY_FIELD_DESC);
        oprot.writeString(struct.actionDay);
        oprot.writeFieldEnd();
      }
      if (struct.exchangeID != null) {
        oprot.writeFieldBegin(EXCHANGE_ID_FIELD_DESC);
        oprot.writeString(struct.exchangeID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcForQuoteRspFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcForQuoteRspFieldTupleScheme getScheme() {
      return new CThostFtdcForQuoteRspFieldTupleScheme();
    }
  }

  private static class CThostFtdcForQuoteRspFieldTupleScheme extends TupleScheme<CThostFtdcForQuoteRspField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcForQuoteRspField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTradingDay()) {
        optionals.set(0);
      }
      if (struct.isSetInstrumentID()) {
        optionals.set(1);
      }
      if (struct.isSetForQuoteSysID()) {
        optionals.set(2);
      }
      if (struct.isSetForQuoteTime()) {
        optionals.set(3);
      }
      if (struct.isSetActionDay()) {
        optionals.set(4);
      }
      if (struct.isSetExchangeID()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetTradingDay()) {
        oprot.writeString(struct.tradingDay);
      }
      if (struct.isSetInstrumentID()) {
        oprot.writeString(struct.instrumentID);
      }
      if (struct.isSetForQuoteSysID()) {
        oprot.writeString(struct.forQuoteSysID);
      }
      if (struct.isSetForQuoteTime()) {
        oprot.writeString(struct.forQuoteTime);
      }
      if (struct.isSetActionDay()) {
        oprot.writeString(struct.actionDay);
      }
      if (struct.isSetExchangeID()) {
        oprot.writeString(struct.exchangeID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcForQuoteRspField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.tradingDay = iprot.readString();
        struct.setTradingDayIsSet(true);
      }
      if (incoming.get(1)) {
        struct.instrumentID = iprot.readString();
        struct.setInstrumentIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.forQuoteSysID = iprot.readString();
        struct.setForQuoteSysIDIsSet(true);
      }
      if (incoming.get(3)) {
        struct.forQuoteTime = iprot.readString();
        struct.setForQuoteTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.actionDay = iprot.readString();
        struct.setActionDayIsSet(true);
      }
      if (incoming.get(5)) {
        struct.exchangeID = iprot.readString();
        struct.setExchangeIDIsSet(true);
      }
    }
  }

}

