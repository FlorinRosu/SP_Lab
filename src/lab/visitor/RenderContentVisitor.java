package lab.visitor;

import java.util.stream.IntStream;

import lab.Book;
import lab.composite.Image;
import lab.composite.Paragraph;
import lab.composite.Section;
import lab.composite.Table;
import lab.composite.TableOfContents;
import lab.composite.TableOfContentsEntry;
import lab.proxy.ImageProxy;

public class RenderContentVisitor implements Visitor {

	@Override
	public void visit(Book book) {
		book.render();
	}

	@Override
	public void visit(Section section) {
		section.render();

		/* Accept visitor for all children of section */
		IntStream.range(0, section.getChildrenCount()).mapToObj(i -> section.get(i))
				.forEach(element -> element.accept(this));
	}

	@Override
	public void visit(TableOfContents toc) {
		toc.render();
		
		/* Accept visitor for all children of table of contents */
		IntStream.range(0, toc.getChildrenCount()).mapToObj(i -> toc.get(i))
				.forEach(element -> element.accept(this));
	}

	@Override
	public void visit(Paragraph paragraph) {
		paragraph.render();
	}

	@Override
	public void visit(ImageProxy imageProxy) {
		imageProxy.render();
	}

	@Override
	public void visit(Image image) {
		image.render();
	}

	@Override
	public void visit(Table table) {
		table.render();
	}

	@Override
	public void visit(TableOfContentsEntry tableOfContentsEntry) {
		tableOfContentsEntry.render();
		
		/* Accept visitor for all children of table of contents entry */
		IntStream.range(0, tableOfContentsEntry.getChildrenCount()).mapToObj(i -> tableOfContentsEntry.get(i))
				.forEach(element -> element.accept(this));
	}
	
}
