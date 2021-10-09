package lab_1.decorator;

public abstract class BookDecorator extends BookComponent {
	protected BookComponent bookComponent;

	public BookDecorator(BookComponent bookComponent) {
		this.bookComponent = bookComponent;
	}
}
