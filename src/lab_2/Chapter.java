package lab_2;

import java.util.ArrayList;
import java.util.List;

import lab_2.miscellaneous.NoSuchSubChapterException;

public class Chapter {
	private String name;
	private List<SubChapter> subChapters; // Composition

	public Chapter(String name) {
		this.name = name;
		subChapters = new ArrayList<SubChapter>();
	}

	public int createSubChapter(String title) {
		SubChapter subChapterToBeAdded = new SubChapter(title);
		subChapters.add(subChapterToBeAdded);
		return subChapters.indexOf(subChapterToBeAdded);
	}

	public SubChapter getSubChapter(int indexSubChapter) {
		if(indexSubChapter >= subChapters.size()) {
			throw new NoSuchSubChapterException(String.format("%s", indexSubChapter));
		}
		return subChapters.get(indexSubChapter);
	}
	
	public void print() {
		System.out.println(String.format("Chapter name: %s", name));
		subChapters.forEach(SubChapter::print);
	}

	public String getName() {
		return name;
	}
}
