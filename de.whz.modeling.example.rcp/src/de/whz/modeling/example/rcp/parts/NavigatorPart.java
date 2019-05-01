
package de.whz.modeling.example.rcp.parts;

import java.io.IOException;
import java.util.Collections;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuAdapter;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

import de.whz.modeling.example.project.IIdentifiable;
import de.whz.modeling.example.project.Organization;
import de.whz.modeling.example.rcp.Activator;
import de.whz.modeling.example.rcp.helpers.DataRepository;
import de.whz.modeling.example.rcp.helpers.DemoDataHelper;
import de.whz.modeling.example.rcp.helpers.TreeItem;
import de.whz.modeling.example.rcp.provider.OrganizationTreeContentProvider;

public class NavigatorPart {

//	private Resource res;

	@Inject
	private EPartService partService;
	@Inject
	private DataRepository dataRepository;

	@PostConstruct
	public void postConstruct(Composite parent) {
		Resource res = dataRepository.getResource();
		if (res == null) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Resource not loaded!"));
			MessageDialog.openError(parent.getShell(), "Error", "Could not load resource file!");
		}
		TreeViewer tree = new TreeViewer(parent);
		tree.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof IIdentifiable) {
					return ((IIdentifiable) element).getName();
				} else if (element instanceof TreeItem) {
					return ((TreeItem) element).getName();
				}
				return element.toString() + " :: " + element.getClass().getSimpleName();
			}
		});
		tree.setContentProvider(new OrganizationTreeContentProvider());
		tree.getTree().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				Object selection = tree.getStructuredSelection().getFirstElement();
				if (selection instanceof EObject) {
					MPart genericEditor = partService.createPart(GenericEObjectViewPart.PART_ID);
					partService.showPart(genericEditor, PartState.ACTIVATE);
					((IEditor) genericEditor.getObject()).setInput((EObject) selection);
				}
			}

		});
		tree.setInput(res);
		tree.refresh();
		tree.expandAll();

		MenuManager menuManager = new MenuManager("Popup");
		Menu menu = menuManager.createContextMenu(tree.getControl());
		tree.getControl().setMenu(menu);
		menu.addMenuListener(new MenuAdapter() {
			@Override
			public void menuShown(MenuEvent e) {
				MenuItem menuItem = new MenuItem(menu, SWT.PUSH);
				menuItem.setText("Refresh");
				menuItem.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						tree.refresh();
						tree.expandAll();
					}
				});
			}
		});
		menuManager.setRemoveAllWhenShown(true);
	}

}