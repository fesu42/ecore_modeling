/**
 */
package de.whz.modeling.example.project.impl;

import java.util.Collection;

import java.util.UUID;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.whz.modeling.example.project.Organization;
import de.whz.modeling.example.project.Participant;
import de.whz.modeling.example.project.Person;
import de.whz.modeling.example.project.ProjectPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Person</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.whz.modeling.example.project.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.impl.PersonImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.impl.PersonImpl#getWeeklyWorkload <em>Weekly Workload</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.impl.PersonImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.impl.PersonImpl#getTotalWeeklyWorkload <em>Total Weekly Workload</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.impl.PersonImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.whz.modeling.example.project.impl.PersonImpl#getParticipates <em>Participates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final UUID UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected UUID uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeeklyWorkload() <em>Weekly Workload</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWeeklyWorkload()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WEEKLY_WORKLOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeeklyWorkload() <em>Weekly Workload</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWeeklyWorkload()
	 * @generated
	 * @ordered
	 */
	protected Integer weeklyWorkload = WEEKLY_WORKLOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalWeeklyWorkload() <em>Total Weekly Workload</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTotalWeeklyWorkload()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_WEEKLY_WORKLOAD_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getTotalWeeklyWorkload() <em>Total Weekly Workload</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTotalWeeklyWorkload()
	 * @generated
	 * @ordered
	 */
	protected Integer totalWeeklyWorkload = TOTAL_WEEKLY_WORKLOAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipates() <em>Participates</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParticipates()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participates;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UUID getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(UUID newUuid) {
		UUID oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PERSON__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getWeeklyWorkload() {
		return weeklyWorkload;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeeklyWorkload(Integer newWeeklyWorkload) {
		Integer oldWeeklyWorkload = weeklyWorkload;
		weeklyWorkload = newWeeklyWorkload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PERSON__WEEKLY_WORKLOAD, oldWeeklyWorkload, weeklyWorkload));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PERSON__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Integer getTotalWeeklyWorkload() {
		totalWeeklyWorkload = 0;
		for (Participant participant : getParticipates()) {
			totalWeeklyWorkload += participant.getWeeklyWorkload();
		}
		return totalWeeklyWorkload;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (eContainerFeatureID() != ProjectPackage.PERSON__ORGANIZATION) return null;
		return (Organization)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganization, ProjectPackage.PERSON__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		if (newOrganization != eInternalContainer() || (eContainerFeatureID() != ProjectPackage.PERSON__ORGANIZATION && newOrganization != null)) {
			if (EcoreUtil.isAncestor(this, newOrganization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, ProjectPackage.ORGANIZATION__EMPLOYEES, Organization.class, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PERSON__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipates() {
		if (participates == null) {
			participates = new EObjectWithInverseResolvingEList<Participant>(Participant.class, this, ProjectPackage.PERSON__PARTICIPATES, ProjectPackage.PARTICIPANT__PERSON);
		}
		return participates;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectPackage.PERSON__ORGANIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrganization((Organization)otherEnd, msgs);
			case ProjectPackage.PERSON__PARTICIPATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectPackage.PERSON__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case ProjectPackage.PERSON__PARTICIPATES:
				return ((InternalEList<?>)getParticipates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProjectPackage.PERSON__ORGANIZATION:
				return eInternalContainer().eInverseRemove(this, ProjectPackage.ORGANIZATION__EMPLOYEES, Organization.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectPackage.PERSON__NAME:
				return getName();
			case ProjectPackage.PERSON__UUID:
				return getUuid();
			case ProjectPackage.PERSON__WEEKLY_WORKLOAD:
				return getWeeklyWorkload();
			case ProjectPackage.PERSON__EMAIL:
				return getEmail();
			case ProjectPackage.PERSON__TOTAL_WEEKLY_WORKLOAD:
				return getTotalWeeklyWorkload();
			case ProjectPackage.PERSON__ORGANIZATION:
				return getOrganization();
			case ProjectPackage.PERSON__PARTICIPATES:
				return getParticipates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjectPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case ProjectPackage.PERSON__UUID:
				setUuid((UUID)newValue);
				return;
			case ProjectPackage.PERSON__WEEKLY_WORKLOAD:
				setWeeklyWorkload((Integer)newValue);
				return;
			case ProjectPackage.PERSON__EMAIL:
				setEmail((String)newValue);
				return;
			case ProjectPackage.PERSON__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case ProjectPackage.PERSON__PARTICIPATES:
				getParticipates().clear();
				getParticipates().addAll((Collection<? extends Participant>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProjectPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProjectPackage.PERSON__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case ProjectPackage.PERSON__WEEKLY_WORKLOAD:
				setWeeklyWorkload(WEEKLY_WORKLOAD_EDEFAULT);
				return;
			case ProjectPackage.PERSON__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ProjectPackage.PERSON__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case ProjectPackage.PERSON__PARTICIPATES:
				getParticipates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProjectPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProjectPackage.PERSON__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case ProjectPackage.PERSON__WEEKLY_WORKLOAD:
				return WEEKLY_WORKLOAD_EDEFAULT == null ? weeklyWorkload != null : !WEEKLY_WORKLOAD_EDEFAULT.equals(weeklyWorkload);
			case ProjectPackage.PERSON__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ProjectPackage.PERSON__TOTAL_WEEKLY_WORKLOAD:
				return TOTAL_WEEKLY_WORKLOAD_EDEFAULT == null ? totalWeeklyWorkload != null : !TOTAL_WEEKLY_WORKLOAD_EDEFAULT.equals(totalWeeklyWorkload);
			case ProjectPackage.PERSON__ORGANIZATION:
				return getOrganization() != null;
			case ProjectPackage.PERSON__PARTICIPATES:
				return participates != null && !participates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(", weeklyWorkload: ");
		result.append(weeklyWorkload);
		result.append(", email: ");
		result.append(email);
		result.append(", totalWeeklyWorkload: ");
		result.append(totalWeeklyWorkload);
		result.append(')');
		return result.toString();
	}

} // PersonImpl
