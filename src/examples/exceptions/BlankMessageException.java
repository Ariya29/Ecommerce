package examples.exceptions;

public class BlankMessageException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public BlankMessageException() {
		super("Cannot send a blank message");
	}

}
