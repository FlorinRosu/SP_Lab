package lab.composite;

import java.io.Serializable;

public interface Element extends Serializable { /* Allows cloning by serialization */
	public void print();

	public void add(Element element);

	public void remove(Element element);

	public Element get(int index);

	public Element makeClone();
}
