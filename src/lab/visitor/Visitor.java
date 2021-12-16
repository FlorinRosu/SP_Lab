package lab.visitor;

import lab.Book;
import lab.composite.Image;
import lab.composite.Paragraph;
import lab.composite.Section;
import lab.composite.Table;
import lab.composite.TableOfContents;
import lab.proxy.ImageProxy;

public interface Visitor {
	public void visit(Book book);
	public void visit(Section section);
	public void visit(TableOfContents toc);
	public void visit(Paragraph paragraph);
	public void visit(ImageProxy imageProxy);
	public void visit(Image image);
	public void visit(Table table);
}
