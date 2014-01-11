/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.coveo.blitz.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Les type de noeud dans l'arbre syntaxique de la requete.
 */
public enum NodeType implements org.apache.thrift.TEnum {
  /**
   * Un noeud qui represente un operateur de requete (AND, OR, ...)
   * "value" contient l'operateur.
   * "leftPart" contient la partie a droite de l'operateur.
   * "rightPart" contient la partie de gauche de l'operateur.
   */
  OPERATOR(1),
  /**
   * Un noeud qui represente un terme de la requete ("Madonna", "Justin", "Hello World")
   * "value" contient le terme.
   * "leftPart" est null.
   * "rightPart" est null.
   */
  LITERAL(2);

  private final int value;

  private NodeType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static NodeType findByValue(int value) { 
    switch (value) {
      case 1:
        return OPERATOR;
      case 2:
        return LITERAL;
      default:
        return null;
    }
  }
}