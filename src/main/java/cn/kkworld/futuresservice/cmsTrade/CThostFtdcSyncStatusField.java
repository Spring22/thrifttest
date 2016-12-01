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

public class CThostFtdcSyncStatusField implements org.apache.thrift.TBase<CThostFtdcSyncStatusField, CThostFtdcSyncStatusField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcSyncStatusField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcSyncStatusField");

  private static final org.apache.thrift.protocol.TField TRADING_DAY_FIELD_DESC = new org.apache.thrift.protocol.TField("tradingDay", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_SYNC_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("dataSyncStatus", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcSyncStatusFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcSyncStatusFieldTupleSchemeFactory());
  }

  public String tradingDay; // required
  public String dataSyncStatus; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRADING_DAY((short)1, "tradingDay"),
    DATA_SYNC_STATUS((short)2, "dataSyncStatus");

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
        case 2: // DATA_SYNC_STATUS
          return DATA_SYNC_STATUS;
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
    tmpMap.put(_Fields.DATA_SYNC_STATUS, new org.apache.thrift.meta_data.FieldMetaData("dataSyncStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcDataSyncStatusType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcSyncStatusField.class, metaDataMap);
  }

  public CThostFtdcSyncStatusField() {
  }

  public CThostFtdcSyncStatusField(
    String tradingDay,
    String dataSyncStatus)
  {
    this();
    this.tradingDay = tradingDay;
    this.dataSyncStatus = dataSyncStatus;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcSyncStatusField(CThostFtdcSyncStatusField other) {
    if (other.isSetTradingDay()) {
      this.tradingDay = other.tradingDay;
    }
    if (other.isSetDataSyncStatus()) {
      this.dataSyncStatus = other.dataSyncStatus;
    }
  }

  public CThostFtdcSyncStatusField deepCopy() {
    return new CThostFtdcSyncStatusField(this);
  }

  @Override
  public void clear() {
    this.tradingDay = null;
    this.dataSyncStatus = null;
  }

  public String getTradingDay() {
    return this.tradingDay;
  }

  public CThostFtdcSyncStatusField setTradingDay(String tradingDay) {
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

  public String getDataSyncStatus() {
    return this.dataSyncStatus;
  }

  public CThostFtdcSyncStatusField setDataSyncStatus(String dataSyncStatus) {
    this.dataSyncStatus = dataSyncStatus;
    return this;
  }

  public void unsetDataSyncStatus() {
    this.dataSyncStatus = null;
  }

  /** Returns true if field dataSyncStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetDataSyncStatus() {
    return this.dataSyncStatus != null;
  }

  public void setDataSyncStatusIsSet(boolean value) {
    if (!value) {
      this.dataSyncStatus = null;
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

    case DATA_SYNC_STATUS:
      if (value == null) {
        unsetDataSyncStatus();
      } else {
        setDataSyncStatus((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRADING_DAY:
      return getTradingDay();

    case DATA_SYNC_STATUS:
      return getDataSyncStatus();

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
    case DATA_SYNC_STATUS:
      return isSetDataSyncStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcSyncStatusField)
      return this.equals((CThostFtdcSyncStatusField)that);
    return false;
  }

  public boolean equals(CThostFtdcSyncStatusField that) {
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

    boolean this_present_dataSyncStatus = true && this.isSetDataSyncStatus();
    boolean that_present_dataSyncStatus = true && that.isSetDataSyncStatus();
    if (this_present_dataSyncStatus || that_present_dataSyncStatus) {
      if (!(this_present_dataSyncStatus && that_present_dataSyncStatus))
        return false;
      if (!this.dataSyncStatus.equals(that.dataSyncStatus))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcSyncStatusField other) {
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
    lastComparison = Boolean.valueOf(isSetDataSyncStatus()).compareTo(other.isSetDataSyncStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataSyncStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataSyncStatus, other.dataSyncStatus);
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
    StringBuilder sb = new StringBuilder("CThostFtdcSyncStatusField(");
    boolean first = true;

    sb.append("tradingDay:");
    if (this.tradingDay == null) {
      sb.append("null");
    } else {
      sb.append(this.tradingDay);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataSyncStatus:");
    if (this.dataSyncStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.dataSyncStatus);
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

  private static class CThostFtdcSyncStatusFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcSyncStatusFieldStandardScheme getScheme() {
      return new CThostFtdcSyncStatusFieldStandardScheme();
    }
  }

  private static class CThostFtdcSyncStatusFieldStandardScheme extends StandardScheme<CThostFtdcSyncStatusField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcSyncStatusField struct) throws org.apache.thrift.TException {
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
          case 2: // DATA_SYNC_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dataSyncStatus = iprot.readString();
              struct.setDataSyncStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcSyncStatusField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tradingDay != null) {
        oprot.writeFieldBegin(TRADING_DAY_FIELD_DESC);
        oprot.writeString(struct.tradingDay);
        oprot.writeFieldEnd();
      }
      if (struct.dataSyncStatus != null) {
        oprot.writeFieldBegin(DATA_SYNC_STATUS_FIELD_DESC);
        oprot.writeString(struct.dataSyncStatus);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcSyncStatusFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcSyncStatusFieldTupleScheme getScheme() {
      return new CThostFtdcSyncStatusFieldTupleScheme();
    }
  }

  private static class CThostFtdcSyncStatusFieldTupleScheme extends TupleScheme<CThostFtdcSyncStatusField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcSyncStatusField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTradingDay()) {
        optionals.set(0);
      }
      if (struct.isSetDataSyncStatus()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTradingDay()) {
        oprot.writeString(struct.tradingDay);
      }
      if (struct.isSetDataSyncStatus()) {
        oprot.writeString(struct.dataSyncStatus);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcSyncStatusField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.tradingDay = iprot.readString();
        struct.setTradingDayIsSet(true);
      }
      if (incoming.get(1)) {
        struct.dataSyncStatus = iprot.readString();
        struct.setDataSyncStatusIsSet(true);
      }
    }
  }

}
