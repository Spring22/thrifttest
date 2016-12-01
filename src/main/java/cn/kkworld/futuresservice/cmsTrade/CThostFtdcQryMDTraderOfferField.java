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

public class CThostFtdcQryMDTraderOfferField implements org.apache.thrift.TBase<CThostFtdcQryMDTraderOfferField, CThostFtdcQryMDTraderOfferField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcQryMDTraderOfferField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcQryMDTraderOfferField");

  private static final org.apache.thrift.protocol.TField EXCHANGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("exchangeID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARTICIPANT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("participantID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TRADER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("traderID", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcQryMDTraderOfferFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcQryMDTraderOfferFieldTupleSchemeFactory());
  }

  public String exchangeID; // required
  public String participantID; // required
  public String traderID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXCHANGE_ID((short)1, "exchangeID"),
    PARTICIPANT_ID((short)2, "participantID"),
    TRADER_ID((short)3, "traderID");

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
        case 2: // PARTICIPANT_ID
          return PARTICIPANT_ID;
        case 3: // TRADER_ID
          return TRADER_ID;
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
    tmpMap.put(_Fields.PARTICIPANT_ID, new org.apache.thrift.meta_data.FieldMetaData("participantID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcParticipantIDType")));
    tmpMap.put(_Fields.TRADER_ID, new org.apache.thrift.meta_data.FieldMetaData("traderID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcTraderIDType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcQryMDTraderOfferField.class, metaDataMap);
  }

  public CThostFtdcQryMDTraderOfferField() {
  }

  public CThostFtdcQryMDTraderOfferField(
    String exchangeID,
    String participantID,
    String traderID)
  {
    this();
    this.exchangeID = exchangeID;
    this.participantID = participantID;
    this.traderID = traderID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcQryMDTraderOfferField(CThostFtdcQryMDTraderOfferField other) {
    if (other.isSetExchangeID()) {
      this.exchangeID = other.exchangeID;
    }
    if (other.isSetParticipantID()) {
      this.participantID = other.participantID;
    }
    if (other.isSetTraderID()) {
      this.traderID = other.traderID;
    }
  }

  public CThostFtdcQryMDTraderOfferField deepCopy() {
    return new CThostFtdcQryMDTraderOfferField(this);
  }

  @Override
  public void clear() {
    this.exchangeID = null;
    this.participantID = null;
    this.traderID = null;
  }

  public String getExchangeID() {
    return this.exchangeID;
  }

  public CThostFtdcQryMDTraderOfferField setExchangeID(String exchangeID) {
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

  public String getParticipantID() {
    return this.participantID;
  }

  public CThostFtdcQryMDTraderOfferField setParticipantID(String participantID) {
    this.participantID = participantID;
    return this;
  }

  public void unsetParticipantID() {
    this.participantID = null;
  }

  /** Returns true if field participantID is set (has been assigned a value) and false otherwise */
  public boolean isSetParticipantID() {
    return this.participantID != null;
  }

  public void setParticipantIDIsSet(boolean value) {
    if (!value) {
      this.participantID = null;
    }
  }

  public String getTraderID() {
    return this.traderID;
  }

  public CThostFtdcQryMDTraderOfferField setTraderID(String traderID) {
    this.traderID = traderID;
    return this;
  }

  public void unsetTraderID() {
    this.traderID = null;
  }

  /** Returns true if field traderID is set (has been assigned a value) and false otherwise */
  public boolean isSetTraderID() {
    return this.traderID != null;
  }

  public void setTraderIDIsSet(boolean value) {
    if (!value) {
      this.traderID = null;
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

    case PARTICIPANT_ID:
      if (value == null) {
        unsetParticipantID();
      } else {
        setParticipantID((String)value);
      }
      break;

    case TRADER_ID:
      if (value == null) {
        unsetTraderID();
      } else {
        setTraderID((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXCHANGE_ID:
      return getExchangeID();

    case PARTICIPANT_ID:
      return getParticipantID();

    case TRADER_ID:
      return getTraderID();

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
    case PARTICIPANT_ID:
      return isSetParticipantID();
    case TRADER_ID:
      return isSetTraderID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcQryMDTraderOfferField)
      return this.equals((CThostFtdcQryMDTraderOfferField)that);
    return false;
  }

  public boolean equals(CThostFtdcQryMDTraderOfferField that) {
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

    boolean this_present_participantID = true && this.isSetParticipantID();
    boolean that_present_participantID = true && that.isSetParticipantID();
    if (this_present_participantID || that_present_participantID) {
      if (!(this_present_participantID && that_present_participantID))
        return false;
      if (!this.participantID.equals(that.participantID))
        return false;
    }

    boolean this_present_traderID = true && this.isSetTraderID();
    boolean that_present_traderID = true && that.isSetTraderID();
    if (this_present_traderID || that_present_traderID) {
      if (!(this_present_traderID && that_present_traderID))
        return false;
      if (!this.traderID.equals(that.traderID))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcQryMDTraderOfferField other) {
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
    lastComparison = Boolean.valueOf(isSetParticipantID()).compareTo(other.isSetParticipantID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParticipantID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.participantID, other.participantID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTraderID()).compareTo(other.isSetTraderID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTraderID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.traderID, other.traderID);
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
    StringBuilder sb = new StringBuilder("CThostFtdcQryMDTraderOfferField(");
    boolean first = true;

    sb.append("exchangeID:");
    if (this.exchangeID == null) {
      sb.append("null");
    } else {
      sb.append(this.exchangeID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("participantID:");
    if (this.participantID == null) {
      sb.append("null");
    } else {
      sb.append(this.participantID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("traderID:");
    if (this.traderID == null) {
      sb.append("null");
    } else {
      sb.append(this.traderID);
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

  private static class CThostFtdcQryMDTraderOfferFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcQryMDTraderOfferFieldStandardScheme getScheme() {
      return new CThostFtdcQryMDTraderOfferFieldStandardScheme();
    }
  }

  private static class CThostFtdcQryMDTraderOfferFieldStandardScheme extends StandardScheme<CThostFtdcQryMDTraderOfferField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcQryMDTraderOfferField struct) throws org.apache.thrift.TException {
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
          case 2: // PARTICIPANT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.participantID = iprot.readString();
              struct.setParticipantIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TRADER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.traderID = iprot.readString();
              struct.setTraderIDIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcQryMDTraderOfferField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.exchangeID != null) {
        oprot.writeFieldBegin(EXCHANGE_ID_FIELD_DESC);
        oprot.writeString(struct.exchangeID);
        oprot.writeFieldEnd();
      }
      if (struct.participantID != null) {
        oprot.writeFieldBegin(PARTICIPANT_ID_FIELD_DESC);
        oprot.writeString(struct.participantID);
        oprot.writeFieldEnd();
      }
      if (struct.traderID != null) {
        oprot.writeFieldBegin(TRADER_ID_FIELD_DESC);
        oprot.writeString(struct.traderID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcQryMDTraderOfferFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcQryMDTraderOfferFieldTupleScheme getScheme() {
      return new CThostFtdcQryMDTraderOfferFieldTupleScheme();
    }
  }

  private static class CThostFtdcQryMDTraderOfferFieldTupleScheme extends TupleScheme<CThostFtdcQryMDTraderOfferField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcQryMDTraderOfferField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExchangeID()) {
        optionals.set(0);
      }
      if (struct.isSetParticipantID()) {
        optionals.set(1);
      }
      if (struct.isSetTraderID()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetExchangeID()) {
        oprot.writeString(struct.exchangeID);
      }
      if (struct.isSetParticipantID()) {
        oprot.writeString(struct.participantID);
      }
      if (struct.isSetTraderID()) {
        oprot.writeString(struct.traderID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcQryMDTraderOfferField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.exchangeID = iprot.readString();
        struct.setExchangeIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.participantID = iprot.readString();
        struct.setParticipantIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.traderID = iprot.readString();
        struct.setTraderIDIsSet(true);
      }
    }
  }

}
