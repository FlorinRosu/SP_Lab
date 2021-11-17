package lab.composite;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.SerializationUtils;

public class Image implements Element {
	private static final long serialVersionUID = 1L;

	private String url;

	public Image(String url) {
		this.url = url;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

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

	@Override
	public Element makeClone() {
		return SerializationUtils.clone(this);
	}
}
