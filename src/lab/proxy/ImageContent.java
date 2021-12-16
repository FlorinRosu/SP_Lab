package lab.proxy;

import java.io.Serializable;
import java.security.SecureRandom;

import lombok.Getter;

public class ImageContent implements PictureContent, Serializable{
	private static final long serialVersionUID = -5666804541193784768L;
	
	@Getter
	private String url;
	@Getter
	private int width;
	@Getter
	private int height;
	@Getter
	private byte[] bytes;
	
	public ImageContent(String url) {
		this.url = url;
		bytes = new byte[1024];
		new SecureRandom().nextBytes(bytes);
	}
}
