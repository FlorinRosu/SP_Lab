package lab_1.decorator;

public class Paragraph extends BookComponent {
	private String title;

	public Paragraph(String title) {
		this.title=title;
	}

	@Override
	public void print() {
		System.out.println(String.format("Paragraph title: %s", title));
	}

}
