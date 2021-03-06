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

public class CThostFtdcVerifyFuturePasswordAndCustInfoField implements org.apache.thrift.TBase<CThostFtdcVerifyFuturePasswordAndCustInfoField, CThostFtdcVerifyFuturePasswordAndCustInfoField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcVerifyFuturePasswordAndCustInfoField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcVerifyFuturePasswordAndCustInfoField");

  private static final org.apache.thrift.protocol.TField CUSTOMER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("customerName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ID_CARD_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("idCardType", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IDENTIFIED_CARD_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("identifiedCardNo", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CUST_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("custType", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ACCOUNT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("accountID", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField CURRENCY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("currencyID", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcVerifyFuturePasswordAndCustInfoFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcVerifyFuturePasswordAndCustInfoFieldTupleSchemeFactory());
  }

  public String customerName; // required
  public String idCardType; // required
  public String identifiedCardNo; // required
  public String custType; // required
  public String accountID; // required
  public String password; // required
  public String currencyID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CUSTOMER_NAME((short)1, "customerName"),
    ID_CARD_TYPE((short)2, "idCardType"),
    IDENTIFIED_CARD_NO((short)3, "identifiedCardNo"),
    CUST_TYPE((short)4, "custType"),
    ACCOUNT_ID((short)5, "accountID"),
    PASSWORD((short)6, "password"),
    CURRENCY_ID((short)7, "currencyID");

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
        case 1: // CUSTOMER_NAME
          return CUSTOMER_NAME;
        case 2: // ID_CARD_TYPE
          return ID_CARD_TYPE;
        case 3: // IDENTIFIED_CARD_NO
          return IDENTIFIED_CARD_NO;
        case 4: // CUST_TYPE
          return CUST_TYPE;
        case 5: // ACCOUNT_ID
          return ACCOUNT_ID;
        case 6: // PASSWORD
          return PASSWORD;
        case 7: // CURRENCY_ID
          return CURRENCY_ID;
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
    tmpMap.put(_Fields.CUSTOMER_NAME, new org.apache.thrift.meta_data.FieldMetaData("customerName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcIndividualNameType")));
    tmpMap.put(_Fields.ID_CARD_TYPE, new org.apache.thrift.meta_data.FieldMetaData("idCardType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcIdCardTypeType")));
    tmpMap.put(_Fields.IDENTIFIED_CARD_NO, new org.apache.thrift.meta_data.FieldMetaData("identifiedCardNo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcIdentifiedCardNoType")));
    tmpMap.put(_Fields.CUST_TYPE, new org.apache.thrift.meta_data.FieldMetaData("custType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcCustTypeType")));
    tmpMap.put(_Fields.ACCOUNT_ID, new org.apache.thrift.meta_data.FieldMetaData("accountID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcAccountIDType")));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcPasswordType")));
    tmpMap.put(_Fields.CURRENCY_ID, new org.apache.thrift.meta_data.FieldMetaData("currencyID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcCurrencyIDType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcVerifyFuturePasswordAndCustInfoField.class, metaDataMap);
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField() {
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField(
    String customerName,
    String idCardType,
    String identifiedCardNo,
    String custType,
    String accountID,
    String password,
    String currencyID)
  {
    this();
    this.customerName = customerName;
    this.idCardType = idCardType;
    this.identifiedCardNo = identifiedCardNo;
    this.custType = custType;
    this.accountID = accountID;
    this.password = password;
    this.currencyID = currencyID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcVerifyFuturePasswordAndCustInfoField(CThostFtdcVerifyFuturePasswordAndCustInfoField other) {
    if (other.isSetCustomerName()) {
      this.customerName = other.customerName;
    }
    if (other.isSetIdCardType()) {
      this.idCardType = other.idCardType;
    }
    if (other.isSetIdentifiedCardNo()) {
      this.identifiedCardNo = other.identifiedCardNo;
    }
    if (other.isSetCustType()) {
      this.custType = other.custType;
    }
    if (other.isSetAccountID()) {
      this.accountID = other.accountID;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    if (other.isSetCurrencyID()) {
      this.currencyID = other.currencyID;
    }
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField deepCopy() {
    return new CThostFtdcVerifyFuturePasswordAndCustInfoField(this);
  }

  @Override
  public void clear() {
    this.customerName = null;
    this.idCardType = null;
    this.identifiedCardNo = null;
    this.custType = null;
    this.accountID = null;
    this.password = null;
    this.currencyID = null;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField setCustomerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  public void unsetCustomerName() {
    this.customerName = null;
  }

  /** Returns true if field customerName is set (has been assigned a value) and false otherwise */
  public boolean isSetCustomerName() {
    return this.customerName != null;
  }

  public void setCustomerNameIsSet(boolean value) {
    if (!value) {
      this.customerName = null;
    }
  }

  public String getIdCardType() {
    return this.idCardType;
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField setIdCardType(String idCardType) {
    this.idCardType = idCardType;
    return this;
  }

  public void unsetIdCardType() {
    this.idCardType = null;
  }

  /** Returns true if field idCardType is set (has been assigned a value) and false otherwise */
  public boolean isSetIdCardType() {
    return this.idCardType != null;
  }

  public void setIdCardTypeIsSet(boolean value) {
    if (!value) {
      this.idCardType = null;
    }
  }

  public String getIdentifiedCardNo() {
    return this.identifiedCardNo;
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField setIdentifiedCardNo(String identifiedCardNo) {
    this.identifiedCardNo = identifiedCardNo;
    return this;
  }

  public void unsetIdentifiedCardNo() {
    this.identifiedCardNo = null;
  }

  /** Returns true if field identifiedCardNo is set (has been assigned a value) and false otherwise */
  public boolean isSetIdentifiedCardNo() {
    return this.identifiedCardNo != null;
  }

  public void setIdentifiedCardNoIsSet(boolean value) {
    if (!value) {
      this.identifiedCardNo = null;
    }
  }

  public String getCustType() {
    return this.custType;
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField setCustType(String custType) {
    this.custType = custType;
    return this;
  }

  public void unsetCustType() {
    this.custType = null;
  }

  /** Returns true if field custType is set (has been assigned a value) and false otherwise */
  public boolean isSetCustType() {
    return this.custType != null;
  }

  public void setCustTypeIsSet(boolean value) {
    if (!value) {
      this.custType = null;
    }
  }

  public String getAccountID() {
    return this.accountID;
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField setAccountID(String accountID) {
    this.accountID = accountID;
    return this;
  }

  public void unsetAccountID() {
    this.accountID = null;
  }

  /** Returns true if field accountID is set (has been assigned a value) and false otherwise */
  public boolean isSetAccountID() {
    return this.accountID != null;
  }

  public void setAccountIDIsSet(boolean value) {
    if (!value) {
      this.accountID = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public String getCurrencyID() {
    return this.currencyID;
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField setCurrencyID(String currencyID) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CUSTOMER_NAME:
      if (value == null) {
        unsetCustomerName();
      } else {
        setCustomerName((String)value);
      }
      break;

    case ID_CARD_TYPE:
      if (value == null) {
        unsetIdCardType();
      } else {
        setIdCardType((String)value);
      }
      break;

    case IDENTIFIED_CARD_NO:
      if (value == null) {
        unsetIdentifiedCardNo();
      } else {
        setIdentifiedCardNo((String)value);
      }
      break;

    case CUST_TYPE:
      if (value == null) {
        unsetCustType();
      } else {
        setCustType((String)value);
      }
      break;

    case ACCOUNT_ID:
      if (value == null) {
        unsetAccountID();
      } else {
        setAccountID((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    case CURRENCY_ID:
      if (value == null) {
        unsetCurrencyID();
      } else {
        setCurrencyID((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CUSTOMER_NAME:
      return getCustomerName();

    case ID_CARD_TYPE:
      return getIdCardType();

    case IDENTIFIED_CARD_NO:
      return getIdentifiedCardNo();

    case CUST_TYPE:
      return getCustType();

    case ACCOUNT_ID:
      return getAccountID();

    case PASSWORD:
      return getPassword();

    case CURRENCY_ID:
      return getCurrencyID();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CUSTOMER_NAME:
      return isSetCustomerName();
    case ID_CARD_TYPE:
      return isSetIdCardType();
    case IDENTIFIED_CARD_NO:
      return isSetIdentifiedCardNo();
    case CUST_TYPE:
      return isSetCustType();
    case ACCOUNT_ID:
      return isSetAccountID();
    case PASSWORD:
      return isSetPassword();
    case CURRENCY_ID:
      return isSetCurrencyID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcVerifyFuturePasswordAndCustInfoField)
      return this.equals((CThostFtdcVerifyFuturePasswordAndCustInfoField)that);
    return false;
  }

  public boolean equals(CThostFtdcVerifyFuturePasswordAndCustInfoField that) {
    if (that == null)
      return false;

    boolean this_present_customerName = true && this.isSetCustomerName();
    boolean that_present_customerName = true && that.isSetCustomerName();
    if (this_present_customerName || that_present_customerName) {
      if (!(this_present_customerName && that_present_customerName))
        return false;
      if (!this.customerName.equals(that.customerName))
        return false;
    }

    boolean this_present_idCardType = true && this.isSetIdCardType();
    boolean that_present_idCardType = true && that.isSetIdCardType();
    if (this_present_idCardType || that_present_idCardType) {
      if (!(this_present_idCardType && that_present_idCardType))
        return false;
      if (!this.idCardType.equals(that.idCardType))
        return false;
    }

    boolean this_present_identifiedCardNo = true && this.isSetIdentifiedCardNo();
    boolean that_present_identifiedCardNo = true && that.isSetIdentifiedCardNo();
    if (this_present_identifiedCardNo || that_present_identifiedCardNo) {
      if (!(this_present_identifiedCardNo && that_present_identifiedCardNo))
        return false;
      if (!this.identifiedCardNo.equals(that.identifiedCardNo))
        return false;
    }

    boolean this_present_custType = true && this.isSetCustType();
    boolean that_present_custType = true && that.isSetCustType();
    if (this_present_custType || that_present_custType) {
      if (!(this_present_custType && that_present_custType))
        return false;
      if (!this.custType.equals(that.custType))
        return false;
    }

    boolean this_present_accountID = true && this.isSetAccountID();
    boolean that_present_accountID = true && that.isSetAccountID();
    if (this_present_accountID || that_present_accountID) {
      if (!(this_present_accountID && that_present_accountID))
        return false;
      if (!this.accountID.equals(that.accountID))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
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

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcVerifyFuturePasswordAndCustInfoField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCustomerName()).compareTo(other.isSetCustomerName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCustomerName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.customerName, other.customerName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIdCardType()).compareTo(other.isSetIdCardType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdCardType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idCardType, other.idCardType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIdentifiedCardNo()).compareTo(other.isSetIdentifiedCardNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdentifiedCardNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.identifiedCardNo, other.identifiedCardNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCustType()).compareTo(other.isSetCustType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCustType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.custType, other.custType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAccountID()).compareTo(other.isSetAccountID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccountID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accountID, other.accountID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
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
    StringBuilder sb = new StringBuilder("CThostFtdcVerifyFuturePasswordAndCustInfoField(");
    boolean first = true;

    sb.append("customerName:");
    if (this.customerName == null) {
      sb.append("null");
    } else {
      sb.append(this.customerName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("idCardType:");
    if (this.idCardType == null) {
      sb.append("null");
    } else {
      sb.append(this.idCardType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("identifiedCardNo:");
    if (this.identifiedCardNo == null) {
      sb.append("null");
    } else {
      sb.append(this.identifiedCardNo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("custType:");
    if (this.custType == null) {
      sb.append("null");
    } else {
      sb.append(this.custType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("accountID:");
    if (this.accountID == null) {
      sb.append("null");
    } else {
      sb.append(this.accountID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
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

  private static class CThostFtdcVerifyFuturePasswordAndCustInfoFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcVerifyFuturePasswordAndCustInfoFieldStandardScheme getScheme() {
      return new CThostFtdcVerifyFuturePasswordAndCustInfoFieldStandardScheme();
    }
  }

  private static class CThostFtdcVerifyFuturePasswordAndCustInfoFieldStandardScheme extends StandardScheme<CThostFtdcVerifyFuturePasswordAndCustInfoField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcVerifyFuturePasswordAndCustInfoField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CUSTOMER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.customerName = iprot.readString();
              struct.setCustomerNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ID_CARD_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.idCardType = iprot.readString();
              struct.setIdCardTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IDENTIFIED_CARD_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.identifiedCardNo = iprot.readString();
              struct.setIdentifiedCardNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CUST_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.custType = iprot.readString();
              struct.setCustTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ACCOUNT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.accountID = iprot.readString();
              struct.setAccountIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CURRENCY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.currencyID = iprot.readString();
              struct.setCurrencyIDIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcVerifyFuturePasswordAndCustInfoField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.customerName != null) {
        oprot.writeFieldBegin(CUSTOMER_NAME_FIELD_DESC);
        oprot.writeString(struct.customerName);
        oprot.writeFieldEnd();
      }
      if (struct.idCardType != null) {
        oprot.writeFieldBegin(ID_CARD_TYPE_FIELD_DESC);
        oprot.writeString(struct.idCardType);
        oprot.writeFieldEnd();
      }
      if (struct.identifiedCardNo != null) {
        oprot.writeFieldBegin(IDENTIFIED_CARD_NO_FIELD_DESC);
        oprot.writeString(struct.identifiedCardNo);
        oprot.writeFieldEnd();
      }
      if (struct.custType != null) {
        oprot.writeFieldBegin(CUST_TYPE_FIELD_DESC);
        oprot.writeString(struct.custType);
        oprot.writeFieldEnd();
      }
      if (struct.accountID != null) {
        oprot.writeFieldBegin(ACCOUNT_ID_FIELD_DESC);
        oprot.writeString(struct.accountID);
        oprot.writeFieldEnd();
      }
      if (struct.password != null) {
        oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
        oprot.writeString(struct.password);
        oprot.writeFieldEnd();
      }
      if (struct.currencyID != null) {
        oprot.writeFieldBegin(CURRENCY_ID_FIELD_DESC);
        oprot.writeString(struct.currencyID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcVerifyFuturePasswordAndCustInfoFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcVerifyFuturePasswordAndCustInfoFieldTupleScheme getScheme() {
      return new CThostFtdcVerifyFuturePasswordAndCustInfoFieldTupleScheme();
    }
  }

  private static class CThostFtdcVerifyFuturePasswordAndCustInfoFieldTupleScheme extends TupleScheme<CThostFtdcVerifyFuturePasswordAndCustInfoField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcVerifyFuturePasswordAndCustInfoField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCustomerName()) {
        optionals.set(0);
      }
      if (struct.isSetIdCardType()) {
        optionals.set(1);
      }
      if (struct.isSetIdentifiedCardNo()) {
        optionals.set(2);
      }
      if (struct.isSetCustType()) {
        optionals.set(3);
      }
      if (struct.isSetAccountID()) {
        optionals.set(4);
      }
      if (struct.isSetPassword()) {
        optionals.set(5);
      }
      if (struct.isSetCurrencyID()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetCustomerName()) {
        oprot.writeString(struct.customerName);
      }
      if (struct.isSetIdCardType()) {
        oprot.writeString(struct.idCardType);
      }
      if (struct.isSetIdentifiedCardNo()) {
        oprot.writeString(struct.identifiedCardNo);
      }
      if (struct.isSetCustType()) {
        oprot.writeString(struct.custType);
      }
      if (struct.isSetAccountID()) {
        oprot.writeString(struct.accountID);
      }
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
      if (struct.isSetCurrencyID()) {
        oprot.writeString(struct.currencyID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcVerifyFuturePasswordAndCustInfoField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.customerName = iprot.readString();
        struct.setCustomerNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.idCardType = iprot.readString();
        struct.setIdCardTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.identifiedCardNo = iprot.readString();
        struct.setIdentifiedCardNoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.custType = iprot.readString();
        struct.setCustTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.accountID = iprot.readString();
        struct.setAccountIDIsSet(true);
      }
      if (incoming.get(5)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
      if (incoming.get(6)) {
        struct.currencyID = iprot.readString();
        struct.setCurrencyIDIsSet(true);
      }
    }
  }

}

