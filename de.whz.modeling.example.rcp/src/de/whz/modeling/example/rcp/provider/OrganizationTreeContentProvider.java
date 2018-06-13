package de.whz.modeling.example.rcp.provider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;

import de.whz.modeling.example.project.Organization;
import de.whz.modeling.example.project.ProjectPackage;
import de.whz.modeling.example.rcp.helpers.TreeItem;

public class OrganizationTreeContentProvider implements ITreeContentProvider {

	private final Object[] EMPTY_ARRAY = new Object[] {};
	
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Resource) {
			EObject root = ((Resource) inputElement).getContents().get(0);
			return ArrayContentProvider.getInstance().getElements(Collections.singleton(root));
		}
		return ArrayContentProvider.getInstance().getElements(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof TreeItem)
			return ((TreeItem) parentElement).getChildren().toArray();
		
		List<TreeItem> treeItems = new ArrayList<>();
		if (parentElement instanceof Organization) {
			treeItems.add(new TreeItem("Projects", (Organization) parentElement, ProjectPackage.eINSTANCE.getOrganization_Projects(), parentElement));
			treeItems.add(new TreeItem("Employees", (Organization) parentElement, ProjectPackage.eINSTANCE.getOrganization_Employees(), parentElement));
			return treeItems.toArray();
		}
		
		return EMPTY_ARRAY;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof TreeItem) {
			return ((TreeItem)element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

}
