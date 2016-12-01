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

public class CThostFtdcMarketDataBid45Field implements org.apache.thrift.TBase<CThostFtdcMarketDataBid45Field, CThostFtdcMarketDataBid45Field._Fields>, java.io.Serializable, Cloneable, Comparable<CThostFtdcMarketDataBid45Field> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CThostFtdcMarketDataBid45Field");

  private static final org.apache.thrift.protocol.TField BID_PRICE4_FIELD_DESC = new org.apache.thrift.protocol.TField("bidPrice4", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField BID_VOLUME4_FIELD_DESC = new org.apache.thrift.protocol.TField("bidVolume4", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField BID_PRICE5_FIELD_DESC = new org.apache.thrift.protocol.TField("bidPrice5", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField BID_VOLUME5_FIELD_DESC = new org.apache.thrift.protocol.TField("bidVolume5", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CThostFtdcMarketDataBid45FieldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CThostFtdcMarketDataBid45FieldTupleSchemeFactory());
  }

  public double bidPrice4; // required
  public int bidVolume4; // required
  public double bidPrice5; // required
  public int bidVolume5; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BID_PRICE4((short)1, "bidPrice4"),
    BID_VOLUME4((short)2, "bidVolume4"),
    BID_PRICE5((short)3, "bidPrice5"),
    BID_VOLUME5((short)4, "bidVolume5");

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
        case 1: // BID_PRICE4
          return BID_PRICE4;
        case 2: // BID_VOLUME4
          return BID_VOLUME4;
        case 3: // BID_PRICE5
          return BID_PRICE5;
        case 4: // BID_VOLUME5
          return BID_VOLUME5;
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
  private static final int __BIDPRICE4_ISSET_ID = 0;
  private static final int __BIDVOLUME4_ISSET_ID = 1;
  private static final int __BIDPRICE5_ISSET_ID = 2;
  private static final int __BIDVOLUME5_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BID_PRICE4, new org.apache.thrift.meta_data.FieldMetaData("bidPrice4", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    tmpMap.put(_Fields.BID_VOLUME4, new org.apache.thrift.meta_data.FieldMetaData("bidVolume4", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcVolumeType")));
    tmpMap.put(_Fields.BID_PRICE5, new org.apache.thrift.meta_data.FieldMetaData("bidPrice5", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "TThostFtdcPriceType")));
    tmpMap.put(_Fields.BID_VOLUME5, new org.apache.thrift.meta_data.FieldMetaData("bidVolume5", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TThostFtdcVolumeType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CThostFtdcMarketDataBid45Field.class, metaDataMap);
  }

  public CThostFtdcMarketDataBid45Field() {
  }

  public CThostFtdcMarketDataBid45Field(
    double bidPrice4,
    int bidVolume4,
    double bidPrice5,
    int bidVolume5)
  {
    this();
    this.bidPrice4 = bidPrice4;
    setBidPrice4IsSet(true);
    this.bidVolume4 = bidVolume4;
    setBidVolume4IsSet(true);
    this.bidPrice5 = bidPrice5;
    setBidPrice5IsSet(true);
    this.bidVolume5 = bidVolume5;
    setBidVolume5IsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CThostFtdcMarketDataBid45Field(CThostFtdcMarketDataBid45Field other) {
    __isset_bitfield = other.__isset_bitfield;
    this.bidPrice4 = other.bidPrice4;
    this.bidVolume4 = other.bidVolume4;
    this.bidPrice5 = other.bidPrice5;
    this.bidVolume5 = other.bidVolume5;
  }

  public CThostFtdcMarketDataBid45Field deepCopy() {
    return new CThostFtdcMarketDataBid45Field(this);
  }

  @Override
  public void clear() {
    setBidPrice4IsSet(false);
    this.bidPrice4 = 0.0;
    setBidVolume4IsSet(false);
    this.bidVolume4 = 0;
    setBidPrice5IsSet(false);
    this.bidPrice5 = 0.0;
    setBidVolume5IsSet(false);
    this.bidVolume5 = 0;
  }

  public double getBidPrice4() {
    return this.bidPrice4;
  }

  public CThostFtdcMarketDataBid45Field setBidPrice4(double bidPrice4) {
    this.bidPrice4 = bidPrice4;
    setBidPrice4IsSet(true);
    return this;
  }

  public void unsetBidPrice4() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BIDPRICE4_ISSET_ID);
  }

  /** Returns true if field bidPrice4 is set (has been assigned a value) and false otherwise */
  public boolean isSetBidPrice4() {
    return EncodingUtils.testBit(__isset_bitfield, __BIDPRICE4_ISSET_ID);
  }

  public void setBidPrice4IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BIDPRICE4_ISSET_ID, value);
  }

  public int getBidVolume4() {
    return this.bidVolume4;
  }

  public CThostFtdcMarketDataBid45Field setBidVolume4(int bidVolume4) {
    this.bidVolume4 = bidVolume4;
    setBidVolume4IsSet(true);
    return this;
  }

  public void unsetBidVolume4() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BIDVOLUME4_ISSET_ID);
  }

  /** Returns true if field bidVolume4 is set (has been assigned a value) and false otherwise */
  public boolean isSetBidVolume4() {
    return EncodingUtils.testBit(__isset_bitfield, __BIDVOLUME4_ISSET_ID);
  }

  public void setBidVolume4IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BIDVOLUME4_ISSET_ID, value);
  }

  public double getBidPrice5() {
    return this.bidPrice5;
  }

  public CThostFtdcMarketDataBid45Field setBidPrice5(double bidPrice5) {
    this.bidPrice5 = bidPrice5;
    setBidPrice5IsSet(true);
    return this;
  }

  public void unsetBidPrice5() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BIDPRICE5_ISSET_ID);
  }

  /** Returns true if field bidPrice5 is set (has been assigned a value) and false otherwise */
  public boolean isSetBidPrice5() {
    return EncodingUtils.testBit(__isset_bitfield, __BIDPRICE5_ISSET_ID);
  }

  public void setBidPrice5IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BIDPRICE5_ISSET_ID, value);
  }

  public int getBidVolume5() {
    return this.bidVolume5;
  }

  public CThostFtdcMarketDataBid45Field setBidVolume5(int bidVolume5) {
    this.bidVolume5 = bidVolume5;
    setBidVolume5IsSet(true);
    return this;
  }

  public void unsetBidVolume5() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BIDVOLUME5_ISSET_ID);
  }

  /** Returns true if field bidVolume5 is set (has been assigned a value) and false otherwise */
  public boolean isSetBidVolume5() {
    return EncodingUtils.testBit(__isset_bitfield, __BIDVOLUME5_ISSET_ID);
  }

  public void setBidVolume5IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BIDVOLUME5_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BID_PRICE4:
      if (value == null) {
        unsetBidPrice4();
      } else {
        setBidPrice4((Double)value);
      }
      break;

    case BID_VOLUME4:
      if (value == null) {
        unsetBidVolume4();
      } else {
        setBidVolume4((Integer)value);
      }
      break;

    case BID_PRICE5:
      if (value == null) {
        unsetBidPrice5();
      } else {
        setBidPrice5((Double)value);
      }
      break;

    case BID_VOLUME5:
      if (value == null) {
        unsetBidVolume5();
      } else {
        setBidVolume5((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BID_PRICE4:
      return Double.valueOf(getBidPrice4());

    case BID_VOLUME4:
      return Integer.valueOf(getBidVolume4());

    case BID_PRICE5:
      return Double.valueOf(getBidPrice5());

    case BID_VOLUME5:
      return Integer.valueOf(getBidVolume5());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BID_PRICE4:
      return isSetBidPrice4();
    case BID_VOLUME4:
      return isSetBidVolume4();
    case BID_PRICE5:
      return isSetBidPrice5();
    case BID_VOLUME5:
      return isSetBidVolume5();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CThostFtdcMarketDataBid45Field)
      return this.equals((CThostFtdcMarketDataBid45Field)that);
    return false;
  }

  public boolean equals(CThostFtdcMarketDataBid45Field that) {
    if (that == null)
      return false;

    boolean this_present_bidPrice4 = true;
    boolean that_present_bidPrice4 = true;
    if (this_present_bidPrice4 || that_present_bidPrice4) {
      if (!(this_present_bidPrice4 && that_present_bidPrice4))
        return false;
      if (this.bidPrice4 != that.bidPrice4)
        return false;
    }

    boolean this_present_bidVolume4 = true;
    boolean that_present_bidVolume4 = true;
    if (this_present_bidVolume4 || that_present_bidVolume4) {
      if (!(this_present_bidVolume4 && that_present_bidVolume4))
        return false;
      if (this.bidVolume4 != that.bidVolume4)
        return false;
    }

    boolean this_present_bidPrice5 = true;
    boolean that_present_bidPrice5 = true;
    if (this_present_bidPrice5 || that_present_bidPrice5) {
      if (!(this_present_bidPrice5 && that_present_bidPrice5))
        return false;
      if (this.bidPrice5 != that.bidPrice5)
        return false;
    }

    boolean this_present_bidVolume5 = true;
    boolean that_present_bidVolume5 = true;
    if (this_present_bidVolume5 || that_present_bidVolume5) {
      if (!(this_present_bidVolume5 && that_present_bidVolume5))
        return false;
      if (this.bidVolume5 != that.bidVolume5)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CThostFtdcMarketDataBid45Field other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBidPrice4()).compareTo(other.isSetBidPrice4());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBidPrice4()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bidPrice4, other.bidPrice4);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBidVolume4()).compareTo(other.isSetBidVolume4());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBidVolume4()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bidVolume4, other.bidVolume4);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBidPrice5()).compareTo(other.isSetBidPrice5());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBidPrice5()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bidPrice5, other.bidPrice5);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBidVolume5()).compareTo(other.isSetBidVolume5());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBidVolume5()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bidVolume5, other.bidVolume5);
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
    StringBuilder sb = new StringBuilder("CThostFtdcMarketDataBid45Field(");
    boolean first = true;

    sb.append("bidPrice4:");
    sb.append(this.bidPrice4);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bidVolume4:");
    sb.append(this.bidVolume4);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bidPrice5:");
    sb.append(this.bidPrice5);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bidVolume5:");
    sb.append(this.bidVolume5);
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

  private static class CThostFtdcMarketDataBid45FieldStandardSchemeFactory implements SchemeFactory {
    public CThostFtdcMarketDataBid45FieldStandardScheme getScheme() {
      return new CThostFtdcMarketDataBid45FieldStandardScheme();
    }
  }

  private static class CThostFtdcMarketDataBid45FieldStandardScheme extends StandardScheme<CThostFtdcMarketDataBid45Field> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CThostFtdcMarketDataBid45Field struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BID_PRICE4
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.bidPrice4 = iprot.readDouble();
              struct.setBidPrice4IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BID_VOLUME4
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.bidVolume4 = iprot.readI32();
              struct.setBidVolume4IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BID_PRICE5
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.bidPrice5 = iprot.readDouble();
              struct.setBidPrice5IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BID_VOLUME5
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.bidVolume5 = iprot.readI32();
              struct.setBidVolume5IsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CThostFtdcMarketDataBid45Field struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BID_PRICE4_FIELD_DESC);
      oprot.writeDouble(struct.bidPrice4);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BID_VOLUME4_FIELD_DESC);
      oprot.writeI32(struct.bidVolume4);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BID_PRICE5_FIELD_DESC);
      oprot.writeDouble(struct.bidPrice5);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BID_VOLUME5_FIELD_DESC);
      oprot.writeI32(struct.bidVolume5);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CThostFtdcMarketDataBid45FieldTupleSchemeFactory implements SchemeFactory {
    public CThostFtdcMarketDataBid45FieldTupleScheme getScheme() {
      return new CThostFtdcMarketDataBid45FieldTupleScheme();
    }
  }

  private static class CThostFtdcMarketDataBid45FieldTupleScheme extends TupleScheme<CThostFtdcMarketDataBid45Field> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CThostFtdcMarketDataBid45Field struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBidPrice4()) {
        optionals.set(0);
      }
      if (struct.isSetBidVolume4()) {
        optionals.set(1);
      }
      if (struct.isSetBidPrice5()) {
        optionals.set(2);
      }
      if (struct.isSetBidVolume5()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetBidPrice4()) {
        oprot.writeDouble(struct.bidPrice4);
      }
      if (struct.isSetBidVolume4()) {
        oprot.writeI32(struct.bidVolume4);
      }
      if (struct.isSetBidPrice5()) {
        oprot.writeDouble(struct.bidPrice5);
      }
      if (struct.isSetBidVolume5()) {
        oprot.writeI32(struct.bidVolume5);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CThostFtdcMarketDataBid45Field struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.bidPrice4 = iprot.readDouble();
        struct.setBidPrice4IsSet(true);
      }
      if (incoming.get(1)) {
        struct.bidVolume4 = iprot.readI32();
        struct.setBidVolume4IsSet(true);
      }
      if (incoming.get(2)) {
        struct.bidPrice5 = iprot.readDouble();
        struct.setBidPrice5IsSet(true);
      }
      if (incoming.get(3)) {
        struct.bidVolume5 = iprot.readI32();
        struct.setBidVolume5IsSet(true);
      }
    }
  }

}

