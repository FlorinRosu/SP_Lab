package lab.proxy;

import java.security.SecureRandom;

import lombok.Getter;

public class ImageContent implements PictureContent {
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
