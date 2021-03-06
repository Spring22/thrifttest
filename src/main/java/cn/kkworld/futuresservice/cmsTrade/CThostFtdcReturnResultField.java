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

public class CThostFtdcReturnResultField implements org.apache.thrift.TBase<CThostFtdcReturnResultField, CThostFtdcReturnResultField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcReturnResultField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcReturnResultField");

  private static final org.apache.thrift.protocol.TField RETURN_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("returnCode", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DESCR_INFO_FOR_RETURN_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("descrInfoForReturnCode", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcReturnResultFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcReturnResultFieldTupleSchemeFactory());
  }

  public String returnCode; // required
  public String descrInfoForReturnCode; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RETURN_CODE((short)1, "returnCode"),
    DESCR_INFO_FOR_RETURN_CODE((short)2, "descrInfoForReturnCode");

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
        case 1: // RETURN_CODE
          return RETURN_CODE;
        case 2: // DESCR_INFO_FOR_RETURN_CODE
          return DESCR_INFO_FOR_RETURN_CODE;
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
    tmpMap.put(_Fields.RETURN_CODE, new org.apache.thrift.meta_data.FieldMetaData("returnCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcReturnCodeType")));
    tmpMap.put(_Fields.DESCR_INFO_FOR_RETURN_CODE, new org.apache.thrift.meta_data.FieldMetaData("descrInfoForReturnCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcDescrInfoForReturnCodeType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcReturnResultField.class, metaDataMap);
  }

  public CThostFtdcReturnResultField() {
  }

  public CThostFtdcReturnResultField(
    String returnCode,
    String descrInfoForReturnCode)
  {
    this();
    this.returnCode = returnCode;
    this.descrInfoForReturnCode = descrInfoForReturnCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcReturnResultField(CThostFtdcReturnResultField other) {
    if (other.isSetReturnCode()) {
      this.returnCode = other.returnCode;
    }
    if (other.isSetDescrInfoForReturnCode()) {
      this.descrInfoForReturnCode = other.descrInfoForReturnCode;
    }
  }

  public CThostFtdcReturnResultField deepCopy() {
    return new CThostFtdcReturnResultField(this);
  }

  @Override
  public void clear() {
    this.returnCode = null;
    this.descrInfoForReturnCode = null;
  }

  public String getReturnCode() {
    return this.returnCode;
  }

  public CThostFtdcReturnResultField setReturnCode(String returnCode) {
    this.returnCode = returnCode;
    return this;
  }

  public void unsetReturnCode() {
    this.returnCode = null;
  }

  /** Returns true if field returnCode is set (has been assigned a value) and false otherwise */
  public boolean isSetReturnCode() {
    return this.returnCode != null;
  }

  public void setReturnCodeIsSet(boolean value) {
    if (!value) {
      this.returnCode = null;
    }
  }

  public String getDescrInfoForReturnCode() {
    return this.descrInfoForReturnCode;
  }

  public CThostFtdcReturnResultField setDescrInfoForReturnCode(String descrInfoForReturnCode) {
    this.descrInfoForReturnCode = descrInfoForReturnCode;
    return this;
  }

  public void unsetDescrInfoForReturnCode() {
    this.descrInfoForReturnCode = null;
  }

  /** Returns true if field descrInfoForReturnCode is set (has been assigned a value) and false otherwise */
  public boolean isSetDescrInfoForReturnCode() {
    return this.descrInfoForReturnCode != null;
  }

  public void setDescrInfoForReturnCodeIsSet(boolean value) {
    if (!value) {
      this.descrInfoForReturnCode = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RETURN_CODE:
      if (value == null) {
        unsetReturnCode();
      } else {
        setReturnCode((String)value);
      }
      break;

    case DESCR_INFO_FOR_RETURN_CODE:
      if (value == null) {
        unsetDescrInfoForReturnCode();
      } else {
        setDescrInfoForReturnCode((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RETURN_CODE:
      return getReturnCode();

    case DESCR_INFO_FOR_RETURN_CODE:
      return getDescrInfoForReturnCode();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RETURN_CODE:
      return isSetReturnCode();
    case DESCR_INFO_FOR_RETURN_CODE:
      return isSetDescrInfoForReturnCode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcReturnResultField)
      return this.equals((CThostFtdcReturnResultField)that);
    return false;
  }

  public boolean equals(CThostFtdcReturnResultField that) {
    if (that == null)
      return false;

    boolean this_present_returnCode = true && this.isSetReturnCode();
    boolean that_present_returnCode = true && that.isSetReturnCode();
    if (this_present_returnCode || that_present_returnCode) {
      if (!(this_present_returnCode && that_present_returnCode))
        return false;
      if (!this.returnCode.equals(that.returnCode))
        return false;
    }

    boolean this_present_descrInfoForReturnCode = true && this.isSetDescrInfoForReturnCode();
    boolean that_present_descrInfoForReturnCode = true && that.isSetDescrInfoForReturnCode();
    if (this_present_descrInfoForReturnCode || that_present_descrInfoForReturnCode) {
      if (!(this_present_descrInfoForReturnCode && that_present_descrInfoForReturnCode))
        return false;
      if (!this.descrInfoForReturnCode.equals(that.descrInfoForReturnCode))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcReturnResultField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReturnCode()).compareTo(other.isSetReturnCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReturnCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.returnCode, other.returnCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescrInfoForReturnCode()).compareTo(other.isSetDescrInfoForReturnCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescrInfoForReturnCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.descrInfoForReturnCode, other.descrInfoForReturnCode);
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
    StringBuilder sb = new StringBuilder("CThostFtdcReturnResultField(");
    boolean first = true;

    sb.append("returnCode:");
    if (this.returnCode == null) {
      sb.append("null");
    } else {
      sb.append(this.returnCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("descrInfoForReturnCode:");
    if (this.descrInfoForReturnCode == null) {
      sb.append("null");
    } else {
      sb.append(this.descrInfoForReturnCode);
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

  private static class CThostFtdcReturnResultFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcReturnResultFieldStandardScheme getScheme() {
      return new CThostFtdcReturnResultFieldStandardScheme();
    }
  }

  private static class CThostFtdcReturnResultFieldStandardScheme extends StandardScheme<CThostFtdcReturnResultField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcReturnResultField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RETURN_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.returnCode = iprot.readString();
              struct.setReturnCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DESCR_INFO_FOR_RETURN_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.descrInfoForReturnCode = iprot.readString();
              struct.setDescrInfoForReturnCodeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcReturnResultField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.returnCode != null) {
        oprot.writeFieldBegin(RETURN_CODE_FIELD_DESC);
        oprot.writeString(struct.returnCode);
        oprot.writeFieldEnd();
      }
      if (struct.descrInfoForReturnCode != null) {
        oprot.writeFieldBegin(DESCR_INFO_FOR_RETURN_CODE_FIELD_DESC);
        oprot.writeString(struct.descrInfoForReturnCode);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcReturnResultFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcReturnResultFieldTupleScheme getScheme() {
      return new CThostFtdcReturnResultFieldTupleScheme();
    }
  }

  private static class CThostFtdcReturnResultFieldTupleScheme extends TupleScheme<CThostFtdcReturnResultField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcReturnResultField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetReturnCode()) {
        optionals.set(0);
      }
      if (struct.isSetDescrInfoForReturnCode()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetReturnCode()) {
        oprot.writeString(struct.returnCode);
      }
      if (struct.isSetDescrInfoForReturnCode()) {
        oprot.writeString(struct.descrInfoForReturnCode);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcReturnResultField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.returnCode = iprot.readString();
        struct.setReturnCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.descrInfoForReturnCode = iprot.readString();
        struct.setDescrInfoForReturnCodeIsSet(true);
      }
    }
  }

}

