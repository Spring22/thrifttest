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

public class CThostFtdcExchangeField implements org.apache.thrift.TBase<CThostFtdcExchangeField, CThostFtdcExchangeField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcExchangeField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcExchangeField");

  private static final org.apache.thrift.protocol.TField EXCHANGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("exchangeID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EXCHANGE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("exchangeName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXCHANGE_PROPERTY_FIELD_DESC = new org.apache.thrift.protocol.TField("exchangeProperty", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcExchangeFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcExchangeFieldTupleSchemeFactory());
  }

  public String exchangeID; // required
  public String exchangeName; // required
  public String exchangeProperty; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXCHANGE_ID((short)1, "exchangeID"),
    EXCHANGE_NAME((short)2, "exchangeName"),
    EXCHANGE_PROPERTY((short)3, "exchangeProperty");

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
        case 1: // EXCHANGE_ID
          return EXCHANGE_ID;
        case 2: // EXCHANGE_NAME
          return EXCHANGE_NAME;
        case 3: // EXCHANGE_PROPERTY
          return EXCHANGE_PROPERTY;
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
    tmpMap.put(_Fields.EXCHANGE_ID, new org.apache.thrift.meta_data.FieldMetaData("exchangeID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcExchangeIDType")));
    tmpMap.put(_Fields.EXCHANGE_NAME, new org.apache.thrift.meta_data.FieldMetaData("exchangeName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcExchangeNameType")));
    tmpMap.put(_Fields.EXCHANGE_PROPERTY, new org.apache.thrift.meta_data.FieldMetaData("exchangeProperty", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcExchangePropertyType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcExchangeField.class, metaDataMap);
  }

  public CThostFtdcExchangeField() {
  }

  public CThostFtdcExchangeField(
    String exchangeID,
    String exchangeName,
    String exchangeProperty)
  {
    this();
    this.exchangeID = exchangeID;
    this.exchangeName = exchangeName;
    this.exchangeProperty = exchangeProperty;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcExchangeField(CThostFtdcExchangeField other) {
    if (other.isSetExchangeID()) {
      this.exchangeID = other.exchangeID;
    }
    if (other.isSetExchangeName()) {
      this.exchangeName = other.exchangeName;
    }
    if (other.isSetExchangeProperty()) {
      this.exchangeProperty = other.exchangeProperty;
    }
  }

  public CThostFtdcExchangeField deepCopy() {
    return new CThostFtdcExchangeField(this);
  }

  @Override
  public void clear() {
    this.exchangeID = null;
    this.exchangeName = null;
    this.exchangeProperty = null;
  }

  public String getExchangeID() {
    return this.exchangeID;
  }

  public CThostFtdcExchangeField setExchangeID(String exchangeID) {
    this.exchangeID = exchangeID;
    return this;
  }

  public void unsetExchangeID() {
    this.exchangeID = null;
  }

  /** Returns true if field exchangeID is set (has been assigned a value) and false otherwise */
  public boolean isSetExchangeID() {
    return this.exchangeID != null;
  }

  public void setExchangeIDIsSet(boolean value) {
    if (!value) {
      this.exchangeID = null;
    }
  }

  public String getExchangeName() {
    return this.exchangeName;
  }

  public CThostFtdcExchangeField setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
    return this;
  }

  public void unsetExchangeName() {
    this.exchangeName = null;
  }

  /** Returns true if field exchangeName is set (has been assigned a value) and false otherwise */
  public boolean isSetExchangeName() {
    return this.exchangeName != null;
  }

  public void setExchangeNameIsSet(boolean value) {
    if (!value) {
      this.exchangeName = null;
    }
  }

  public String getExchangeProperty() {
    return this.exchangeProperty;
  }

  public CThostFtdcExchangeField setExchangeProperty(String exchangeProperty) {
    this.exchangeProperty = exchangeProperty;
    return this;
  }

  public void unsetExchangeProperty() {
    this.exchangeProperty = null;
  }

  /** Returns true if field exchangeProperty is set (has been assigned a value) and false otherwise */
  public boolean isSetExchangeProperty() {
    return this.exchangeProperty != null;
  }

  public void setExchangePropertyIsSet(boolean value) {
    if (!value) {
      this.exchangeProperty = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXCHANGE_ID:
      if (value == null) {
        unsetExchangeID();
      } else {
        setExchangeID((String)value);
      }
      break;

    case EXCHANGE_NAME:
      if (value == null) {
        unsetExchangeName();
      } else {
        setExchangeName((String)value);
      }
      break;

    case EXCHANGE_PROPERTY:
      if (value == null) {
        unsetExchangeProperty();
      } else {
        setExchangeProperty((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXCHANGE_ID:
      return getExchangeID();

    case EXCHANGE_NAME:
      return getExchangeName();

    case EXCHANGE_PROPERTY:
      return getExchangeProperty();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXCHANGE_ID:
      return isSetExchangeID();
    case EXCHANGE_NAME:
      return isSetExchangeName();
    case EXCHANGE_PROPERTY:
      return isSetExchangeProperty();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcExchangeField)
      return this.equals((CThostFtdcExchangeField)that);
    return false;
  }

  public boolean equals(CThostFtdcExchangeField that) {
    if (that == null)
      return false;

    boolean this_present_exchangeID = true && this.isSetExchangeID();
    boolean that_present_exchangeID = true && that.isSetExchangeID();
    if (this_present_exchangeID || that_present_exchangeID) {
      if (!(this_present_exchangeID && that_present_exchangeID))
        return false;
      if (!this.exchangeID.equals(that.exchangeID))
        return false;
    }

    boolean this_present_exchangeName = true && this.isSetExchangeName();
    boolean that_present_exchangeName = true && that.isSetExchangeName();
    if (this_present_exchangeName || that_present_exchangeName) {
      if (!(this_present_exchangeName && that_present_exchangeName))
        return false;
      if (!this.exchangeName.equals(that.exchangeName))
        return false;
    }

    boolean this_present_exchangeProperty = true && this.isSetExchangeProperty();
    boolean that_present_exchangeProperty = true && that.isSetExchangeProperty();
    if (this_present_exchangeProperty || that_present_exchangeProperty) {
      if (!(this_present_exchangeProperty && that_present_exchangeProperty))
        return false;
      if (!this.exchangeProperty.equals(that.exchangeProperty))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcExchangeField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExchangeID()).compareTo(other.isSetExchangeID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExchangeID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exchangeID, other.exchangeID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExchangeName()).compareTo(other.isSetExchangeName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExchangeName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exchangeName, other.exchangeName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExchangeProperty()).compareTo(other.isSetExchangeProperty());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExchangeProperty()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exchangeProperty, other.exchangeProperty);
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
    StringBuilder sb = new StringBuilder("CThostFtdcExchangeField(");
    boolean first = true;

    sb.append("exchangeID:");
    if (this.exchangeID == null) {
      sb.append("null");
    } else {
      sb.append(this.exchangeID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("exchangeName:");
    if (this.exchangeName == null) {
      sb.append("null");
    } else {
      sb.append(this.exchangeName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("exchangeProperty:");
    if (this.exchangeProperty == null) {
      sb.append("null");
    } else {
      sb.append(this.exchangeProperty);
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

  private static class CThostFtdcExchangeFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcExchangeFieldStandardScheme getScheme() {
      return new CThostFtdcExchangeFieldStandardScheme();
    }
  }

  private static class CThostFtdcExchangeFieldStandardScheme extends StandardScheme<CThostFtdcExchangeField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcExchangeField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXCHANGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exchangeID = iprot.readString();
              struct.setExchangeIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXCHANGE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exchangeName = iprot.readString();
              struct.setExchangeNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXCHANGE_PROPERTY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exchangeProperty = iprot.readString();
              struct.setExchangePropertyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcExchangeField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.exchangeID != null) {
        oprot.writeFieldBegin(EXCHANGE_ID_FIELD_DESC);
        oprot.writeString(struct.exchangeID);
        oprot.writeFieldEnd();
      }
      if (struct.exchangeName != null) {
        oprot.writeFieldBegin(EXCHANGE_NAME_FIELD_DESC);
        oprot.writeString(struct.exchangeName);
        oprot.writeFieldEnd();
      }
      if (struct.exchangeProperty != null) {
        oprot.writeFieldBegin(EXCHANGE_PROPERTY_FIELD_DESC);
        oprot.writeString(struct.exchangeProperty);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcExchangeFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcExchangeFieldTupleScheme getScheme() {
      return new CThostFtdcExchangeFieldTupleScheme();
    }
  }

  private static class CThostFtdcExchangeFieldTupleScheme extends TupleScheme<CThostFtdcExchangeField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcExchangeField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExchangeID()) {
        optionals.set(0);
      }
      if (struct.isSetExchangeName()) {
        optionals.set(1);
      }
      if (struct.isSetExchangeProperty()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetExchangeID()) {
        oprot.writeString(struct.exchangeID);
      }
      if (struct.isSetExchangeName()) {
        oprot.writeString(struct.exchangeName);
      }
      if (struct.isSetExchangeProperty()) {
        oprot.writeString(struct.exchangeProperty);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcExchangeField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.exchangeID = iprot.readString();
        struct.setExchangeIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.exchangeName = iprot.readString();
        struct.setExchangeNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.exchangeProperty = iprot.readString();
        struct.setExchangePropertyIsSet(true);
      }
    }
  }

}

