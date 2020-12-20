package examples.exceptions;

public class CallingOwnNumberException extends Exception {

	private static final long serialVersionUID = 1L;

	public CallingOwnNumberException() {
		super("Cannot make a call to own number");
	}
}
