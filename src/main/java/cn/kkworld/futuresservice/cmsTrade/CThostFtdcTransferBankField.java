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

public class CThostFtdcTransferBankField implements org.apache.thrift.TBase<CThostFtdcTransferBankField, CThostFtdcTransferBankField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcTransferBankField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcTransferBankField");

  private static final org.apache.thrift.protocol.TField BANK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("bankID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BANK_BRCH_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("bankBrchID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField BANK_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("bankName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField IS_ACTIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("isActive", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcTransferBankFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcTransferBankFieldTupleSchemeFactory());
  }

  public String bankID; // required
  public String bankBrchID; // required
  public String bankName; // required
  public int isActive; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BANK_ID((short)1, "bankID"),
    BANK_BRCH_ID((short)2, "bankBrchID"),
    BANK_NAME((short)3, "bankName"),
    IS_ACTIVE((short)4, "isActive");

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
        case 1: // BANK_ID
          return BANK_ID;
        case 2: // BANK_BRCH_ID
          return BANK_BRCH_ID;
        case 3: // BANK_NAME
          return BANK_NAME;
        case 4: // IS_ACTIVE
          return IS_ACTIVE;
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
  private static final int __ISACTIVE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BANK_ID, new org.apache.thrift.meta_data.FieldMetaData("bankID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcBankIDType")));
    tmpMap.put(_Fields.BANK_BRCH_ID, new org.apache.thrift.meta_data.FieldMetaData("bankBrchID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcBankBrchIDType")));
    tmpMap.put(_Fields.BANK_NAME, new org.apache.thrift.meta_data.FieldMetaData("bankName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcBankNameType")));
    tmpMap.put(_Fields.IS_ACTIVE, new org.apache.thrift.meta_data.FieldMetaData("isActive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcBoolType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcTransferBankField.class, metaDataMap);
  }

  public CThostFtdcTransferBankField() {
  }

  public CThostFtdcTransferBankField(
    String bankID,
    String bankBrchID,
    String bankName,
    int isActive)
  {
    this();
    this.bankID = bankID;
    this.bankBrchID = bankBrchID;
    this.bankName = bankName;
    this.isActive = isActive;
    setIsActiveIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcTransferBankField(CThostFtdcTransferBankField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBankID()) {
      this.bankID = other.bankID;
    }
    if (other.isSetBankBrchID()) {
      this.bankBrchID = other.bankBrchID;
    }
    if (other.isSetBankName()) {
      this.bankName = other.bankName;
    }
    this.isActive = other.isActive;
  }

  public CThostFtdcTransferBankField deepCopy() {
    return new CThostFtdcTransferBankField(this);
  }

  @Override
  public void clear() {
    this.bankID = null;
    this.bankBrchID = null;
    this.bankName = null;
    setIsActiveIsSet(false);
    this.isActive = 0;
  }

  public String getBankID() {
    return this.bankID;
  }

  public CThostFtdcTransferBankField setBankID(String bankID) {
    this.bankID = bankID;
    return this;
  }

  public void unsetBankID() {
    this.bankID = null;
  }

  /** Returns true if field bankID is set (has been assigned a value) and false otherwise */
  public boolean isSetBankID() {
    return this.bankID != null;
  }

  public void setBankIDIsSet(boolean value) {
    if (!value) {
      this.bankID = null;
    }
  }

  public String getBankBrchID() {
    return this.bankBrchID;
  }

  public CThostFtdcTransferBankField setBankBrchID(String bankBrchID) {
    this.bankBrchID = bankBrchID;
    return this;
  }

  public void unsetBankBrchID() {
    this.bankBrchID = null;
  }

  /** Returns true if field bankBrchID is set (has been assigned a value) and false otherwise */
  public boolean isSetBankBrchID() {
    return this.bankBrchID != null;
  }

  public void setBankBrchIDIsSet(boolean value) {
    if (!value) {
      this.bankBrchID = null;
    }
  }

  public String getBankName() {
    return this.bankName;
  }

  public CThostFtdcTransferBankField setBankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  public void unsetBankName() {
    this.bankName = null;
  }

  /** Returns true if field bankName is set (has been assigned a value) and false otherwise */
  public boolean isSetBankName() {
    return this.bankName != null;
  }

  public void setBankNameIsSet(boolean value) {
    if (!value) {
      this.bankName = null;
    }
  }

  public int getIsActive() {
    return this.isActive;
  }

  public CThostFtdcTransferBankField setIsActive(int isActive) {
    this.isActive = isActive;
    setIsActiveIsSet(true);
    return this;
  }

  public void unsetIsActive() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISACTIVE_ISSET_ID);
  }

  /** Returns true if field isActive is set (has been assigned a value) and false otherwise */
  public boolean isSetIsActive() {
    return EncodingUtils.testBit(__isset_bitfield, __ISACTIVE_ISSET_ID);
  }

  public void setIsActiveIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISACTIVE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BANK_ID:
      if (value == null) {
        unsetBankID();
      } else {
        setBankID((String)value);
      }
      break;

    case BANK_BRCH_ID:
      if (value == null) {
        unsetBankBrchID();
      } else {
        setBankBrchID((String)value);
      }
      break;

    case BANK_NAME:
      if (value == null) {
        unsetBankName();
      } else {
        setBankName((String)value);
      }
      break;

    case IS_ACTIVE:
      if (value == null) {
        unsetIsActive();
      } else {
        setIsActive((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BANK_ID:
      return getBankID();

    case BANK_BRCH_ID:
      return getBankBrchID();

    case BANK_NAME:
      return getBankName();

    case IS_ACTIVE:
      return Integer.valueOf(getIsActive());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BANK_ID:
      return isSetBankID();
    case BANK_BRCH_ID:
      return isSetBankBrchID();
    case BANK_NAME:
      return isSetBankName();
    case IS_ACTIVE:
      return isSetIsActive();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcTransferBankField)
      return this.equals((CThostFtdcTransferBankField)that);
    return false;
  }

  public boolean equals(CThostFtdcTransferBankField that) {
    if (that == null)
      return false;

    boolean this_present_bankID = true && this.isSetBankID();
    boolean that_present_bankID = true && that.isSetBankID();
    if (this_present_bankID || that_present_bankID) {
      if (!(this_present_bankID && that_present_bankID))
        return false;
      if (!this.bankID.equals(that.bankID))
        return false;
    }

    boolean this_present_bankBrchID = true && this.isSetBankBrchID();
    boolean that_present_bankBrchID = true && that.isSetBankBrchID();
    if (this_present_bankBrchID || that_present_bankBrchID) {
      if (!(this_present_bankBrchID && that_present_bankBrchID))
        return false;
      if (!this.bankBrchID.equals(that.bankBrchID))
        return false;
    }

    boolean this_present_bankName = true && this.isSetBankName();
    boolean that_present_bankName = true && that.isSetBankName();
    if (this_present_bankName || that_present_bankName) {
      if (!(this_present_bankName && that_present_bankName))
        return false;
      if (!this.bankName.equals(that.bankName))
        return false;
    }

    boolean this_present_isActive = true;
    boolean that_present_isActive = true;
    if (this_present_isActive || that_present_isActive) {
      if (!(this_present_isActive && that_present_isActive))
        return false;
      if (this.isActive != that.isActive)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcTransferBankField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBankID()).compareTo(other.isSetBankID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBankID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bankID, other.bankID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBankBrchID()).compareTo(other.isSetBankBrchID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBankBrchID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bankBrchID, other.bankBrchID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBankName()).compareTo(other.isSetBankName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBankName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bankName, other.bankName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsActive()).compareTo(other.isSetIsActive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsActive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isActive, other.isActive);
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
    StringBuilder sb = new StringBuilder("CThostFtdcTransferBankField(");
    boolean first = true;

    sb.append("bankID:");
    if (this.bankID == null) {
      sb.append("null");
    } else {
      sb.append(this.bankID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("bankBrchID:");
    if (this.bankBrchID == null) {
      sb.append("null");
    } else {
      sb.append(this.bankBrchID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("bankName:");
    if (this.bankName == null) {
      sb.append("null");
    } else {
      sb.append(this.bankName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isActive:");
    sb.append(this.isActive);
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

  private static class CThostFtdcTransferBankFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcTransferBankFieldStandardScheme getScheme() {
      return new CThostFtdcTransferBankFieldStandardScheme();
    }
  }

  private static class CThostFtdcTransferBankFieldStandardScheme extends StandardScheme<CThostFtdcTransferBankField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcTransferBankField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BANK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.bankID = iprot.readString();
              struct.setBankIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BANK_BRCH_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.bankBrchID = iprot.readString();
              struct.setBankBrchIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BANK_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.bankName = iprot.readString();
              struct.setBankNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_ACTIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.isActive = iprot.readI32();
              struct.setIsActiveIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcTransferBankField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.bankID != null) {
        oprot.writeFieldBegin(BANK_ID_FIELD_DESC);
        oprot.writeString(struct.bankID);
        oprot.writeFieldEnd();
      }
      if (struct.bankBrchID != null) {
        oprot.writeFieldBegin(BANK_BRCH_ID_FIELD_DESC);
        oprot.writeString(struct.bankBrchID);
        oprot.writeFieldEnd();
      }
      if (struct.bankName != null) {
        oprot.writeFieldBegin(BANK_NAME_FIELD_DESC);
        oprot.writeString(struct.bankName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_ACTIVE_FIELD_DESC);
      oprot.writeI32(struct.isActive);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcTransferBankFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcTransferBankFieldTupleScheme getScheme() {
      return new CThostFtdcTransferBankFieldTupleScheme();
    }
  }

  private static class CThostFtdcTransferBankFieldTupleScheme extends TupleScheme<CThostFtdcTransferBankField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcTransferBankField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBankID()) {
        optionals.set(0);
      }
      if (struct.isSetBankBrchID()) {
        optionals.set(1);
      }
      if (struct.isSetBankName()) {
        optionals.set(2);
      }
      if (struct.isSetIsActive()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetBankID()) {
        oprot.writeString(struct.bankID);
      }
      if (struct.isSetBankBrchID()) {
        oprot.writeString(struct.bankBrchID);
      }
      if (struct.isSetBankName()) {
        oprot.writeString(struct.bankName);
      }
      if (struct.isSetIsActive()) {
        oprot.writeI32(struct.isActive);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcTransferBankField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.bankID = iprot.readString();
        struct.setBankIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.bankBrchID = iprot.readString();
        struct.setBankBrchIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.bankName = iprot.readString();
        struct.setBankNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isActive = iprot.readI32();
        struct.setIsActiveIsSet(true);
      }
    }
  }

}
