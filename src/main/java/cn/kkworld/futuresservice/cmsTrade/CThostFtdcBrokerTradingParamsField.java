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

public class CThostFtdcBrokerTradingParamsField implements org.apache.thrift.TBase<CThostFtdcBrokerTradingParamsField, CThostFtdcBrokerTradingParamsField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcBrokerTradingParamsField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcBrokerTradingParamsField");

  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INVESTOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("investorID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MARGIN_PRICE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("marginPriceType", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ALGORITHM_FIELD_DESC = new org.apache.thrift.protocol.TField("algorithm", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField AVAIL_INCLUDE_CLOSE_PROFIT_FIELD_DESC = new org.apache.thrift.protocol.TField("availIncludeCloseProfit", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField CURRENCY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("currencyID", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField OPTION_ROYALTY_PRICE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("optionRoyaltyPriceType", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcBrokerTradingParamsFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcBrokerTradingParamsFieldTupleSchemeFactory());
  }

  public String brokerID; // required
  public String investorID; // required
  public String marginPriceType; // required
  public String algorithm; // required
  public String availIncludeCloseProfit; // required
  public String currencyID; // required
  public String optionRoyaltyPriceType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BROKER_ID((short)1, "brokerID"),
    INVESTOR_ID((short)2, "investorID"),
    MARGIN_PRICE_TYPE((short)3, "marginPriceType"),
    ALGORITHM((short)4, "algorithm"),
    AVAIL_INCLUDE_CLOSE_PROFIT((short)5, "availIncludeCloseProfit"),
    CURRENCY_ID((short)6, "currencyID"),
    OPTION_ROYALTY_PRICE_TYPE((short)7, "optionRoyaltyPriceType");

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
        case 3: // MARGIN_PRICE_TYPE
          return MARGIN_PRICE_TYPE;
        case 4: // ALGORITHM
          return ALGORITHM;
        case 5: // AVAIL_INCLUDE_CLOSE_PROFIT
          return AVAIL_INCLUDE_CLOSE_PROFIT;
        case 6: // CURRENCY_ID
          return CURRENCY_ID;
        case 7: // OPTION_ROYALTY_PRICE_TYPE
          return OPTION_ROYALTY_PRICE_TYPE;
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
    tmpMap.put(_Fields.INVESTOR_ID, new org.apache.thrift.meta_data.FieldMetaData("investorID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInvestorIDType")));
    tmpMap.put(_Fields.MARGIN_PRICE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("marginPriceType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcMarginPriceTypeType")));
    tmpMap.put(_Fields.ALGORITHM, new org.apache.thrift.meta_data.FieldMetaData("algorithm", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcAlgorithmType")));
    tmpMap.put(_Fields.AVAIL_INCLUDE_CLOSE_PROFIT, new org.apache.thrift.meta_data.FieldMetaData("availIncludeCloseProfit", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcIncludeCloseProfitType")));
    tmpMap.put(_Fields.CURRENCY_ID, new org.apache.thrift.meta_data.FieldMetaData("currencyID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcCurrencyIDType")));
    tmpMap.put(_Fields.OPTION_ROYALTY_PRICE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("optionRoyaltyPriceType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcOptionRoyaltyPriceTypeType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcBrokerTradingParamsField.class, metaDataMap);
  }

  public CThostFtdcBrokerTradingParamsField() {
  }

  public CThostFtdcBrokerTradingParamsField(
    String brokerID,
    String investorID,
    String marginPriceType,
    String algorithm,
    String availIncludeCloseProfit,
    String currencyID,
    String optionRoyaltyPriceType)
  {
    this();
    this.brokerID = brokerID;
    this.investorID = investorID;
    this.marginPriceType = marginPriceType;
    this.algorithm = algorithm;
    this.availIncludeCloseProfit = availIncludeCloseProfit;
    this.currencyID = currencyID;
    this.optionRoyaltyPriceType = optionRoyaltyPriceType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcBrokerTradingParamsField(CThostFtdcBrokerTradingParamsField other) {
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetInvestorID()) {
      this.investorID = other.investorID;
    }
    if (other.isSetMarginPriceType()) {
      this.marginPriceType = other.marginPriceType;
    }
    if (other.isSetAlgorithm()) {
      this.algorithm = other.algorithm;
    }
    if (other.isSetAvailIncludeCloseProfit()) {
      this.availIncludeCloseProfit = other.availIncludeCloseProfit;
    }
    if (other.isSetCurrencyID()) {
      this.currencyID = other.currencyID;
    }
    if (other.isSetOptionRoyaltyPriceType()) {
      this.optionRoyaltyPriceType = other.optionRoyaltyPriceType;
    }
  }

  public CThostFtdcBrokerTradingParamsField deepCopy() {
    return new CThostFtdcBrokerTradingParamsField(this);
  }

  @Override
  public void clear() {
    this.brokerID = null;
    this.investorID = null;
    this.marginPriceType = null;
    this.algorithm = null;
    this.availIncludeCloseProfit = null;
    this.currencyID = null;
    this.optionRoyaltyPriceType = null;
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcBrokerTradingParamsField setBrokerID(String brokerID) {
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

  public CThostFtdcBrokerTradingParamsField setInvestorID(String investorID) {
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

  public String getMarginPriceType() {
    return this.marginPriceType;
  }

  public CThostFtdcBrokerTradingParamsField setMarginPriceType(String marginPriceType) {
    this.marginPriceType = marginPriceType;
    return this;
  }

  public void unsetMarginPriceType() {
    this.marginPriceType = null;
  }

  /** Returns true if field marginPriceType is set (has been assigned a value) and false otherwise */
  public boolean isSetMarginPriceType() {
    return this.marginPriceType != null;
  }

  public void setMarginPriceTypeIsSet(boolean value) {
    if (!value) {
      this.marginPriceType = null;
    }
  }

  public String getAlgorithm() {
    return this.algorithm;
  }

  public CThostFtdcBrokerTradingParamsField setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  public void unsetAlgorithm() {
    this.algorithm = null;
  }

  /** Returns true if field algorithm is set (has been assigned a value) and false otherwise */
  public boolean isSetAlgorithm() {
    return this.algorithm != null;
  }

  public void setAlgorithmIsSet(boolean value) {
    if (!value) {
      this.algorithm = null;
    }
  }

  public String getAvailIncludeCloseProfit() {
    return this.availIncludeCloseProfit;
  }

  public CThostFtdcBrokerTradingParamsField setAvailIncludeCloseProfit(String availIncludeCloseProfit) {
    this.availIncludeCloseProfit = availIncludeCloseProfit;
    return this;
  }

  public void unsetAvailIncludeCloseProfit() {
    this.availIncludeCloseProfit = null;
  }

  /** Returns true if field availIncludeCloseProfit is set (has been assigned a value) and false otherwise */
  public boolean isSetAvailIncludeCloseProfit() {
    return this.availIncludeCloseProfit != null;
  }

  public void setAvailIncludeCloseProfitIsSet(boolean value) {
    if (!value) {
      this.availIncludeCloseProfit = null;
    }
  }

  public String getCurrencyID() {
    return this.currencyID;
  }

  public CThostFtdcBrokerTradingParamsField setCurrencyID(String currencyID) {
    this.currencyID = currencyID;
    return this;
  }

  public void unsetCurrencyID() {
    this.currencyID = null;
  }

  /** Returns true if field currencyID is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrencyID() {
    return this.currencyID != null;
  }

  public void setCurrencyIDIsSet(boolean value) {
    if (!value) {
      this.currencyID = null;
    }
  }

  public String getOptionRoyaltyPriceType() {
    return this.optionRoyaltyPriceType;
  }

  public CThostFtdcBrokerTradingParamsField setOptionRoyaltyPriceType(String optionRoyaltyPriceType) {
    this.optionRoyaltyPriceType = optionRoyaltyPriceType;
    return this;
  }

  public void unsetOptionRoyaltyPriceType() {
    this.optionRoyaltyPriceType = null;
  }

  /** Returns true if field optionRoyaltyPriceType is set (has been assigned a value) and false otherwise */
  public boolean isSetOptionRoyaltyPriceType() {
    return this.optionRoyaltyPriceType != null;
  }

  public void setOptionRoyaltyPriceTypeIsSet(boolean value) {
    if (!value) {
      this.optionRoyaltyPriceType = null;
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

    case INVESTOR_ID:
      if (value == null) {
        unsetInvestorID();
      } else {
        setInvestorID((String)value);
      }
      break;

    case MARGIN_PRICE_TYPE:
      if (value == null) {
        unsetMarginPriceType();
      } else {
        setMarginPriceType((String)value);
      }
      break;

    case ALGORITHM:
      if (value == null) {
        unsetAlgorithm();
      } else {
        setAlgorithm((String)value);
      }
      break;

    case AVAIL_INCLUDE_CLOSE_PROFIT:
      if (value == null) {
        unsetAvailIncludeCloseProfit();
      } else {
        setAvailIncludeCloseProfit((String)value);
      }
      break;

    case CURRENCY_ID:
      if (value == null) {
        unsetCurrencyID();
      } else {
        setCurrencyID((String)value);
      }
      break;

    case OPTION_ROYALTY_PRICE_TYPE:
      if (value == null) {
        unsetOptionRoyaltyPriceType();
      } else {
        setOptionRoyaltyPriceType((String)value);
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

    case MARGIN_PRICE_TYPE:
      return getMarginPriceType();

    case ALGORITHM:
      return getAlgorithm();

    case AVAIL_INCLUDE_CLOSE_PROFIT:
      return getAvailIncludeCloseProfit();

    case CURRENCY_ID:
      return getCurrencyID();

    case OPTION_ROYALTY_PRICE_TYPE:
      return getOptionRoyaltyPriceType();

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
    case MARGIN_PRICE_TYPE:
      return isSetMarginPriceType();
    case ALGORITHM:
      return isSetAlgorithm();
    case AVAIL_INCLUDE_CLOSE_PROFIT:
      return isSetAvailIncludeCloseProfit();
    case CURRENCY_ID:
      return isSetCurrencyID();
    case OPTION_ROYALTY_PRICE_TYPE:
      return isSetOptionRoyaltyPriceType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcBrokerTradingParamsField)
      return this.equals((CThostFtdcBrokerTradingParamsField)that);
    return false;
  }

  public boolean equals(CThostFtdcBrokerTradingParamsField that) {
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

    boolean this_present_marginPriceType = true && this.isSetMarginPriceType();
    boolean that_present_marginPriceType = true && that.isSetMarginPriceType();
    if (this_present_marginPriceType || that_present_marginPriceType) {
      if (!(this_present_marginPriceType && that_present_marginPriceType))
        return false;
      if (!this.marginPriceType.equals(that.marginPriceType))
        return false;
    }

    boolean this_present_algorithm = true && this.isSetAlgorithm();
    boolean that_present_algorithm = true && that.isSetAlgorithm();
    if (this_present_algorithm || that_present_algorithm) {
      if (!(this_present_algorithm && that_present_algorithm))
        return false;
      if (!this.algorithm.equals(that.algorithm))
        return false;
    }

    boolean this_present_availIncludeCloseProfit = true && this.isSetAvailIncludeCloseProfit();
    boolean that_present_availIncludeCloseProfit = true && that.isSetAvailIncludeCloseProfit();
    if (this_present_availIncludeCloseProfit || that_present_availIncludeCloseProfit) {
      if (!(this_present_availIncludeCloseProfit && that_present_availIncludeCloseProfit))
        return false;
      if (!this.availIncludeCloseProfit.equals(that.availIncludeCloseProfit))
        return false;
    }

    boolean this_present_currencyID = true && this.isSetCurrencyID();
    boolean that_present_currencyID = true && that.isSetCurrencyID();
    if (this_present_currencyID || that_present_currencyID) {
      if (!(this_present_currencyID && that_present_currencyID))
        return false;
      if (!this.currencyID.equals(that.currencyID))
        return false;
    }

    boolean this_present_optionRoyaltyPriceType = true && this.isSetOptionRoyaltyPriceType();
    boolean that_present_optionRoyaltyPriceType = true && that.isSetOptionRoyaltyPriceType();
    if (this_present_optionRoyaltyPriceType || that_present_optionRoyaltyPriceType) {
      if (!(this_present_optionRoyaltyPriceType && that_present_optionRoyaltyPriceType))
        return false;
      if (!this.optionRoyaltyPriceType.equals(that.optionRoyaltyPriceType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcBrokerTradingParamsField other) {
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
    lastComparison = Boolean.valueOf(isSetMarginPriceType()).compareTo(other.isSetMarginPriceType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMarginPriceType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.marginPriceType, other.marginPriceType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAlgorithm()).compareTo(other.isSetAlgorithm());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlgorithm()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.algorithm, other.algorithm);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAvailIncludeCloseProfit()).compareTo(other.isSetAvailIncludeCloseProfit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAvailIncludeCloseProfit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.availIncludeCloseProfit, other.availIncludeCloseProfit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurrencyID()).compareTo(other.isSetCurrencyID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrencyID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currencyID, other.currencyID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOptionRoyaltyPriceType()).compareTo(other.isSetOptionRoyaltyPriceType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOptionRoyaltyPriceType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.optionRoyaltyPriceType, other.optionRoyaltyPriceType);
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
    StringBuilder sb = new StringBuilder("CThostFtdcBrokerTradingParamsField(");
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
    sb.append("marginPriceType:");
    if (this.marginPriceType == null) {
      sb.append("null");
    } else {
      sb.append(this.marginPriceType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("algorithm:");
    if (this.algorithm == null) {
      sb.append("null");
    } else {
      sb.append(this.algorithm);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("availIncludeCloseProfit:");
    if (this.availIncludeCloseProfit == null) {
      sb.append("null");
    } else {
      sb.append(this.availIncludeCloseProfit);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("currencyID:");
    if (this.currencyID == null) {
      sb.append("null");
    } else {
      sb.append(this.currencyID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("optionRoyaltyPriceType:");
    if (this.optionRoyaltyPriceType == null) {
      sb.append("null");
    } else {
      sb.append(this.optionRoyaltyPriceType);
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

  private static class CThostFtdcBrokerTradingParamsFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcBrokerTradingParamsFieldStandardScheme getScheme() {
      return new CThostFtdcBrokerTradingParamsFieldStandardScheme();
    }
  }

  private static class CThostFtdcBrokerTradingParamsFieldStandardScheme extends StandardScheme<CThostFtdcBrokerTradingParamsField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcBrokerTradingParamsField struct) throws org.apache.thrift.TException {
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
          case 3: // MARGIN_PRICE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.marginPriceType = iprot.readString();
              struct.setMarginPriceTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ALGORITHM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.algorithm = iprot.readString();
              struct.setAlgorithmIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AVAIL_INCLUDE_CLOSE_PROFIT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.availIncludeCloseProfit = iprot.readString();
              struct.setAvailIncludeCloseProfitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CURRENCY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.currencyID = iprot.readString();
              struct.setCurrencyIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // OPTION_ROYALTY_PRICE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.optionRoyaltyPriceType = iprot.readString();
              struct.setOptionRoyaltyPriceTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcBrokerTradingParamsField struct) throws org.apache.thrift.TException {
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
      if (struct.marginPriceType != null) {
        oprot.writeFieldBegin(MARGIN_PRICE_TYPE_FIELD_DESC);
        oprot.writeString(struct.marginPriceType);
        oprot.writeFieldEnd();
      }
      if (struct.algorithm != null) {
        oprot.writeFieldBegin(ALGORITHM_FIELD_DESC);
        oprot.writeString(struct.algorithm);
        oprot.writeFieldEnd();
      }
      if (struct.availIncludeCloseProfit != null) {
        oprot.writeFieldBegin(AVAIL_INCLUDE_CLOSE_PROFIT_FIELD_DESC);
        oprot.writeString(struct.availIncludeCloseProfit);
        oprot.writeFieldEnd();
      }
      if (struct.currencyID != null) {
        oprot.writeFieldBegin(CURRENCY_ID_FIELD_DESC);
        oprot.writeString(struct.currencyID);
        oprot.writeFieldEnd();
      }
      if (struct.optionRoyaltyPriceType != null) {
        oprot.writeFieldBegin(OPTION_ROYALTY_PRICE_TYPE_FIELD_DESC);
        oprot.writeString(struct.optionRoyaltyPriceType);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcBrokerTradingParamsFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcBrokerTradingParamsFieldTupleScheme getScheme() {
      return new CThostFtdcBrokerTradingParamsFieldTupleScheme();
    }
  }

  private static class CThostFtdcBrokerTradingParamsFieldTupleScheme extends TupleScheme<CThostFtdcBrokerTradingParamsField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcBrokerTradingParamsField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBrokerID()) {
        optionals.set(0);
      }
      if (struct.isSetInvestorID()) {
        optionals.set(1);
      }
      if (struct.isSetMarginPriceType()) {
        optionals.set(2);
      }
      if (struct.isSetAlgorithm()) {
        optionals.set(3);
      }
      if (struct.isSetAvailIncludeCloseProfit()) {
        optionals.set(4);
      }
      if (struct.isSetCurrencyID()) {
        optionals.set(5);
      }
      if (struct.isSetOptionRoyaltyPriceType()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetInvestorID()) {
        oprot.writeString(struct.investorID);
      }
      if (struct.isSetMarginPriceType()) {
        oprot.writeString(struct.marginPriceType);
      }
      if (struct.isSetAlgorithm()) {
        oprot.writeString(struct.algorithm);
      }
      if (struct.isSetAvailIncludeCloseProfit()) {
        oprot.writeString(struct.availIncludeCloseProfit);
      }
      if (struct.isSetCurrencyID()) {
        oprot.writeString(struct.currencyID);
      }
      if (struct.isSetOptionRoyaltyPriceType()) {
        oprot.writeString(struct.optionRoyaltyPriceType);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcBrokerTradingParamsField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.investorID = iprot.readString();
        struct.setInvestorIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.marginPriceType = iprot.readString();
        struct.setMarginPriceTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.algorithm = iprot.readString();
        struct.setAlgorithmIsSet(true);
      }
      if (incoming.get(4)) {
        struct.availIncludeCloseProfit = iprot.readString();
        struct.setAvailIncludeCloseProfitIsSet(true);
      }
      if (incoming.get(5)) {
        struct.currencyID = iprot.readString();
        struct.setCurrencyIDIsSet(true);
      }
      if (incoming.get(6)) {
        struct.optionRoyaltyPriceType = iprot.readString();
        struct.setOptionRoyaltyPriceTypeIsSet(true);
      }
    }
  }

}

