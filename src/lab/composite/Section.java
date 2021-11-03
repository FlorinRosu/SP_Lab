package lab.composite;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Section implements Element {
	@Getter
	private String title;
	private List<Element> children;

	public Section(String title) {
		this.title = title;
		children = new ArrayList<Element>();
	}

	@Override
	public void print() {
		/* Add padding inbetween each section */
		System.out.println(String.format("\nSection: %s", title));

		children.forEach(Element::print);
	}

	@Override
	public void add(Element element) {
		children.add(element);
	}

	@Override
	public void remove(Element element) {
		children.remove(element);
	}

	@Override
	public Element get(int index) {
		/* Index out of bounds will be propagated if index is invalid */
		return children.get(index);
	}
}
