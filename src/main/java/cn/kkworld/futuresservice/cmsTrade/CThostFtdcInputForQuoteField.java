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

public class CThostFtdcInputForQuoteField implements org.apache.thrift.TBase<CThostFtdcInputForQuoteField, CThostFtdcInputForQuoteField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcInputForQuoteField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcInputForQuoteField");

  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INVESTOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("investorID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField INSTRUMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("instrumentID", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField FOR_QUOTE_REF_FIELD_DESC = new org.apache.thrift.protocol.TField("forQuoteRef", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userID", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcInputForQuoteFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcInputForQuoteFieldTupleSchemeFactory());
  }

  public String brokerID; // required
  public String investorID; // required
  public String instrumentID; // required
  public String forQuoteRef; // required
  public String userID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BROKER_ID((short)1, "brokerID"),
    INVESTOR_ID((short)2, "investorID"),
    INSTRUMENT_ID((short)3, "instrumentID"),
    FOR_QUOTE_REF((short)4, "forQuoteRef"),
    USER_ID((short)5, "userID");

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
        case 3: // INSTRUMENT_ID
          return INSTRUMENT_ID;
        case 4: // FOR_QUOTE_REF
          return FOR_QUOTE_REF;
        case 5: // USER_ID
          return USER_ID;
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
    tmpMap.put(_Fields.INSTRUMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("instrumentID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInstrumentIDType")));
    tmpMap.put(_Fields.FOR_QUOTE_REF, new org.apache.thrift.meta_data.FieldMetaData("forQuoteRef", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcOrderRefType")));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcUserIDType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcInputForQuoteField.class, metaDataMap);
  }

  public CThostFtdcInputForQuoteField() {
  }

  public CThostFtdcInputForQuoteField(
    String brokerID,
    String investorID,
    String instrumentID,
    String forQuoteRef,
    String userID)
  {
    this();
    this.brokerID = brokerID;
    this.investorID = investorID;
    this.instrumentID = instrumentID;
    this.forQuoteRef = forQuoteRef;
    this.userID = userID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcInputForQuoteField(CThostFtdcInputForQuoteField other) {
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetInvestorID()) {
      this.investorID = other.investorID;
    }
    if (other.isSetInstrumentID()) {
      this.instrumentID = other.instrumentID;
    }
    if (other.isSetForQuoteRef()) {
      this.forQuoteRef = other.forQuoteRef;
    }
    if (other.isSetUserID()) {
      this.userID = other.userID;
    }
  }

  public CThostFtdcInputForQuoteField deepCopy() {
    return new CThostFtdcInputForQuoteField(this);
  }

  @Override
  public void clear() {
    this.brokerID = null;
    this.investorID = null;
    this.instrumentID = null;
    this.forQuoteRef = null;
    this.userID = null;
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcInputForQuoteField setBrokerID(String brokerID) {
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

  public CThostFtdcInputForQuoteField setInvestorID(String investorID) {
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

  public String getInstrumentID() {
    return this.instrumentID;
  }

  public CThostFtdcInputForQuoteField setInstrumentID(String instrumentID) {
    this.instrumentID = instrumentID;
    return this;
  }

  public void unsetInstrumentID() {
    this.instrumentID = null;
  }

  /** Returns true if field instrumentID is set (has been assigned a value) and false otherwise */
  public boolean isSetInstrumentID() {
    return this.instrumentID != null;
  }

  public void setInstrumentIDIsSet(boolean value) {
    if (!value) {
      this.instrumentID = null;
    }
  }

  public String getForQuoteRef() {
    return this.forQuoteRef;
  }

  public CThostFtdcInputForQuoteField setForQuoteRef(String forQuoteRef) {
    this.forQuoteRef = forQuoteRef;
    return this;
  }

  public void unsetForQuoteRef() {
    this.forQuoteRef = null;
  }

  /** Returns true if field forQuoteRef is set (has been assigned a value) and false otherwise */
  public boolean isSetForQuoteRef() {
    return this.forQuoteRef != null;
  }

  public void setForQuoteRefIsSet(boolean value) {
    if (!value) {
      this.forQuoteRef = null;
    }
  }

  public String getUserID() {
    return this.userID;
  }

  public CThostFtdcInputForQuoteField setUserID(String userID) {
    this.userID = userID;
    return this;
  }

  public void unsetUserID() {
    this.userID = null;
  }

  /** Returns true if field userID is set (has been assigned a value) and false otherwise */
  public boolean isSetUserID() {
    return this.userID != null;
  }

  public void setUserIDIsSet(boolean value) {
    if (!value) {
      this.userID = null;
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

    case INSTRUMENT_ID:
      if (value == null) {
        unsetInstrumentID();
      } else {
        setInstrumentID((String)value);
      }
      break;

    case FOR_QUOTE_REF:
      if (value == null) {
        unsetForQuoteRef();
      } else {
        setForQuoteRef((String)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserID();
      } else {
        setUserID((String)value);
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

    case INSTRUMENT_ID:
      return getInstrumentID();

    case FOR_QUOTE_REF:
      return getForQuoteRef();

    case USER_ID:
      return getUserID();

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
    case INSTRUMENT_ID:
      return isSetInstrumentID();
    case FOR_QUOTE_REF:
      return isSetForQuoteRef();
    case USER_ID:
      return isSetUserID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcInputForQuoteField)
      return this.equals((CThostFtdcInputForQuoteField)that);
    return false;
  }

  public boolean equals(CThostFtdcInputForQuoteField that) {
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

    boolean this_present_instrumentID = true && this.isSetInstrumentID();
    boolean that_present_instrumentID = true && that.isSetInstrumentID();
    if (this_present_instrumentID || that_present_instrumentID) {
      if (!(this_present_instrumentID && that_present_instrumentID))
        return false;
      if (!this.instrumentID.equals(that.instrumentID))
        return false;
    }

    boolean this_present_forQuoteRef = true && this.isSetForQuoteRef();
    boolean that_present_forQuoteRef = true && that.isSetForQuoteRef();
    if (this_present_forQuoteRef || that_present_forQuoteRef) {
      if (!(this_present_forQuoteRef && that_present_forQuoteRef))
        return false;
      if (!this.forQuoteRef.equals(that.forQuoteRef))
        return false;
    }

    boolean this_present_userID = true && this.isSetUserID();
    boolean that_present_userID = true && that.isSetUserID();
    if (this_present_userID || that_present_userID) {
      if (!(this_present_userID && that_present_userID))
        return false;
      if (!this.userID.equals(that.userID))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcInputForQuoteField other) {
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
    lastComparison = Boolean.valueOf(isSetInstrumentID()).compareTo(other.isSetInstrumentID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstrumentID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instrumentID, other.instrumentID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetForQuoteRef()).compareTo(other.isSetForQuoteRef());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForQuoteRef()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.forQuoteRef, other.forQuoteRef);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserID()).compareTo(other.isSetUserID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userID, other.userID);
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
    StringBuilder sb = new StringBuilder("CThostFtdcInputForQuoteField(");
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
    if (!first) sb.append(", ");
    sb.append("instrumentID:");
    if (this.instrumentID == null) {
      sb.append("null");
    } else {
      sb.append(this.instrumentID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("forQuoteRef:");
    if (this.forQuoteRef == null) {
      sb.append("null");
    } else {
      sb.append(this.forQuoteRef);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userID:");
    if (this.userID == null) {
      sb.append("null");
    } else {
      sb.append(this.userID);
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

  private static class CThostFtdcInputForQuoteFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcInputForQuoteFieldStandardScheme getScheme() {
      return new CThostFtdcInputForQuoteFieldStandardScheme();
    }
  }

  private static class CThostFtdcInputForQuoteFieldStandardScheme extends StandardScheme<CThostFtdcInputForQuoteField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcInputForQuoteField struct) throws org.apache.thrift.TException {
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
          case 3: // INSTRUMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.instrumentID = iprot.readString();
              struct.setInstrumentIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FOR_QUOTE_REF
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.forQuoteRef = iprot.readString();
              struct.setForQuoteRefIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userID = iprot.readString();
              struct.setUserIDIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcInputForQuoteField struct) throws org.apache.thrift.TException {
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
      if (struct.instrumentID != null) {
        oprot.writeFieldBegin(INSTRUMENT_ID_FIELD_DESC);
        oprot.writeString(struct.instrumentID);
        oprot.writeFieldEnd();
      }
      if (struct.forQuoteRef != null) {
        oprot.writeFieldBegin(FOR_QUOTE_REF_FIELD_DESC);
        oprot.writeString(struct.forQuoteRef);
        oprot.writeFieldEnd();
      }
      if (struct.userID != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcInputForQuoteFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcInputForQuoteFieldTupleScheme getScheme() {
      return new CThostFtdcInputForQuoteFieldTupleScheme();
    }
  }

  private static class CThostFtdcInputForQuoteFieldTupleScheme extends TupleScheme<CThostFtdcInputForQuoteField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcInputForQuoteField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBrokerID()) {
        optionals.set(0);
      }
      if (struct.isSetInvestorID()) {
        optionals.set(1);
      }
      if (struct.isSetInstrumentID()) {
        optionals.set(2);
      }
      if (struct.isSetForQuoteRef()) {
        optionals.set(3);
      }
      if (struct.isSetUserID()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetInvestorID()) {
        oprot.writeString(struct.investorID);
      }
      if (struct.isSetInstrumentID()) {
        oprot.writeString(struct.instrumentID);
      }
      if (struct.isSetForQuoteRef()) {
        oprot.writeString(struct.forQuoteRef);
      }
      if (struct.isSetUserID()) {
        oprot.writeString(struct.userID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcInputForQuoteField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.investorID = iprot.readString();
        struct.setInvestorIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.instrumentID = iprot.readString();
        struct.setInstrumentIDIsSet(true);
      }
      if (incoming.get(3)) {
        struct.forQuoteRef = iprot.readString();
        struct.setForQuoteRefIsSet(true);
      }
      if (incoming.get(4)) {
        struct.userID = iprot.readString();
        struct.setUserIDIsSet(true);
      }
    }
  }

}

