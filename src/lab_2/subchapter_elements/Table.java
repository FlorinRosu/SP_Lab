package lab_2.subchapter_elements;

public class Table extends Element{
	private String title;

	public Table(String title) {
		this.title = title;
	}

	@Override
	public void print() {
		System.out.println(String.format("Table title: %s", title));
	}
}
