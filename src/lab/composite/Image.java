package lab.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Image implements Element {
	private String url;

	@Override
	public void print() {
		System.out.println(String.format("Image: %s", url));
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
