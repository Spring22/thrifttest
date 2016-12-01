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

public class ErrorResponse implements org.apache.thrift.TBase<ErrorResponse, ErrorResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ErrorResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ErrorResponse");

  private static final org.apache.thrift.protocol.TField C_THOST_FTDC_RSP_INFO_FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("cThostFtdcRspInfoField", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField N_REQUEST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("nRequestID", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField B_IS_LAST_FIELD_DESC = new org.apache.thrift.protocol.TField("bIsLast", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ErrorResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ErrorResponseTupleSchemeFactory());
  }

  public cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField cThostFtdcRspInfoField; // required
  public int nRequestID; // required
  public boolean bIsLast; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    C_THOST_FTDC_RSP_INFO_FIELD((short)1, "cThostFtdcRspInfoField"),
    N_REQUEST_ID((short)2, "nRequestID"),
    B_IS_LAST((short)3, "bIsLast");

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
        case 1: // C_THOST_FTDC_RSP_INFO_FIELD
          return C_THOST_FTDC_RSP_INFO_FIELD;
        case 2: // N_REQUEST_ID
          return N_REQUEST_ID;
        case 3: // B_IS_LAST
          return B_IS_LAST;
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
  private static final int __NREQUESTID_ISSET_ID = 0;
  private static final int __BISLAST_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.C_THOST_FTDC_RSP_INFO_FIELD, new org.apache.thrift.meta_data.FieldMetaData("cThostFtdcRspInfoField", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField.class)));
    tmpMap.put(_Fields.N_REQUEST_ID, new org.apache.thrift.meta_data.FieldMetaData("nRequestID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.B_IS_LAST, new org.apache.thrift.meta_data.FieldMetaData("bIsLast", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ErrorResponse.class, metaDataMap);
  }

  public ErrorResponse() {
  }

  public ErrorResponse(
    cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField cThostFtdcRspInfoField,
    int nRequestID,
    boolean bIsLast)
  {
    this();
    this.cThostFtdcRspInfoField = cThostFtdcRspInfoField;
    this.nRequestID = nRequestID;
    setNRequestIDIsSet(true);
    this.bIsLast = bIsLast;
    setBIsLastIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ErrorResponse(ErrorResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCThostFtdcRspInfoField()) {
      this.cThostFtdcRspInfoField = new cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField(other.cThostFtdcRspInfoField);
    }
    this.nRequestID = other.nRequestID;
    this.bIsLast = other.bIsLast;
  }

  public ErrorResponse deepCopy() {
    return new ErrorResponse(this);
  }

  @Override
  public void clear() {
    this.cThostFtdcRspInfoField = null;
    setNRequestIDIsSet(false);
    this.nRequestID = 0;
    setBIsLastIsSet(false);
    this.bIsLast = false;
  }

  public cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField getCThostFtdcRspInfoField() {
    return this.cThostFtdcRspInfoField;
  }

  public ErrorResponse setCThostFtdcRspInfoField(cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField cThostFtdcRspInfoField) {
    this.cThostFtdcRspInfoField = cThostFtdcRspInfoField;
    return this;
  }

  public void unsetCThostFtdcRspInfoField() {
    this.cThostFtdcRspInfoField = null;
  }

  /** Returns true if field cThostFtdcRspInfoField is set (has been assigned a value) and false otherwise */
  public boolean isSetCThostFtdcRspInfoField() {
    return this.cThostFtdcRspInfoField != null;
  }

  public void setCThostFtdcRspInfoFieldIsSet(boolean value) {
    if (!value) {
      this.cThostFtdcRspInfoField = null;
    }
  }

  public int getNRequestID() {
    return this.nRequestID;
  }

  public ErrorResponse setNRequestID(int nRequestID) {
    this.nRequestID = nRequestID;
    setNRequestIDIsSet(true);
    return this;
  }

  public void unsetNRequestID() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NREQUESTID_ISSET_ID);
  }

  /** Returns true if field nRequestID is set (has been assigned a value) and false otherwise */
  public boolean isSetNRequestID() {
    return EncodingUtils.testBit(__isset_bitfield, __NREQUESTID_ISSET_ID);
  }

  public void setNRequestIDIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NREQUESTID_ISSET_ID, value);
  }

  public boolean isBIsLast() {
    return this.bIsLast;
  }

  public ErrorResponse setBIsLast(boolean bIsLast) {
    this.bIsLast = bIsLast;
    setBIsLastIsSet(true);
    return this;
  }

  public void unsetBIsLast() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BISLAST_ISSET_ID);
  }

  /** Returns true if field bIsLast is set (has been assigned a value) and false otherwise */
  public boolean isSetBIsLast() {
    return EncodingUtils.testBit(__isset_bitfield, __BISLAST_ISSET_ID);
  }

  public void setBIsLastIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BISLAST_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case C_THOST_FTDC_RSP_INFO_FIELD:
      if (value == null) {
        unsetCThostFtdcRspInfoField();
      } else {
        setCThostFtdcRspInfoField((cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField)value);
      }
      break;

    case N_REQUEST_ID:
      if (value == null) {
        unsetNRequestID();
      } else {
        setNRequestID((Integer)value);
      }
      break;

    case B_IS_LAST:
      if (value == null) {
        unsetBIsLast();
      } else {
        setBIsLast((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case C_THOST_FTDC_RSP_INFO_FIELD:
      return getCThostFtdcRspInfoField();

    case N_REQUEST_ID:
      return Integer.valueOf(getNRequestID());

    case B_IS_LAST:
      return Boolean.valueOf(isBIsLast());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case C_THOST_FTDC_RSP_INFO_FIELD:
      return isSetCThostFtdcRspInfoField();
    case N_REQUEST_ID:
      return isSetNRequestID();
    case B_IS_LAST:
      return isSetBIsLast();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ErrorResponse)
      return this.equals((ErrorResponse)that);
    return false;
  }

  public boolean equals(ErrorResponse that) {
    if (that == null)
      return false;

    boolean this_present_cThostFtdcRspInfoField = true && this.isSetCThostFtdcRspInfoField();
    boolean that_present_cThostFtdcRspInfoField = true && that.isSetCThostFtdcRspInfoField();
    if (this_present_cThostFtdcRspInfoField || that_present_cThostFtdcRspInfoField) {
      if (!(this_present_cThostFtdcRspInfoField && that_present_cThostFtdcRspInfoField))
        return false;
      if (!this.cThostFtdcRspInfoField.equals(that.cThostFtdcRspInfoField))
        return false;
    }

    boolean this_present_nRequestID = true;
    boolean that_present_nRequestID = true;
    if (this_present_nRequestID || that_present_nRequestID) {
      if (!(this_present_nRequestID && that_present_nRequestID))
        return false;
      if (this.nRequestID != that.nRequestID)
        return false;
    }

    boolean this_present_bIsLast = true;
    boolean that_present_bIsLast = true;
    if (this_present_bIsLast || that_present_bIsLast) {
      if (!(this_present_bIsLast && that_present_bIsLast))
        return false;
      if (this.bIsLast != that.bIsLast)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ErrorResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCThostFtdcRspInfoField()).compareTo(other.isSetCThostFtdcRspInfoField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCThostFtdcRspInfoField()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cThostFtdcRspInfoField, other.cThostFtdcRspInfoField);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNRequestID()).compareTo(other.isSetNRequestID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNRequestID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nRequestID, other.nRequestID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBIsLast()).compareTo(other.isSetBIsLast());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBIsLast()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bIsLast, other.bIsLast);
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
    StringBuilder sb = new StringBuilder("ErrorResponse(");
    boolean first = true;

    sb.append("cThostFtdcRspInfoField:");
    if (this.cThostFtdcRspInfoField == null) {
      sb.append("null");
    } else {
      sb.append(this.cThostFtdcRspInfoField);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nRequestID:");
    sb.append(this.nRequestID);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bIsLast:");
    sb.append(this.bIsLast);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (cThostFtdcRspInfoField != null) {
      cThostFtdcRspInfoField.validate();
    }
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

  private static class ErrorResponseStandardSchemeFactory implements SchemeFactory {
    public ErrorResponseStandardScheme getScheme() {
      return new ErrorResponseStandardScheme();
    }
  }

  private static class ErrorResponseStandardScheme extends StandardScheme<ErrorResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ErrorResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // C_THOST_FTDC_RSP_INFO_FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cThostFtdcRspInfoField = new cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField();
              struct.cThostFtdcRspInfoField.read(iprot);
              struct.setCThostFtdcRspInfoFieldIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // N_REQUEST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nRequestID = iprot.readI32();
              struct.setNRequestIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // B_IS_LAST
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.bIsLast = iprot.readBool();
              struct.setBIsLastIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ErrorResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cThostFtdcRspInfoField != null) {
        oprot.writeFieldBegin(C_THOST_FTDC_RSP_INFO_FIELD_FIELD_DESC);
        struct.cThostFtdcRspInfoField.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(N_REQUEST_ID_FIELD_DESC);
      oprot.writeI32(struct.nRequestID);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(B_IS_LAST_FIELD_DESC);
      oprot.writeBool(struct.bIsLast);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ErrorResponseTupleSchemeFactory implements SchemeFactory {
    public ErrorResponseTupleScheme getScheme() {
      return new ErrorResponseTupleScheme();
    }
  }

  private static class ErrorResponseTupleScheme extends TupleScheme<ErrorResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ErrorResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCThostFtdcRspInfoField()) {
        optionals.set(0);
      }
      if (struct.isSetNRequestID()) {
        optionals.set(1);
      }
      if (struct.isSetBIsLast()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCThostFtdcRspInfoField()) {
        struct.cThostFtdcRspInfoField.write(oprot);
      }
      if (struct.isSetNRequestID()) {
        oprot.writeI32(struct.nRequestID);
      }
      if (struct.isSetBIsLast()) {
        oprot.writeBool(struct.bIsLast);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ErrorResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.cThostFtdcRspInfoField = new cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField();
        struct.cThostFtdcRspInfoField.read(iprot);
        struct.setCThostFtdcRspInfoFieldIsSet(true);
      }
      if (incoming.get(1)) {
        struct.nRequestID = iprot.readI32();
        struct.setNRequestIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.bIsLast = iprot.readBool();
        struct.setBIsLastIsSet(true);
      }
    }
  }

}

