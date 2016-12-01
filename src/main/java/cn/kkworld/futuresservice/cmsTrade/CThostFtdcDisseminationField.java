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

/**
 * 请求参数结构体定义文件
 * 
 */
public class CThostFtdcDisseminationField implements org.apache.thrift.TBase<CThostFtdcDisseminationField, CThostFtdcDisseminationField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcDisseminationField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcDisseminationField");

  private static final org.apache.thrift.protocol.TField SEQUENCE_SERIES_FIELD_DESC = new org.apache.thrift.protocol.TField("sequenceSeries", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField SEQUENCE_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("sequenceNo", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcDisseminationFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcDisseminationFieldTupleSchemeFactory());
  }

  public short sequenceSeries; // required
  public int sequenceNo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SEQUENCE_SERIES((short)1, "sequenceSeries"),
    SEQUENCE_NO((short)2, "sequenceNo");

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
        case 1: // SEQUENCE_SERIES
          return SEQUENCE_SERIES;
        case 2: // SEQUENCE_NO
          return SEQUENCE_NO;
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
  private static final int __SEQUENCESERIES_ISSET_ID = 0;
  private static final int __SEQUENCENO_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SEQUENCE_SERIES, new org.apache.thrift.meta_data.FieldMetaData("sequenceSeries", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16        , "TThostFtdcSequenceSeriesType")));
    tmpMap.put(_Fields.SEQUENCE_NO, new org.apache.thrift.meta_data.FieldMetaData("sequenceNo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcSequenceNoType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcDisseminationField.class, metaDataMap);
  }

  public CThostFtdcDisseminationField() {
  }

  public CThostFtdcDisseminationField(
    short sequenceSeries,
    int sequenceNo)
  {
    this();
    this.sequenceSeries = sequenceSeries;
    setSequenceSeriesIsSet(true);
    this.sequenceNo = sequenceNo;
    setSequenceNoIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcDisseminationField(CThostFtdcDisseminationField other) {
    __isset_bitfield = other.__isset_bitfield;
    this.sequenceSeries = other.sequenceSeries;
    this.sequenceNo = other.sequenceNo;
  }

  public CThostFtdcDisseminationField deepCopy() {
    return new CThostFtdcDisseminationField(this);
  }

  @Override
  public void clear() {
    setSequenceSeriesIsSet(false);
    this.sequenceSeries = 0;
    setSequenceNoIsSet(false);
    this.sequenceNo = 0;
  }

  public short getSequenceSeries() {
    return this.sequenceSeries;
  }

  public CThostFtdcDisseminationField setSequenceSeries(short sequenceSeries) {
    this.sequenceSeries = sequenceSeries;
    setSequenceSeriesIsSet(true);
    return this;
  }

  public void unsetSequenceSeries() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEQUENCESERIES_ISSET_ID);
  }

  /** Returns true if field sequenceSeries is set (has been assigned a value) and false otherwise */
  public boolean isSetSequenceSeries() {
    return EncodingUtils.testBit(__isset_bitfield, __SEQUENCESERIES_ISSET_ID);
  }

  public void setSequenceSeriesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEQUENCESERIES_ISSET_ID, value);
  }

  public int getSequenceNo() {
    return this.sequenceNo;
  }

  public CThostFtdcDisseminationField setSequenceNo(int sequenceNo) {
    this.sequenceNo = sequenceNo;
    setSequenceNoIsSet(true);
    return this;
  }

  public void unsetSequenceNo() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEQUENCENO_ISSET_ID);
  }

  /** Returns true if field sequenceNo is set (has been assigned a value) and false otherwise */
  public boolean isSetSequenceNo() {
    return EncodingUtils.testBit(__isset_bitfield, __SEQUENCENO_ISSET_ID);
  }

  public void setSequenceNoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEQUENCENO_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SEQUENCE_SERIES:
      if (value == null) {
        unsetSequenceSeries();
      } else {
        setSequenceSeries((Short)value);
      }
      break;

    case SEQUENCE_NO:
      if (value == null) {
        unsetSequenceNo();
      } else {
        setSequenceNo((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SEQUENCE_SERIES:
      return Short.valueOf(getSequenceSeries());

    case SEQUENCE_NO:
      return Integer.valueOf(getSequenceNo());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SEQUENCE_SERIES:
      return isSetSequenceSeries();
    case SEQUENCE_NO:
      return isSetSequenceNo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcDisseminationField)
      return this.equals((CThostFtdcDisseminationField)that);
    return false;
  }

  public boolean equals(CThostFtdcDisseminationField that) {
    if (that == null)
      return false;

    boolean this_present_sequenceSeries = true;
    boolean that_present_sequenceSeries = true;
    if (this_present_sequenceSeries || that_present_sequenceSeries) {
      if (!(this_present_sequenceSeries && that_present_sequenceSeries))
        return false;
      if (this.sequenceSeries != that.sequenceSeries)
        return false;
    }

    boolean this_present_sequenceNo = true;
    boolean that_present_sequenceNo = true;
    if (this_present_sequenceNo || that_present_sequenceNo) {
      if (!(this_present_sequenceNo && that_present_sequenceNo))
        return false;
      if (this.sequenceNo != that.sequenceNo)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcDisseminationField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSequenceSeries()).compareTo(other.isSetSequenceSeries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequenceSeries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sequenceSeries, other.sequenceSeries);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSequenceNo()).compareTo(other.isSetSequenceNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequenceNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sequenceNo, other.sequenceNo);
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
    StringBuilder sb = new StringBuilder("CThostFtdcDisseminationField(");
    boolean first = true;

    sb.append("sequenceSeries:");
    sb.append(this.sequenceSeries);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sequenceNo:");
    sb.append(this.sequenceNo);
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

  private static class CThostFtdcDisseminationFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcDisseminationFieldStandardScheme getScheme() {
      return new CThostFtdcDisseminationFieldStandardScheme();
    }
  }

  private static class CThostFtdcDisseminationFieldStandardScheme extends StandardScheme<CThostFtdcDisseminationField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcDisseminationField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SEQUENCE_SERIES
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.sequenceSeries = iprot.readI16();
              struct.setSequenceSeriesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SEQUENCE_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sequenceNo = iprot.readI32();
              struct.setSequenceNoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcDisseminationField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SEQUENCE_SERIES_FIELD_DESC);
      oprot.writeI16(struct.sequenceSeries);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SEQUENCE_NO_FIELD_DESC);
      oprot.writeI32(struct.sequenceNo);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcDisseminationFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcDisseminationFieldTupleScheme getScheme() {
      return new CThostFtdcDisseminationFieldTupleScheme();
    }
  }

  private static class CThostFtdcDisseminationFieldTupleScheme extends TupleScheme<CThostFtdcDisseminationField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcDisseminationField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSequenceSeries()) {
        optionals.set(0);
      }
      if (struct.isSetSequenceNo()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSequenceSeries()) {
        oprot.writeI16(struct.sequenceSeries);
      }
      if (struct.isSetSequenceNo()) {
        oprot.writeI32(struct.sequenceNo);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcDisseminationField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.sequenceSeries = iprot.readI16();
        struct.setSequenceSeriesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sequenceNo = iprot.readI32();
        struct.setSequenceNoIsSet(true);
      }
    }
  }

}

