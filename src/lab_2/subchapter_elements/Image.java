package lab_2.subchapter_elements;

public class Image extends Element {
	private String imageName;

	public Image(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public void print() {
		System.out.println(String.format("Image name: %s", imageName));
	}

}
