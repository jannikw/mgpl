/**
 * generated by Xtext 2.20.0
 */
package de.tu_dortmund.mGPL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Key Stroke</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_dortmund.mGPL.MGPLPackage#getKeyStroke()
 * @model
 * @generated
 */
public enum KeyStroke implements Enumerator
{
  /**
   * The '<em><b>SPACE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SPACE_VALUE
   * @generated
   * @ordered
   */
  SPACE(0, "SPACE", "space"),

  /**
   * The '<em><b>LEFT ARROW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEFT_ARROW_VALUE
   * @generated
   * @ordered
   */
  LEFT_ARROW(1, "LEFT_ARROW", "leftarrow"),

  /**
   * The '<em><b>RIGHT ARROW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RIGHT_ARROW_VALUE
   * @generated
   * @ordered
   */
  RIGHT_ARROW(2, "RIGHT_ARROW", "rightarrow"),

  /**
   * The '<em><b>UP ARROW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UP_ARROW_VALUE
   * @generated
   * @ordered
   */
  UP_ARROW(3, "UP_ARROW", "uparrow"),

  /**
   * The '<em><b>DOWN ARROW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOWN_ARROW_VALUE
   * @generated
   * @ordered
   */
  DOWN_ARROW(4, "DOWN_ARROW", "downarrow");

  /**
   * The '<em><b>SPACE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SPACE
   * @model literal="space"
   * @generated
   * @ordered
   */
  public static final int SPACE_VALUE = 0;

  /**
   * The '<em><b>LEFT ARROW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEFT_ARROW
   * @model literal="leftarrow"
   * @generated
   * @ordered
   */
  public static final int LEFT_ARROW_VALUE = 1;

  /**
   * The '<em><b>RIGHT ARROW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RIGHT_ARROW
   * @model literal="rightarrow"
   * @generated
   * @ordered
   */
  public static final int RIGHT_ARROW_VALUE = 2;

  /**
   * The '<em><b>UP ARROW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UP_ARROW
   * @model literal="uparrow"
   * @generated
   * @ordered
   */
  public static final int UP_ARROW_VALUE = 3;

  /**
   * The '<em><b>DOWN ARROW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOWN_ARROW
   * @model literal="downarrow"
   * @generated
   * @ordered
   */
  public static final int DOWN_ARROW_VALUE = 4;

  /**
   * An array of all the '<em><b>Key Stroke</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final KeyStroke[] VALUES_ARRAY =
    new KeyStroke[]
    {
      SPACE,
      LEFT_ARROW,
      RIGHT_ARROW,
      UP_ARROW,
      DOWN_ARROW,
    };

  /**
   * A public read-only list of all the '<em><b>Key Stroke</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<KeyStroke> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Key Stroke</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static KeyStroke get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      KeyStroke result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Key Stroke</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static KeyStroke getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      KeyStroke result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Key Stroke</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static KeyStroke get(int value)
  {
    switch (value)
    {
      case SPACE_VALUE: return SPACE;
      case LEFT_ARROW_VALUE: return LEFT_ARROW;
      case RIGHT_ARROW_VALUE: return RIGHT_ARROW;
      case UP_ARROW_VALUE: return UP_ARROW;
      case DOWN_ARROW_VALUE: return DOWN_ARROW;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private KeyStroke(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //KeyStroke
