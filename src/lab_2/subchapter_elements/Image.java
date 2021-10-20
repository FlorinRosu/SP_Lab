package lab_2.subchapter_elements;

public class Image{
	private String imageName;

	public Image(String imageName) {
		this.imageName = imageName;
	}

	public void print() {
		System.out.println(String.format("Image name: %s", imageName));
	}

}
