package lab_1.decorator;

public class Image extends BookDecorator {
	private String footNote;

	public Image(BookComponent bookComponent, String footNote) {
		super(bookComponent);
		this.footNote = footNote;
	}

	@Override
	public void print() {
		bookComponent.print();
		System.out.println(String.format("Image foot note: %s", footNote));
	}

}
