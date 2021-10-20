package lab_2.miscellaneous;

public class NoSuchSubChapterException extends RuntimeException {
	private static final long serialVersionUID = -7913591045442374453L;

	public NoSuchSubChapterException(String subChapter) {
		super(String.format("No such subchapter present: %s", subChapter));
	}
}
