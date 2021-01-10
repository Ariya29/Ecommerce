package rdbms;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Press 1: See all the students in DB");
		System.out.println("Press 2: See one specific student in DB");
		System.out.println("Press 3: Add a new student to the DB");
		System.out.println("Press 4: Update details of a student in DB");
		System.out.println("Press 5: Delete a student from the DB");
		System.out.println("Press -1: Exit");
		
		while(true) {
		
			int choice = scanner.nextInt();
			
			switch(choice) {
			case -1:
				System.exit(0);
			case 1:
				for (Student s: Student.getStudents()) {
					System.out.println(s);
				}
				break;
			case 2:
				System.out.print("Id of the student: ");
				System.out.println(Student.getStudent(scanner.nextInt()));
				break;
			case 3:
				scanner.nextLine();
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("Roll: ");
				int roll = scanner.nextInt();
				System.out.print("Standard: ");
				int standard = scanner.nextInt();
				
				Student student = new Student(name, roll, standard);
				student.addStudentToDatabase();
				
				System.out.println("Student created with ID: " + student.getId());
				break;
			case 4:
				System.out.print("Id of the student: ");
				Student s = Student.getStudent(scanner.nextInt());
				System.out.println(s);
				if (s == null)
					break;
				
				scanner.nextLine();
				System.out.print("Updated Name: ");
				String name2 = scanner.nextLine();
				System.out.print("Updated Roll: ");
				int roll2 = scanner.nextInt();
				System.out.print("Updated Standard: ");
				int standard2 = scanner.nextInt();
				
				Student updatedStudent = new Student(s.getId(), name2, roll2, standard2);
				Student.updateStudent(updatedStudent);
				System.out.println("Student with ID " + s.getId() + " updated in DB");
				break;
			case 5:
				System.out.print("Id of the student: ");
				int deleteId = scanner.nextInt();
				Student deletingStudent = Student.getStudent(deleteId);
				System.out.println(deletingStudent);
				
				if (deletingStudent == null)
					break;
				
				scanner.nextLine();
				System.out.print("Shall we proceed with Deletion (y/n): ");
				String yn = scanner.nextLine();
				
				if (yn.toLowerCase().equals("y")) {
					Student.deleteStudent(deleteId);
					System.out.println("Student deleted");
				} else
					System.out.println("Aborted");
				
				break;
			}
		}
		
		
	}

}
