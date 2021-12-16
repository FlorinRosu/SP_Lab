package lab.composite;

import java.io.Serializable;

import lab.visitor.Visitor;

public interface Element extends Serializable { /* Allows cloning by serialization */
	public void render();

	public void add(Element element);

	public void remove(Element element);

	public Element get(int index);
	
	public int getChildrenCount();

	public Element makeClone();
	
	public void accept(Visitor visitor);
}
