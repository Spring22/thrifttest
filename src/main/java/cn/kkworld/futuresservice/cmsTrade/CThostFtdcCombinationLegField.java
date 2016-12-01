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

public class CThostFtdcCombinationLegField implements org.apache.thrift.TBase<CThostFtdcCombinationLegField, CThostFtdcCombinationLegField._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcCombinationLegField> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcCombinationLegField");

  private static final org.apache.thrift.protocol.TField COMB_INSTRUMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("combInstrumentID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LEG_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("legID", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LEG_INSTRUMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("legInstrumentID", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DIRECTION_FIELD_DESC = new org.apache.thrift.protocol.TField("direction", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField LEG_MULTIPLE_FIELD_DESC = new org.apache.thrift.protocol.TField("legMultiple", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField IMPLY_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("implyLevel", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcCombinationLegFieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcCombinationLegFieldTupleSchemeFactory());
  }

  public String combInstrumentID; // required
  public int legID; // required
  public String legInstrumentID; // required
  public String direction; // required
  public int legMultiple; // required
  public int implyLevel; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMB_INSTRUMENT_ID((short)1, "combInstrumentID"),
    LEG_ID((short)2, "legID"),
    LEG_INSTRUMENT_ID((short)3, "legInstrumentID"),
    DIRECTION((short)4, "direction"),
    LEG_MULTIPLE((short)5, "legMultiple"),
    IMPLY_LEVEL((short)6, "implyLevel");

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
        case 1: // COMB_INSTRUMENT_ID
          return COMB_INSTRUMENT_ID;
        case 2: // LEG_ID
          return LEG_ID;
        case 3: // LEG_INSTRUMENT_ID
          return LEG_INSTRUMENT_ID;
        case 4: // DIRECTION
          return DIRECTION;
        case 5: // LEG_MULTIPLE
          return LEG_MULTIPLE;
        case 6: // IMPLY_LEVEL
          return IMPLY_LEVEL;
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
  private static final int __LEGID_ISSET_ID = 0;
  private static final int __LEGMULTIPLE_ISSET_ID = 1;
  private static final int __IMPLYLEVEL_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMB_INSTRUMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("combInstrumentID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInstrumentIDType")));
    tmpMap.put(_Fields.LEG_ID, new org.apache.thrift.meta_data.FieldMetaData("legID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcLegIDType")));
    tmpMap.put(_Fields.LEG_INSTRUMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("legInstrumentID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcInstrumentIDType")));
    tmpMap.put(_Fields.DIRECTION, new org.apache.thrift.meta_data.FieldMetaData("direction", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TThostFtdcDirectionType")));
    tmpMap.put(_Fields.LEG_MULTIPLE, new org.apache.thrift.meta_data.FieldMetaData("legMultiple", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcLegMultipleType")));
    tmpMap.put(_Fields.IMPLY_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("implyLevel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcImplyLevelType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcCombinationLegField.class, metaDataMap);
  }

  public CThostFtdcCombinationLegField() {
  }

  public CThostFtdcCombinationLegField(
    String combInstrumentID,
    int legID,
    String legInstrumentID,
    String direction,
    int legMultiple,
    int implyLevel)
  {
    this();
    this.combInstrumentID = combInstrumentID;
    this.legID = legID;
    setLegIDIsSet(true);
    this.legInstrumentID = legInstrumentID;
    this.direction = direction;
    this.legMultiple = legMultiple;
    setLegMultipleIsSet(true);
    this.implyLevel = implyLevel;
    setImplyLevelIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcCombinationLegField(CThostFtdcCombinationLegField other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCombInstrumentID()) {
      this.combInstrumentID = other.combInstrumentID;
    }
    this.legID = other.legID;
    if (other.isSetLegInstrumentID()) {
      this.legInstrumentID = other.legInstrumentID;
    }
    if (other.isSetDirection()) {
      this.direction = other.direction;
    }
    this.legMultiple = other.legMultiple;
    this.implyLevel = other.implyLevel;
  }

  public CThostFtdcCombinationLegField deepCopy() {
    return new CThostFtdcCombinationLegField(this);
  }

  @Override
  public void clear() {
    this.combInstrumentID = null;
    setLegIDIsSet(false);
    this.legID = 0;
    this.legInstrumentID = null;
    this.direction = null;
    setLegMultipleIsSet(false);
    this.legMultiple = 0;
    setImplyLevelIsSet(false);
    this.implyLevel = 0;
  }

  public String getCombInstrumentID() {
    return this.combInstrumentID;
  }

  public CThostFtdcCombinationLegField setCombInstrumentID(String combInstrumentID) {
    this.combInstrumentID = combInstrumentID;
    return this;
  }

  public void unsetCombInstrumentID() {
    this.combInstrumentID = null;
  }

  /** Returns true if field combInstrumentID is set (has been assigned a value) and false otherwise */
  public boolean isSetCombInstrumentID() {
    return this.combInstrumentID != null;
  }

  public void setCombInstrumentIDIsSet(boolean value) {
    if (!value) {
      this.combInstrumentID = null;
    }
  }

  public int getLegID() {
    return this.legID;
  }

  public CThostFtdcCombinationLegField setLegID(int legID) {
    this.legID = legID;
    setLegIDIsSet(true);
    return this;
  }

  public void unsetLegID() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LEGID_ISSET_ID);
  }

  /** Returns true if field legID is set (has been assigned a value) and false otherwise */
  public boolean isSetLegID() {
    return EncodingUtils.testBit(__isset_bitfield, __LEGID_ISSET_ID);
  }

  public void setLegIDIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LEGID_ISSET_ID, value);
  }

  public String getLegInstrumentID() {
    return this.legInstrumentID;
  }

  public CThostFtdcCombinationLegField setLegInstrumentID(String legInstrumentID) {
    this.legInstrumentID = legInstrumentID;
    return this;
  }

  public void unsetLegInstrumentID() {
    this.legInstrumentID = null;
  }

  /** Returns true if field legInstrumentID is set (has been assigned a value) and false otherwise */
  public boolean isSetLegInstrumentID() {
    return this.legInstrumentID != null;
  }

  public void setLegInstrumentIDIsSet(boolean value) {
    if (!value) {
      this.legInstrumentID = null;
    }
  }

  public String getDirection() {
    return this.direction;
  }

  public CThostFtdcCombinationLegField setDirection(String direction) {
    this.direction = direction;
    return this;
  }

  public void unsetDirection() {
    this.direction = null;
  }

  /** Returns true if field direction is set (has been assigned a value) and false otherwise */
  public boolean isSetDirection() {
    return this.direction != null;
  }

  public void setDirectionIsSet(boolean value) {
    if (!value) {
      this.direction = null;
    }
  }

  public int getLegMultiple() {
    return this.legMultiple;
  }

  public CThostFtdcCombinationLegField setLegMultiple(int legMultiple) {
    this.legMultiple = legMultiple;
    setLegMultipleIsSet(true);
    return this;
  }

  public void unsetLegMultiple() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LEGMULTIPLE_ISSET_ID);
  }

  /** Returns true if field legMultiple is set (has been assigned a value) and false otherwise */
  public boolean isSetLegMultiple() {
    return EncodingUtils.testBit(__isset_bitfield, __LEGMULTIPLE_ISSET_ID);
  }

  public void setLegMultipleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LEGMULTIPLE_ISSET_ID, value);
  }

  public int getImplyLevel() {
    return this.implyLevel;
  }

  public CThostFtdcCombinationLegField setImplyLevel(int implyLevel) {
    this.implyLevel = implyLevel;
    setImplyLevelIsSet(true);
    return this;
  }

  public void unsetImplyLevel() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IMPLYLEVEL_ISSET_ID);
  }

  /** Returns true if field implyLevel is set (has been assigned a value) and false otherwise */
  public boolean isSetImplyLevel() {
    return EncodingUtils.testBit(__isset_bitfield, __IMPLYLEVEL_ISSET_ID);
  }

  public void setImplyLevelIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IMPLYLEVEL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMB_INSTRUMENT_ID:
      if (value == null) {
        unsetCombInstrumentID();
      } else {
        setCombInstrumentID((String)value);
      }
      break;

    case LEG_ID:
      if (value == null) {
        unsetLegID();
      } else {
        setLegID((Integer)value);
      }
      break;

    case LEG_INSTRUMENT_ID:
      if (value == null) {
        unsetLegInstrumentID();
      } else {
        setLegInstrumentID((String)value);
      }
      break;

    case DIRECTION:
      if (value == null) {
        unsetDirection();
      } else {
        setDirection((String)value);
      }
      break;

    case LEG_MULTIPLE:
      if (value == null) {
        unsetLegMultiple();
      } else {
        setLegMultiple((Integer)value);
      }
      break;

    case IMPLY_LEVEL:
      if (value == null) {
        unsetImplyLevel();
      } else {
        setImplyLevel((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMB_INSTRUMENT_ID:
      return getCombInstrumentID();

    case LEG_ID:
      return Integer.valueOf(getLegID());

    case LEG_INSTRUMENT_ID:
      return getLegInstrumentID();

    case DIRECTION:
      return getDirection();

    case LEG_MULTIPLE:
      return Integer.valueOf(getLegMultiple());

    case IMPLY_LEVEL:
      return Integer.valueOf(getImplyLevel());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMB_INSTRUMENT_ID:
      return isSetCombInstrumentID();
    case LEG_ID:
      return isSetLegID();
    case LEG_INSTRUMENT_ID:
      return isSetLegInstrumentID();
    case DIRECTION:
      return isSetDirection();
    case LEG_MULTIPLE:
      return isSetLegMultiple();
    case IMPLY_LEVEL:
      return isSetImplyLevel();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcCombinationLegField)
      return this.equals((CThostFtdcCombinationLegField)that);
    return false;
  }

  public boolean equals(CThostFtdcCombinationLegField that) {
    if (that == null)
      return false;

    boolean this_present_combInstrumentID = true && this.isSetCombInstrumentID();
    boolean that_present_combInstrumentID = true && that.isSetCombInstrumentID();
    if (this_present_combInstrumentID || that_present_combInstrumentID) {
      if (!(this_present_combInstrumentID && that_present_combInstrumentID))
        return false;
      if (!this.combInstrumentID.equals(that.combInstrumentID))
        return false;
    }

    boolean this_present_legID = true;
    boolean that_present_legID = true;
    if (this_present_legID || that_present_legID) {
      if (!(this_present_legID && that_present_legID))
        return false;
      if (this.legID != that.legID)
        return false;
    }

    boolean this_present_legInstrumentID = true && this.isSetLegInstrumentID();
    boolean that_present_legInstrumentID = true && that.isSetLegInstrumentID();
    if (this_present_legInstrumentID || that_present_legInstrumentID) {
      if (!(this_present_legInstrumentID && that_present_legInstrumentID))
        return false;
      if (!this.legInstrumentID.equals(that.legInstrumentID))
        return false;
    }

    boolean this_present_direction = true && this.isSetDirection();
    boolean that_present_direction = true && that.isSetDirection();
    if (this_present_direction || that_present_direction) {
      if (!(this_present_direction && that_present_direction))
        return false;
      if (!this.direction.equals(that.direction))
        return false;
    }

    boolean this_present_legMultiple = true;
    boolean that_present_legMultiple = true;
    if (this_present_legMultiple || that_present_legMultiple) {
      if (!(this_present_legMultiple && that_present_legMultiple))
        return false;
      if (this.legMultiple != that.legMultiple)
        return false;
    }

    boolean this_present_implyLevel = true;
    boolean that_present_implyLevel = true;
    if (this_present_implyLevel || that_present_implyLevel) {
      if (!(this_present_implyLevel && that_present_implyLevel))
        return false;
      if (this.implyLevel != that.implyLevel)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcCombinationLegField other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCombInstrumentID()).compareTo(other.isSetCombInstrumentID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCombInstrumentID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.combInstrumentID, other.combInstrumentID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLegID()).compareTo(other.isSetLegID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLegID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.legID, other.legID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLegInstrumentID()).compareTo(other.isSetLegInstrumentID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLegInstrumentID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.legInstrumentID, other.legInstrumentID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDirection()).compareTo(other.isSetDirection());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDirection()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.direction, other.direction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLegMultiple()).compareTo(other.isSetLegMultiple());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLegMultiple()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.legMultiple, other.legMultiple);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetImplyLevel()).compareTo(other.isSetImplyLevel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImplyLevel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.implyLevel, other.implyLevel);
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
    StringBuilder sb = new StringBuilder("CThostFtdcCombinationLegField(");
    boolean first = true;

    sb.append("combInstrumentID:");
    if (this.combInstrumentID == null) {
      sb.append("null");
    } else {
      sb.append(this.combInstrumentID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("legID:");
    sb.append(this.legID);
    first = false;
    if (!first) sb.append(", ");
    sb.append("legInstrumentID:");
    if (this.legInstrumentID == null) {
      sb.append("null");
    } else {
      sb.append(this.legInstrumentID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("direction:");
    if (this.direction == null) {
      sb.append("null");
    } else {
      sb.append(this.direction);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("legMultiple:");
    sb.append(this.legMultiple);
    first = false;
    if (!first) sb.append(", ");
    sb.append("implyLevel:");
    sb.append(this.implyLevel);
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

  private static class CThostFtdcCombinationLegFieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcCombinationLegFieldStandardScheme getScheme() {
      return new CThostFtdcCombinationLegFieldStandardScheme();
    }
  }

  private static class CThostFtdcCombinationLegFieldStandardScheme extends StandardScheme<CThostFtdcCombinationLegField> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcCombinationLegField struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMB_INSTRUMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.combInstrumentID = iprot.readString();
              struct.setCombInstrumentIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LEG_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.legID = iprot.readI32();
              struct.setLegIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LEG_INSTRUMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.legInstrumentID = iprot.readString();
              struct.setLegInstrumentIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DIRECTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.direction = iprot.readString();
              struct.setDirectionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LEG_MULTIPLE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.legMultiple = iprot.readI32();
              struct.setLegMultipleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // IMPLY_LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.implyLevel = iprot.readI32();
              struct.setImplyLevelIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcCombinationLegField struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.combInstrumentID != null) {
        oprot.writeFieldBegin(COMB_INSTRUMENT_ID_FIELD_DESC);
        oprot.writeString(struct.combInstrumentID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LEG_ID_FIELD_DESC);
      oprot.writeI32(struct.legID);
      oprot.writeFieldEnd();
      if (struct.legInstrumentID != null) {
        oprot.writeFieldBegin(LEG_INSTRUMENT_ID_FIELD_DESC);
        oprot.writeString(struct.legInstrumentID);
        oprot.writeFieldEnd();
      }
      if (struct.direction != null) {
        oprot.writeFieldBegin(DIRECTION_FIELD_DESC);
        oprot.writeString(struct.direction);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LEG_MULTIPLE_FIELD_DESC);
      oprot.writeI32(struct.legMultiple);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IMPLY_LEVEL_FIELD_DESC);
      oprot.writeI32(struct.implyLevel);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcCombinationLegFieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcCombinationLegFieldTupleScheme getScheme() {
      return new CThostFtdcCombinationLegFieldTupleScheme();
    }
  }

  private static class CThostFtdcCombinationLegFieldTupleScheme extends TupleScheme<CThostFtdcCombinationLegField> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcCombinationLegField struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCombInstrumentID()) {
        optionals.set(0);
      }
      if (struct.isSetLegID()) {
        optionals.set(1);
      }
      if (struct.isSetLegInstrumentID()) {
        optionals.set(2);
      }
      if (struct.isSetDirection()) {
        optionals.set(3);
      }
      if (struct.isSetLegMultiple()) {
        optionals.set(4);
      }
      if (struct.isSetImplyLevel()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetCombInstrumentID()) {
        oprot.writeString(struct.combInstrumentID);
      }
      if (struct.isSetLegID()) {
        oprot.writeI32(struct.legID);
      }
      if (struct.isSetLegInstrumentID()) {
        oprot.writeString(struct.legInstrumentID);
      }
      if (struct.isSetDirection()) {
        oprot.writeString(struct.direction);
      }
      if (struct.isSetLegMultiple()) {
        oprot.writeI32(struct.legMultiple);
      }
      if (struct.isSetImplyLevel()) {
        oprot.writeI32(struct.implyLevel);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcCombinationLegField struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.combInstrumentID = iprot.readString();
        struct.setCombInstrumentIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.legID = iprot.readI32();
        struct.setLegIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.legInstrumentID = iprot.readString();
        struct.setLegInstrumentIDIsSet(true);
      }
      if (incoming.get(3)) {
        struct.direction = iprot.readString();
        struct.setDirectionIsSet(true);
      }
      if (incoming.get(4)) {
        struct.legMultiple = iprot.readI32();
        struct.setLegMultipleIsSet(true);
      }
      if (incoming.get(5)) {
        struct.implyLevel = iprot.readI32();
        struct.setImplyLevelIsSet(true);
      }
    }
  }

}

