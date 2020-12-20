package examples.oops_with_exceptions;

public class PaperNotReadyForCheckingException extends Exception {

	private static final long serialVersionUID = 6509007323247043855L;
	
	public PaperNotReadyForCheckingException() {
		super("Paper is not yet ready for checking");
	}

}
