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

public class CThostFtdcQryOptionInstrTradeCostField implements org.apache.thrift.TBase<CThostFtdcQryOptionInstrTradeCostField, CThostFtdcQryOptionInstrTradeCostField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcQryOptionInstrTradeCostField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcQryOptionInstrTradeCostField");

  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INVESTOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("investorID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField INSTRUMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("instrumentID", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField HEDGE_FLAG_FIELD_DESC = new org.apache.thrift.protocol.TField("hedgeFlag", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField INPUT_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("inputPrice", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField UNDERLYING_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("underlyingPrice", org.apache.thrift.protocol.TType.DOUBLE, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcQryOptionInstrTradeCostFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcQryOptionInstrTradeCostFieldTupleSchemeFactory());
  }

  public String brokerID; // required
  public String investorID; // required
  public String instrumentID; // required
  public String hedgeFlag; // required
  public double inputPrice; // required
  public double underlyingPrice; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BROKER_ID((short)1, "brokerID"),
    INVESTOR_ID((short)2, "investorID"),
    INSTRUMENT_ID((short)3, "instrumentID"),
    HEDGE_FLAG((short)4, "hedgeFlag"),
    INPUT_PRICE((short)5, "inputPrice"),
    UNDERLYING_PRICE((short)6, "underlyingPrice");

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
        case 2: // INVESTOR_ID
          return INVESTOR_ID;
        case 3: // INSTRUMENT_ID
          return INSTRUMENT_ID;
        case 4: // HEDGE_FLAG
          return HEDGE_FLAG;
        case 5: // INPUT_PRICE
          return INPUT_PRICE;
        case 6: // UNDERLYING_PRICE
          return UNDERLYING_PRICE;
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
  private static final int __INPUTPRICE_ISSET_ID = 0;
  private static final int __UNDERLYINGPRICE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BROKER_ID, new org.apache.thrift.meta_data.FieldMetaData("brokerID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcBrokerIDType")));
    tmpMap.put(_Fields.INVESTOR_ID, new org.apache.thrift.meta_data.FieldMetaData("investorID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInvestorIDType")));
    tmpMap.put(_Fields.INSTRUMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("instrumentID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInstrumentIDType")));
    tmpMap.put(_Fields.HEDGE_FLAG, new org.apache.thrift.meta_data.FieldMetaData("hedgeFlag", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcHedgeFlagType")));
    tmpMap.put(_Fields.INPUT_PRICE, new org.apache.thrift.meta_data.FieldMetaData("inputPrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    tmpMap.put(_Fields.UNDERLYING_PRICE, new org.apache.thrift.meta_data.FieldMetaData("underlyingPrice", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcQryOptionInstrTradeCostField.class, metaDataMap);
  }

  public CThostFtdcQryOptionInstrTradeCostField() {
  }

  public CThostFtdcQryOptionInstrTradeCostField(
    String brokerID,
    String investorID,
    String instrumentID,
    String hedgeFlag,
    double inputPrice,
    double underlyingPrice)
  {
    this();
    this.brokerID = brokerID;
    this.investorID = investorID;
    this.instrumentID = instrumentID;
    this.hedgeFlag = hedgeFlag;
    this.inputPrice = inputPrice;
    setInputPriceIsSet(true);
    this.underlyingPrice = underlyingPrice;
    setUnderlyingPriceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcQryOptionInstrTradeCostField(CThostFtdcQryOptionInstrTradeCostField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetInvestorID()) {
      this.investorID = other.investorID;
    }
    if (other.isSetInstrumentID()) {
      this.instrumentID = other.instrumentID;
    }
    if (other.isSetHedgeFlag()) {
      this.hedgeFlag = other.hedgeFlag;
    }
    this.inputPrice = other.inputPrice;
    this.underlyingPrice = other.underlyingPrice;
  }

  public CThostFtdcQryOptionInstrTradeCostField deepCopy() {
    return new CThostFtdcQryOptionInstrTradeCostField(this);
  }

  @Override
  public void clear() {
    this.brokerID = null;
    this.investorID = null;
    this.instrumentID = null;
    this.hedgeFlag = null;
    setInputPriceIsSet(false);
    this.inputPrice = 0.0;
    setUnderlyingPriceIsSet(false);
    this.underlyingPrice = 0.0;
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcQryOptionInstrTradeCostField setBrokerID(String brokerID) {
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

  public CThostFtdcQryOptionInstrTradeCostField setInvestorID(String investorID) {
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

  public String getInstrumentID() {
    return this.instrumentID;
  }

  public CThostFtdcQryOptionInstrTradeCostField setInstrumentID(String instrumentID) {
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

  public String getHedgeFlag() {
    return this.hedgeFlag;
  }

  public CThostFtdcQryOptionInstrTradeCostField setHedgeFlag(String hedgeFlag) {
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

  public double getInputPrice() {
    return this.inputPrice;
  }

  public CThostFtdcQryOptionInstrTradeCostField setInputPrice(double inputPrice) {
    this.inputPrice = inputPrice;
    setInputPriceIsSet(true);
    return this;
  }

  public void unsetInputPrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INPUTPRICE_ISSET_ID);
  }

  /** Returns true if field inputPrice is set (has been assigned a value) and false otherwise */
  public boolean isSetInputPrice() {
    return EncodingUtils.testBit(__isset_bitfield, __INPUTPRICE_ISSET_ID);
  }

  public void setInputPriceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INPUTPRICE_ISSET_ID, value);
  }

  public double getUnderlyingPrice() {
    return this.underlyingPrice;
  }

  public CThostFtdcQryOptionInstrTradeCostField setUnderlyingPrice(double underlyingPrice) {
    this.underlyingPrice = underlyingPrice;
    setUnderlyingPriceIsSet(true);
    return this;
  }

  public void unsetUnderlyingPrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UNDERLYINGPRICE_ISSET_ID);
  }

  /** Returns true if field underlyingPrice is set (has been assigned a value) and false otherwise */
  public boolean isSetUnderlyingPrice() {
    return EncodingUtils.testBit(__isset_bitfield, __UNDERLYINGPRICE_ISSET_ID);
  }

  public void setUnderlyingPriceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UNDERLYINGPRICE_ISSET_ID, value);
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

    case INVESTOR_ID:
      if (value == null) {
        unsetInvestorID();
      } else {
        setInvestorID((String)value);
      }
      break;

    case INSTRUMENT_ID:
      if (value == null) {
        unsetInstrumentID();
      } else {
        setInstrumentID((String)value);
      }
      break;

    case HEDGE_FLAG:
      if (value == null) {
        unsetHedgeFlag();
      } else {
        setHedgeFlag((String)value);
      }
      break;

    case INPUT_PRICE:
      if (value == null) {
        unsetInputPrice();
      } else {
        setInputPrice((Double)value);
      }
      break;

    case UNDERLYING_PRICE:
      if (value == null) {
        unsetUnderlyingPrice();
      } else {
        setUnderlyingPrice((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BROKER_ID:
      return getBrokerID();

    case INVESTOR_ID:
      return getInvestorID();

    case INSTRUMENT_ID:
      return getInstrumentID();

    case HEDGE_FLAG:
      return getHedgeFlag();

    case INPUT_PRICE:
      return Double.valueOf(getInputPrice());

    case UNDERLYING_PRICE:
      return Double.valueOf(getUnderlyingPrice());

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
    case INVESTOR_ID:
      return isSetInvestorID();
    case INSTRUMENT_ID:
      return isSetInstrumentID();
    case HEDGE_FLAG:
      return isSetHedgeFlag();
    case INPUT_PRICE:
      return isSetInputPrice();
    case UNDERLYING_PRICE:
      return isSetUnderlyingPrice();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcQryOptionInstrTradeCostField)
      return this.equals((CThostFtdcQryOptionInstrTradeCostField)that);
    return false;
  }

  public boolean equals(CThostFtdcQryOptionInstrTradeCostField that) {
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

    boolean this_present_investorID = true && this.isSetInvestorID();
    boolean that_present_investorID = true && that.isSetInvestorID();
    if (this_present_investorID || that_present_investorID) {
      if (!(this_present_investorID && that_present_investorID))
        return false;
      if (!this.investorID.equals(that.investorID))
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

    boolean this_present_hedgeFlag = true && this.isSetHedgeFlag();
    boolean that_present_hedgeFlag = true && that.isSetHedgeFlag();
    if (this_present_hedgeFlag || that_present_hedgeFlag) {
      if (!(this_present_hedgeFlag && that_present_hedgeFlag))
        return false;
      if (!this.hedgeFlag.equals(that.hedgeFlag))
        return false;
    }

    boolean this_present_inputPrice = true;
    boolean that_present_inputPrice = true;
    if (this_present_inputPrice || that_present_inputPrice) {
      if (!(this_present_inputPrice && that_present_inputPrice))
        return false;
      if (this.inputPrice != that.inputPrice)
        return false;
    }

    boolean this_present_underlyingPrice = true;
    boolean that_present_underlyingPrice = true;
    if (this_present_underlyingPrice || that_present_underlyingPrice) {
      if (!(this_present_underlyingPrice && that_present_underlyingPrice))
        return false;
      if (this.underlyingPrice != that.underlyingPrice)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcQryOptionInstrTradeCostField other) {
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
    lastComparison = Boolean.valueOf(isSetInputPrice()).compareTo(other.isSetInputPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInputPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inputPrice, other.inputPrice);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnderlyingPrice()).compareTo(other.isSetUnderlyingPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnderlyingPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.underlyingPrice, other.underlyingPrice);
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
    StringBuilder sb = new StringBuilder("CThostFtdcQryOptionInstrTradeCostField(");
    boolean first = true;

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
    sb.append("instrumentID:");
    if (this.instrumentID == null) {
      sb.append("null");
    } else {
      sb.append(this.instrumentID);
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
    sb.append("inputPrice:");
    sb.append(this.inputPrice);
    first = false;
    if (!first) sb.append(", ");
    sb.append("underlyingPrice:");
    sb.append(this.underlyingPrice);
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

  private static class CThostFtdcQryOptionInstrTradeCostFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcQryOptionInstrTradeCostFieldStandardScheme getScheme() {
      return new CThostFtdcQryOptionInstrTradeCostFieldStandardScheme();
    }
  }

  private static class CThostFtdcQryOptionInstrTradeCostFieldStandardScheme extends StandardScheme<CThostFtdcQryOptionInstrTradeCostField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcQryOptionInstrTradeCostField struct) throws org.apache.thrift.TException {
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
          case 2: // INVESTOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.investorID = iprot.readString();
              struct.setInvestorIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INSTRUMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.instrumentID = iprot.readString();
              struct.setInstrumentIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HEDGE_FLAG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hedgeFlag = iprot.readString();
              struct.setHedgeFlagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // INPUT_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.inputPrice = iprot.readDouble();
              struct.setInputPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // UNDERLYING_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.underlyingPrice = iprot.readDouble();
              struct.setUnderlyingPriceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcQryOptionInstrTradeCostField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
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
      if (struct.instrumentID != null) {
        oprot.writeFieldBegin(INSTRUMENT_ID_FIELD_DESC);
        oprot.writeString(struct.instrumentID);
        oprot.writeFieldEnd();
      }
      if (struct.hedgeFlag != null) {
        oprot.writeFieldBegin(HEDGE_FLAG_FIELD_DESC);
        oprot.writeString(struct.hedgeFlag);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INPUT_PRICE_FIELD_DESC);
      oprot.writeDouble(struct.inputPrice);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UNDERLYING_PRICE_FIELD_DESC);
      oprot.writeDouble(struct.underlyingPrice);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcQryOptionInstrTradeCostFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcQryOptionInstrTradeCostFieldTupleScheme getScheme() {
      return new CThostFtdcQryOptionInstrTradeCostFieldTupleScheme();
    }
  }

  private static class CThostFtdcQryOptionInstrTradeCostFieldTupleScheme extends TupleScheme<CThostFtdcQryOptionInstrTradeCostField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcQryOptionInstrTradeCostField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBrokerID()) {
        optionals.set(0);
      }
      if (struct.isSetInvestorID()) {
        optionals.set(1);
      }
      if (struct.isSetInstrumentID()) {
        optionals.set(2);
      }
      if (struct.isSetHedgeFlag()) {
        optionals.set(3);
      }
      if (struct.isSetInputPrice()) {
        optionals.set(4);
      }
      if (struct.isSetUnderlyingPrice()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetInvestorID()) {
        oprot.writeString(struct.investorID);
      }
      if (struct.isSetInstrumentID()) {
        oprot.writeString(struct.instrumentID);
      }
      if (struct.isSetHedgeFlag()) {
        oprot.writeString(struct.hedgeFlag);
      }
      if (struct.isSetInputPrice()) {
        oprot.writeDouble(struct.inputPrice);
      }
      if (struct.isSetUnderlyingPrice()) {
        oprot.writeDouble(struct.underlyingPrice);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcQryOptionInstrTradeCostField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.investorID = iprot.readString();
        struct.setInvestorIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.instrumentID = iprot.readString();
        struct.setInstrumentIDIsSet(true);
      }
      if (incoming.get(3)) {
        struct.hedgeFlag = iprot.readString();
        struct.setHedgeFlagIsSet(true);
      }
      if (incoming.get(4)) {
        struct.inputPrice = iprot.readDouble();
        struct.setInputPriceIsSet(true);
      }
      if (incoming.get(5)) {
        struct.underlyingPrice = iprot.readDouble();
        struct.setUnderlyingPriceIsSet(true);
      }
    }
  }

}

