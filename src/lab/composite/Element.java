package lab.composite;

public interface Element {
	public void print();

	public void add(Element element);

	public void remove(Element element);

	public Element get(int index);
}
