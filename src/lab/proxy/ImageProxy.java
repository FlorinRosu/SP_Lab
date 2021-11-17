package lab.proxy;

import java.awt.Dimension;

import org.apache.commons.lang3.SerializationUtils;

import lab.composite.Element;
import lab.composite.Image;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImageProxy implements Picture, Element {
	private static final long serialVersionUID = 8467203770400944654L;

	@NonNull
	private String url;
	private Image realImg;

	@Override
	public String url() {
		return url;
	}

	@Override
	public Dimension dim() {
		return realImg != null ? realImg.dim() : null;
	}

	@Override
	public PictureContent content() {
		return realImg != null ? realImg.content() : null;
	}

	@Override
	public void print() {
		loadImage();
		realImg.print();
	}
	
	@Override
	public Element makeClone() {
		return SerializationUtils.clone(this);
	}

	private Image loadImage() {
		if (realImg == null) {
			realImg = new Image(url);
		}

		return realImg;
	}

	/*
	 * Unused Element specific methods
	 * 
	 * 
	 */
	
	@Override
	public void add(Element element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Element element) {
		
	}

	@Override
	public Element get(int index) {
		return null;
	}
}
