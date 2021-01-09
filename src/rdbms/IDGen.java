package rdbms;

public abstract class IDGen {

	private static int id = -1;
	
	public static int getNextId() {
		
		if (id == -1) {
			try {
				id = DBMS.getDBMSObject().retrieveLatestId();
			} catch (ClassNotFoundException e) {
				System.err.println("Unable to retrieve the ID");
			}
		}
		
		return ++id;
	}
	
	public static int getCurrentId() {
		return id;
	}
}
