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

public class InputOrderFieldErrResponse implements org.apache.thrift.TBase<InputOrderFieldErrResponse, InputOrderFieldErrResponse._Fields>, java.io.Serializable, Cloneable, Comparable<InputOrderFieldErrResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InputOrderFieldErrResponse");

  private static final org.apache.thrift.protocol.TField C_THOST_FTDC_INPUT_ORDER_FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("cThostFtdcInputOrderField", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField C_THOST_FTDC_RSP_INFO_FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("cThostFtdcRspInfoField", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InputOrderFieldErrResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InputOrderFieldErrResponseTupleSchemeFactory());
  }

  public cn.kkworld.futuresservice.cmsTrade.CThostFtdcInputOrderField cThostFtdcInputOrderField; // required
  public cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField cThostFtdcRspInfoField; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    C_THOST_FTDC_INPUT_ORDER_FIELD((short)1, "cThostFtdcInputOrderField"),
    C_THOST_FTDC_RSP_INFO_FIELD((short)2, "cThostFtdcRspInfoField");

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
        case 1: // C_THOST_FTDC_INPUT_ORDER_FIELD
          return C_THOST_FTDC_INPUT_ORDER_FIELD;
        case 2: // C_THOST_FTDC_RSP_INFO_FIELD
          return C_THOST_FTDC_RSP_INFO_FIELD;
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
    tmpMap.put(_Fields.C_THOST_FTDC_INPUT_ORDER_FIELD, new org.apache.thrift.meta_data.FieldMetaData("cThostFtdcInputOrderField", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, cn.kkworld.futuresservice.cmsTrade.CThostFtdcInputOrderField.class)));
    tmpMap.put(_Fields.C_THOST_FTDC_RSP_INFO_FIELD, new org.apache.thrift.meta_data.FieldMetaData("cThostFtdcRspInfoField", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InputOrderFieldErrResponse.class, metaDataMap);
  }

  public InputOrderFieldErrResponse() {
  }

  public InputOrderFieldErrResponse(
    cn.kkworld.futuresservice.cmsTrade.CThostFtdcInputOrderField cThostFtdcInputOrderField,
    cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField cThostFtdcRspInfoField)
  {
    this();
    this.cThostFtdcInputOrderField = cThostFtdcInputOrderField;
    this.cThostFtdcRspInfoField = cThostFtdcRspInfoField;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InputOrderFieldErrResponse(InputOrderFieldErrResponse other) {
    if (other.isSetCThostFtdcInputOrderField()) {
      this.cThostFtdcInputOrderField = new cn.kkworld.futuresservice.cmsTrade.CThostFtdcInputOrderField(other.cThostFtdcInputOrderField);
    }
    if (other.isSetCThostFtdcRspInfoField()) {
      this.cThostFtdcRspInfoField = new cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField(other.cThostFtdcRspInfoField);
    }
  }

  public InputOrderFieldErrResponse deepCopy() {
    return new InputOrderFieldErrResponse(this);
  }

  @Override
  public void clear() {
    this.cThostFtdcInputOrderField = null;
    this.cThostFtdcRspInfoField = null;
  }

  public cn.kkworld.futuresservice.cmsTrade.CThostFtdcInputOrderField getCThostFtdcInputOrderField() {
    return this.cThostFtdcInputOrderField;
  }

  public InputOrderFieldErrResponse setCThostFtdcInputOrderField(cn.kkworld.futuresservice.cmsTrade.CThostFtdcInputOrderField cThostFtdcInputOrderField) {
    this.cThostFtdcInputOrderField = cThostFtdcInputOrderField;
    return this;
  }

  public void unsetCThostFtdcInputOrderField() {
    this.cThostFtdcInputOrderField = null;
  }

  /** Returns true if field cThostFtdcInputOrderField is set (has been assigned a value) and false otherwise */
  public boolean isSetCThostFtdcInputOrderField() {
    return this.cThostFtdcInputOrderField != null;
  }

  public void setCThostFtdcInputOrderFieldIsSet(boolean value) {
    if (!value) {
      this.cThostFtdcInputOrderField = null;
    }
  }

  public cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField getCThostFtdcRspInfoField() {
    return this.cThostFtdcRspInfoField;
  }

  public InputOrderFieldErrResponse setCThostFtdcRspInfoField(cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField cThostFtdcRspInfoField) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case C_THOST_FTDC_INPUT_ORDER_FIELD:
      if (value == null) {
        unsetCThostFtdcInputOrderField();
      } else {
        setCThostFtdcInputOrderField((cn.kkworld.futuresservice.cmsTrade.CThostFtdcInputOrderField)value);
      }
      break;

    case C_THOST_FTDC_RSP_INFO_FIELD:
      if (value == null) {
        unsetCThostFtdcRspInfoField();
      } else {
        setCThostFtdcRspInfoField((cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case C_THOST_FTDC_INPUT_ORDER_FIELD:
      return getCThostFtdcInputOrderField();

    case C_THOST_FTDC_RSP_INFO_FIELD:
      return getCThostFtdcRspInfoField();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case C_THOST_FTDC_INPUT_ORDER_FIELD:
      return isSetCThostFtdcInputOrderField();
    case C_THOST_FTDC_RSP_INFO_FIELD:
      return isSetCThostFtdcRspInfoField();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InputOrderFieldErrResponse)
      return this.equals((InputOrderFieldErrResponse)that);
    return false;
  }

  public boolean equals(InputOrderFieldErrResponse that) {
    if (that == null)
      return false;

    boolean this_present_cThostFtdcInputOrderField = true && this.isSetCThostFtdcInputOrderField();
    boolean that_present_cThostFtdcInputOrderField = true && that.isSetCThostFtdcInputOrderField();
    if (this_present_cThostFtdcInputOrderField || that_present_cThostFtdcInputOrderField) {
      if (!(this_present_cThostFtdcInputOrderField && that_present_cThostFtdcInputOrderField))
        return false;
      if (!this.cThostFtdcInputOrderField.equals(that.cThostFtdcInputOrderField))
        return false;
    }

    boolean this_present_cThostFtdcRspInfoField = true && this.isSetCThostFtdcRspInfoField();
    boolean that_present_cThostFtdcRspInfoField = true && that.isSetCThostFtdcRspInfoField();
    if (this_present_cThostFtdcRspInfoField || that_present_cThostFtdcRspInfoField) {
      if (!(this_present_cThostFtdcRspInfoField && that_present_cThostFtdcRspInfoField))
        return false;
      if (!this.cThostFtdcRspInfoField.equals(that.cThostFtdcRspInfoField))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(InputOrderFieldErrResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCThostFtdcInputOrderField()).compareTo(other.isSetCThostFtdcInputOrderField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCThostFtdcInputOrderField()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cThostFtdcInputOrderField, other.cThostFtdcInputOrderField);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    StringBuilder sb = new StringBuilder("InputOrderFieldErrResponse(");
    boolean first = true;

    sb.append("cThostFtdcInputOrderField:");
    if (this.cThostFtdcInputOrderField == null) {
      sb.append("null");
    } else {
      sb.append(this.cThostFtdcInputOrderField);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cThostFtdcRspInfoField:");
    if (this.cThostFtdcRspInfoField == null) {
      sb.append("null");
    } else {
      sb.append(this.cThostFtdcRspInfoField);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (cThostFtdcInputOrderField != null) {
      cThostFtdcInputOrderField.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InputOrderFieldErrResponseStandardSchemeFactory implements SchemeFactory {
    public InputOrderFieldErrResponseStandardScheme getScheme() {
      return new InputOrderFieldErrResponseStandardScheme();
    }
  }

  private static class InputOrderFieldErrResponseStandardScheme extends StandardScheme<InputOrderFieldErrResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InputOrderFieldErrResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // C_THOST_FTDC_INPUT_ORDER_FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cThostFtdcInputOrderField = new cn.kkworld.futuresservice.cmsTrade.CThostFtdcInputOrderField();
              struct.cThostFtdcInputOrderField.read(iprot);
              struct.setCThostFtdcInputOrderFieldIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // C_THOST_FTDC_RSP_INFO_FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cThostFtdcRspInfoField = new cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField();
              struct.cThostFtdcRspInfoField.read(iprot);
              struct.setCThostFtdcRspInfoFieldIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, InputOrderFieldErrResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cThostFtdcInputOrderField != null) {
        oprot.writeFieldBegin(C_THOST_FTDC_INPUT_ORDER_FIELD_FIELD_DESC);
        struct.cThostFtdcInputOrderField.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.cThostFtdcRspInfoField != null) {
        oprot.writeFieldBegin(C_THOST_FTDC_RSP_INFO_FIELD_FIELD_DESC);
        struct.cThostFtdcRspInfoField.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InputOrderFieldErrResponseTupleSchemeFactory implements SchemeFactory {
    public InputOrderFieldErrResponseTupleScheme getScheme() {
      return new InputOrderFieldErrResponseTupleScheme();
    }
  }

  private static class InputOrderFieldErrResponseTupleScheme extends TupleScheme<InputOrderFieldErrResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InputOrderFieldErrResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCThostFtdcInputOrderField()) {
        optionals.set(0);
      }
      if (struct.isSetCThostFtdcRspInfoField()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCThostFtdcInputOrderField()) {
        struct.cThostFtdcInputOrderField.write(oprot);
      }
      if (struct.isSetCThostFtdcRspInfoField()) {
        struct.cThostFtdcRspInfoField.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InputOrderFieldErrResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.cThostFtdcInputOrderField = new cn.kkworld.futuresservice.cmsTrade.CThostFtdcInputOrderField();
        struct.cThostFtdcInputOrderField.read(iprot);
        struct.setCThostFtdcInputOrderFieldIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cThostFtdcRspInfoField = new cn.kkworld.futuresservice.cmsTrade.CThostFtdcRspInfoField();
        struct.cThostFtdcRspInfoField.read(iprot);
        struct.setCThostFtdcRspInfoFieldIsSet(true);
      }
    }
  }

}

