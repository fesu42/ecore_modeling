/**
 */
package de.whz.modeling.example.project.impl;

import de.whz.modeling.example.project.Participant;
import de.whz.modeling.example.project.ParticipantRole;
import de.whz.modeling.example.project.Person;
import de.whz.modeling.example.project.Project;
import de.whz.modeling.example.project.ProjectPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.whz.modeling.example.project.impl.ParticipantImpl#getRole <em>Role</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.impl.ParticipantImpl#getWeeklyWorkload <em>Weekly Workload</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.impl.ParticipantImpl#getProject <em>Project</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.impl.ParticipantImpl#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final ParticipantRole ROLE_EDEFAULT = ParticipantRole.DEVELOPER;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected ParticipantRole role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeeklyWorkload() <em>Weekly Workload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeeklyWorkload()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WEEKLY_WORKLOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeeklyWorkload() <em>Weekly Workload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeeklyWorkload()
	 * @generated
	 * @ordered
	 */
	protected Integer weeklyWorkload = WEEKLY_WORKLOAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectPackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(ParticipantRole newRole) {
		ParticipantRole oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PARTICIPANT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getWeeklyWorkload() {
		return weeklyWorkload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeeklyWorkload(Integer newWeeklyWorkload) {
		Integer oldWeeklyWorkload = weeklyWorkload;
		weeklyWorkload = newWeeklyWorkload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PARTICIPANT__WEEKLY_WORKLOAD, oldWeeklyWorkload, weeklyWorkload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (eContainerFeatureID() != ProjectPackage.PARTICIPANT__PROJECT) return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, ProjectPackage.PARTICIPANT__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != ProjectPackage.PARTICIPANT__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, ProjectPackage.PROJECT__PARTICIPANT, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PARTICIPANT__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectPackage.PARTICIPANT__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectPackage.PARTICIPANT__PERSON, oldPerson, newPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject)person).eInverseRemove(this, ProjectPackage.PERSON__PARTICIPATES, Person.class, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, ProjectPackage.PERSON__PARTICIPATES, Person.class, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PARTICIPANT__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectPackage.PARTICIPANT__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((Project)otherEnd, msgs);
			case ProjectPackage.PARTICIPANT__PERSON:
				if (person != null)
					msgs = ((InternalEObject)person).eInverseRemove(this, ProjectPackage.PERSON__PARTICIPATES, Person.class, msgs);
				return basicSetPerson((Person)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectPackage.PARTICIPANT__PROJECT:
				return basicSetProject(null, msgs);
			case ProjectPackage.PARTICIPANT__PERSON:
				return basicSetPerson(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProjectPackage.PARTICIPANT__PROJECT:
				return eInternalContainer().eInverseRemove(this, ProjectPackage.PROJECT__PARTICIPANT, Project.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectPackage.PARTICIPANT__ROLE:
				return getRole();
			case ProjectPackage.PARTICIPANT__WEEKLY_WORKLOAD:
				return getWeeklyWorkload();
			case ProjectPackage.PARTICIPANT__PROJECT:
				return getProject();
			case ProjectPackage.PARTICIPANT__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjectPackage.PARTICIPANT__ROLE:
				setRole((ParticipantRole)newValue);
				return;
			case ProjectPackage.PARTICIPANT__WEEKLY_WORKLOAD:
				setWeeklyWorkload((Integer)newValue);
				return;
			case ProjectPackage.PARTICIPANT__PROJECT:
				setProject((Project)newValue);
				return;
			case ProjectPackage.PARTICIPANT__PERSON:
				setPerson((Person)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProjectPackage.PARTICIPANT__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case ProjectPackage.PARTICIPANT__WEEKLY_WORKLOAD:
				setWeeklyWorkload(WEEKLY_WORKLOAD_EDEFAULT);
				return;
			case ProjectPackage.PARTICIPANT__PROJECT:
				setProject((Project)null);
				return;
			case ProjectPackage.PARTICIPANT__PERSON:
				setPerson((Person)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProjectPackage.PARTICIPANT__ROLE:
				return role != ROLE_EDEFAULT;
			case ProjectPackage.PARTICIPANT__WEEKLY_WORKLOAD:
				return WEEKLY_WORKLOAD_EDEFAULT == null ? weeklyWorkload != null : !WEEKLY_WORKLOAD_EDEFAULT.equals(weeklyWorkload);
			case ProjectPackage.PARTICIPANT__PROJECT:
				return getProject() != null;
			case ProjectPackage.PARTICIPANT__PERSON:
				return person != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (role: ");
		result.append(role);
		result.append(", weeklyWorkload: ");
		result.append(weeklyWorkload);
		result.append(')');
		return result.toString();
	}

} //ParticipantImpl
