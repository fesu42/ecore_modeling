package de.whz.modeling.example.rcp.dialogs;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.whz.modeling.example.project.ProjectFactory;

public class CreateDialog extends Dialog {

	private final EClass contextEClass;
	private final Map<EAttribute, Text> attributeMap = new HashMap<>();

	public CreateDialog(Shell parentShell, EClass contextEClass) {
		super(parentShell);
		this.contextEClass = contextEClass;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Create a new " + contextEClass.getName());
		newShell.setSize(600, 400);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite main = (Composite) super.createDialogArea(parent);
		main.setLayout(new GridLayout(2, false));
		GridDataFactory.fillDefaults().grab(true, true).applyTo(main);
		for (EAttribute attr : contextEClass.getEAllAttributes()) {
			new Label(main, SWT.NONE).setText(attr.getName());
			Text tx = new Text(main, SWT.BORDER);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(tx);
			attributeMap.put(attr, tx);
		}

		return main;
	}

	@Override
	protected void okPressed() {
		EObject object = ProjectFactory.eINSTANCE.create(contextEClass);
		for (EAttribute attr : attributeMap.keySet()) {
			if (attr.isChangeable()) {
				Text tx = attributeMap.get(attr);
				object.eSet(attr, convert(attr.getEType().getInstanceClass(), tx.getText()));
			}
		}
		createdEObject = object;
		super.okPressed();
	}

	@SuppressWarnings("unchecked")
	private <T> T convert(Class<T> type, String value) {
		if (type.equals(String.class)) {
			return (T) value;
		} else if (type.equals(UUID.class)) {
			try {
				UUID instance = UUID.fromString(value);
				return (T) instance;
			} catch (IllegalArgumentException e) {
				return (T) UUID.randomUUID();
			}
		} else if (type.equals(Integer.class)) {
			try {
				Integer instance = Integer.parseInt(value);
				return (T) instance;
			} catch (NumberFormatException e) {
				return (T) Integer.valueOf(0);
			}
		}
		return null;
	}

	private EObject createdEObject = null;

	public EObject getCreatedEObject() {
		return createdEObject;
	}

}
