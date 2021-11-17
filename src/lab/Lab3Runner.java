package lab;

import lab.composite.Image;
import lab.composite.Section;

public class Lab3Runner {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long endTime = 0L;
		
		Image img1 = new Image("Pamela Anderson");
		Image img2 = new Image("Kim Kardashian");
		Image img3 = new Image("Kirby Griffin");
		
		Section playboyS1 = new Section("Front Cover");
		Section playboyS2 = new Section("Summer Girls");
		
		Book playboy = new Book("Playboy");
		
		playboyS1.add(img1);
		playboyS2.add(img2);
		playboyS2.add(img3);
		
		playboy.add(playboyS1);
		playboy.add(playboyS2);
		
		endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime - startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing of the section 1 took " + (endTime - startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing again the section 1 took " + (endTime - startTime) + " milliseconds");
	}
}
