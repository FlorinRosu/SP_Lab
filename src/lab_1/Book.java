package lab_1;

import java.util.ArrayList;
import java.util.List;

import lab_1.decorator.BookComponent;
import lab_1.decorator.Image;
import lab_1.decorator.Paragraph;
import lab_1.decorator.Table;

public class Book {
	private String title;
	private List<BookComponent> bookComponents;

	public Book(String title) {
		this.title = title;
		bookComponents = new ArrayList<BookComponent>();
	}

	public void createNewParagraph(String paragraphTitle) {
		bookComponents.add(new Paragraph(paragraphTitle));
	}

	public void createNewImage(String imageFootNote) {
		BookComponent bookComponent = fetchLastBookComponent();
		bookComponent = new Image(bookComponent, imageFootNote);
		updateLastBookComponent(bookComponent);
	}

	public void createNewTable(String tableLegend) {
		BookComponent bookComponent = fetchLastBookComponent();
		bookComponent = new Table(bookComponent, tableLegend);
		updateLastBookComponent(bookComponent);
	}

	public void print() {
		System.out.println(String.format("Book title: %s", title));
		bookComponents.forEach(BookComponent::print);
	}
	
	private BookComponent fetchLastBookComponent() {
		if(bookComponents.size() < 1) {
			throw new NoSuchComponentException();
		}
		
		return bookComponents.get(bookComponents.size() - 1);
	}
	
	private void updateLastBookComponent(BookComponent bookComponent) {
		if(bookComponents.size() < 1) {
			throw new NoSuchComponentException();
		}
		
		bookComponents.set(bookComponents.size() - 1, bookComponent);
	}

	public static void main(String[] args) {
		Book discoTitanic = new Book("Disco Titanic");
		discoTitanic.createNewParagraph("Paragraph 1");
		discoTitanic.createNewParagraph("Paragraph 2");
		discoTitanic.createNewParagraph("Paragraph 3");
		discoTitanic.createNewImage("Image 1");
		discoTitanic.createNewParagraph("Paragraph 4");
		discoTitanic.createNewTable("Table 1");
		discoTitanic.createNewParagraph("Paragraph 5");
		discoTitanic.print();
	}
}
