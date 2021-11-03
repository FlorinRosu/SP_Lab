package lab.composite;

import org.apache.commons.lang3.SerializationUtils;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Paragraph implements Element {
	private static final long serialVersionUID = 1L;

	private String text;

	@Override
	public void print() {
		System.out.println(String.format("Paragraph: %s", text));
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
}
