package rdbms;

import java.util.List;

public class Teacher {

	private int id;
	private String name;
	private String subject;
	private List<Student> students;
	
	public Teacher(String name, String subject, List<Student> students) {
		this.id = IDGen.getNextId();
		this.name = name;
		this.subject = subject;
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public List<Student> getStudents() {
		return students;
	}
	
	public void addTeacherToDatabase() {
		try {
			DBMS.getDBMSObject().createTeacherEntry(this);
		} catch (ClassNotFoundException e) {
			System.err.println("Unable to add student entry in DB");
		}
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teacher [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", students=");
		builder.append(students);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
