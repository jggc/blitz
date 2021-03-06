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
 * Represente un noeud dans l'arbre syntaxique de la requete.
 * 
 * Voir la documentation pour des exemples.
 */
public class QueryTreeNode implements org.apache.thrift.TBase<QueryTreeNode, QueryTreeNode._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QueryTreeNode");

  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LEFT_PART_FIELD_DESC = new org.apache.thrift.protocol.TField("leftPart", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField RIGHT_PART_FIELD_DESC = new org.apache.thrift.protocol.TField("rightPart", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryTreeNodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryTreeNodeTupleSchemeFactory());
  }

  /**
   * La valeur du noeud.
   * 
   * Par exemple, un noeud dont le type est "OPERATOR" pourrait avoir la valeur "OR",
   * "AND" ou "NOT". Un noeud dont le type est "LITERAL" pourrait avoir la valeur "Justin Bieber".
   */
  public String value; // required
  /**
   * Le type du noeud. Le type influence ce que sera contenu dans "value", "leftPart" et "rightPart".
   * Voir la documentation pour plus d'information et des exemples.
   * 
   * @see NodeType
   */
  public NodeType type; // required
  /**
   * L'identifiant du noeud representant la partie de gauche de la requete. Si la valeur est -1, il n'y a pas de partie de gauche.
   */
  public int leftPart; // required
  /**
   * L'identifiant du noeud representant la partie de droite de la requete. Si la valeur est -1, il n'y a pas de partie de droite.
   */
  public int rightPart; // required
  /**
   * L'identifiant de ce noeud.
   * Est necessairement plus grand que zero.
   */
  public int id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * La valeur du noeud.
     * 
     * Par exemple, un noeud dont le type est "OPERATOR" pourrait avoir la valeur "OR",
     * "AND" ou "NOT". Un noeud dont le type est "LITERAL" pourrait avoir la valeur "Justin Bieber".
     */
    VALUE((short)1, "value"),
    /**
     * Le type du noeud. Le type influence ce que sera contenu dans "value", "leftPart" et "rightPart".
     * Voir la documentation pour plus d'information et des exemples.
     * 
     * @see NodeType
     */
    TYPE((short)2, "type"),
    /**
     * L'identifiant du noeud representant la partie de gauche de la requete. Si la valeur est -1, il n'y a pas de partie de gauche.
     */
    LEFT_PART((short)3, "leftPart"),
    /**
     * L'identifiant du noeud representant la partie de droite de la requete. Si la valeur est -1, il n'y a pas de partie de droite.
     */
    RIGHT_PART((short)4, "rightPart"),
    /**
     * L'identifiant de ce noeud.
     * Est necessairement plus grand que zero.
     */
    ID((short)5, "id");

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
        case 1: // VALUE
          return VALUE;
        case 2: // TYPE
          return TYPE;
        case 3: // LEFT_PART
          return LEFT_PART;
        case 4: // RIGHT_PART
          return RIGHT_PART;
        case 5: // ID
          return ID;
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
  private static final int __LEFTPART_ISSET_ID = 0;
  private static final int __RIGHTPART_ISSET_ID = 1;
  private static final int __ID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, NodeType.class)));
    tmpMap.put(_Fields.LEFT_PART, new org.apache.thrift.meta_data.FieldMetaData("leftPart", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RIGHT_PART, new org.apache.thrift.meta_data.FieldMetaData("rightPart", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QueryTreeNode.class, metaDataMap);
  }

  public QueryTreeNode() {
  }

  public QueryTreeNode(
    String value,
    NodeType type,
    int leftPart,
    int rightPart,
    int id)
  {
    this();
    this.value = value;
    this.type = type;
    this.leftPart = leftPart;
    setLeftPartIsSet(true);
    this.rightPart = rightPart;
    setRightPartIsSet(true);
    this.id = id;
    setIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryTreeNode(QueryTreeNode other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetValue()) {
      this.value = other.value;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.leftPart = other.leftPart;
    this.rightPart = other.rightPart;
    this.id = other.id;
  }

  public QueryTreeNode deepCopy() {
    return new QueryTreeNode(this);
  }

  @Override
  public void clear() {
    this.value = null;
    this.type = null;
    setLeftPartIsSet(false);
    this.leftPart = 0;
    setRightPartIsSet(false);
    this.rightPart = 0;
    setIdIsSet(false);
    this.id = 0;
  }

  /**
   * La valeur du noeud.
   * 
   * Par exemple, un noeud dont le type est "OPERATOR" pourrait avoir la valeur "OR",
   * "AND" ou "NOT". Un noeud dont le type est "LITERAL" pourrait avoir la valeur "Justin Bieber".
   */
  public String getValue() {
    return this.value;
  }

  /**
   * La valeur du noeud.
   * 
   * Par exemple, un noeud dont le type est "OPERATOR" pourrait avoir la valeur "OR",
   * "AND" ou "NOT". Un noeud dont le type est "LITERAL" pourrait avoir la valeur "Justin Bieber".
   */
  public QueryTreeNode setValue(String value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  /**
   * Le type du noeud. Le type influence ce que sera contenu dans "value", "leftPart" et "rightPart".
   * Voir la documentation pour plus d'information et des exemples.
   * 
   * @see NodeType
   */
  public NodeType getType() {
    return this.type;
  }

  /**
   * Le type du noeud. Le type influence ce que sera contenu dans "value", "leftPart" et "rightPart".
   * Voir la documentation pour plus d'information et des exemples.
   * 
   * @see NodeType
   */
  public QueryTreeNode setType(NodeType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  /**
   * L'identifiant du noeud representant la partie de gauche de la requete. Si la valeur est -1, il n'y a pas de partie de gauche.
   */
  public int getLeftPart() {
    return this.leftPart;
  }

  /**
   * L'identifiant du noeud representant la partie de gauche de la requete. Si la valeur est -1, il n'y a pas de partie de gauche.
   */
  public QueryTreeNode setLeftPart(int leftPart) {
    this.leftPart = leftPart;
    setLeftPartIsSet(true);
    return this;
  }

  public void unsetLeftPart() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LEFTPART_ISSET_ID);
  }

  /** Returns true if field leftPart is set (has been assigned a value) and false otherwise */
  public boolean isSetLeftPart() {
    return EncodingUtils.testBit(__isset_bitfield, __LEFTPART_ISSET_ID);
  }

  public void setLeftPartIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LEFTPART_ISSET_ID, value);
  }

  /**
   * L'identifiant du noeud representant la partie de droite de la requete. Si la valeur est -1, il n'y a pas de partie de droite.
   */
  public int getRightPart() {
    return this.rightPart;
  }

  /**
   * L'identifiant du noeud representant la partie de droite de la requete. Si la valeur est -1, il n'y a pas de partie de droite.
   */
  public QueryTreeNode setRightPart(int rightPart) {
    this.rightPart = rightPart;
    setRightPartIsSet(true);
    return this;
  }

  public void unsetRightPart() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RIGHTPART_ISSET_ID);
  }

  /** Returns true if field rightPart is set (has been assigned a value) and false otherwise */
  public boolean isSetRightPart() {
    return EncodingUtils.testBit(__isset_bitfield, __RIGHTPART_ISSET_ID);
  }

  public void setRightPartIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RIGHTPART_ISSET_ID, value);
  }

  /**
   * L'identifiant de ce noeud.
   * Est necessairement plus grand que zero.
   */
  public int getId() {
    return this.id;
  }

  /**
   * L'identifiant de ce noeud.
   * Est necessairement plus grand que zero.
   */
  public QueryTreeNode setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((NodeType)value);
      }
      break;

    case LEFT_PART:
      if (value == null) {
        unsetLeftPart();
      } else {
        setLeftPart((Integer)value);
      }
      break;

    case RIGHT_PART:
      if (value == null) {
        unsetRightPart();
      } else {
        setRightPart((Integer)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VALUE:
      return getValue();

    case TYPE:
      return getType();

    case LEFT_PART:
      return Integer.valueOf(getLeftPart());

    case RIGHT_PART:
      return Integer.valueOf(getRightPart());

    case ID:
      return Integer.valueOf(getId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VALUE:
      return isSetValue();
    case TYPE:
      return isSetType();
    case LEFT_PART:
      return isSetLeftPart();
    case RIGHT_PART:
      return isSetRightPart();
    case ID:
      return isSetId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryTreeNode)
      return this.equals((QueryTreeNode)that);
    return false;
  }

  public boolean equals(QueryTreeNode that) {
    if (that == null)
      return false;

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_leftPart = true;
    boolean that_present_leftPart = true;
    if (this_present_leftPart || that_present_leftPart) {
      if (!(this_present_leftPart && that_present_leftPart))
        return false;
      if (this.leftPart != that.leftPart)
        return false;
    }

    boolean this_present_rightPart = true;
    boolean that_present_rightPart = true;
    if (this_present_rightPart || that_present_rightPart) {
      if (!(this_present_rightPart && that_present_rightPart))
        return false;
      if (this.rightPart != that.rightPart)
        return false;
    }

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_value = true && (isSetValue());
    builder.append(present_value);
    if (present_value)
      builder.append(value);

    boolean present_type = true && (isSetType());
    builder.append(present_type);
    if (present_type)
      builder.append(type.getValue());

    boolean present_leftPart = true;
    builder.append(present_leftPart);
    if (present_leftPart)
      builder.append(leftPart);

    boolean present_rightPart = true;
    builder.append(present_rightPart);
    if (present_rightPart)
      builder.append(rightPart);

    boolean present_id = true;
    builder.append(present_id);
    if (present_id)
      builder.append(id);

    return builder.toHashCode();
  }

  public int compareTo(QueryTreeNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    QueryTreeNode typedOther = (QueryTreeNode)other;

    lastComparison = Boolean.valueOf(isSetValue()).compareTo(typedOther.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, typedOther.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(typedOther.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, typedOther.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLeftPart()).compareTo(typedOther.isSetLeftPart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeftPart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.leftPart, typedOther.leftPart);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRightPart()).compareTo(typedOther.isSetRightPart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRightPart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rightPart, typedOther.rightPart);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
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
    StringBuilder sb = new StringBuilder("QueryTreeNode(");
    boolean first = true;

    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      sb.append(this.value);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("leftPart:");
    sb.append(this.leftPart);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rightPart:");
    sb.append(this.rightPart);
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    sb.append(this.id);
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

  private static class QueryTreeNodeStandardSchemeFactory implements SchemeFactory {
    public QueryTreeNodeStandardScheme getScheme() {
      return new QueryTreeNodeStandardScheme();
    }
  }

  private static class QueryTreeNodeStandardScheme extends StandardScheme<QueryTreeNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QueryTreeNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readString();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = NodeType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LEFT_PART
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.leftPart = iprot.readI32();
              struct.setLeftPartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RIGHT_PART
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.rightPart = iprot.readI32();
              struct.setRightPartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, QueryTreeNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeString(struct.value);
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LEFT_PART_FIELD_DESC);
      oprot.writeI32(struct.leftPart);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RIGHT_PART_FIELD_DESC);
      oprot.writeI32(struct.rightPart);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryTreeNodeTupleSchemeFactory implements SchemeFactory {
    public QueryTreeNodeTupleScheme getScheme() {
      return new QueryTreeNodeTupleScheme();
    }
  }

  private static class QueryTreeNodeTupleScheme extends TupleScheme<QueryTreeNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QueryTreeNode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetValue()) {
        optionals.set(0);
      }
      if (struct.isSetType()) {
        optionals.set(1);
      }
      if (struct.isSetLeftPart()) {
        optionals.set(2);
      }
      if (struct.isSetRightPart()) {
        optionals.set(3);
      }
      if (struct.isSetId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetValue()) {
        oprot.writeString(struct.value);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetLeftPart()) {
        oprot.writeI32(struct.leftPart);
      }
      if (struct.isSetRightPart()) {
        oprot.writeI32(struct.rightPart);
      }
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QueryTreeNode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.value = iprot.readString();
        struct.setValueIsSet(true);
      }
      if (incoming.get(1)) {
        struct.type = NodeType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.leftPart = iprot.readI32();
        struct.setLeftPartIsSet(true);
      }
      if (incoming.get(3)) {
        struct.rightPart = iprot.readI32();
        struct.setRightPartIsSet(true);
      }
      if (incoming.get(4)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
    }
  }

}

