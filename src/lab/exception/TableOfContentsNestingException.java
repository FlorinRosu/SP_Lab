package lab.exception;

public class TableOfContentsNestingException extends RuntimeException {
	private static final long serialVersionUID = 4902730693293694180L;

	public TableOfContentsNestingException(String errorMessage) {
		super(errorMessage);
	}
}