package lab;

import lab.composite.Image;
import lab.composite.Paragraph;
import lab.composite.Section;
import lab.composite.Table;
import lab.proxy.ImageProxy;
import lab.visitor.BookStatistics;
import lab.visitor.GenerateTOC;
import lab.visitor.RenderContentVisitor;

public class LabRunner {
	public static void main(String[] args) {
		runStatisticsExample();
		runTableOfContentsExample();
	}

	private static void runTableOfContentsExample() {
		Section cap1 = new Section("Cap1");
		Section cap1_1 = new Section("Cap1.1");
		Section cap1_1_1 = new Section("Cap1.1.1");
		Section cap1_1_2 = new Section("Cap1.1.2");
		Section cap1_2 = new Section("Cap1.2");
		Section cap2 = new Section("Cap2");
		Section cap2_1 = new Section("Cap2.1");
		Section cap2_2 = new Section("Cap2.2");
		Section cap2_2_1 = new Section("Cap2.2.1");
		Section cap2_2_1_1 = new Section("Cap2.2.1.1");

		cap2_2_1.add(cap2_2_1_1);
		cap1_1.add(cap1_1_1);
		cap1_1.add(cap1_1_2);
		cap2_2.add(cap2_2_1);
		cap1.add(cap1_1);
		cap1.add(cap1_2);
		cap2.add(cap2_1);
		cap2.add(cap2_2);

		GenerateTOC tocGen = new GenerateTOC();
		cap1.accept(tocGen);
		cap2.accept(tocGen);
		tocGen.getToc().accept(new RenderContentVisitor());
	}

	private static void runStatisticsExample() {
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));

		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();
	}
}
