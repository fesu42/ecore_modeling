
package de.whz.modeling.example.rcp.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;

import de.whz.modeling.example.project.Person;
import de.whz.modeling.example.project.ProjectPackage;
import de.whz.modeling.example.rcp.dialogs.CreateDialog;
import de.whz.modeling.example.rcp.helpers.DemoDataHelper;

public class CreateEmployeeHandler {

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {
		CreateDialog dialog = new CreateDialog(shell, ProjectPackage.eINSTANCE.getPerson());
		if (dialog.open() == IDialogConstants.OK_ID) {
			Person person = (Person) dialog.getCreatedEObject();
			if (person != null)
				DemoDataHelper.INSTANCE.getOrganization().getEmployees().add(person);
		}
	}

}