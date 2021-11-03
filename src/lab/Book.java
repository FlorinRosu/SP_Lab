package lab;

import java.util.ArrayList;
import java.util.List;

import lab.composite.Section;
import lab.exception.AuthorAlreadyExistsException;

public class Book extends Section {
	private static final long serialVersionUID = 1L;
	
	private List<Author> authors;

	public Book(String title) {
		super(title);
		authors = new ArrayList<Author>();
	}

	@Override
	public void print() {
		System.out.println(String.format("Book: %s\nAuthors: ", super.getTitle()));
		
		authors.forEach(Author::print);
		super.print();
	}

	public void addAuthor(Author author) {
		if (isAuthorExistent(author.getName())) {
			throw new AuthorAlreadyExistsException(author.getName());
		}
		authors.add(author);
	}

	private boolean isAuthorExistent(String name) {
		return authors.stream().filter(author -> author.getName().equals(name)).findAny().isPresent();
	}

}
