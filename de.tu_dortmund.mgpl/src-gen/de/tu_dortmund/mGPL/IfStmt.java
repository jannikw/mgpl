/**
 * generated by Xtext 2.20.0
 */
package de.tu_dortmund.mGPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_dortmund.mGPL.IfStmt#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.tu_dortmund.mGPL.IfStmt#getThen <em>Then</em>}</li>
 *   <li>{@link de.tu_dortmund.mGPL.IfStmt#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see de.tu_dortmund.mGPL.MGPLPackage#getIfStmt()
 * @model
 * @generated
 */
public interface IfStmt extends Stmt
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expr)
   * @see de.tu_dortmund.mGPL.MGPLPackage#getIfStmt_Condition()
   * @model containment="true"
   * @generated
   */
  Expr getCondition();

  /**
   * Sets the value of the '{@link de.tu_dortmund.mGPL.IfStmt#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expr value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(StmtBlock)
   * @see de.tu_dortmund.mGPL.MGPLPackage#getIfStmt_Then()
   * @model containment="true"
   * @generated
   */
  StmtBlock getThen();

  /**
   * Sets the value of the '{@link de.tu_dortmund.mGPL.IfStmt#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(StmtBlock value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(StmtBlock)
   * @see de.tu_dortmund.mGPL.MGPLPackage#getIfStmt_Else()
   * @model containment="true"
   * @generated
   */
  StmtBlock getElse();

  /**
   * Sets the value of the '{@link de.tu_dortmund.mGPL.IfStmt#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(StmtBlock value);

} // IfStmt
