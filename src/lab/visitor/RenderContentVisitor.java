package lab.visitor;

import lab.Book;
import lab.composite.Image;
import lab.composite.Paragraph;
import lab.composite.Section;
import lab.composite.Table;
import lab.composite.TableOfContents;
import lab.proxy.ImageProxy;

public class RenderContentVisitor implements Visitor {

	@Override
	public void visit(Book book) {
		book.render();
	}

	@Override
	public void visit(Section section) {
		section.render();
	}

	@Override
	public void visit(TableOfContents toc) {
		toc.render();
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
	
}
