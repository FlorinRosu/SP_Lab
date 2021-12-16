package lab.visitor;

import lab.Book;
import lab.composite.Image;
import lab.composite.Paragraph;
import lab.composite.Section;
import lab.composite.Table;
import lab.composite.TableOfContents;
import lab.proxy.ImageProxy;

public class BookStatistics implements Visitor {

	public void printStatistics() {

	}
	
	@Override
	public void visit(Book book) {
		
	}

	@Override
	public void visit(Section section) {
		
	}

	@Override
	public void visit(TableOfContents toc) {
		
	}

	@Override
	public void visit(Paragraph paragraph) {
		
	}

	@Override
	public void visit(ImageProxy imageProxy) {
		
	}

	@Override
	public void visit(Image image) {
		
	}

	@Override
	public void visit(Table table) {
		
	}
	
}
