package learnings.oops.inheritance;

import java.util.Scanner;

public class Student extends User {

	public Student(String name, int userId, String password) {
		super(name, userId, password, "STUDENT");
	}

	public void takeExam(Exam e) {
		if (getLoginStatus()) {

			System.out.println(e.getName() + " is being taken");
			
			Scanner scanner = new Scanner(System.in);
			String[] questions = e.getQuestions();
			String[] answers = new String[3];
			for(int i = 0; i < 3; i++) {
				System.out.print((i+1) + ". " + questions[i]);	// printing the question
				answers[i] = scanner.nextLine();
			}
			
			e.setAnswers(answers);
			System.out.println("Answering completed");
		}
		else {
			System.out.println("Please login to continue");
		}
	}
}
