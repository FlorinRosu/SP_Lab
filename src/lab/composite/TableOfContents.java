package lab.composite;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.SerializationUtils;

import lab.exception.TableOfContentsNestingException;
import lab.visitor.Visitor;

public class TableOfContents implements Element {
	private static final long serialVersionUID = 1L;
	private List<TableOfContentsEntry> contentList;
	
	public TableOfContents() {
		contentList = new ArrayList<TableOfContentsEntry>();
	}

	@Override
	public void render() {
		System.out.println("Table of contents: ");
	}

	@Override
	public void add(Element element) {
		if(!(element instanceof TableOfContentsEntry)) {
			throw new TableOfContentsNestingException("Can only nest instances of TableOfContentsEntry.");
		}
		
		contentList.add((TableOfContentsEntry)element.makeClone());
	}

	@Override
	public void remove(Element element) {
		contentList.remove(element);
	}

	@Override
	public Element get(int index) {
		/* Index out of bounds will be propagated if index is invalid */
		return contentList.get(index);
	}

	@Override
	public Element makeClone() {
		return SerializationUtils.clone(this);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public int getChildrenCount() {
		return contentList.size();
	}
}
