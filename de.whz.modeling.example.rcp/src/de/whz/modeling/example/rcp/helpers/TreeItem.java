package de.whz.modeling.example.rcp.helpers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class TreeItem {

	private final String name;
	private final Object parent;
	private final EObject semanticElement;
	private final EReference semanticReference;
	
	public TreeItem(String name, EObject semanticObject, EReference semanticReference, Object parent) {
		this.name = name;
		this.semanticElement = semanticObject;
		if (! semanticReference.isMany())
			throw new IllegalArgumentException("Passed Reference " + semanticReference.getName() + " must be multivalued!");
		this.semanticReference = semanticReference;
		this.parent = parent;
	}
	
	public Object getParent() {
		return parent;
	}
	
	public String getName() {
		return name;
	}
	
	public EObject getSemanticElement() {
		return semanticElement;
	}
	
	public EReference getSemanticReference() {
		return semanticReference;
	}
	
	@SuppressWarnings("unchecked")
	public List<EObject> getChildren() {
		return (List<EObject>) semanticElement.eGet(semanticReference);
	}
	
}
