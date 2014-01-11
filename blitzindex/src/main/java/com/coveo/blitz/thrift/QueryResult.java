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
 * Un resultat d'une requete a votre index.
 * Les resultats doivent etre retournes dans le bon ordre.
 * Un resultat peut etre soit un Artist ou un Album.
 * Si documentType est DocumentType.ARTIST, l'identifiant doit etre un identifiant d'artiste.
 * Si documentType est DocumentType.ALBUM, l'identifiant doit etre un identifiant d'album.
 * 
 * Voir la documentation du concours pour savoir ce que signifie "dans le bon ordre".
 */
public class QueryResult implements org.apache.thrift.TBase<QueryResult, QueryResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QueryResult");

  private static final org.apache.thrift.protocol.TField DOCUMENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("documentType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryResultTupleSchemeFactory());
  }

  /**
   * Le type du document.
   * Si documentType est DocumentType.ARTIST, seul artist doit etre rempli.
   * Si documentType est DocumentType.ALBUM, seul album doit etre rempli.
   * 
   * @see DocumentType
   */
  public DocumentType documentType; // required
  /**
   * L'identifiant unique du document tel que fournit lors de l'indexation.
   */
  public String id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Le type du document.
     * Si documentType est DocumentType.ARTIST, seul artist doit etre rempli.
     * Si documentType est DocumentType.ALBUM, seul album doit etre rempli.
     * 
     * @see DocumentType
     */
    DOCUMENT_TYPE((short)1, "documentType"),
    /**
     * L'identifiant unique du document tel que fournit lors de l'indexation.
     */
    ID((short)2, "id");

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
        case 1: // DOCUMENT_TYPE
          return DOCUMENT_TYPE;
        case 2: // ID
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DOCUMENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("documentType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DocumentType.class)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QueryResult.class, metaDataMap);
  }

  public QueryResult() {
  }

  public QueryResult(
    DocumentType documentType,
    String id)
  {
    this();
    this.documentType = documentType;
    this.id = id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryResult(QueryResult other) {
    if (other.isSetDocumentType()) {
      this.documentType = other.documentType;
    }
    if (other.isSetId()) {
      this.id = other.id;
    }
  }

  public QueryResult deepCopy() {
    return new QueryResult(this);
  }

  @Override
  public void clear() {
    this.documentType = null;
    this.id = null;
  }

  /**
   * Le type du document.
   * Si documentType est DocumentType.ARTIST, seul artist doit etre rempli.
   * Si documentType est DocumentType.ALBUM, seul album doit etre rempli.
   * 
   * @see DocumentType
   */
  public DocumentType getDocumentType() {
    return this.documentType;
  }

  /**
   * Le type du document.
   * Si documentType est DocumentType.ARTIST, seul artist doit etre rempli.
   * Si documentType est DocumentType.ALBUM, seul album doit etre rempli.
   * 
   * @see DocumentType
   */
  public QueryResult setDocumentType(DocumentType documentType) {
    this.documentType = documentType;
    return this;
  }

  public void unsetDocumentType() {
    this.documentType = null;
  }

  /** Returns true if field documentType is set (has been assigned a value) and false otherwise */
  public boolean isSetDocumentType() {
    return this.documentType != null;
  }

  public void setDocumentTypeIsSet(boolean value) {
    if (!value) {
      this.documentType = null;
    }
  }

  /**
   * L'identifiant unique du document tel que fournit lors de l'indexation.
   */
  public String getId() {
    return this.id;
  }

  /**
   * L'identifiant unique du document tel que fournit lors de l'indexation.
   */
  public QueryResult setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DOCUMENT_TYPE:
      if (value == null) {
        unsetDocumentType();
      } else {
        setDocumentType((DocumentType)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DOCUMENT_TYPE:
      return getDocumentType();

    case ID:
      return getId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DOCUMENT_TYPE:
      return isSetDocumentType();
    case ID:
      return isSetId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryResult)
      return this.equals((QueryResult)that);
    return false;
  }

  public boolean equals(QueryResult that) {
    if (that == null)
      return false;

    boolean this_present_documentType = true && this.isSetDocumentType();
    boolean that_present_documentType = true && that.isSetDocumentType();
    if (this_present_documentType || that_present_documentType) {
      if (!(this_present_documentType && that_present_documentType))
        return false;
      if (!this.documentType.equals(that.documentType))
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_documentType = true && (isSetDocumentType());
    builder.append(present_documentType);
    if (present_documentType)
      builder.append(documentType.getValue());

    boolean present_id = true && (isSetId());
    builder.append(present_id);
    if (present_id)
      builder.append(id);

    return builder.toHashCode();
  }

  public int compareTo(QueryResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    QueryResult typedOther = (QueryResult)other;

    lastComparison = Boolean.valueOf(isSetDocumentType()).compareTo(typedOther.isSetDocumentType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDocumentType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.documentType, typedOther.documentType);
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
    StringBuilder sb = new StringBuilder("QueryResult(");
    boolean first = true;

    sb.append("documentType:");
    if (this.documentType == null) {
      sb.append("null");
    } else {
      sb.append(this.documentType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
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

  private static class QueryResultStandardSchemeFactory implements SchemeFactory {
    public QueryResultStandardScheme getScheme() {
      return new QueryResultStandardScheme();
    }
  }

  private static class QueryResultStandardScheme extends StandardScheme<QueryResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QueryResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DOCUMENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.documentType = DocumentType.findByValue(iprot.readI32());
              struct.setDocumentTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, QueryResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.documentType != null) {
        oprot.writeFieldBegin(DOCUMENT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.documentType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryResultTupleSchemeFactory implements SchemeFactory {
    public QueryResultTupleScheme getScheme() {
      return new QueryResultTupleScheme();
    }
  }

  private static class QueryResultTupleScheme extends TupleScheme<QueryResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QueryResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDocumentType()) {
        optionals.set(0);
      }
      if (struct.isSetId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDocumentType()) {
        oprot.writeI32(struct.documentType.getValue());
      }
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QueryResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.documentType = DocumentType.findByValue(iprot.readI32());
        struct.setDocumentTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
    }
  }

}

