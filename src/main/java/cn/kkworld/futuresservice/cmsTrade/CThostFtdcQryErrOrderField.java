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

public class CThostFtdcQryErrOrderField implements org.apache.thrift.TBase<CThostFtdcQryErrOrderField, CThostFtdcQryErrOrderField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcQryErrOrderField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcQryErrOrderField");

  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INVESTOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("investorID", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcQryErrOrderFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcQryErrOrderFieldTupleSchemeFactory());
  }

  public String brokerID; // required
  public String investorID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BROKER_ID((short)1, "brokerID"),
    INVESTOR_ID((short)2, "investorID");

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
        case 2: // INVESTOR_ID
          return INVESTOR_ID;
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
    tmpMap.put(_Fields.INVESTOR_ID, new org.apache.thrift.meta_data.FieldMetaData("investorID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInvestorIDType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcQryErrOrderField.class, metaDataMap);
  }

  public CThostFtdcQryErrOrderField() {
  }

  public CThostFtdcQryErrOrderField(
    String brokerID,
    String investorID)
  {
    this();
    this.brokerID = brokerID;
    this.investorID = investorID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcQryErrOrderField(CThostFtdcQryErrOrderField other) {
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetInvestorID()) {
      this.investorID = other.investorID;
    }
  }

  public CThostFtdcQryErrOrderField deepCopy() {
    return new CThostFtdcQryErrOrderField(this);
  }

  @Override
  public void clear() {
    this.brokerID = null;
    this.investorID = null;
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcQryErrOrderField setBrokerID(String brokerID) {
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

  public String getInvestorID() {
    return this.investorID;
  }

  public CThostFtdcQryErrOrderField setInvestorID(String investorID) {
    this.investorID = investorID;
    return this;
  }

  public void unsetInvestorID() {
    this.investorID = null;
  }

  /** Returns true if field investorID is set (has been assigned a value) and false otherwise */
  public boolean isSetInvestorID() {
    return this.investorID != null;
  }

  public void setInvestorIDIsSet(boolean value) {
    if (!value) {
      this.investorID = null;
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

    case INVESTOR_ID:
      if (value == null) {
        unsetInvestorID();
      } else {
        setInvestorID((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BROKER_ID:
      return getBrokerID();

    case INVESTOR_ID:
      return getInvestorID();

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
    case INVESTOR_ID:
      return isSetInvestorID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcQryErrOrderField)
      return this.equals((CThostFtdcQryErrOrderField)that);
    return false;
  }

  public boolean equals(CThostFtdcQryErrOrderField that) {
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

    boolean this_present_investorID = true && this.isSetInvestorID();
    boolean that_present_investorID = true && that.isSetInvestorID();
    if (this_present_investorID || that_present_investorID) {
      if (!(this_present_investorID && that_present_investorID))
        return false;
      if (!this.investorID.equals(that.investorID))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcQryErrOrderField other) {
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
    lastComparison = Boolean.valueOf(isSetInvestorID()).compareTo(other.isSetInvestorID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvestorID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.investorID, other.investorID);
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
    StringBuilder sb = new StringBuilder("CThostFtdcQryErrOrderField(");
    boolean first = true;

    sb.append("brokerID:");
    if (this.brokerID == null) {
      sb.append("null");
    } else {
      sb.append(this.brokerID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("investorID:");
    if (this.investorID == null) {
      sb.append("null");
    } else {
      sb.append(this.investorID);
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

  private static class CThostFtdcQryErrOrderFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcQryErrOrderFieldStandardScheme getScheme() {
      return new CThostFtdcQryErrOrderFieldStandardScheme();
    }
  }

  private static class CThostFtdcQryErrOrderFieldStandardScheme extends StandardScheme<CThostFtdcQryErrOrderField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcQryErrOrderField struct) throws org.apache.thrift.TException {
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
          case 2: // INVESTOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.investorID = iprot.readString();
              struct.setInvestorIDIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcQryErrOrderField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.brokerID != null) {
        oprot.writeFieldBegin(BROKER_ID_FIELD_DESC);
        oprot.writeString(struct.brokerID);
        oprot.writeFieldEnd();
      }
      if (struct.investorID != null) {
        oprot.writeFieldBegin(INVESTOR_ID_FIELD_DESC);
        oprot.writeString(struct.investorID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcQryErrOrderFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcQryErrOrderFieldTupleScheme getScheme() {
      return new CThostFtdcQryErrOrderFieldTupleScheme();
    }
  }

  private static class CThostFtdcQryErrOrderFieldTupleScheme extends TupleScheme<CThostFtdcQryErrOrderField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcQryErrOrderField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBrokerID()) {
        optionals.set(0);
      }
      if (struct.isSetInvestorID()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetInvestorID()) {
        oprot.writeString(struct.investorID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcQryErrOrderField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.investorID = iprot.readString();
        struct.setInvestorIDIsSet(true);
      }
    }
  }

}

