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

public class CThostFtdcCommPhaseField implements org.apache.thrift.TBase<CThostFtdcCommPhaseField, CThostFtdcCommPhaseField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcCommPhaseField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcCommPhaseField");

  private static final org.apache.thrift.protocol.TField TRADING_DAY_FIELD_DESC = new org.apache.thrift.protocol.TField("tradingDay", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COMM_PHASE_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("commPhaseNo", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField SYSTEM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("systemID", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcCommPhaseFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcCommPhaseFieldTupleSchemeFactory());
  }

  public String tradingDay; // required
  public short commPhaseNo; // required
  public String systemID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRADING_DAY((short)1, "tradingDay"),
    COMM_PHASE_NO((short)2, "commPhaseNo"),
    SYSTEM_ID((short)3, "systemID");

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
        case 2: // COMM_PHASE_NO
          return COMM_PHASE_NO;
        case 3: // SYSTEM_ID
          return SYSTEM_ID;
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
  private static final int __COMMPHASENO_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRADING_DAY, new org.apache.thrift.meta_data.FieldMetaData("tradingDay", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcDateType")));
    tmpMap.put(_Fields.COMM_PHASE_NO, new org.apache.thrift.meta_data.FieldMetaData("commPhaseNo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16        , "TThostFtdcCommPhaseNoType")));
    tmpMap.put(_Fields.SYSTEM_ID, new org.apache.thrift.meta_data.FieldMetaData("systemID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcSystemIDType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcCommPhaseField.class, metaDataMap);
  }

  public CThostFtdcCommPhaseField() {
  }

  public CThostFtdcCommPhaseField(
    String tradingDay,
    short commPhaseNo,
    String systemID)
  {
    this();
    this.tradingDay = tradingDay;
    this.commPhaseNo = commPhaseNo;
    setCommPhaseNoIsSet(true);
    this.systemID = systemID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcCommPhaseField(CThostFtdcCommPhaseField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTradingDay()) {
      this.tradingDay = other.tradingDay;
    }
    this.commPhaseNo = other.commPhaseNo;
    if (other.isSetSystemID()) {
      this.systemID = other.systemID;
    }
  }

  public CThostFtdcCommPhaseField deepCopy() {
    return new CThostFtdcCommPhaseField(this);
  }

  @Override
  public void clear() {
    this.tradingDay = null;
    setCommPhaseNoIsSet(false);
    this.commPhaseNo = 0;
    this.systemID = null;
  }

  public String getTradingDay() {
    return this.tradingDay;
  }

  public CThostFtdcCommPhaseField setTradingDay(String tradingDay) {
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

  public short getCommPhaseNo() {
    return this.commPhaseNo;
  }

  public CThostFtdcCommPhaseField setCommPhaseNo(short commPhaseNo) {
    this.commPhaseNo = commPhaseNo;
    setCommPhaseNoIsSet(true);
    return this;
  }

  public void unsetCommPhaseNo() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMMPHASENO_ISSET_ID);
  }

  /** Returns true if field commPhaseNo is set (has been assigned a value) and false otherwise */
  public boolean isSetCommPhaseNo() {
    return EncodingUtils.testBit(__isset_bitfield, __COMMPHASENO_ISSET_ID);
  }

  public void setCommPhaseNoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMMPHASENO_ISSET_ID, value);
  }

  public String getSystemID() {
    return this.systemID;
  }

  public CThostFtdcCommPhaseField setSystemID(String systemID) {
    this.systemID = systemID;
    return this;
  }

  public void unsetSystemID() {
    this.systemID = null;
  }

  /** Returns true if field systemID is set (has been assigned a value) and false otherwise */
  public boolean isSetSystemID() {
    return this.systemID != null;
  }

  public void setSystemIDIsSet(boolean value) {
    if (!value) {
      this.systemID = null;
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

    case COMM_PHASE_NO:
      if (value == null) {
        unsetCommPhaseNo();
      } else {
        setCommPhaseNo((Short)value);
      }
      break;

    case SYSTEM_ID:
      if (value == null) {
        unsetSystemID();
      } else {
        setSystemID((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRADING_DAY:
      return getTradingDay();

    case COMM_PHASE_NO:
      return Short.valueOf(getCommPhaseNo());

    case SYSTEM_ID:
      return getSystemID();

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
    case COMM_PHASE_NO:
      return isSetCommPhaseNo();
    case SYSTEM_ID:
      return isSetSystemID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcCommPhaseField)
      return this.equals((CThostFtdcCommPhaseField)that);
    return false;
  }

  public boolean equals(CThostFtdcCommPhaseField that) {
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

    boolean this_present_commPhaseNo = true;
    boolean that_present_commPhaseNo = true;
    if (this_present_commPhaseNo || that_present_commPhaseNo) {
      if (!(this_present_commPhaseNo && that_present_commPhaseNo))
        return false;
      if (this.commPhaseNo != that.commPhaseNo)
        return false;
    }

    boolean this_present_systemID = true && this.isSetSystemID();
    boolean that_present_systemID = true && that.isSetSystemID();
    if (this_present_systemID || that_present_systemID) {
      if (!(this_present_systemID && that_present_systemID))
        return false;
      if (!this.systemID.equals(that.systemID))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcCommPhaseField other) {
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
    lastComparison = Boolean.valueOf(isSetCommPhaseNo()).compareTo(other.isSetCommPhaseNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommPhaseNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.commPhaseNo, other.commPhaseNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSystemID()).compareTo(other.isSetSystemID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSystemID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.systemID, other.systemID);
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
    StringBuilder sb = new StringBuilder("CThostFtdcCommPhaseField(");
    boolean first = true;

    sb.append("tradingDay:");
    if (this.tradingDay == null) {
      sb.append("null");
    } else {
      sb.append(this.tradingDay);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("commPhaseNo:");
    sb.append(this.commPhaseNo);
    first = false;
    if (!first) sb.append(", ");
    sb.append("systemID:");
    if (this.systemID == null) {
      sb.append("null");
    } else {
      sb.append(this.systemID);
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

  private static class CThostFtdcCommPhaseFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcCommPhaseFieldStandardScheme getScheme() {
      return new CThostFtdcCommPhaseFieldStandardScheme();
    }
  }

  private static class CThostFtdcCommPhaseFieldStandardScheme extends StandardScheme<CThostFtdcCommPhaseField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcCommPhaseField struct) throws org.apache.thrift.TException {
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
          case 2: // COMM_PHASE_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.commPhaseNo = iprot.readI16();
              struct.setCommPhaseNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SYSTEM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.systemID = iprot.readString();
              struct.setSystemIDIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcCommPhaseField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tradingDay != null) {
        oprot.writeFieldBegin(TRADING_DAY_FIELD_DESC);
        oprot.writeString(struct.tradingDay);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COMM_PHASE_NO_FIELD_DESC);
      oprot.writeI16(struct.commPhaseNo);
      oprot.writeFieldEnd();
      if (struct.systemID != null) {
        oprot.writeFieldBegin(SYSTEM_ID_FIELD_DESC);
        oprot.writeString(struct.systemID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcCommPhaseFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcCommPhaseFieldTupleScheme getScheme() {
      return new CThostFtdcCommPhaseFieldTupleScheme();
    }
  }

  private static class CThostFtdcCommPhaseFieldTupleScheme extends TupleScheme<CThostFtdcCommPhaseField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcCommPhaseField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTradingDay()) {
        optionals.set(0);
      }
      if (struct.isSetCommPhaseNo()) {
        optionals.set(1);
      }
      if (struct.isSetSystemID()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTradingDay()) {
        oprot.writeString(struct.tradingDay);
      }
      if (struct.isSetCommPhaseNo()) {
        oprot.writeI16(struct.commPhaseNo);
      }
      if (struct.isSetSystemID()) {
        oprot.writeString(struct.systemID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcCommPhaseField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.tradingDay = iprot.readString();
        struct.setTradingDayIsSet(true);
      }
      if (incoming.get(1)) {
        struct.commPhaseNo = iprot.readI16();
        struct.setCommPhaseNoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.systemID = iprot.readString();
        struct.setSystemIDIsSet(true);
      }
    }
  }

}
