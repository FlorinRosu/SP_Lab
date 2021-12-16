package lab.visitor;

import lab.Book;
import lab.composite.Image;
import lab.composite.Paragraph;
import lab.composite.Section;
import lab.composite.Table;
import lab.composite.TableOfContents;
import lab.composite.TableOfContentsEntry;
import lab.proxy.ImageProxy;
import lombok.Getter;

public class GenerateTOC implements Visitor {
	@Getter
	private TableOfContents toc;

	public GenerateTOC() {
		toc = new TableOfContents();
	}

	@Override
	public void visit(Section section) {
		/* 
		 * Table of contents may only contain sections
		 * 
		 * TocGeneratorHelper traverses section recursively and 
		 * creates nested table of contents entries
		 */
		toc.add(TocGeneratorHelper.traverseSection(section, toc.getChildrenCount()+1));
	}

	@Override
	public void visit(Book book) {
		/* Do nothing */
	}

	@Override
	public void visit(TableOfContents toc) {
		/* Do nothing */
	}

	@Override
	public void visit(Paragraph paragraph) {
		/* Do nothing */
	}

	@Override
	public void visit(ImageProxy imageProxy) {
		/* Do nothing */
	}

	@Override
	public void visit(Image image) {
		/* Do nothing */
	}

	@Override
	public void visit(Table table) {
		/* Do nothing */
	}

	@Override
	public void visit(TableOfContentsEntry tableOfContentsEntry) {
		/* Do nothing */
	}

}
