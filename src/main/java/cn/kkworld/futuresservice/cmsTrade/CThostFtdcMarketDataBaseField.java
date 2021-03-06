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

public class CThostFtdcMarketDataBaseField implements org.apache.thrift.TBase<CThostFtdcMarketDataBaseField, CThostFtdcMarketDataBaseField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcMarketDataBaseField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcMarketDataBaseField");

  private static final org.apache.thrift.protocol.TField TRADING_DAY_FIELD_DESC = new org.apache.thrift.protocol.TField("tradingDay", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PRE_SETTLEMENT_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("preSettlementPrice", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField PRE_CLOSE_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("preClosePrice", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField PRE_OPEN_INTEREST_FIELD_DESC = new org.apache.thrift.protocol.TField("preOpenInterest", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField PRE_DELTA_FIELD_DESC = new org.apache.thrift.protocol.TField("preDelta", org.apache.thrift.protocol.TType.DOUBLE, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcMarketDataBaseFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcMarketDataBaseFieldTupleSchemeFactory());
  }

  public String tradingDay; // required
  public double preSettlementPrice; // required
  public double preClosePrice; // required
  public double preOpenInterest; // required
  public double preDelta; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRADING_DAY((short)1, "tradingDay"),
    PRE_SETTLEMENT_PRICE((short)2, "preSettlementPrice"),
    PRE_CLOSE_PRICE((short)3, "preClosePrice"),
    PRE_OPEN_INTEREST((short)4, "preOpenInterest"),
    PRE_DELTA((short)5, "preDelta");

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
        case 2: // PRE_SETTLEMENT_PRICE
          return PRE_SETTLEMENT_PRICE;
        case 3: // PRE_CLOSE_PRICE
          return PRE_CLOSE_PRICE;
        case 4: // PRE_OPEN_INTEREST
          return PRE_OPEN_INTEREST;
        case 5: // PRE_DELTA
          return PRE_DELTA;
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
  private static final int __PRESETTLEMENTPRICE_ISSET_ID = 0;
  private static final int __PRECLOSEPRICE_ISSET_ID = 1;
  private static final int __PREOPENINTEREST_ISSET_ID = 2;
  private static final int __PREDELTA_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRADING_DAY, new org.apache.thrift.meta_data.FieldMetaData("tradingDay", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcDateType")));
    tmpMap.put(_Fields.PRE_SETTLEMENT_PRICE, new org.apache.thrift.meta_data.FieldMetaData("preSettlementPrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    tmpMap.put(_Fields.PRE_CLOSE_PRICE, new org.apache.thrift.meta_data.FieldMetaData("preClosePrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    tmpMap.put(_Fields.PRE_OPEN_INTEREST, new org.apache.thrift.meta_data.FieldMetaData("preOpenInterest", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcLargeVolumeType")));
    tmpMap.put(_Fields.PRE_DELTA, new org.apache.thrift.meta_data.FieldMetaData("preDelta", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcRatioType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcMarketDataBaseField.class, metaDataMap);
  }

  public CThostFtdcMarketDataBaseField() {
  }

  public CThostFtdcMarketDataBaseField(
    String tradingDay,
    double preSettlementPrice,
    double preClosePrice,
    double preOpenInterest,
    double preDelta)
  {
    this();
    this.tradingDay = tradingDay;
    this.preSettlementPrice = preSettlementPrice;
    setPreSettlementPriceIsSet(true);
    this.preClosePrice = preClosePrice;
    setPreClosePriceIsSet(true);
    this.preOpenInterest = preOpenInterest;
    setPreOpenInterestIsSet(true);
    this.preDelta = preDelta;
    setPreDeltaIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcMarketDataBaseField(CThostFtdcMarketDataBaseField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTradingDay()) {
      this.tradingDay = other.tradingDay;
    }
    this.preSettlementPrice = other.preSettlementPrice;
    this.preClosePrice = other.preClosePrice;
    this.preOpenInterest = other.preOpenInterest;
    this.preDelta = other.preDelta;
  }

  public CThostFtdcMarketDataBaseField deepCopy() {
    return new CThostFtdcMarketDataBaseField(this);
  }

  @Override
  public void clear() {
    this.tradingDay = null;
    setPreSettlementPriceIsSet(false);
    this.preSettlementPrice = 0.0;
    setPreClosePriceIsSet(false);
    this.preClosePrice = 0.0;
    setPreOpenInterestIsSet(false);
    this.preOpenInterest = 0.0;
    setPreDeltaIsSet(false);
    this.preDelta = 0.0;
  }

  public String getTradingDay() {
    return this.tradingDay;
  }

  public CThostFtdcMarketDataBaseField setTradingDay(String tradingDay) {
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

  public double getPreSettlementPrice() {
    return this.preSettlementPrice;
  }

  public CThostFtdcMarketDataBaseField setPreSettlementPrice(double preSettlementPrice) {
    this.preSettlementPrice = preSettlementPrice;
    setPreSettlementPriceIsSet(true);
    return this;
  }

  public void unsetPreSettlementPrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRESETTLEMENTPRICE_ISSET_ID);
  }

  /** Returns true if field preSettlementPrice is set (has been assigned a value) and false otherwise */
  public boolean isSetPreSettlementPrice() {
    return EncodingUtils.testBit(__isset_bitfield, __PRESETTLEMENTPRICE_ISSET_ID);
  }

  public void setPreSettlementPriceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRESETTLEMENTPRICE_ISSET_ID, value);
  }

  public double getPreClosePrice() {
    return this.preClosePrice;
  }

  public CThostFtdcMarketDataBaseField setPreClosePrice(double preClosePrice) {
    this.preClosePrice = preClosePrice;
    setPreClosePriceIsSet(true);
    return this;
  }

  public void unsetPreClosePrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRECLOSEPRICE_ISSET_ID);
  }

  /** Returns true if field preClosePrice is set (has been assigned a value) and false otherwise */
  public boolean isSetPreClosePrice() {
    return EncodingUtils.testBit(__isset_bitfield, __PRECLOSEPRICE_ISSET_ID);
  }

  public void setPreClosePriceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRECLOSEPRICE_ISSET_ID, value);
  }

  public double getPreOpenInterest() {
    return this.preOpenInterest;
  }

  public CThostFtdcMarketDataBaseField setPreOpenInterest(double preOpenInterest) {
    this.preOpenInterest = preOpenInterest;
    setPreOpenInterestIsSet(true);
    return this;
  }

  public void unsetPreOpenInterest() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PREOPENINTEREST_ISSET_ID);
  }

  /** Returns true if field preOpenInterest is set (has been assigned a value) and false otherwise */
  public boolean isSetPreOpenInterest() {
    return EncodingUtils.testBit(__isset_bitfield, __PREOPENINTEREST_ISSET_ID);
  }

  public void setPreOpenInterestIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PREOPENINTEREST_ISSET_ID, value);
  }

  public double getPreDelta() {
    return this.preDelta;
  }

  public CThostFtdcMarketDataBaseField setPreDelta(double preDelta) {
    this.preDelta = preDelta;
    setPreDeltaIsSet(true);
    return this;
  }

  public void unsetPreDelta() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PREDELTA_ISSET_ID);
  }

  /** Returns true if field preDelta is set (has been assigned a value) and false otherwise */
  public boolean isSetPreDelta() {
    return EncodingUtils.testBit(__isset_bitfield, __PREDELTA_ISSET_ID);
  }

  public void setPreDeltaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PREDELTA_ISSET_ID, value);
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

    case PRE_SETTLEMENT_PRICE:
      if (value == null) {
        unsetPreSettlementPrice();
      } else {
        setPreSettlementPrice((Double)value);
      }
      break;

    case PRE_CLOSE_PRICE:
      if (value == null) {
        unsetPreClosePrice();
      } else {
        setPreClosePrice((Double)value);
      }
      break;

    case PRE_OPEN_INTEREST:
      if (value == null) {
        unsetPreOpenInterest();
      } else {
        setPreOpenInterest((Double)value);
      }
      break;

    case PRE_DELTA:
      if (value == null) {
        unsetPreDelta();
      } else {
        setPreDelta((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRADING_DAY:
      return getTradingDay();

    case PRE_SETTLEMENT_PRICE:
      return Double.valueOf(getPreSettlementPrice());

    case PRE_CLOSE_PRICE:
      return Double.valueOf(getPreClosePrice());

    case PRE_OPEN_INTEREST:
      return Double.valueOf(getPreOpenInterest());

    case PRE_DELTA:
      return Double.valueOf(getPreDelta());

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
    case PRE_SETTLEMENT_PRICE:
      return isSetPreSettlementPrice();
    case PRE_CLOSE_PRICE:
      return isSetPreClosePrice();
    case PRE_OPEN_INTEREST:
      return isSetPreOpenInterest();
    case PRE_DELTA:
      return isSetPreDelta();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcMarketDataBaseField)
      return this.equals((CThostFtdcMarketDataBaseField)that);
    return false;
  }

  public boolean equals(CThostFtdcMarketDataBaseField that) {
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

    boolean this_present_preSettlementPrice = true;
    boolean that_present_preSettlementPrice = true;
    if (this_present_preSettlementPrice || that_present_preSettlementPrice) {
      if (!(this_present_preSettlementPrice && that_present_preSettlementPrice))
        return false;
      if (this.preSettlementPrice != that.preSettlementPrice)
        return false;
    }

    boolean this_present_preClosePrice = true;
    boolean that_present_preClosePrice = true;
    if (this_present_preClosePrice || that_present_preClosePrice) {
      if (!(this_present_preClosePrice && that_present_preClosePrice))
        return false;
      if (this.preClosePrice != that.preClosePrice)
        return false;
    }

    boolean this_present_preOpenInterest = true;
    boolean that_present_preOpenInterest = true;
    if (this_present_preOpenInterest || that_present_preOpenInterest) {
      if (!(this_present_preOpenInterest && that_present_preOpenInterest))
        return false;
      if (this.preOpenInterest != that.preOpenInterest)
        return false;
    }

    boolean this_present_preDelta = true;
    boolean that_present_preDelta = true;
    if (this_present_preDelta || that_present_preDelta) {
      if (!(this_present_preDelta && that_present_preDelta))
        return false;
      if (this.preDelta != that.preDelta)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcMarketDataBaseField other) {
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
    lastComparison = Boolean.valueOf(isSetPreSettlementPrice()).compareTo(other.isSetPreSettlementPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreSettlementPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.preSettlementPrice, other.preSettlementPrice);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPreClosePrice()).compareTo(other.isSetPreClosePrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreClosePrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.preClosePrice, other.preClosePrice);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPreOpenInterest()).compareTo(other.isSetPreOpenInterest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreOpenInterest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.preOpenInterest, other.preOpenInterest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPreDelta()).compareTo(other.isSetPreDelta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreDelta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.preDelta, other.preDelta);
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
    StringBuilder sb = new StringBuilder("CThostFtdcMarketDataBaseField(");
    boolean first = true;

    sb.append("tradingDay:");
    if (this.tradingDay == null) {
      sb.append("null");
    } else {
      sb.append(this.tradingDay);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("preSettlementPrice:");
    sb.append(this.preSettlementPrice);
    first = false;
    if (!first) sb.append(", ");
    sb.append("preClosePrice:");
    sb.append(this.preClosePrice);
    first = false;
    if (!first) sb.append(", ");
    sb.append("preOpenInterest:");
    sb.append(this.preOpenInterest);
    first = false;
    if (!first) sb.append(", ");
    sb.append("preDelta:");
    sb.append(this.preDelta);
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

  private static class CThostFtdcMarketDataBaseFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcMarketDataBaseFieldStandardScheme getScheme() {
      return new CThostFtdcMarketDataBaseFieldStandardScheme();
    }
  }

  private static class CThostFtdcMarketDataBaseFieldStandardScheme extends StandardScheme<CThostFtdcMarketDataBaseField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcMarketDataBaseField struct) throws org.apache.thrift.TException {
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
          case 2: // PRE_SETTLEMENT_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.preSettlementPrice = iprot.readDouble();
              struct.setPreSettlementPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRE_CLOSE_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.preClosePrice = iprot.readDouble();
              struct.setPreClosePriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PRE_OPEN_INTEREST
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.preOpenInterest = iprot.readDouble();
              struct.setPreOpenInterestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PRE_DELTA
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.preDelta = iprot.readDouble();
              struct.setPreDeltaIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcMarketDataBaseField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tradingDay != null) {
        oprot.writeFieldBegin(TRADING_DAY_FIELD_DESC);
        oprot.writeString(struct.tradingDay);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PRE_SETTLEMENT_PRICE_FIELD_DESC);
      oprot.writeDouble(struct.preSettlementPrice);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PRE_CLOSE_PRICE_FIELD_DESC);
      oprot.writeDouble(struct.preClosePrice);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PRE_OPEN_INTEREST_FIELD_DESC);
      oprot.writeDouble(struct.preOpenInterest);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PRE_DELTA_FIELD_DESC);
      oprot.writeDouble(struct.preDelta);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcMarketDataBaseFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcMarketDataBaseFieldTupleScheme getScheme() {
      return new CThostFtdcMarketDataBaseFieldTupleScheme();
    }
  }

  private static class CThostFtdcMarketDataBaseFieldTupleScheme extends TupleScheme<CThostFtdcMarketDataBaseField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcMarketDataBaseField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTradingDay()) {
        optionals.set(0);
      }
      if (struct.isSetPreSettlementPrice()) {
        optionals.set(1);
      }
      if (struct.isSetPreClosePrice()) {
        optionals.set(2);
      }
      if (struct.isSetPreOpenInterest()) {
        optionals.set(3);
      }
      if (struct.isSetPreDelta()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTradingDay()) {
        oprot.writeString(struct.tradingDay);
      }
      if (struct.isSetPreSettlementPrice()) {
        oprot.writeDouble(struct.preSettlementPrice);
      }
      if (struct.isSetPreClosePrice()) {
        oprot.writeDouble(struct.preClosePrice);
      }
      if (struct.isSetPreOpenInterest()) {
        oprot.writeDouble(struct.preOpenInterest);
      }
      if (struct.isSetPreDelta()) {
        oprot.writeDouble(struct.preDelta);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcMarketDataBaseField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.tradingDay = iprot.readString();
        struct.setTradingDayIsSet(true);
      }
      if (incoming.get(1)) {
        struct.preSettlementPrice = iprot.readDouble();
        struct.setPreSettlementPriceIsSet(true);
      }
      if (incoming.get(2)) {
        struct.preClosePrice = iprot.readDouble();
        struct.setPreClosePriceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.preOpenInterest = iprot.readDouble();
        struct.setPreOpenInterestIsSet(true);
      }
      if (incoming.get(4)) {
        struct.preDelta = iprot.readDouble();
        struct.setPreDeltaIsSet(true);
      }
    }
  }

}

