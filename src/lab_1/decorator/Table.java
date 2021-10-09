package lab_1.decorator;

public class Table extends BookDecorator {
	private String legend;

	public Table(BookComponent bookComponent, String legend) {
		super(bookComponent);
		this.legend = legend;
	}

	@Override
	public void print() {
		bookComponent.print();
		System.out.println(String.format("Table legend: %s", legend));
	}

}
