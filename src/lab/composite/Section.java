package lab.composite;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.SerializationUtils;

import lab.visitor.Visitor;
import lombok.Getter;

public class Section implements Element {
	private static final long serialVersionUID = 1L;

	@Getter
	private String title;
	private List<Element> children;

	public Section(String title) {
		this.title = title;
		children = new ArrayList<Element>();
	}

	@Override
	public void render() {
		/* Add padding inbetween each section */
		System.out.println(String.format("\nSection: %s", title));
	}

	@Override
	public void add(Element element) {
		children.add(element.makeClone());
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

	@Override
	public Element makeClone() {
		return SerializationUtils.clone(this);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public int getChildrenCount() {
		return children.size();
	}
}
