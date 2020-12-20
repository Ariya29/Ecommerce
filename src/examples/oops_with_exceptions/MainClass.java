package examples.oops_with_exceptions;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Exam mathsExam = new Exam("Maths", 3, 10);
		Teacher t = new Teacher(123, "112", "John");
		Student s = new Student(87, "hello123", "Moss");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Press 1 for Teacher Login");
		System.out.println("Press 2 for Teacher Logout");
		System.out.println("Press 3 for Student Login");
		System.out.println("Press 4 for Student Logout");
		System.out.println("Press 5 for Teacher Set Questions");
		System.out.println("Press 6 for Student Taking Test");
		System.out.println("Press 7 for Teacher Checking paper");

		System.out.print("Choice:  ");
		int choice = scanner.nextInt();
		
		while (choice != -1) {
			
			switch (choice) {
			case 1:
				t.login();
				break;
			case 2:
				t.logout();
				break;
			case 3:
				s.login();
				break;
			case 4:
				s.logout();
				break;
			case 5:
				t.setQuestions(mathsExam);
				break;
			case 6:
				try {
					s.takeTest(mathsExam);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			case 7:
				try {
					t.checkPaper(mathsExam);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Invalid Choice");
			}

			System.out.print("Choice:  ");
			choice = scanner.nextInt();
		}
		
		
	}
	
	
}
