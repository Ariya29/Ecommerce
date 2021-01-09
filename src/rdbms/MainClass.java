package rdbms;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		Student s1 = Student.getStudent(1);
		Student s2 = Student.getStudent(2);
		Student s3 = Student.getStudent(3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		List<Student> teacher1Students = new ArrayList<Student>();
		List<Student> teacher2Students = new ArrayList<Student>();
		
		teacher1Students.add(s1);
		teacher2Students.add(s2);
		teacher2Students.add(s3);
		
		new Teacher("John", "Science", teacher1Students).addTeacherToDatabase();
		new Teacher("Paul", "Maths", teacher2Students).addTeacherToDatabase();
		
	}

}
