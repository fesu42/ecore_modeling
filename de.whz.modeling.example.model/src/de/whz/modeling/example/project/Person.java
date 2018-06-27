/**
 */
package de.whz.modeling.example.project;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.whz.modeling.example.project.Person#getWeeklyWorkload <em>Weekly Workload</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.Person#getTotalWeeklyWorkload <em>Total Weekly Workload</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.Person#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.Person#getParticipates <em>Participates</em>}</li>
 * </ul>
 *
 * @see de.whz.modeling.example.project.ProjectPackage#getPerson()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validWorkload'"
 * @generated
 */
public interface Person extends IIdentifiable {
	/**
	 * Returns the value of the '<em><b>Weekly Workload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weekly Workload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weekly Workload</em>' attribute.
	 * @see #setWeeklyWorkload(Integer)
	 * @see de.whz.modeling.example.project.ProjectPackage#getPerson_WeeklyWorkload()
	 * @model dataType="de.whz.modeling.example.project.HoursPerWeek" required="true" ordered="false"
	 * @generated
	 */
	Integer getWeeklyWorkload();

	/**
	 * Sets the value of the '{@link de.whz.modeling.example.project.Person#getWeeklyWorkload <em>Weekly Workload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weekly Workload</em>' attribute.
	 * @see #getWeeklyWorkload()
	 * @generated
	 */
	void setWeeklyWorkload(Integer value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see de.whz.modeling.example.project.ProjectPackage#getPerson_Email()
	 * @model dataType="de.whz.modeling.example.project.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link de.whz.modeling.example.project.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Total Weekly Workload</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Weekly Workload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Weekly Workload</em>' attribute.
	 * @see de.whz.modeling.example.project.ProjectPackage#getPerson_TotalWeeklyWorkload()
	 * @model default="0" dataType="de.whz.modeling.example.project.HoursPerWeek" required="true" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	Integer getTotalWeeklyWorkload();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.whz.modeling.example.project.Organization#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(Organization)
	 * @see de.whz.modeling.example.project.ProjectPackage#getPerson_Organization()
	 * @see de.whz.modeling.example.project.Organization#getEmployees
	 * @model opposite="employees" required="true" transient="false" ordered="false"
	 *        annotation="http://www.vsd-project.org/vsee/annotation/description text=''"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link de.whz.modeling.example.project.Person#getOrganization <em>Organization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' container reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Participates</b></em>' reference list.
	 * The list contents are of type {@link de.whz.modeling.example.project.Participant}.
	 * It is bidirectional and its opposite is '{@link de.whz.modeling.example.project.Participant#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participates</em>' reference list.
	 * @see de.whz.modeling.example.project.ProjectPackage#getPerson_Participates()
	 * @see de.whz.modeling.example.project.Participant#getPerson
	 * @model opposite="person" ordered="false"
	 *        annotation="http://www.vsd-project.org/vsee/annotation/description text=''"
	 * @generated
	 */
	EList<Participant> getParticipates();

} // Person
