package org.mindmap.model;

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */


import java.io.Serializable;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Bloque</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * 
 * @see mindmap.MindmapPackage#getBloque()
 * @model
 * @generated NOT
 */
public class Bloque
    implements Enumerator,Serializable
{
  /**
   * The '<em><b>Empty</b></em>' literal object. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #EMPTY_VALUE
   * @generated
   * @ordered
   */
  public static Bloque EMPTY = new Bloque(0, "empty", "");

  /**
   * The '<em><b>Empty</b></em>' literal value. <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Empty</b></em>' literal object isn't clear, there
   * really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @see #EMPTY
   * @model name="empty" literal=""
   * @generated
   * @ordered
   */
  public static final int EMPTY_VALUE = 0;

  /**
   * An array of all the '<em><b>Bloque</b></em>' enumerators. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  private static Bloque[] VALUES_ARRAY = new Bloque[]
  { EMPTY, };

  private static Bloque[] DEFAULT_VALUES_ARRAY = new Bloque[]
  { EMPTY, };

  /**
   * A public read-only list of all the '<em><b>Bloque</b></em>' enumerators.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  // public static final List<Bloque> VALUES =
  // Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Bloque</b></em>' literal with the specified literal
   * value. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static Bloque get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Bloque result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Bloque</b></em>' literal with the specified name. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static Bloque getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Bloque result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Bloque</b></em>' literal with the specified integer
   * value. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public static Bloque get(int value)
  {
    // switch (value)
    // {
    // case EMPTY_VALUE: return EMPTY;
    // }
    // return null;
    if (value < VALUES_ARRAY.length)
    {
      return VALUES_ARRAY[value];
    }
    else
      return null;
  }

  /**
   * Creates a new 'Bloque' and adds it to the end of the VALUES_ARRAY.
   * 
   * @param name
   * @param literal
   * @return
   * @generated NOT
   */
  public static Bloque createNewBloque(String name, String literal)
  {
    Bloque newBloque = new Bloque(VALUES_ARRAY.length, name, literal);

    Bloque[] aux = new Bloque[VALUES_ARRAY.length + 1];
    int i = 0;
    for (; i < VALUES_ARRAY.length; i++)
    {
      aux[i] = VALUES_ARRAY[i];
    }
    aux[i] = newBloque;

    VALUES_ARRAY = aux;

    return newBloque;
  }

  /**
   * Creates a new 'Bloque' with the given name and literal, and replace with it
   * the 'Bloque' in 'value' position.
   * 
   * @param value The value of the 'Bloque' to change.
   * @param name The new name.
   * @param literal The new literal.
   */
  public static Bloque changeBloqueNameAndLiteral(int value, String name,
      String literal)
  {
    Bloque bloque = new Bloque(value, name, literal);
    VALUES_ARRAY[value] = bloque;

    return bloque;
  }

  /**
   * Removes the 'Bloque' element with the given name.
   * 
   * @param name The name of the element to remove.
   */
  public static void removeBloque(String name)
  {
    Bloque[] aux = new Bloque[VALUES_ARRAY.length - 1];

    int oldArrayIndex = 0;
    int newArrayIndex = 0;

    for (; oldArrayIndex < VALUES_ARRAY.length; oldArrayIndex++)
    {
      Bloque bloque = VALUES_ARRAY[oldArrayIndex];
      if (!bloque.getName().equals(name))
      {
        // Insert all 'Bloque' elements except the removed
        aux[newArrayIndex] = bloque;
        newArrayIndex++;
      }
    }

    VALUES_ARRAY = aux;
  }
  
  /**
   * Removes all 'Bloque' objects (excepts the default objects).
   */
  public static void removeAllBloques()
  {
    VALUES_ARRAY = new Bloque[DEFAULT_VALUES_ARRAY.length];
    for (int i = 0; i < DEFAULT_VALUES_ARRAY.length; i++)
    {
      VALUES_ARRAY[i] = DEFAULT_VALUES_ARRAY[i];
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  private Bloque(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string
   * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
}
