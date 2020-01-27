/**
 * generated by Xtext 2.20.0
 */
package de.tu_dortmund.mGPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_dortmund.mGPL.Assignment#getVar <em>Var</em>}</li>
 *   <li>{@link de.tu_dortmund.mGPL.Assignment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.tu_dortmund.mGPL.MGPLPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends AssStmt
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Var)
   * @see de.tu_dortmund.mGPL.MGPLPackage#getAssignment_Var()
   * @model containment="true"
   * @generated
   */
  Var getVar();

  /**
   * Sets the value of the '{@link de.tu_dortmund.mGPL.Assignment#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Var value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expr)
   * @see de.tu_dortmund.mGPL.MGPLPackage#getAssignment_Value()
   * @model containment="true"
   * @generated
   */
  Expr getValue();

  /**
   * Sets the value of the '{@link de.tu_dortmund.mGPL.Assignment#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expr value);

} // Assignment
