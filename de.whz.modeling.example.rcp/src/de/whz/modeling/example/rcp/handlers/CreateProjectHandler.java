
package de.whz.modeling.example.rcp.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;

import de.whz.modeling.example.project.Project;
import de.whz.modeling.example.project.ProjectPackage;
import de.whz.modeling.example.rcp.dialogs.CreateDialog;
import de.whz.modeling.example.rcp.helpers.DemoDataHelper;

public class CreateProjectHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {
		CreateDialog dialog = new CreateDialog(shell, ProjectPackage.eINSTANCE.getProject());
		if (dialog.open() == IDialogConstants.OK_ID) {
			Project project = (Project) dialog.getCreatedEObject();
			if (project != null)
				DemoDataHelper.INSTANCE.getOrganization().getProjects().add(project);
		}
	}

}