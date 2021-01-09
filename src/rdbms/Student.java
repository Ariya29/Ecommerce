package rdbms;

public class Student {

	private int id;
	private String name;
	private int roll;
	private int standard;
	
	public Student(String name, int roll, int standard) {
		this.id = IDGen.getNextId();
		this.name = name;
		this.roll = roll;
		this.standard = standard;
	}
	
	public Student(int id, String name, int roll, int standard) {
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.standard = standard;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRoll() {
		return roll;
	}

	public int getStandard() {
		return standard;
	}
	
	public void addStudentToDatabase() {
		try {
			DBMS.getDBMSObject().createStudentEntry(this);
		} catch (ClassNotFoundException e) {
			System.err.println("Unable to add student entry in DB");
		}
	}
	
	public static Student getStudent(int id) {
		try {
			return DBMS.getDBMSObject().getStudentEntry(id);
		} catch (ClassNotFoundException e) {
			System.err.println("Unable to retrieve");
			return null;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", roll=");
		builder.append(roll);
		builder.append(", standard=");
		builder.append(standard);
		builder.append("]");
		return builder.toString();
	}
	
}
