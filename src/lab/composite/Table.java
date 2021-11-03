package lab.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Table implements Element {
	private String footNote;

	@Override
	public void print() {
		System.out.println(String.format("Table: %s", footNote));
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
}
