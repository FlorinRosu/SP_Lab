package lab.composite;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.SerializationUtils;

import lab.exception.TableOfContentsNestingException;
import lab.visitor.Visitor;

public class TableOfContentsEntry implements Element {
	private static final long serialVersionUID = 6876712191410202292L;
	
	private String title;
	private List<TableOfContentsEntry> subentries;
	
	public TableOfContentsEntry(String title) {
		this.title = title;
		subentries = new ArrayList<TableOfContentsEntry>();
	}

	@Override
	public void render() {
		System.out.println(title);
	}

	@Override
	public void add(Element element) {
		if(!(element instanceof TableOfContentsEntry)) {
			throw new TableOfContentsNestingException("Can only nest instances of TableOfContentsEntry.");
		}
		
		subentries.add((TableOfContentsEntry)element.makeClone());
	}

	@Override
	public void remove(Element element) {
		subentries.remove(element);
	}

	@Override
	public Element get(int index) {
		/* Index out of bounds will be propagated if index is invalid */
		return subentries.get(index);
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
		return subentries.size();
	}
	
}
