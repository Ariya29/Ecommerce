package examples.oops_with_exceptions;

public class NoQuestionsFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoQuestionsFoundException() {
		super("The questions have not yet been set.");
	}
	
}
