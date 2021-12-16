package lab.composite;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.SerializationUtils;

import lab.proxy.ImageContent;
import lab.proxy.Picture;
import lab.proxy.PictureContent;
import lab.visitor.Visitor;

public class Image implements Picture, Element {
	private static final long serialVersionUID = 1L;

	private String url;
	private ImageContent content;

	public Image(String url) {
		this.url = url;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		content = new ImageContent(url);
	}

	@Override
	public void render() {
		System.out.println(String.format("Image: %s", url));
	}

	@Override
	public Element makeClone() {
		return SerializationUtils.clone(this);
	}

	@Override
	public String url() {
		return url;
	}

	@Override
	public Dimension dim() {
		return new Dimension(content.getWidth(), content.getHeight());
	}

	@Override
	public PictureContent content() {
		return content;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	/*
	 * Unused Element specific methods
	 * 
	 * 
	 */
	
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
