package lab_2.subchapter_elements;

public class Table{
	private String title;

	public Table(String title) {
		this.title = title;
	}

	public void print() {
		System.out.println(String.format("Table title: %s", title));
	}
}
