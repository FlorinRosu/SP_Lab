package lab_2.subchapter_elements;

public class Paragraph extends Element{
	private String text;

	public Paragraph(String text) {
		this.text = text;
	}

	@Override
	public void print() {
		System.out.println(String.format("Paragraph text: %s", text));
	}
}
