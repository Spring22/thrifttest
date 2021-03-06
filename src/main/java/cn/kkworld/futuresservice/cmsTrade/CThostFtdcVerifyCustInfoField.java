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

public class CThostFtdcVerifyCustInfoField implements org.apache.thrift.TBase<CThostFtdcVerifyCustInfoField, CThostFtdcVerifyCustInfoField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcVerifyCustInfoField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcVerifyCustInfoField");

  private static final org.apache.thrift.protocol.TField CUSTOMER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("customerName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ID_CARD_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("idCardType", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IDENTIFIED_CARD_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("identifiedCardNo", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CUST_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("custType", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcVerifyCustInfoFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcVerifyCustInfoFieldTupleSchemeFactory());
  }

  public String customerName; // required
  public String idCardType; // required
  public String identifiedCardNo; // required
  public String custType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CUSTOMER_NAME((short)1, "customerName"),
    ID_CARD_TYPE((short)2, "idCardType"),
    IDENTIFIED_CARD_NO((short)3, "identifiedCardNo"),
    CUST_TYPE((short)4, "custType");

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
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcVerifyCustInfoField.class, metaDataMap);
  }

  public CThostFtdcVerifyCustInfoField() {
  }

  public CThostFtdcVerifyCustInfoField(
    String customerName,
    String idCardType,
    String identifiedCardNo,
    String custType)
  {
    this();
    this.customerName = customerName;
    this.idCardType = idCardType;
    this.identifiedCardNo = identifiedCardNo;
    this.custType = custType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcVerifyCustInfoField(CThostFtdcVerifyCustInfoField other) {
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
  }

  public CThostFtdcVerifyCustInfoField deepCopy() {
    return new CThostFtdcVerifyCustInfoField(this);
  }

  @Override
  public void clear() {
    this.customerName = null;
    this.idCardType = null;
    this.identifiedCardNo = null;
    this.custType = null;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public CThostFtdcVerifyCustInfoField setCustomerName(String customerName) {
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

  public CThostFtdcVerifyCustInfoField setIdCardType(String idCardType) {
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

  public CThostFtdcVerifyCustInfoField setIdentifiedCardNo(String identifiedCardNo) {
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

  public CThostFtdcVerifyCustInfoField setCustType(String custType) {
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
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcVerifyCustInfoField)
      return this.equals((CThostFtdcVerifyCustInfoField)that);
    return false;
  }

  public boolean equals(CThostFtdcVerifyCustInfoField that) {
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

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcVerifyCustInfoField other) {
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
    StringBuilder sb = new StringBuilder("CThostFtdcVerifyCustInfoField(");
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

  private static class CThostFtdcVerifyCustInfoFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcVerifyCustInfoFieldStandardScheme getScheme() {
      return new CThostFtdcVerifyCustInfoFieldStandardScheme();
    }
  }

  private static class CThostFtdcVerifyCustInfoFieldStandardScheme extends StandardScheme<CThostFtdcVerifyCustInfoField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcVerifyCustInfoField struct) throws org.apache.thrift.TException {
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
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcVerifyCustInfoField struct) throws org.apache.thrift.TException {
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
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcVerifyCustInfoFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcVerifyCustInfoFieldTupleScheme getScheme() {
      return new CThostFtdcVerifyCustInfoFieldTupleScheme();
    }
  }

  private static class CThostFtdcVerifyCustInfoFieldTupleScheme extends TupleScheme<CThostFtdcVerifyCustInfoField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcVerifyCustInfoField struct) throws org.apache.thrift.TException {
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
      oprot.writeBitSet(optionals, 4);
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
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcVerifyCustInfoField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
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
    }
  }

}

