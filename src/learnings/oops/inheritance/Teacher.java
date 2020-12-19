package learnings.oops.inheritance;

import java.util.Scanner;

public class Teacher extends User {

	public Teacher(String name, int userId, String password) {
		super(name, userId, password, "TEACHER");
	}
	
	public void prepareQuestion(Exam e) {
		
		if (getLoginStatus()) {
		
			System.out.println("Question is being prepared for " + e.getName());
			
			Scanner scanner = new Scanner(System.in);
			String[] questions = new String[3];
			for(int i = 0; i < 3; i++) {
				System.out.print("Enter question " + (i + 1) + ": ");
				questions[i] = scanner.nextLine();
			}
			
			e.setQuestions(questions);
			System.out.println("Question preparation completed");
		}
		else {
			System.out.println("Please login to continue");
		}
	}
	
	public void checkAnswerSheet(Exam e) {
		if (getLoginStatus()) {
			
			System.out.println("Answers are being checked for " + e.getName());
			
			Scanner scanner = new Scanner(System.in);
			
			String[] questions = e.getQuestions();
			String[] answers = e.getAnswers();
			
			int marks = 0;
			
			for(int i = 0; i < 3; i++) {
				System.out.println((i+1) + ". " + questions[i] + " -> " + answers[i]);
				System.out.print("Marks: ");
				marks += scanner.nextInt();
			}
			
			e.setObtainedMarks(marks);;
			System.out.println("The Answer sheet checking is completed");
		}
		else {
			System.out.println("Please login to continue");
		}
	}

}
