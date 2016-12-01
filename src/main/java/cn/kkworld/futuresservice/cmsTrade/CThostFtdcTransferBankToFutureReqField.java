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

public class CThostFtdcTransferBankToFutureReqField implements org.apache.thrift.TBase<CThostFtdcTransferBankToFutureReqField, CThostFtdcTransferBankToFutureReqField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcTransferBankToFutureReqField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcTransferBankToFutureReqField");

  private static final org.apache.thrift.protocol.TField FUTURE_ACCOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("futureAccount", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FUTURE_PWD_FLAG_FIELD_DESC = new org.apache.thrift.protocol.TField("futurePwdFlag", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField FUTURE_ACC_PWD_FIELD_DESC = new org.apache.thrift.protocol.TField("futureAccPwd", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TRADE_AMT_FIELD_DESC = new org.apache.thrift.protocol.TField("tradeAmt", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField CUST_FEE_FIELD_DESC = new org.apache.thrift.protocol.TField("custFee", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField CURRENCY_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("currencyCode", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcTransferBankToFutureReqFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcTransferBankToFutureReqFieldTupleSchemeFactory());
  }

  public String futureAccount; // required
  public String futurePwdFlag; // required
  public String futureAccPwd; // required
  public double tradeAmt; // required
  public double custFee; // required
  public String currencyCode; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FUTURE_ACCOUNT((short)1, "futureAccount"),
    FUTURE_PWD_FLAG((short)2, "futurePwdFlag"),
    FUTURE_ACC_PWD((short)3, "futureAccPwd"),
    TRADE_AMT((short)4, "tradeAmt"),
    CUST_FEE((short)5, "custFee"),
    CURRENCY_CODE((short)6, "currencyCode");

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
        case 1: // FUTURE_ACCOUNT
          return FUTURE_ACCOUNT;
        case 2: // FUTURE_PWD_FLAG
          return FUTURE_PWD_FLAG;
        case 3: // FUTURE_ACC_PWD
          return FUTURE_ACC_PWD;
        case 4: // TRADE_AMT
          return TRADE_AMT;
        case 5: // CUST_FEE
          return CUST_FEE;
        case 6: // CURRENCY_CODE
          return CURRENCY_CODE;
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
  private static final int __TRADEAMT_ISSET_ID = 0;
  private static final int __CUSTFEE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FUTURE_ACCOUNT, new org.apache.thrift.meta_data.FieldMetaData("futureAccount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcAccountIDType")));
    tmpMap.put(_Fields.FUTURE_PWD_FLAG, new org.apache.thrift.meta_data.FieldMetaData("futurePwdFlag", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcFuturePwdFlagType")));
    tmpMap.put(_Fields.FUTURE_ACC_PWD, new org.apache.thrift.meta_data.FieldMetaData("futureAccPwd", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcFutureAccPwdType")));
    tmpMap.put(_Fields.TRADE_AMT, new org.apache.thrift.meta_data.FieldMetaData("tradeAmt", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcMoneyType")));
    tmpMap.put(_Fields.CUST_FEE, new org.apache.thrift.meta_data.FieldMetaData("custFee", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcMoneyType")));
    tmpMap.put(_Fields.CURRENCY_CODE, new org.apache.thrift.meta_data.FieldMetaData("currencyCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcCurrencyCodeType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcTransferBankToFutureReqField.class, metaDataMap);
  }

  public CThostFtdcTransferBankToFutureReqField() {
  }

  public CThostFtdcTransferBankToFutureReqField(
    String futureAccount,
    String futurePwdFlag,
    String futureAccPwd,
    double tradeAmt,
    double custFee,
    String currencyCode)
  {
    this();
    this.futureAccount = futureAccount;
    this.futurePwdFlag = futurePwdFlag;
    this.futureAccPwd = futureAccPwd;
    this.tradeAmt = tradeAmt;
    setTradeAmtIsSet(true);
    this.custFee = custFee;
    setCustFeeIsSet(true);
    this.currencyCode = currencyCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcTransferBankToFutureReqField(CThostFtdcTransferBankToFutureReqField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFutureAccount()) {
      this.futureAccount = other.futureAccount;
    }
    if (other.isSetFuturePwdFlag()) {
      this.futurePwdFlag = other.futurePwdFlag;
    }
    if (other.isSetFutureAccPwd()) {
      this.futureAccPwd = other.futureAccPwd;
    }
    this.tradeAmt = other.tradeAmt;
    this.custFee = other.custFee;
    if (other.isSetCurrencyCode()) {
      this.currencyCode = other.currencyCode;
    }
  }

  public CThostFtdcTransferBankToFutureReqField deepCopy() {
    return new CThostFtdcTransferBankToFutureReqField(this);
  }

  @Override
  public void clear() {
    this.futureAccount = null;
    this.futurePwdFlag = null;
    this.futureAccPwd = null;
    setTradeAmtIsSet(false);
    this.tradeAmt = 0.0;
    setCustFeeIsSet(false);
    this.custFee = 0.0;
    this.currencyCode = null;
  }

  public String getFutureAccount() {
    return this.futureAccount;
  }

  public CThostFtdcTransferBankToFutureReqField setFutureAccount(String futureAccount) {
    this.futureAccount = futureAccount;
    return this;
  }

  public void unsetFutureAccount() {
    this.futureAccount = null;
  }

  /** Returns true if field futureAccount is set (has been assigned a value) and false otherwise */
  public boolean isSetFutureAccount() {
    return this.futureAccount != null;
  }

  public void setFutureAccountIsSet(boolean value) {
    if (!value) {
      this.futureAccount = null;
    }
  }

  public String getFuturePwdFlag() {
    return this.futurePwdFlag;
  }

  public CThostFtdcTransferBankToFutureReqField setFuturePwdFlag(String futurePwdFlag) {
    this.futurePwdFlag = futurePwdFlag;
    return this;
  }

  public void unsetFuturePwdFlag() {
    this.futurePwdFlag = null;
  }

  /** Returns true if field futurePwdFlag is set (has been assigned a value) and false otherwise */
  public boolean isSetFuturePwdFlag() {
    return this.futurePwdFlag != null;
  }

  public void setFuturePwdFlagIsSet(boolean value) {
    if (!value) {
      this.futurePwdFlag = null;
    }
  }

  public String getFutureAccPwd() {
    return this.futureAccPwd;
  }

  public CThostFtdcTransferBankToFutureReqField setFutureAccPwd(String futureAccPwd) {
    this.futureAccPwd = futureAccPwd;
    return this;
  }

  public void unsetFutureAccPwd() {
    this.futureAccPwd = null;
  }

  /** Returns true if field futureAccPwd is set (has been assigned a value) and false otherwise */
  public boolean isSetFutureAccPwd() {
    return this.futureAccPwd != null;
  }

  public void setFutureAccPwdIsSet(boolean value) {
    if (!value) {
      this.futureAccPwd = null;
    }
  }

  public double getTradeAmt() {
    return this.tradeAmt;
  }

  public CThostFtdcTransferBankToFutureReqField setTradeAmt(double tradeAmt) {
    this.tradeAmt = tradeAmt;
    setTradeAmtIsSet(true);
    return this;
  }

  public void unsetTradeAmt() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TRADEAMT_ISSET_ID);
  }

  /** Returns true if field tradeAmt is set (has been assigned a value) and false otherwise */
  public boolean isSetTradeAmt() {
    return EncodingUtils.testBit(__isset_bitfield, __TRADEAMT_ISSET_ID);
  }

  public void setTradeAmtIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TRADEAMT_ISSET_ID, value);
  }

  public double getCustFee() {
    return this.custFee;
  }

  public CThostFtdcTransferBankToFutureReqField setCustFee(double custFee) {
    this.custFee = custFee;
    setCustFeeIsSet(true);
    return this;
  }

  public void unsetCustFee() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CUSTFEE_ISSET_ID);
  }

  /** Returns true if field custFee is set (has been assigned a value) and false otherwise */
  public boolean isSetCustFee() {
    return EncodingUtils.testBit(__isset_bitfield, __CUSTFEE_ISSET_ID);
  }

  public void setCustFeeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CUSTFEE_ISSET_ID, value);
  }

  public String getCurrencyCode() {
    return this.currencyCode;
  }

  public CThostFtdcTransferBankToFutureReqField setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  public void unsetCurrencyCode() {
    this.currencyCode = null;
  }

  /** Returns true if field currencyCode is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrencyCode() {
    return this.currencyCode != null;
  }

  public void setCurrencyCodeIsSet(boolean value) {
    if (!value) {
      this.currencyCode = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FUTURE_ACCOUNT:
      if (value == null) {
        unsetFutureAccount();
      } else {
        setFutureAccount((String)value);
      }
      break;

    case FUTURE_PWD_FLAG:
      if (value == null) {
        unsetFuturePwdFlag();
      } else {
        setFuturePwdFlag((String)value);
      }
      break;

    case FUTURE_ACC_PWD:
      if (value == null) {
        unsetFutureAccPwd();
      } else {
        setFutureAccPwd((String)value);
      }
      break;

    case TRADE_AMT:
      if (value == null) {
        unsetTradeAmt();
      } else {
        setTradeAmt((Double)value);
      }
      break;

    case CUST_FEE:
      if (value == null) {
        unsetCustFee();
      } else {
        setCustFee((Double)value);
      }
      break;

    case CURRENCY_CODE:
      if (value == null) {
        unsetCurrencyCode();
      } else {
        setCurrencyCode((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FUTURE_ACCOUNT:
      return getFutureAccount();

    case FUTURE_PWD_FLAG:
      return getFuturePwdFlag();

    case FUTURE_ACC_PWD:
      return getFutureAccPwd();

    case TRADE_AMT:
      return Double.valueOf(getTradeAmt());

    case CUST_FEE:
      return Double.valueOf(getCustFee());

    case CURRENCY_CODE:
      return getCurrencyCode();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FUTURE_ACCOUNT:
      return isSetFutureAccount();
    case FUTURE_PWD_FLAG:
      return isSetFuturePwdFlag();
    case FUTURE_ACC_PWD:
      return isSetFutureAccPwd();
    case TRADE_AMT:
      return isSetTradeAmt();
    case CUST_FEE:
      return isSetCustFee();
    case CURRENCY_CODE:
      return isSetCurrencyCode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcTransferBankToFutureReqField)
      return this.equals((CThostFtdcTransferBankToFutureReqField)that);
    return false;
  }

  public boolean equals(CThostFtdcTransferBankToFutureReqField that) {
    if (that == null)
      return false;

    boolean this_present_futureAccount = true && this.isSetFutureAccount();
    boolean that_present_futureAccount = true && that.isSetFutureAccount();
    if (this_present_futureAccount || that_present_futureAccount) {
      if (!(this_present_futureAccount && that_present_futureAccount))
        return false;
      if (!this.futureAccount.equals(that.futureAccount))
        return false;
    }

    boolean this_present_futurePwdFlag = true && this.isSetFuturePwdFlag();
    boolean that_present_futurePwdFlag = true && that.isSetFuturePwdFlag();
    if (this_present_futurePwdFlag || that_present_futurePwdFlag) {
      if (!(this_present_futurePwdFlag && that_present_futurePwdFlag))
        return false;
      if (!this.futurePwdFlag.equals(that.futurePwdFlag))
        return false;
    }

    boolean this_present_futureAccPwd = true && this.isSetFutureAccPwd();
    boolean that_present_futureAccPwd = true && that.isSetFutureAccPwd();
    if (this_present_futureAccPwd || that_present_futureAccPwd) {
      if (!(this_present_futureAccPwd && that_present_futureAccPwd))
        return false;
      if (!this.futureAccPwd.equals(that.futureAccPwd))
        return false;
    }

    boolean this_present_tradeAmt = true;
    boolean that_present_tradeAmt = true;
    if (this_present_tradeAmt || that_present_tradeAmt) {
      if (!(this_present_tradeAmt && that_present_tradeAmt))
        return false;
      if (this.tradeAmt != that.tradeAmt)
        return false;
    }

    boolean this_present_custFee = true;
    boolean that_present_custFee = true;
    if (this_present_custFee || that_present_custFee) {
      if (!(this_present_custFee && that_present_custFee))
        return false;
      if (this.custFee != that.custFee)
        return false;
    }

    boolean this_present_currencyCode = true && this.isSetCurrencyCode();
    boolean that_present_currencyCode = true && that.isSetCurrencyCode();
    if (this_present_currencyCode || that_present_currencyCode) {
      if (!(this_present_currencyCode && that_present_currencyCode))
        return false;
      if (!this.currencyCode.equals(that.currencyCode))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcTransferBankToFutureReqField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFutureAccount()).compareTo(other.isSetFutureAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFutureAccount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.futureAccount, other.futureAccount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFuturePwdFlag()).compareTo(other.isSetFuturePwdFlag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFuturePwdFlag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.futurePwdFlag, other.futurePwdFlag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFutureAccPwd()).compareTo(other.isSetFutureAccPwd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFutureAccPwd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.futureAccPwd, other.futureAccPwd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTradeAmt()).compareTo(other.isSetTradeAmt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTradeAmt()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tradeAmt, other.tradeAmt);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCustFee()).compareTo(other.isSetCustFee());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCustFee()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.custFee, other.custFee);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurrencyCode()).compareTo(other.isSetCurrencyCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrencyCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currencyCode, other.currencyCode);
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
    StringBuilder sb = new StringBuilder("CThostFtdcTransferBankToFutureReqField(");
    boolean first = true;

    sb.append("futureAccount:");
    if (this.futureAccount == null) {
      sb.append("null");
    } else {
      sb.append(this.futureAccount);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("futurePwdFlag:");
    if (this.futurePwdFlag == null) {
      sb.append("null");
    } else {
      sb.append(this.futurePwdFlag);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("futureAccPwd:");
    if (this.futureAccPwd == null) {
      sb.append("null");
    } else {
      sb.append(this.futureAccPwd);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tradeAmt:");
    sb.append(this.tradeAmt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("custFee:");
    sb.append(this.custFee);
    first = false;
    if (!first) sb.append(", ");
    sb.append("currencyCode:");
    if (this.currencyCode == null) {
      sb.append("null");
    } else {
      sb.append(this.currencyCode);
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

  private static class CThostFtdcTransferBankToFutureReqFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcTransferBankToFutureReqFieldStandardScheme getScheme() {
      return new CThostFtdcTransferBankToFutureReqFieldStandardScheme();
    }
  }

  private static class CThostFtdcTransferBankToFutureReqFieldStandardScheme extends StandardScheme<CThostFtdcTransferBankToFutureReqField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcTransferBankToFutureReqField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FUTURE_ACCOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.futureAccount = iprot.readString();
              struct.setFutureAccountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FUTURE_PWD_FLAG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.futurePwdFlag = iprot.readString();
              struct.setFuturePwdFlagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FUTURE_ACC_PWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.futureAccPwd = iprot.readString();
              struct.setFutureAccPwdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRADE_AMT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.tradeAmt = iprot.readDouble();
              struct.setTradeAmtIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CUST_FEE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.custFee = iprot.readDouble();
              struct.setCustFeeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CURRENCY_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.currencyCode = iprot.readString();
              struct.setCurrencyCodeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcTransferBankToFutureReqField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.futureAccount != null) {
        oprot.writeFieldBegin(FUTURE_ACCOUNT_FIELD_DESC);
        oprot.writeString(struct.futureAccount);
        oprot.writeFieldEnd();
      }
      if (struct.futurePwdFlag != null) {
        oprot.writeFieldBegin(FUTURE_PWD_FLAG_FIELD_DESC);
        oprot.writeString(struct.futurePwdFlag);
        oprot.writeFieldEnd();
      }
      if (struct.futureAccPwd != null) {
        oprot.writeFieldBegin(FUTURE_ACC_PWD_FIELD_DESC);
        oprot.writeString(struct.futureAccPwd);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TRADE_AMT_FIELD_DESC);
      oprot.writeDouble(struct.tradeAmt);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CUST_FEE_FIELD_DESC);
      oprot.writeDouble(struct.custFee);
      oprot.writeFieldEnd();
      if (struct.currencyCode != null) {
        oprot.writeFieldBegin(CURRENCY_CODE_FIELD_DESC);
        oprot.writeString(struct.currencyCode);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcTransferBankToFutureReqFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcTransferBankToFutureReqFieldTupleScheme getScheme() {
      return new CThostFtdcTransferBankToFutureReqFieldTupleScheme();
    }
  }

  private static class CThostFtdcTransferBankToFutureReqFieldTupleScheme extends TupleScheme<CThostFtdcTransferBankToFutureReqField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcTransferBankToFutureReqField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFutureAccount()) {
        optionals.set(0);
      }
      if (struct.isSetFuturePwdFlag()) {
        optionals.set(1);
      }
      if (struct.isSetFutureAccPwd()) {
        optionals.set(2);
      }
      if (struct.isSetTradeAmt()) {
        optionals.set(3);
      }
      if (struct.isSetCustFee()) {
        optionals.set(4);
      }
      if (struct.isSetCurrencyCode()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetFutureAccount()) {
        oprot.writeString(struct.futureAccount);
      }
      if (struct.isSetFuturePwdFlag()) {
        oprot.writeString(struct.futurePwdFlag);
      }
      if (struct.isSetFutureAccPwd()) {
        oprot.writeString(struct.futureAccPwd);
      }
      if (struct.isSetTradeAmt()) {
        oprot.writeDouble(struct.tradeAmt);
      }
      if (struct.isSetCustFee()) {
        oprot.writeDouble(struct.custFee);
      }
      if (struct.isSetCurrencyCode()) {
        oprot.writeString(struct.currencyCode);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcTransferBankToFutureReqField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.futureAccount = iprot.readString();
        struct.setFutureAccountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.futurePwdFlag = iprot.readString();
        struct.setFuturePwdFlagIsSet(true);
      }
      if (incoming.get(2)) {
        struct.futureAccPwd = iprot.readString();
        struct.setFutureAccPwdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.tradeAmt = iprot.readDouble();
        struct.setTradeAmtIsSet(true);
      }
      if (incoming.get(4)) {
        struct.custFee = iprot.readDouble();
        struct.setCustFeeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.currencyCode = iprot.readString();
        struct.setCurrencyCodeIsSet(true);
      }
    }
  }

}

