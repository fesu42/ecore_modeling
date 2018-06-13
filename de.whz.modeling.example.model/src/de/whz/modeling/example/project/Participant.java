/**
 */
package de.whz.modeling.example.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.whz.modeling.example.project.Participant#getRole <em>Role</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.Participant#getWeeklyWorkload <em>Weekly Workload</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.Participant#getProject <em>Project</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.Participant#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see de.whz.modeling.example.project.ProjectPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link de.whz.modeling.example.project.ParticipantRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see de.whz.modeling.example.project.ParticipantRole
	 * @see #setRole(ParticipantRole)
	 * @see de.whz.modeling.example.project.ProjectPackage#getParticipant_Role()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParticipantRole getRole();

	/**
	 * Sets the value of the '{@link de.whz.modeling.example.project.Participant#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see de.whz.modeling.example.project.ParticipantRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ParticipantRole value);

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
	 * @see de.whz.modeling.example.project.ProjectPackage#getParticipant_WeeklyWorkload()
	 * @model dataType="de.whz.modeling.example.project.HoursPerWeek" required="true" ordered="false"
	 * @generated
	 */
	Integer getWeeklyWorkload();

	/**
	 * Sets the value of the '{@link de.whz.modeling.example.project.Participant#getWeeklyWorkload <em>Weekly Workload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weekly Workload</em>' attribute.
	 * @see #getWeeklyWorkload()
	 * @generated
	 */
	void setWeeklyWorkload(Integer value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.whz.modeling.example.project.Project#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see de.whz.modeling.example.project.ProjectPackage#getParticipant_Project()
	 * @see de.whz.modeling.example.project.Project#getParticipant
	 * @model opposite="participant" required="true" transient="false" ordered="false"
	 *        annotation="http://www.vsd-project.org/vsee/annotation/description text=''"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link de.whz.modeling.example.project.Participant#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.whz.modeling.example.project.Person#getParticipates <em>Participates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see de.whz.modeling.example.project.ProjectPackage#getParticipant_Person()
	 * @see de.whz.modeling.example.project.Person#getParticipates
	 * @model opposite="participates" required="true" ordered="false"
	 *        annotation="http://www.vsd-project.org/vsee/annotation/description text=''"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link de.whz.modeling.example.project.Participant#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // Participant
