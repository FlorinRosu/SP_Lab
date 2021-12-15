package lab;

import lab.composite.Paragraph;
import lab.composite.Section;
import lab.strategy.AlignCenter;
import lab.strategy.AlignLeft;
import lab.strategy.AlignRight;

public class LabRunner {
	public static void main(String[] args) {
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		Paragraph p2 = new Paragraph("Paragraph 2");
		Paragraph p3 = new Paragraph("Paragraph 3");
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p1);
		cap1.add(p2);
		cap1.add(p3);
		cap1.add(p4);
		
		System.out.println("Printing without Alignment");
		cap1.print();
		
		Section cap2 = new Section("Capitolul 2");
		Paragraph p5 = new Paragraph("Paragraph 5");
		Paragraph p6 = new Paragraph("Paragraph 6");
		Paragraph p7 = new Paragraph("Paragraph 7");
		Paragraph p8 = new Paragraph("Paragraph 8");
		p5.setAlignStrategy(new AlignCenter());
		p6.setAlignStrategy(new AlignRight());
		p7.setAlignStrategy(new AlignLeft());
		cap2.add(p5);
		cap2.add(p6);
		cap2.add(p7);
		cap2.add(p8);
		
		System.out.println("\nPrinting with Alignment");
		cap2.print();
	}
}
