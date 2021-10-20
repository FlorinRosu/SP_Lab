package lab_2.subchapter_elements;

public class Paragraph{
	private String text;

	public Paragraph(String text) {
		this.text = text;
	}

	public void print() {
		System.out.println(String.format("Paragraph text: %s", text));
	}
}
