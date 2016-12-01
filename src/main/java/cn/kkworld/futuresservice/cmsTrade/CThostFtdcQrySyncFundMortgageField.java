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

public class CThostFtdcQrySyncFundMortgageField implements org.apache.thrift.TBase<CThostFtdcQrySyncFundMortgageField, CThostFtdcQrySyncFundMortgageField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcQrySyncFundMortgageField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcQrySyncFundMortgageField");

  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MORTGAGE_SEQ_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("mortgageSeqNo", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcQrySyncFundMortgageFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcQrySyncFundMortgageFieldTupleSchemeFactory());
  }

  public String brokerID; // required
  public String mortgageSeqNo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BROKER_ID((short)1, "brokerID"),
    MORTGAGE_SEQ_NO((short)2, "mortgageSeqNo");

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
        case 2: // MORTGAGE_SEQ_NO
          return MORTGAGE_SEQ_NO;
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
    tmpMap.put(_Fields.BROKER_ID, new org.apache.thrift.meta_data.FieldMetaData("brokerID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcBrokerIDType")));
    tmpMap.put(_Fields.MORTGAGE_SEQ_NO, new org.apache.thrift.meta_data.FieldMetaData("mortgageSeqNo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcDepositSeqNoType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcQrySyncFundMortgageField.class, metaDataMap);
  }

  public CThostFtdcQrySyncFundMortgageField() {
  }

  public CThostFtdcQrySyncFundMortgageField(
    String brokerID,
    String mortgageSeqNo)
  {
    this();
    this.brokerID = brokerID;
    this.mortgageSeqNo = mortgageSeqNo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcQrySyncFundMortgageField(CThostFtdcQrySyncFundMortgageField other) {
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetMortgageSeqNo()) {
      this.mortgageSeqNo = other.mortgageSeqNo;
    }
  }

  public CThostFtdcQrySyncFundMortgageField deepCopy() {
    return new CThostFtdcQrySyncFundMortgageField(this);
  }

  @Override
  public void clear() {
    this.brokerID = null;
    this.mortgageSeqNo = null;
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcQrySyncFundMortgageField setBrokerID(String brokerID) {
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

  public String getMortgageSeqNo() {
    return this.mortgageSeqNo;
  }

  public CThostFtdcQrySyncFundMortgageField setMortgageSeqNo(String mortgageSeqNo) {
    this.mortgageSeqNo = mortgageSeqNo;
    return this;
  }

  public void unsetMortgageSeqNo() {
    this.mortgageSeqNo = null;
  }

  /** Returns true if field mortgageSeqNo is set (has been assigned a value) and false otherwise */
  public boolean isSetMortgageSeqNo() {
    return this.mortgageSeqNo != null;
  }

  public void setMortgageSeqNoIsSet(boolean value) {
    if (!value) {
      this.mortgageSeqNo = null;
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

    case MORTGAGE_SEQ_NO:
      if (value == null) {
        unsetMortgageSeqNo();
      } else {
        setMortgageSeqNo((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BROKER_ID:
      return getBrokerID();

    case MORTGAGE_SEQ_NO:
      return getMortgageSeqNo();

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
    case MORTGAGE_SEQ_NO:
      return isSetMortgageSeqNo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcQrySyncFundMortgageField)
      return this.equals((CThostFtdcQrySyncFundMortgageField)that);
    return false;
  }

  public boolean equals(CThostFtdcQrySyncFundMortgageField that) {
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

    boolean this_present_mortgageSeqNo = true && this.isSetMortgageSeqNo();
    boolean that_present_mortgageSeqNo = true && that.isSetMortgageSeqNo();
    if (this_present_mortgageSeqNo || that_present_mortgageSeqNo) {
      if (!(this_present_mortgageSeqNo && that_present_mortgageSeqNo))
        return false;
      if (!this.mortgageSeqNo.equals(that.mortgageSeqNo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcQrySyncFundMortgageField other) {
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
    lastComparison = Boolean.valueOf(isSetMortgageSeqNo()).compareTo(other.isSetMortgageSeqNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMortgageSeqNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mortgageSeqNo, other.mortgageSeqNo);
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
    StringBuilder sb = new StringBuilder("CThostFtdcQrySyncFundMortgageField(");
    boolean first = true;

    sb.append("brokerID:");
    if (this.brokerID == null) {
      sb.append("null");
    } else {
      sb.append(this.brokerID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mortgageSeqNo:");
    if (this.mortgageSeqNo == null) {
      sb.append("null");
    } else {
      sb.append(this.mortgageSeqNo);
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

  private static class CThostFtdcQrySyncFundMortgageFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcQrySyncFundMortgageFieldStandardScheme getScheme() {
      return new CThostFtdcQrySyncFundMortgageFieldStandardScheme();
    }
  }

  private static class CThostFtdcQrySyncFundMortgageFieldStandardScheme extends StandardScheme<CThostFtdcQrySyncFundMortgageField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcQrySyncFundMortgageField struct) throws org.apache.thrift.TException {
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
          case 2: // MORTGAGE_SEQ_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mortgageSeqNo = iprot.readString();
              struct.setMortgageSeqNoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcQrySyncFundMortgageField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.brokerID != null) {
        oprot.writeFieldBegin(BROKER_ID_FIELD_DESC);
        oprot.writeString(struct.brokerID);
        oprot.writeFieldEnd();
      }
      if (struct.mortgageSeqNo != null) {
        oprot.writeFieldBegin(MORTGAGE_SEQ_NO_FIELD_DESC);
        oprot.writeString(struct.mortgageSeqNo);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcQrySyncFundMortgageFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcQrySyncFundMortgageFieldTupleScheme getScheme() {
      return new CThostFtdcQrySyncFundMortgageFieldTupleScheme();
    }
  }

  private static class CThostFtdcQrySyncFundMortgageFieldTupleScheme extends TupleScheme<CThostFtdcQrySyncFundMortgageField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcQrySyncFundMortgageField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBrokerID()) {
        optionals.set(0);
      }
      if (struct.isSetMortgageSeqNo()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetMortgageSeqNo()) {
        oprot.writeString(struct.mortgageSeqNo);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcQrySyncFundMortgageField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.mortgageSeqNo = iprot.readString();
        struct.setMortgageSeqNoIsSet(true);
      }
    }
  }

}

