package lab.composite;

import org.apache.commons.lang3.SerializationUtils;

import lab.visitor.Visitor;

public class TableOfContents implements Element {
	private static final long serialVersionUID = 1L;

	@Override
	public void render() {
		System.out.println("Table of contents: ");
	}

	@Override
	public void add(Element element) {

	}

	@Override
	public void remove(Element element) {

	}

	@Override
	public Element get(int index) {
		return null;
	}

	@Override
	public Element makeClone() {
		return SerializationUtils.clone(this);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
