package lab_2;

import java.util.ArrayList;
import java.util.List;

import lab_2.subchapter_elements.Image;
import lab_2.subchapter_elements.Paragraph;
import lab_2.subchapter_elements.Table;

public class SubChapter {
	private String name;
	private List<Image> images; // Composition
	private List<Paragraph> paragraphs; // Composition
	private List<Table> tables; // Composition

	public SubChapter(String name) {
		this.name = name;
		images = new ArrayList<Image>();
		paragraphs = new ArrayList<Paragraph>();
		tables = new ArrayList<Table>();
	}

	public void createNewParagraph(String text) {
		paragraphs.add(new Paragraph(text));
	}

	public void createNewImage(String imageName) {
		images.add(new Image(imageName));
	}

	public void createNewTable(String title) {
		tables.add(new Table(title));
	}

	public void print() {
		System.out.println(String.format("SubChapter Name: %s", name));
		images.forEach(Image::print);
		paragraphs.forEach(Paragraph::print);
		tables.forEach(Table::print);
	}

}
