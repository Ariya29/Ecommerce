package examples.exceptions;

public class MainClass {

	public static void main(String[] args) {

		Phone phone = new Phone("12345678");
		
		try {
			phone.call("12345679");
			phone.message("12345678", "  sdf ");
		}
		catch(CallingOwnNumberException ex) {
			System.out.println(ex.getMessage());
		}
		catch(BlankMessageException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
