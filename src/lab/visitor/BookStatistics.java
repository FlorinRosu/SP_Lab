package lab.visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import lab.Book;
import lab.composite.Image;
import lab.composite.Paragraph;
import lab.composite.Section;
import lab.composite.Table;
import lab.composite.TableOfContents;
import lab.composite.TableOfContentsEntry;
import lab.proxy.ImageProxy;

public class BookStatistics implements Visitor {
	private Map<Class<?>, Integer> elementOccurrenceMap;

	public BookStatistics() {
		elementOccurrenceMap = new HashMap<Class<?>, Integer>();
	}

	public void printStatistics() {
		System.out.println("Book statistics:");
		elementOccurrenceMap.forEach((elementClass, occurrence) -> System.out.println(
				String.format("*** Number of %ss: %s", elementClass.getSimpleName().toLowerCase(), occurrence)));
	}

	@Override
	public void visit(Book book) {
		/* Accept visitor for all children of book */
		IntStream.range(0, book.getChildrenCount()).mapToObj(i -> book.get(i))
				.forEach(element -> element.accept(this));
	}

	@Override
	public void visit(Section section) {
		/* Accept visitor for all children of section */
		IntStream.range(0, section.getChildrenCount()).mapToObj(i -> section.get(i))
				.forEach(element -> element.accept(this));
	}

	@Override
	public void visit(TableOfContents toc) {
		/* Do nothing */
	}
	
	@Override
	public void visit(TableOfContentsEntry tableOfContentsEntry) {
		/* Do nothing */
	}

	@Override
	public void visit(Paragraph paragraph) {
		elementOccurrenceMap.put(paragraph.getClass(), elementOccurrenceMap.getOrDefault(paragraph.getClass(), 0) + 1);
	}

	@Override
	public void visit(ImageProxy imageProxy) {
		/* Special case - ImageProxy must be interpreted as Image when visited */
		elementOccurrenceMap.put(Image.class, elementOccurrenceMap.getOrDefault(Image.class, 0) + 1);
	}

	@Override
	public void visit(Image image) {
		elementOccurrenceMap.put(image.getClass(), elementOccurrenceMap.getOrDefault(image.getClass(), 0) + 1);
	}

	@Override
	public void visit(Table table) {
		elementOccurrenceMap.put(table.getClass(), elementOccurrenceMap.getOrDefault(table.getClass(), 0) + 1);
	}

}
