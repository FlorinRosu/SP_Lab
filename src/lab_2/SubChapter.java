package lab_2;

import java.util.ArrayList;
import java.util.List;

import lab_2.subchapter_elements.Element;
import lab_2.subchapter_elements.Image;
import lab_2.subchapter_elements.Paragraph;
import lab_2.subchapter_elements.Table;

public class SubChapter {
	private String name;
	private List<Element> elements;

	public SubChapter(String name) {
		this.name = name;
		elements = new ArrayList<Element>();
	}

	public void createNewParagraph(String text) {
		elements.add(new Paragraph(text));
	}

	public void createNewImage(String imageName) {
		elements.add(new Image(imageName));
	}

	public void createNewTable(String title) {
		elements.add(new Table(title));
	}

	public void print() {
		System.out.println(String.format("SubChapter Name: %s", name));
		elements.forEach(Element::print);
	}

}
