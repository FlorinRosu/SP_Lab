package lab_2;

public class Author {
	private String name;
	
	public Author(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println(String.format("Author Name: %s", name));
	}

}
