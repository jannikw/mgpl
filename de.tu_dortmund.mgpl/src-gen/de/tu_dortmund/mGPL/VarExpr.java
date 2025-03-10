/**
 * generated by Xtext 2.20.0
 */
package de.tu_dortmund.mGPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_dortmund.mGPL.VarExpr#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see de.tu_dortmund.mGPL.MGPLPackage#getVarExpr()
 * @model
 * @generated
 */
public interface VarExpr extends Expr
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Var)
   * @see de.tu_dortmund.mGPL.MGPLPackage#getVarExpr_Var()
   * @model containment="true"
   * @generated
   */
  Var getVar();

  /**
   * Sets the value of the '{@link de.tu_dortmund.mGPL.VarExpr#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Var value);

} // VarExpr
