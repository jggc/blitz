/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.coveo.blitz.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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

/**
 * Filtre sur une facette. Vous devez uniquement retourner des resultats qui, pour les metadata
 * fournis contiennent une des valeurs fournies. Voir la documentation pour plus d'information.
 */
public class FacetFilter implements org.apache.thrift.TBase<FacetFilter, FacetFilter._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FacetFilter");

  private static final org.apache.thrift.protocol.TField METADATA_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("metadataName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FacetFilterStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FacetFilterTupleSchemeFactory());
  }

  /**
   * Le nom du metadata sur lequel le filtre s'applique.
   */
  public String metadataName; // required
  /**
   * Les valeurs acceptees pour ce metadata.
   */
  public List<String> values; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Le nom du metadata sur lequel le filtre s'applique.
     */
    METADATA_NAME((short)1, "metadataName"),
    /**
     * Les valeurs acceptees pour ce metadata.
     */
    VALUES((short)2, "values");

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
        case 1: // METADATA_NAME
          return METADATA_NAME;
        case 2: // VALUES
          return VALUES;
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
    tmpMap.put(_Fields.METADATA_NAME, new org.apache.thrift.meta_data.FieldMetaData("metadataName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FacetFilter.class, metaDataMap);
  }

  public FacetFilter() {
  }

  public FacetFilter(
    String metadataName,
    List<String> values)
  {
    this();
    this.metadataName = metadataName;
    this.values = values;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FacetFilter(FacetFilter other) {
    if (other.isSetMetadataName()) {
      this.metadataName = other.metadataName;
    }
    if (other.isSetValues()) {
      List<String> __this__values = new ArrayList<String>();
      for (String other_element : other.values) {
        __this__values.add(other_element);
      }
      this.values = __this__values;
    }
  }

  public FacetFilter deepCopy() {
    return new FacetFilter(this);
  }

  @Override
  public void clear() {
    this.metadataName = null;
    this.values = null;
  }

  /**
   * Le nom du metadata sur lequel le filtre s'applique.
   */
  public String getMetadataName() {
    return this.metadataName;
  }

  /**
   * Le nom du metadata sur lequel le filtre s'applique.
   */
  public FacetFilter setMetadataName(String metadataName) {
    this.metadataName = metadataName;
    return this;
  }

  public void unsetMetadataName() {
    this.metadataName = null;
  }

  /** Returns true if field metadataName is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadataName() {
    return this.metadataName != null;
  }

  public void setMetadataNameIsSet(boolean value) {
    if (!value) {
      this.metadataName = null;
    }
  }

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  public java.util.Iterator<String> getValuesIterator() {
    return (this.values == null) ? null : this.values.iterator();
  }

  public void addToValues(String elem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(elem);
  }

  /**
   * Les valeurs acceptees pour ce metadata.
   */
  public List<String> getValues() {
    return this.values;
  }

  /**
   * Les valeurs acceptees pour ce metadata.
   */
  public FacetFilter setValues(List<String> values) {
    this.values = values;
    return this;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METADATA_NAME:
      if (value == null) {
        unsetMetadataName();
      } else {
        setMetadataName((String)value);
      }
      break;

    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METADATA_NAME:
      return getMetadataName();

    case VALUES:
      return getValues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METADATA_NAME:
      return isSetMetadataName();
    case VALUES:
      return isSetValues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FacetFilter)
      return this.equals((FacetFilter)that);
    return false;
  }

  public boolean equals(FacetFilter that) {
    if (that == null)
      return false;

    boolean this_present_metadataName = true && this.isSetMetadataName();
    boolean that_present_metadataName = true && that.isSetMetadataName();
    if (this_present_metadataName || that_present_metadataName) {
      if (!(this_present_metadataName && that_present_metadataName))
        return false;
      if (!this.metadataName.equals(that.metadataName))
        return false;
    }

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_metadataName = true && (isSetMetadataName());
    builder.append(present_metadataName);
    if (present_metadataName)
      builder.append(metadataName);

    boolean present_values = true && (isSetValues());
    builder.append(present_values);
    if (present_values)
      builder.append(values);

    return builder.toHashCode();
  }

  public int compareTo(FacetFilter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    FacetFilter typedOther = (FacetFilter)other;

    lastComparison = Boolean.valueOf(isSetMetadataName()).compareTo(typedOther.isSetMetadataName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadataName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadataName, typedOther.metadataName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValues()).compareTo(typedOther.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, typedOther.values);
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
    StringBuilder sb = new StringBuilder("FacetFilter(");
    boolean first = true;

    sb.append("metadataName:");
    if (this.metadataName == null) {
      sb.append("null");
    } else {
      sb.append(this.metadataName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("values:");
    if (this.values == null) {
      sb.append("null");
    } else {
      sb.append(this.values);
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

  private static class FacetFilterStandardSchemeFactory implements SchemeFactory {
    public FacetFilterStandardScheme getScheme() {
      return new FacetFilterStandardScheme();
    }
  }

  private static class FacetFilterStandardScheme extends StandardScheme<FacetFilter> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FacetFilter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METADATA_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.metadataName = iprot.readString();
              struct.setMetadataNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list112 = iprot.readListBegin();
                struct.values = new ArrayList<String>(_list112.size);
                for (int _i113 = 0; _i113 < _list112.size; ++_i113)
                {
                  String _elem114; // required
                  _elem114 = iprot.readString();
                  struct.values.add(_elem114);
                }
                iprot.readListEnd();
              }
              struct.setValuesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FacetFilter struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metadataName != null) {
        oprot.writeFieldBegin(METADATA_NAME_FIELD_DESC);
        oprot.writeString(struct.metadataName);
        oprot.writeFieldEnd();
      }
      if (struct.values != null) {
        oprot.writeFieldBegin(VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.values.size()));
          for (String _iter115 : struct.values)
          {
            oprot.writeString(_iter115);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FacetFilterTupleSchemeFactory implements SchemeFactory {
    public FacetFilterTupleScheme getScheme() {
      return new FacetFilterTupleScheme();
    }
  }

  private static class FacetFilterTupleScheme extends TupleScheme<FacetFilter> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FacetFilter struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMetadataName()) {
        optionals.set(0);
      }
      if (struct.isSetValues()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMetadataName()) {
        oprot.writeString(struct.metadataName);
      }
      if (struct.isSetValues()) {
        {
          oprot.writeI32(struct.values.size());
          for (String _iter116 : struct.values)
          {
            oprot.writeString(_iter116);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FacetFilter struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.metadataName = iprot.readString();
        struct.setMetadataNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list117 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.values = new ArrayList<String>(_list117.size);
          for (int _i118 = 0; _i118 < _list117.size; ++_i118)
          {
            String _elem119; // required
            _elem119 = iprot.readString();
            struct.values.add(_elem119);
          }
        }
        struct.setValuesIsSet(true);
      }
    }
  }

}

