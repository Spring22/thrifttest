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

public class CThostFtdcMarketDataStaticField implements org.apache.thrift.TBase<CThostFtdcMarketDataStaticField, CThostFtdcMarketDataStaticField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcMarketDataStaticField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcMarketDataStaticField");

  private static final org.apache.thrift.protocol.TField OPEN_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("openPrice", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField HIGHEST_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("highestPrice", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField LOWEST_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("lowestPrice", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField CLOSE_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("closePrice", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField UPPER_LIMIT_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("upperLimitPrice", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField LOWER_LIMIT_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("lowerLimitPrice", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField SETTLEMENT_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("settlementPrice", org.apache.thrift.protocol.TType.DOUBLE, (short)7);
  private static final org.apache.thrift.protocol.TField CURR_DELTA_FIELD_DESC = new org.apache.thrift.protocol.TField("currDelta", org.apache.thrift.protocol.TType.DOUBLE, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcMarketDataStaticFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcMarketDataStaticFieldTupleSchemeFactory());
  }

  public double openPrice; // required
  public double highestPrice; // required
  public double lowestPrice; // required
  public double closePrice; // required
  public double upperLimitPrice; // required
  public double lowerLimitPrice; // required
  public double settlementPrice; // required
  public double currDelta; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPEN_PRICE((short)1, "openPrice"),
    HIGHEST_PRICE((short)2, "highestPrice"),
    LOWEST_PRICE((short)3, "lowestPrice"),
    CLOSE_PRICE((short)4, "closePrice"),
    UPPER_LIMIT_PRICE((short)5, "upperLimitPrice"),
    LOWER_LIMIT_PRICE((short)6, "lowerLimitPrice"),
    SETTLEMENT_PRICE((short)7, "settlementPrice"),
    CURR_DELTA((short)8, "currDelta");

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
        case 1: // OPEN_PRICE
          return OPEN_PRICE;
        case 2: // HIGHEST_PRICE
          return HIGHEST_PRICE;
        case 3: // LOWEST_PRICE
          return LOWEST_PRICE;
        case 4: // CLOSE_PRICE
          return CLOSE_PRICE;
        case 5: // UPPER_LIMIT_PRICE
          return UPPER_LIMIT_PRICE;
        case 6: // LOWER_LIMIT_PRICE
          return LOWER_LIMIT_PRICE;
        case 7: // SETTLEMENT_PRICE
          return SETTLEMENT_PRICE;
        case 8: // CURR_DELTA
          return CURR_DELTA;
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
  private static final int __OPENPRICE_ISSET_ID = 0;
  private static final int __HIGHESTPRICE_ISSET_ID = 1;
  private static final int __LOWESTPRICE_ISSET_ID = 2;
  private static final int __CLOSEPRICE_ISSET_ID = 3;
  private static final int __UPPERLIMITPRICE_ISSET_ID = 4;
  private static final int __LOWERLIMITPRICE_ISSET_ID = 5;
  private static final int __SETTLEMENTPRICE_ISSET_ID = 6;
  private static final int __CURRDELTA_ISSET_ID = 7;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPEN_PRICE, new org.apache.thrift.meta_data.FieldMetaData("openPrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    tmpMap.put(_Fields.HIGHEST_PRICE, new org.apache.thrift.meta_data.FieldMetaData("highestPrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    tmpMap.put(_Fields.LOWEST_PRICE, new org.apache.thrift.meta_data.FieldMetaData("lowestPrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    tmpMap.put(_Fields.CLOSE_PRICE, new org.apache.thrift.meta_data.FieldMetaData("closePrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    tmpMap.put(_Fields.UPPER_LIMIT_PRICE, new org.apache.thrift.meta_data.FieldMetaData("upperLimitPrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    tmpMap.put(_Fields.LOWER_LIMIT_PRICE, new org.apache.thrift.meta_data.FieldMetaData("lowerLimitPrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    tmpMap.put(_Fields.SETTLEMENT_PRICE, new org.apache.thrift.meta_data.FieldMetaData("settlementPrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    tmpMap.put(_Fields.CURR_DELTA, new org.apache.thrift.meta_data.FieldMetaData("currDelta", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcRatioType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcMarketDataStaticField.class, metaDataMap);
  }

  public CThostFtdcMarketDataStaticField() {
  }

  public CThostFtdcMarketDataStaticField(
    double openPrice,
    double highestPrice,
    double lowestPrice,
    double closePrice,
    double upperLimitPrice,
    double lowerLimitPrice,
    double settlementPrice,
    double currDelta)
  {
    this();
    this.openPrice = openPrice;
    setOpenPriceIsSet(true);
    this.highestPrice = highestPrice;
    setHighestPriceIsSet(true);
    this.lowestPrice = lowestPrice;
    setLowestPriceIsSet(true);
    this.closePrice = closePrice;
    setClosePriceIsSet(true);
    this.upperLimitPrice = upperLimitPrice;
    setUpperLimitPriceIsSet(true);
    this.lowerLimitPrice = lowerLimitPrice;
    setLowerLimitPriceIsSet(true);
    this.settlementPrice = settlementPrice;
    setSettlementPriceIsSet(true);
    this.currDelta = currDelta;
    setCurrDeltaIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcMarketDataStaticField(CThostFtdcMarketDataStaticField other) {
    __isset_bitfield = other.__isset_bitfield;
    this.openPrice = other.openPrice;
    this.highestPrice = other.highestPrice;
    this.lowestPrice = other.lowestPrice;
    this.closePrice = other.closePrice;
    this.upperLimitPrice = other.upperLimitPrice;
    this.lowerLimitPrice = other.lowerLimitPrice;
    this.settlementPrice = other.settlementPrice;
    this.currDelta = other.currDelta;
  }

  public CThostFtdcMarketDataStaticField deepCopy() {
    return new CThostFtdcMarketDataStaticField(this);
  }

  @Override
  public void clear() {
    setOpenPriceIsSet(false);
    this.openPrice = 0.0;
    setHighestPriceIsSet(false);
    this.highestPrice = 0.0;
    setLowestPriceIsSet(false);
    this.lowestPrice = 0.0;
    setClosePriceIsSet(false);
    this.closePrice = 0.0;
    setUpperLimitPriceIsSet(false);
    this.upperLimitPrice = 0.0;
    setLowerLimitPriceIsSet(false);
    this.lowerLimitPrice = 0.0;
    setSettlementPriceIsSet(false);
    this.settlementPrice = 0.0;
    setCurrDeltaIsSet(false);
    this.currDelta = 0.0;
  }

  public double getOpenPrice() {
    return this.openPrice;
  }

  public CThostFtdcMarketDataStaticField setOpenPrice(double openPrice) {
    this.openPrice = openPrice;
    setOpenPriceIsSet(true);
    return this;
  }

  public void unsetOpenPrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPENPRICE_ISSET_ID);
  }

  /** Returns true if field openPrice is set (has been assigned a value) and false otherwise */
  public boolean isSetOpenPrice() {
    return EncodingUtils.testBit(__isset_bitfield, __OPENPRICE_ISSET_ID);
  }

  public void setOpenPriceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPENPRICE_ISSET_ID, value);
  }

  public double getHighestPrice() {
    return this.highestPrice;
  }

  public CThostFtdcMarketDataStaticField setHighestPrice(double highestPrice) {
    this.highestPrice = highestPrice;
    setHighestPriceIsSet(true);
    return this;
  }

  public void unsetHighestPrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HIGHESTPRICE_ISSET_ID);
  }

  /** Returns true if field highestPrice is set (has been assigned a value) and false otherwise */
  public boolean isSetHighestPrice() {
    return EncodingUtils.testBit(__isset_bitfield, __HIGHESTPRICE_ISSET_ID);
  }

  public void setHighestPriceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HIGHESTPRICE_ISSET_ID, value);
  }

  public double getLowestPrice() {
    return this.lowestPrice;
  }

  public CThostFtdcMarketDataStaticField setLowestPrice(double lowestPrice) {
    this.lowestPrice = lowestPrice;
    setLowestPriceIsSet(true);
    return this;
  }

  public void unsetLowestPrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOWESTPRICE_ISSET_ID);
  }

  /** Returns true if field lowestPrice is set (has been assigned a value) and false otherwise */
  public boolean isSetLowestPrice() {
    return EncodingUtils.testBit(__isset_bitfield, __LOWESTPRICE_ISSET_ID);
  }

  public void setLowestPriceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOWESTPRICE_ISSET_ID, value);
  }

  public double getClosePrice() {
    return this.closePrice;
  }

  public CThostFtdcMarketDataStaticField setClosePrice(double closePrice) {
    this.closePrice = closePrice;
    setClosePriceIsSet(true);
    return this;
  }

  public void unsetClosePrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CLOSEPRICE_ISSET_ID);
  }

  /** Returns true if field closePrice is set (has been assigned a value) and false otherwise */
  public boolean isSetClosePrice() {
    return EncodingUtils.testBit(__isset_bitfield, __CLOSEPRICE_ISSET_ID);
  }

  public void setClosePriceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CLOSEPRICE_ISSET_ID, value);
  }

  public double getUpperLimitPrice() {
    return this.upperLimitPrice;
  }

  public CThostFtdcMarketDataStaticField setUpperLimitPrice(double upperLimitPrice) {
    this.upperLimitPrice = upperLimitPrice;
    setUpperLimitPriceIsSet(true);
    return this;
  }

  public void unsetUpperLimitPrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPPERLIMITPRICE_ISSET_ID);
  }

  /** Returns true if field upperLimitPrice is set (has been assigned a value) and false otherwise */
  public boolean isSetUpperLimitPrice() {
    return EncodingUtils.testBit(__isset_bitfield, __UPPERLIMITPRICE_ISSET_ID);
  }

  public void setUpperLimitPriceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPPERLIMITPRICE_ISSET_ID, value);
  }

  public double getLowerLimitPrice() {
    return this.lowerLimitPrice;
  }

  public CThostFtdcMarketDataStaticField setLowerLimitPrice(double lowerLimitPrice) {
    this.lowerLimitPrice = lowerLimitPrice;
    setLowerLimitPriceIsSet(true);
    return this;
  }

  public void unsetLowerLimitPrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOWERLIMITPRICE_ISSET_ID);
  }

  /** Returns true if field lowerLimitPrice is set (has been assigned a value) and false otherwise */
  public boolean isSetLowerLimitPrice() {
    return EncodingUtils.testBit(__isset_bitfield, __LOWERLIMITPRICE_ISSET_ID);
  }

  public void setLowerLimitPriceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOWERLIMITPRICE_ISSET_ID, value);
  }

  public double getSettlementPrice() {
    return this.settlementPrice;
  }

  public CThostFtdcMarketDataStaticField setSettlementPrice(double settlementPrice) {
    this.settlementPrice = settlementPrice;
    setSettlementPriceIsSet(true);
    return this;
  }

  public void unsetSettlementPrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SETTLEMENTPRICE_ISSET_ID);
  }

  /** Returns true if field settlementPrice is set (has been assigned a value) and false otherwise */
  public boolean isSetSettlementPrice() {
    return EncodingUtils.testBit(__isset_bitfield, __SETTLEMENTPRICE_ISSET_ID);
  }

  public void setSettlementPriceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SETTLEMENTPRICE_ISSET_ID, value);
  }

  public double getCurrDelta() {
    return this.currDelta;
  }

  public CThostFtdcMarketDataStaticField setCurrDelta(double currDelta) {
    this.currDelta = currDelta;
    setCurrDeltaIsSet(true);
    return this;
  }

  public void unsetCurrDelta() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CURRDELTA_ISSET_ID);
  }

  /** Returns true if field currDelta is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrDelta() {
    return EncodingUtils.testBit(__isset_bitfield, __CURRDELTA_ISSET_ID);
  }

  public void setCurrDeltaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CURRDELTA_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OPEN_PRICE:
      if (value == null) {
        unsetOpenPrice();
      } else {
        setOpenPrice((Double)value);
      }
      break;

    case HIGHEST_PRICE:
      if (value == null) {
        unsetHighestPrice();
      } else {
        setHighestPrice((Double)value);
      }
      break;

    case LOWEST_PRICE:
      if (value == null) {
        unsetLowestPrice();
      } else {
        setLowestPrice((Double)value);
      }
      break;

    case CLOSE_PRICE:
      if (value == null) {
        unsetClosePrice();
      } else {
        setClosePrice((Double)value);
      }
      break;

    case UPPER_LIMIT_PRICE:
      if (value == null) {
        unsetUpperLimitPrice();
      } else {
        setUpperLimitPrice((Double)value);
      }
      break;

    case LOWER_LIMIT_PRICE:
      if (value == null) {
        unsetLowerLimitPrice();
      } else {
        setLowerLimitPrice((Double)value);
      }
      break;

    case SETTLEMENT_PRICE:
      if (value == null) {
        unsetSettlementPrice();
      } else {
        setSettlementPrice((Double)value);
      }
      break;

    case CURR_DELTA:
      if (value == null) {
        unsetCurrDelta();
      } else {
        setCurrDelta((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OPEN_PRICE:
      return Double.valueOf(getOpenPrice());

    case HIGHEST_PRICE:
      return Double.valueOf(getHighestPrice());

    case LOWEST_PRICE:
      return Double.valueOf(getLowestPrice());

    case CLOSE_PRICE:
      return Double.valueOf(getClosePrice());

    case UPPER_LIMIT_PRICE:
      return Double.valueOf(getUpperLimitPrice());

    case LOWER_LIMIT_PRICE:
      return Double.valueOf(getLowerLimitPrice());

    case SETTLEMENT_PRICE:
      return Double.valueOf(getSettlementPrice());

    case CURR_DELTA:
      return Double.valueOf(getCurrDelta());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OPEN_PRICE:
      return isSetOpenPrice();
    case HIGHEST_PRICE:
      return isSetHighestPrice();
    case LOWEST_PRICE:
      return isSetLowestPrice();
    case CLOSE_PRICE:
      return isSetClosePrice();
    case UPPER_LIMIT_PRICE:
      return isSetUpperLimitPrice();
    case LOWER_LIMIT_PRICE:
      return isSetLowerLimitPrice();
    case SETTLEMENT_PRICE:
      return isSetSettlementPrice();
    case CURR_DELTA:
      return isSetCurrDelta();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcMarketDataStaticField)
      return this.equals((CThostFtdcMarketDataStaticField)that);
    return false;
  }

  public boolean equals(CThostFtdcMarketDataStaticField that) {
    if (that == null)
      return false;

    boolean this_present_openPrice = true;
    boolean that_present_openPrice = true;
    if (this_present_openPrice || that_present_openPrice) {
      if (!(this_present_openPrice && that_present_openPrice))
        return false;
      if (this.openPrice != that.openPrice)
        return false;
    }

    boolean this_present_highestPrice = true;
    boolean that_present_highestPrice = true;
    if (this_present_highestPrice || that_present_highestPrice) {
      if (!(this_present_highestPrice && that_present_highestPrice))
        return false;
      if (this.highestPrice != that.highestPrice)
        return false;
    }

    boolean this_present_lowestPrice = true;
    boolean that_present_lowestPrice = true;
    if (this_present_lowestPrice || that_present_lowestPrice) {
      if (!(this_present_lowestPrice && that_present_lowestPrice))
        return false;
      if (this.lowestPrice != that.lowestPrice)
        return false;
    }

    boolean this_present_closePrice = true;
    boolean that_present_closePrice = true;
    if (this_present_closePrice || that_present_closePrice) {
      if (!(this_present_closePrice && that_present_closePrice))
        return false;
      if (this.closePrice != that.closePrice)
        return false;
    }

    boolean this_present_upperLimitPrice = true;
    boolean that_present_upperLimitPrice = true;
    if (this_present_upperLimitPrice || that_present_upperLimitPrice) {
      if (!(this_present_upperLimitPrice && that_present_upperLimitPrice))
        return false;
      if (this.upperLimitPrice != that.upperLimitPrice)
        return false;
    }

    boolean this_present_lowerLimitPrice = true;
    boolean that_present_lowerLimitPrice = true;
    if (this_present_lowerLimitPrice || that_present_lowerLimitPrice) {
      if (!(this_present_lowerLimitPrice && that_present_lowerLimitPrice))
        return false;
      if (this.lowerLimitPrice != that.lowerLimitPrice)
        return false;
    }

    boolean this_present_settlementPrice = true;
    boolean that_present_settlementPrice = true;
    if (this_present_settlementPrice || that_present_settlementPrice) {
      if (!(this_present_settlementPrice && that_present_settlementPrice))
        return false;
      if (this.settlementPrice != that.settlementPrice)
        return false;
    }

    boolean this_present_currDelta = true;
    boolean that_present_currDelta = true;
    if (this_present_currDelta || that_present_currDelta) {
      if (!(this_present_currDelta && that_present_currDelta))
        return false;
      if (this.currDelta != that.currDelta)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcMarketDataStaticField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOpenPrice()).compareTo(other.isSetOpenPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpenPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.openPrice, other.openPrice);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHighestPrice()).compareTo(other.isSetHighestPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHighestPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.highestPrice, other.highestPrice);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLowestPrice()).compareTo(other.isSetLowestPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLowestPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lowestPrice, other.lowestPrice);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClosePrice()).compareTo(other.isSetClosePrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClosePrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.closePrice, other.closePrice);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpperLimitPrice()).compareTo(other.isSetUpperLimitPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpperLimitPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.upperLimitPrice, other.upperLimitPrice);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLowerLimitPrice()).compareTo(other.isSetLowerLimitPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLowerLimitPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lowerLimitPrice, other.lowerLimitPrice);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSettlementPrice()).compareTo(other.isSetSettlementPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSettlementPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.settlementPrice, other.settlementPrice);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurrDelta()).compareTo(other.isSetCurrDelta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrDelta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currDelta, other.currDelta);
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
    StringBuilder sb = new StringBuilder("CThostFtdcMarketDataStaticField(");
    boolean first = true;

    sb.append("openPrice:");
    sb.append(this.openPrice);
    first = false;
    if (!first) sb.append(", ");
    sb.append("highestPrice:");
    sb.append(this.highestPrice);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lowestPrice:");
    sb.append(this.lowestPrice);
    first = false;
    if (!first) sb.append(", ");
    sb.append("closePrice:");
    sb.append(this.closePrice);
    first = false;
    if (!first) sb.append(", ");
    sb.append("upperLimitPrice:");
    sb.append(this.upperLimitPrice);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lowerLimitPrice:");
    sb.append(this.lowerLimitPrice);
    first = false;
    if (!first) sb.append(", ");
    sb.append("settlementPrice:");
    sb.append(this.settlementPrice);
    first = false;
    if (!first) sb.append(", ");
    sb.append("currDelta:");
    sb.append(this.currDelta);
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

  private static class CThostFtdcMarketDataStaticFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcMarketDataStaticFieldStandardScheme getScheme() {
      return new CThostFtdcMarketDataStaticFieldStandardScheme();
    }
  }

  private static class CThostFtdcMarketDataStaticFieldStandardScheme extends StandardScheme<CThostFtdcMarketDataStaticField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcMarketDataStaticField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPEN_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.openPrice = iprot.readDouble();
              struct.setOpenPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HIGHEST_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.highestPrice = iprot.readDouble();
              struct.setHighestPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOWEST_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.lowestPrice = iprot.readDouble();
              struct.setLowestPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CLOSE_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.closePrice = iprot.readDouble();
              struct.setClosePriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UPPER_LIMIT_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.upperLimitPrice = iprot.readDouble();
              struct.setUpperLimitPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LOWER_LIMIT_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.lowerLimitPrice = iprot.readDouble();
              struct.setLowerLimitPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SETTLEMENT_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.settlementPrice = iprot.readDouble();
              struct.setSettlementPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // CURR_DELTA
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.currDelta = iprot.readDouble();
              struct.setCurrDeltaIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcMarketDataStaticField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(OPEN_PRICE_FIELD_DESC);
      oprot.writeDouble(struct.openPrice);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HIGHEST_PRICE_FIELD_DESC);
      oprot.writeDouble(struct.highestPrice);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOWEST_PRICE_FIELD_DESC);
      oprot.writeDouble(struct.lowestPrice);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CLOSE_PRICE_FIELD_DESC);
      oprot.writeDouble(struct.closePrice);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPPER_LIMIT_PRICE_FIELD_DESC);
      oprot.writeDouble(struct.upperLimitPrice);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOWER_LIMIT_PRICE_FIELD_DESC);
      oprot.writeDouble(struct.lowerLimitPrice);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SETTLEMENT_PRICE_FIELD_DESC);
      oprot.writeDouble(struct.settlementPrice);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CURR_DELTA_FIELD_DESC);
      oprot.writeDouble(struct.currDelta);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcMarketDataStaticFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcMarketDataStaticFieldTupleScheme getScheme() {
      return new CThostFtdcMarketDataStaticFieldTupleScheme();
    }
  }

  private static class CThostFtdcMarketDataStaticFieldTupleScheme extends TupleScheme<CThostFtdcMarketDataStaticField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcMarketDataStaticField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOpenPrice()) {
        optionals.set(0);
      }
      if (struct.isSetHighestPrice()) {
        optionals.set(1);
      }
      if (struct.isSetLowestPrice()) {
        optionals.set(2);
      }
      if (struct.isSetClosePrice()) {
        optionals.set(3);
      }
      if (struct.isSetUpperLimitPrice()) {
        optionals.set(4);
      }
      if (struct.isSetLowerLimitPrice()) {
        optionals.set(5);
      }
      if (struct.isSetSettlementPrice()) {
        optionals.set(6);
      }
      if (struct.isSetCurrDelta()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetOpenPrice()) {
        oprot.writeDouble(struct.openPrice);
      }
      if (struct.isSetHighestPrice()) {
        oprot.writeDouble(struct.highestPrice);
      }
      if (struct.isSetLowestPrice()) {
        oprot.writeDouble(struct.lowestPrice);
      }
      if (struct.isSetClosePrice()) {
        oprot.writeDouble(struct.closePrice);
      }
      if (struct.isSetUpperLimitPrice()) {
        oprot.writeDouble(struct.upperLimitPrice);
      }
      if (struct.isSetLowerLimitPrice()) {
        oprot.writeDouble(struct.lowerLimitPrice);
      }
      if (struct.isSetSettlementPrice()) {
        oprot.writeDouble(struct.settlementPrice);
      }
      if (struct.isSetCurrDelta()) {
        oprot.writeDouble(struct.currDelta);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcMarketDataStaticField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.openPrice = iprot.readDouble();
        struct.setOpenPriceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.highestPrice = iprot.readDouble();
        struct.setHighestPriceIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lowestPrice = iprot.readDouble();
        struct.setLowestPriceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.closePrice = iprot.readDouble();
        struct.setClosePriceIsSet(true);
      }
      if (incoming.get(4)) {
        struct.upperLimitPrice = iprot.readDouble();
        struct.setUpperLimitPriceIsSet(true);
      }
      if (incoming.get(5)) {
        struct.lowerLimitPrice = iprot.readDouble();
        struct.setLowerLimitPriceIsSet(true);
      }
      if (incoming.get(6)) {
        struct.settlementPrice = iprot.readDouble();
        struct.setSettlementPriceIsSet(true);
      }
      if (incoming.get(7)) {
        struct.currDelta = iprot.readDouble();
        struct.setCurrDeltaIsSet(true);
      }
    }
  }

}

