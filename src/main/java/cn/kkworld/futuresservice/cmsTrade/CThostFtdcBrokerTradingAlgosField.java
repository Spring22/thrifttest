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

public class CThostFtdcBrokerTradingAlgosField implements org.apache.thrift.TBase<CThostFtdcBrokerTradingAlgosField, CThostFtdcBrokerTradingAlgosField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcBrokerTradingAlgosField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcBrokerTradingAlgosField");

  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EXCHANGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("exchangeID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField INSTRUMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("instrumentID", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField HANDLE_POSITION_ALGO_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("handlePositionAlgoID", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField FIND_MARGIN_RATE_ALGO_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("findMarginRateAlgoID", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField HANDLE_TRADING_ACCOUNT_ALGO_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("handleTradingAccountAlgoID", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcBrokerTradingAlgosFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcBrokerTradingAlgosFieldTupleSchemeFactory());
  }

  public String brokerID; // required
  public String exchangeID; // required
  public String instrumentID; // required
  public String handlePositionAlgoID; // required
  public String findMarginRateAlgoID; // required
  public String handleTradingAccountAlgoID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BROKER_ID((short)1, "brokerID"),
    EXCHANGE_ID((short)2, "exchangeID"),
    INSTRUMENT_ID((short)3, "instrumentID"),
    HANDLE_POSITION_ALGO_ID((short)4, "handlePositionAlgoID"),
    FIND_MARGIN_RATE_ALGO_ID((short)5, "findMarginRateAlgoID"),
    HANDLE_TRADING_ACCOUNT_ALGO_ID((short)6, "handleTradingAccountAlgoID");

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
        case 2: // EXCHANGE_ID
          return EXCHANGE_ID;
        case 3: // INSTRUMENT_ID
          return INSTRUMENT_ID;
        case 4: // HANDLE_POSITION_ALGO_ID
          return HANDLE_POSITION_ALGO_ID;
        case 5: // FIND_MARGIN_RATE_ALGO_ID
          return FIND_MARGIN_RATE_ALGO_ID;
        case 6: // HANDLE_TRADING_ACCOUNT_ALGO_ID
          return HANDLE_TRADING_ACCOUNT_ALGO_ID;
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
    tmpMap.put(_Fields.EXCHANGE_ID, new org.apache.thrift.meta_data.FieldMetaData("exchangeID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcExchangeIDType")));
    tmpMap.put(_Fields.INSTRUMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("instrumentID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInstrumentIDType")));
    tmpMap.put(_Fields.HANDLE_POSITION_ALGO_ID, new org.apache.thrift.meta_data.FieldMetaData("handlePositionAlgoID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcHandlePositionAlgoIDType")));
    tmpMap.put(_Fields.FIND_MARGIN_RATE_ALGO_ID, new org.apache.thrift.meta_data.FieldMetaData("findMarginRateAlgoID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcFindMarginRateAlgoIDType")));
    tmpMap.put(_Fields.HANDLE_TRADING_ACCOUNT_ALGO_ID, new org.apache.thrift.meta_data.FieldMetaData("handleTradingAccountAlgoID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcHandleTradingAccountAlgoIDType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcBrokerTradingAlgosField.class, metaDataMap);
  }

  public CThostFtdcBrokerTradingAlgosField() {
  }

  public CThostFtdcBrokerTradingAlgosField(
    String brokerID,
    String exchangeID,
    String instrumentID,
    String handlePositionAlgoID,
    String findMarginRateAlgoID,
    String handleTradingAccountAlgoID)
  {
    this();
    this.brokerID = brokerID;
    this.exchangeID = exchangeID;
    this.instrumentID = instrumentID;
    this.handlePositionAlgoID = handlePositionAlgoID;
    this.findMarginRateAlgoID = findMarginRateAlgoID;
    this.handleTradingAccountAlgoID = handleTradingAccountAlgoID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcBrokerTradingAlgosField(CThostFtdcBrokerTradingAlgosField other) {
    if (other.isSetBrokerID()) {
      this.brokerID = other.brokerID;
    }
    if (other.isSetExchangeID()) {
      this.exchangeID = other.exchangeID;
    }
    if (other.isSetInstrumentID()) {
      this.instrumentID = other.instrumentID;
    }
    if (other.isSetHandlePositionAlgoID()) {
      this.handlePositionAlgoID = other.handlePositionAlgoID;
    }
    if (other.isSetFindMarginRateAlgoID()) {
      this.findMarginRateAlgoID = other.findMarginRateAlgoID;
    }
    if (other.isSetHandleTradingAccountAlgoID()) {
      this.handleTradingAccountAlgoID = other.handleTradingAccountAlgoID;
    }
  }

  public CThostFtdcBrokerTradingAlgosField deepCopy() {
    return new CThostFtdcBrokerTradingAlgosField(this);
  }

  @Override
  public void clear() {
    this.brokerID = null;
    this.exchangeID = null;
    this.instrumentID = null;
    this.handlePositionAlgoID = null;
    this.findMarginRateAlgoID = null;
    this.handleTradingAccountAlgoID = null;
  }

  public String getBrokerID() {
    return this.brokerID;
  }

  public CThostFtdcBrokerTradingAlgosField setBrokerID(String brokerID) {
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

  public String getExchangeID() {
    return this.exchangeID;
  }

  public CThostFtdcBrokerTradingAlgosField setExchangeID(String exchangeID) {
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

  public String getInstrumentID() {
    return this.instrumentID;
  }

  public CThostFtdcBrokerTradingAlgosField setInstrumentID(String instrumentID) {
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

  public String getHandlePositionAlgoID() {
    return this.handlePositionAlgoID;
  }

  public CThostFtdcBrokerTradingAlgosField setHandlePositionAlgoID(String handlePositionAlgoID) {
    this.handlePositionAlgoID = handlePositionAlgoID;
    return this;
  }

  public void unsetHandlePositionAlgoID() {
    this.handlePositionAlgoID = null;
  }

  /** Returns true if field handlePositionAlgoID is set (has been assigned a value) and false otherwise */
  public boolean isSetHandlePositionAlgoID() {
    return this.handlePositionAlgoID != null;
  }

  public void setHandlePositionAlgoIDIsSet(boolean value) {
    if (!value) {
      this.handlePositionAlgoID = null;
    }
  }

  public String getFindMarginRateAlgoID() {
    return this.findMarginRateAlgoID;
  }

  public CThostFtdcBrokerTradingAlgosField setFindMarginRateAlgoID(String findMarginRateAlgoID) {
    this.findMarginRateAlgoID = findMarginRateAlgoID;
    return this;
  }

  public void unsetFindMarginRateAlgoID() {
    this.findMarginRateAlgoID = null;
  }

  /** Returns true if field findMarginRateAlgoID is set (has been assigned a value) and false otherwise */
  public boolean isSetFindMarginRateAlgoID() {
    return this.findMarginRateAlgoID != null;
  }

  public void setFindMarginRateAlgoIDIsSet(boolean value) {
    if (!value) {
      this.findMarginRateAlgoID = null;
    }
  }

  public String getHandleTradingAccountAlgoID() {
    return this.handleTradingAccountAlgoID;
  }

  public CThostFtdcBrokerTradingAlgosField setHandleTradingAccountAlgoID(String handleTradingAccountAlgoID) {
    this.handleTradingAccountAlgoID = handleTradingAccountAlgoID;
    return this;
  }

  public void unsetHandleTradingAccountAlgoID() {
    this.handleTradingAccountAlgoID = null;
  }

  /** Returns true if field handleTradingAccountAlgoID is set (has been assigned a value) and false otherwise */
  public boolean isSetHandleTradingAccountAlgoID() {
    return this.handleTradingAccountAlgoID != null;
  }

  public void setHandleTradingAccountAlgoIDIsSet(boolean value) {
    if (!value) {
      this.handleTradingAccountAlgoID = null;
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

    case EXCHANGE_ID:
      if (value == null) {
        unsetExchangeID();
      } else {
        setExchangeID((String)value);
      }
      break;

    case INSTRUMENT_ID:
      if (value == null) {
        unsetInstrumentID();
      } else {
        setInstrumentID((String)value);
      }
      break;

    case HANDLE_POSITION_ALGO_ID:
      if (value == null) {
        unsetHandlePositionAlgoID();
      } else {
        setHandlePositionAlgoID((String)value);
      }
      break;

    case FIND_MARGIN_RATE_ALGO_ID:
      if (value == null) {
        unsetFindMarginRateAlgoID();
      } else {
        setFindMarginRateAlgoID((String)value);
      }
      break;

    case HANDLE_TRADING_ACCOUNT_ALGO_ID:
      if (value == null) {
        unsetHandleTradingAccountAlgoID();
      } else {
        setHandleTradingAccountAlgoID((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BROKER_ID:
      return getBrokerID();

    case EXCHANGE_ID:
      return getExchangeID();

    case INSTRUMENT_ID:
      return getInstrumentID();

    case HANDLE_POSITION_ALGO_ID:
      return getHandlePositionAlgoID();

    case FIND_MARGIN_RATE_ALGO_ID:
      return getFindMarginRateAlgoID();

    case HANDLE_TRADING_ACCOUNT_ALGO_ID:
      return getHandleTradingAccountAlgoID();

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
    case EXCHANGE_ID:
      return isSetExchangeID();
    case INSTRUMENT_ID:
      return isSetInstrumentID();
    case HANDLE_POSITION_ALGO_ID:
      return isSetHandlePositionAlgoID();
    case FIND_MARGIN_RATE_ALGO_ID:
      return isSetFindMarginRateAlgoID();
    case HANDLE_TRADING_ACCOUNT_ALGO_ID:
      return isSetHandleTradingAccountAlgoID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcBrokerTradingAlgosField)
      return this.equals((CThostFtdcBrokerTradingAlgosField)that);
    return false;
  }

  public boolean equals(CThostFtdcBrokerTradingAlgosField that) {
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

    boolean this_present_exchangeID = true && this.isSetExchangeID();
    boolean that_present_exchangeID = true && that.isSetExchangeID();
    if (this_present_exchangeID || that_present_exchangeID) {
      if (!(this_present_exchangeID && that_present_exchangeID))
        return false;
      if (!this.exchangeID.equals(that.exchangeID))
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

    boolean this_present_handlePositionAlgoID = true && this.isSetHandlePositionAlgoID();
    boolean that_present_handlePositionAlgoID = true && that.isSetHandlePositionAlgoID();
    if (this_present_handlePositionAlgoID || that_present_handlePositionAlgoID) {
      if (!(this_present_handlePositionAlgoID && that_present_handlePositionAlgoID))
        return false;
      if (!this.handlePositionAlgoID.equals(that.handlePositionAlgoID))
        return false;
    }

    boolean this_present_findMarginRateAlgoID = true && this.isSetFindMarginRateAlgoID();
    boolean that_present_findMarginRateAlgoID = true && that.isSetFindMarginRateAlgoID();
    if (this_present_findMarginRateAlgoID || that_present_findMarginRateAlgoID) {
      if (!(this_present_findMarginRateAlgoID && that_present_findMarginRateAlgoID))
        return false;
      if (!this.findMarginRateAlgoID.equals(that.findMarginRateAlgoID))
        return false;
    }

    boolean this_present_handleTradingAccountAlgoID = true && this.isSetHandleTradingAccountAlgoID();
    boolean that_present_handleTradingAccountAlgoID = true && that.isSetHandleTradingAccountAlgoID();
    if (this_present_handleTradingAccountAlgoID || that_present_handleTradingAccountAlgoID) {
      if (!(this_present_handleTradingAccountAlgoID && that_present_handleTradingAccountAlgoID))
        return false;
      if (!this.handleTradingAccountAlgoID.equals(that.handleTradingAccountAlgoID))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcBrokerTradingAlgosField other) {
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
    lastComparison = Boolean.valueOf(isSetHandlePositionAlgoID()).compareTo(other.isSetHandlePositionAlgoID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHandlePositionAlgoID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.handlePositionAlgoID, other.handlePositionAlgoID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFindMarginRateAlgoID()).compareTo(other.isSetFindMarginRateAlgoID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFindMarginRateAlgoID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.findMarginRateAlgoID, other.findMarginRateAlgoID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHandleTradingAccountAlgoID()).compareTo(other.isSetHandleTradingAccountAlgoID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHandleTradingAccountAlgoID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.handleTradingAccountAlgoID, other.handleTradingAccountAlgoID);
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
    StringBuilder sb = new StringBuilder("CThostFtdcBrokerTradingAlgosField(");
    boolean first = true;

    sb.append("brokerID:");
    if (this.brokerID == null) {
      sb.append("null");
    } else {
      sb.append(this.brokerID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("exchangeID:");
    if (this.exchangeID == null) {
      sb.append("null");
    } else {
      sb.append(this.exchangeID);
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
    sb.append("handlePositionAlgoID:");
    if (this.handlePositionAlgoID == null) {
      sb.append("null");
    } else {
      sb.append(this.handlePositionAlgoID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("findMarginRateAlgoID:");
    if (this.findMarginRateAlgoID == null) {
      sb.append("null");
    } else {
      sb.append(this.findMarginRateAlgoID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("handleTradingAccountAlgoID:");
    if (this.handleTradingAccountAlgoID == null) {
      sb.append("null");
    } else {
      sb.append(this.handleTradingAccountAlgoID);
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

  private static class CThostFtdcBrokerTradingAlgosFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcBrokerTradingAlgosFieldStandardScheme getScheme() {
      return new CThostFtdcBrokerTradingAlgosFieldStandardScheme();
    }
  }

  private static class CThostFtdcBrokerTradingAlgosFieldStandardScheme extends StandardScheme<CThostFtdcBrokerTradingAlgosField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcBrokerTradingAlgosField struct) throws org.apache.thrift.TException {
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
          case 2: // EXCHANGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exchangeID = iprot.readString();
              struct.setExchangeIDIsSet(true);
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
          case 4: // HANDLE_POSITION_ALGO_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.handlePositionAlgoID = iprot.readString();
              struct.setHandlePositionAlgoIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FIND_MARGIN_RATE_ALGO_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.findMarginRateAlgoID = iprot.readString();
              struct.setFindMarginRateAlgoIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // HANDLE_TRADING_ACCOUNT_ALGO_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.handleTradingAccountAlgoID = iprot.readString();
              struct.setHandleTradingAccountAlgoIDIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcBrokerTradingAlgosField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.brokerID != null) {
        oprot.writeFieldBegin(BROKER_ID_FIELD_DESC);
        oprot.writeString(struct.brokerID);
        oprot.writeFieldEnd();
      }
      if (struct.exchangeID != null) {
        oprot.writeFieldBegin(EXCHANGE_ID_FIELD_DESC);
        oprot.writeString(struct.exchangeID);
        oprot.writeFieldEnd();
      }
      if (struct.instrumentID != null) {
        oprot.writeFieldBegin(INSTRUMENT_ID_FIELD_DESC);
        oprot.writeString(struct.instrumentID);
        oprot.writeFieldEnd();
      }
      if (struct.handlePositionAlgoID != null) {
        oprot.writeFieldBegin(HANDLE_POSITION_ALGO_ID_FIELD_DESC);
        oprot.writeString(struct.handlePositionAlgoID);
        oprot.writeFieldEnd();
      }
      if (struct.findMarginRateAlgoID != null) {
        oprot.writeFieldBegin(FIND_MARGIN_RATE_ALGO_ID_FIELD_DESC);
        oprot.writeString(struct.findMarginRateAlgoID);
        oprot.writeFieldEnd();
      }
      if (struct.handleTradingAccountAlgoID != null) {
        oprot.writeFieldBegin(HANDLE_TRADING_ACCOUNT_ALGO_ID_FIELD_DESC);
        oprot.writeString(struct.handleTradingAccountAlgoID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcBrokerTradingAlgosFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcBrokerTradingAlgosFieldTupleScheme getScheme() {
      return new CThostFtdcBrokerTradingAlgosFieldTupleScheme();
    }
  }

  private static class CThostFtdcBrokerTradingAlgosFieldTupleScheme extends TupleScheme<CThostFtdcBrokerTradingAlgosField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcBrokerTradingAlgosField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBrokerID()) {
        optionals.set(0);
      }
      if (struct.isSetExchangeID()) {
        optionals.set(1);
      }
      if (struct.isSetInstrumentID()) {
        optionals.set(2);
      }
      if (struct.isSetHandlePositionAlgoID()) {
        optionals.set(3);
      }
      if (struct.isSetFindMarginRateAlgoID()) {
        optionals.set(4);
      }
      if (struct.isSetHandleTradingAccountAlgoID()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetBrokerID()) {
        oprot.writeString(struct.brokerID);
      }
      if (struct.isSetExchangeID()) {
        oprot.writeString(struct.exchangeID);
      }
      if (struct.isSetInstrumentID()) {
        oprot.writeString(struct.instrumentID);
      }
      if (struct.isSetHandlePositionAlgoID()) {
        oprot.writeString(struct.handlePositionAlgoID);
      }
      if (struct.isSetFindMarginRateAlgoID()) {
        oprot.writeString(struct.findMarginRateAlgoID);
      }
      if (struct.isSetHandleTradingAccountAlgoID()) {
        oprot.writeString(struct.handleTradingAccountAlgoID);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcBrokerTradingAlgosField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.brokerID = iprot.readString();
        struct.setBrokerIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.exchangeID = iprot.readString();
        struct.setExchangeIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.instrumentID = iprot.readString();
        struct.setInstrumentIDIsSet(true);
      }
      if (incoming.get(3)) {
        struct.handlePositionAlgoID = iprot.readString();
        struct.setHandlePositionAlgoIDIsSet(true);
      }
      if (incoming.get(4)) {
        struct.findMarginRateAlgoID = iprot.readString();
        struct.setFindMarginRateAlgoIDIsSet(true);
      }
      if (incoming.get(5)) {
        struct.handleTradingAccountAlgoID = iprot.readString();
        struct.setHandleTradingAccountAlgoIDIsSet(true);
      }
    }
  }

}

