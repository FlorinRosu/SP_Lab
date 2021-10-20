package lab_2;

import java.util.ArrayList;
import java.util.List;

import lab_2.miscellaneous.AuthorAlreadyExistsException;
import lab_2.miscellaneous.NoSuchChapterException;

public class Book {
	private String title;
	private List<Author> authors; // Aggregation
	private List<Chapter> chapters; // Composition
	private TableOfContents tableOfContents; // Association

	public Book(String title) {
		this.title = title;
		authors = new ArrayList<Author>();
		chapters = new ArrayList<Chapter>();
	}

	private int createChapter(String title) {
		Chapter chapterToBeAdded = new Chapter(title);
		chapters.add(chapterToBeAdded);
		return chapters.indexOf(chapterToBeAdded);
	}

	private Chapter getChapter(int indexChapter) {
		if (indexChapter >= chapters.size()) {
			throw new NoSuchChapterException(String.format("%s", indexChapter));
		}
		return chapters.get(indexChapter);
	}
	
	public void addAuthor(Author author) {
		if (isAuthorExistent(author.getName())) {
			throw new AuthorAlreadyExistsException(author.getName());
		}
		authors.add(author);
	}

	public void print() {
		System.out.println(String.format("Book title: %s", title));
		authors.forEach(Author::print);
		chapters.forEach(Chapter::print);
	}
	
	private boolean isAuthorExistent(String name) {
		return authors.stream().filter(author -> author.getName().equals(name)).findAny().isPresent();
	}

	public static void main(String[] args) {
		Book discoTitanic = new Book("Disco Titanic");
		Author rpGheo = new Author("Radu Pavel Gheo");
		discoTitanic.addAuthor(rpGheo);
		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		scOneOne.createNewParagraph("Paragraph 1");
		scOneOne.createNewParagraph("Paragraph 2");
		scOneOne.createNewParagraph("Paragraph 3");
		scOneOne.createNewImage("Image 1");
		scOneOne.createNewParagraph("Paragraph 4");
		scOneOne.createNewTable("Table 1");
		scOneOne.createNewParagraph("Paragraph 5");
		scOneOne.print();
	}
}
