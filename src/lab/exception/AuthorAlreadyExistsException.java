package lab.exception;

public class AuthorAlreadyExistsException extends RuntimeException {
	private static final long serialVersionUID = 4902730693293694180L;

	public AuthorAlreadyExistsException(String name) {
		super(String.format("Author %s already exists", name));
	}
}