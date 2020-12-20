package examples.exceptions;

public class Phone {

	private String number;
	
	
	public Phone(String number) {
		this.number = number;
	}
	

	public void message(String number, String msg) throws BlankMessageException {
		if (msg.trim().equals(""))
			throw new BlankMessageException();
		
		System.out.println("Sending a text to " + number + " and the text is " + msg.trim());
	}

	public void call(String number) throws CallingOwnNumberException {
		if (number.trim().equals(this.number))
			throw new CallingOwnNumberException();
			
		System.out.println("Making a call to " + number);
	}
}
