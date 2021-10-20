package lab_2.miscellaneous;

public class NoSuchChapterException extends RuntimeException {
	private static final long serialVersionUID = -7913591045442374453L;

	public NoSuchChapterException(String chapter) {
		super(String.format("No such chapter present: %s", chapter));
	}

}
