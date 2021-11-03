package lab.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import lab.Book;
import lab.composite.Element;
import lab.composite.Paragraph;
import lab.composite.Section;

public class BookTest {
	private Book book;

	@Before
	public void setUp() throws Exception {
		book = new Book("Booktitle");
		
		Element sectionOne = new Section("First section");
		sectionOne.add(new Paragraph("First paragraph"));
		book.add(sectionOne);
	}

	@Test
	public void clonedElementShouldHaveDifferentReference() {
		// Given
		Element firstElement = book.get(0);
		book.add(firstElement);
		
		Element secondElement = book.get(1);
		Element firstElementInner = firstElement.get(0);
		Element secondElementInner = secondElement.get(0);
		
		// Then
		assertThat(firstElement).isNotSameAs(secondElement);
		assertThat(firstElementInner).isNotSameAs(secondElementInner);
	}
}
