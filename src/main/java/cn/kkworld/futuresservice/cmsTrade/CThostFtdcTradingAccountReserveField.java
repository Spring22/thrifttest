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

public class CThostFtdcTradingAccountReserveField implements org.apache.thrift.TBase<CThostFtdcTradingAccountReserveField, CThostFtdcTradingAccountReserveField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcTradingAccountReserveField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcTradingAccountReserveField");

  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ACCOUNT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("accountID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RESERVE_FIELD_DESC = new org.apache.thrift.protocol.TField("reserve", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField CURRENCY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("currencyID", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcTradingAccountReserveFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcTradingAccountReserveFieldTupleSchemeFactory());
  }

  public String brokerID; // required
  public String accountID; // required
  public double reserve; // required
  public String currencyID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BROKER_ID((short)1, "brokerID"),
    ACCOUNT_ID((short)2, "accountID"),
    RESERVE((short)3, "reserve"),
    CURRENCY_ID((short)4, "currencyID");

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
        case 2: // ACCOUNT_ID
          return ACCOUNT_ID;
        case 3: // RESERVE
          return RESERVE;
        case 4: // CURRENCY_ID
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
  private static final int __RESERVE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BROKER_ID, new org.apache.thrift.meta_data.FieldMetaData("brokerID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcBrokerIDType")));
    tmpMap.put(_Fields.ACCOUNT_ID, new org.apache.thrift.meta_data.FieldMetaData("accountID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcAccountIDType")));
    tmpMap.put(_Fields.RESERVE, new org.apache.thrift.meta_data.FieldMetaData("reserve", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcMoneyType")));
    tmpMap.put(_Fields.CURRENCY_ID, new org.apache.thrift.meta_data.FieldMetaData("currencyID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcCurrencyIDType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcTradingAccountReserveField.class, metaDataMap);
  }

  public CThostFtdcTradingAccountReserveField() {
  }

  public CThostFtdcTradingAccountReserveField(
    String brokerID,
    String accountID,
    double reserve,
    String currencyID)
  {
    this();
    this.brokerID = brokerID;
    this.accountID = accountID;
    this.reserve = reserve;
    setReserveIsSet(true);
    this.currencyID = currencyID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcTradingAccountReserveField(CThostFtdcTradingAccountReserveField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetAccountID()) {
      this.accountID = other.accountID;
    }
    this.reserve = other.reserve;
    if (other.isSetCurrencyID()) {
      this.currencyID = other.currencyID;
    }
  }

  public CThostFtdcTradingAccountReserveField deepCopy() {
    return new CThostFtdcTradingAccountReserveField(this);
  }

  @Override
  public void clear() {
    this.brokerID = null;
    this.accountID = null;
    setReserveIsSet(false);
    this.reserve = 0.0;
    this.currencyID = null;
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcTradingAccountReserveField setBrokerID(String brokerID) {
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

  public String getAccountID() {
    return this.accountID;
  }

  public CThostFtdcTradingAccountReserveField setAccountID(String accountID) {
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

  public double getReserve() {
    return this.reserve;
  }

  public CThostFtdcTradingAccountReserveField setReserve(double reserve) {
    this.reserve = reserve;
    setReserveIsSet(true);
    return this;
  }

  public void unsetReserve() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RESERVE_ISSET_ID);
  }

  /** Returns true if field reserve is set (has been assigned a value) and false otherwise */
  public boolean isSetReserve() {
    return EncodingUtils.testBit(__isset_bitfield, __RESERVE_ISSET_ID);
  }

  public void setReserveIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RESERVE_ISSET_ID, value);
  }

  public String getCurrencyID() {
    return this.currencyID;
  }

  public CThostFtdcTradingAccountReserveField setCurrencyID(String currencyID) {
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
    case BROKER_ID:
      if (value == null) {
        unsetBrokerID();
      } else {
        setBrokerID((String)value);
      }
      break;

    case ACCOUNT_ID:
      if (value == null) {
        unsetAccountID();
      } else {
        setAccountID((String)value);
      }
      break;

    case RESERVE:
      if (value == null) {
        unsetReserve();
      } else {
        setReserve((Double)value);
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
    case BROKER_ID:
      return getBrokerID();

    case ACCOUNT_ID:
      return getAccountID();

    case RESERVE:
      return Double.valueOf(getReserve());

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
    case BROKER_ID:
      return isSetBrokerID();
    case ACCOUNT_ID:
      return isSetAccountID();
    case RESERVE:
      return isSetReserve();
    case CURRENCY_ID:
      return isSetCurrencyID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcTradingAccountReserveField)
      return this.equals((CThostFtdcTradingAccountReserveField)that);
    return false;
  }

  public boolean equals(CThostFtdcTradingAccountReserveField that) {
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

    boolean this_present_accountID = true && this.isSetAccountID();
    boolean that_present_accountID = true && that.isSetAccountID();
    if (this_present_accountID || that_present_accountID) {
      if (!(this_present_accountID && that_present_accountID))
        return false;
      if (!this.accountID.equals(that.accountID))
        return false;
    }

    boolean this_present_reserve = true;
    boolean that_present_reserve = true;
    if (this_present_reserve || that_present_reserve) {
      if (!(this_present_reserve && that_present_reserve))
        return false;
      if (this.reserve != that.reserve)
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
  public int compareTo(CThostFtdcTradingAccountReserveField other) {
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
    lastComparison = Boolean.valueOf(isSetReserve()).compareTo(other.isSetReserve());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReserve()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reserve, other.reserve);
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
    StringBuilder sb = new StringBuilder("CThostFtdcTradingAccountReserveField(");
    boolean first = true;

    sb.append("brokerID:");
    if (this.brokerID == null) {
      sb.append("null");
    } else {
      sb.append(this.brokerID);
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
    sb.append("reserve:");
    sb.append(this.reserve);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CThostFtdcTradingAccountReserveFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcTradingAccountReserveFieldStandardScheme getScheme() {
      return new CThostFtdcTradingAccountReserveFieldStandardScheme();
    }
  }

  private static class CThostFtdcTradingAccountReserveFieldStandardScheme extends StandardScheme<CThostFtdcTradingAccountReserveField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcTradingAccountReserveField struct) throws org.apache.thrift.TException {
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
          case 2: // ACCOUNT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.accountID = iprot.readString();
              struct.setAccountIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESERVE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.reserve = iprot.readDouble();
              struct.setReserveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CURRENCY_ID
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcTradingAccountReserveField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.brokerID != null) {
        oprot.writeFieldBegin(BROKER_ID_FIELD_DESC);
        oprot.writeString(struct.brokerID);
        oprot.writeFieldEnd();
      }
      if (struct.accountID != null) {
        oprot.writeFieldBegin(ACCOUNT_ID_FIELD_DESC);
        oprot.writeString(struct.accountID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RESERVE_FIELD_DESC);
      oprot.writeDouble(struct.reserve);
      oprot.writeFieldEnd();
      if (struct.currencyID != null) {
        oprot.writeFieldBegin(CURRENCY_ID_FIELD_DESC);
        oprot.writeString(struct.currencyID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcTradingAccountReserveFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcTradingAccountReserveFieldTupleScheme getScheme() {
      return new CThostFtdcTradingAccountReserveFieldTupleScheme();
    }
  }

  private static class CThostFtdcTradingAccountReserveFieldTupleScheme extends TupleScheme<CThostFtdcTradingAccountReserveField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcTradingAccountReserveField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBrokerID()) {
        optionals.set(0);
      }
      if (struct.isSetAccountID()) {
        optionals.set(1);
      }
      if (struct.isSetReserve()) {
        optionals.set(2);
      }
      if (struct.isSetCurrencyID()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetAccountID()) {
        oprot.writeString(struct.accountID);
      }
      if (struct.isSetReserve()) {
        oprot.writeDouble(struct.reserve);
      }
      if (struct.isSetCurrencyID()) {
        oprot.writeString(struct.currencyID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcTradingAccountReserveField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.accountID = iprot.readString();
        struct.setAccountIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.reserve = iprot.readDouble();
        struct.setReserveIsSet(true);
      }
      if (incoming.get(3)) {
        struct.currencyID = iprot.readString();
        struct.setCurrencyIDIsSet(true);
      }
    }
  }

}

