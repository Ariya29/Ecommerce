package examples.oops;

import java.util.Scanner;

public class Teacher extends User {
	
	public Teacher(int userid, String password, String name) {
		super(userid, password, name, 'T');
	}
	
	public void setQuestions(Exam e) {
		if (this.isLoginStatus()) {
			System.out.println("Setting questions for " + e.getSubject());
			int totalQuestions = e.getTotalQuestions();
			String[] questions = new String[totalQuestions];
			
			
			Scanner scanner = new Scanner(System.in);
			
			for (int i = 0; i < totalQuestions; i++) {
				System.out.print("Question " + (i+1) + " : ");
				questions[i] = scanner.nextLine();
			}
			
			e.setQuestions(questions);
			System.out.println("Questions registered successfully");
		}
		else {
			System.out.println("You need to login first");
		}
	}
	
	public void checkPaper(Exam e) {
		if (this.isLoginStatus()) {
			System.out.println("Checking paper for " + e.getSubject() + " test");
			int totalQuestions = e.getTotalQuestions();
			String[] questions = e.getQuestions();
			String[] answers = e.getAnswers();
			
			Scanner scanner = new Scanner(System.in);
			int totalMarks = 0;
			
			for (int i = 0; i < totalQuestions; i++) {
				System.out.println("Q" + (i+1) + " : " + questions[i] + " -> " + answers[i]);
				System.out.print("Is it correct? (true/false) : ");
				if (scanner.nextBoolean()) {
					totalMarks += e.getMarksPerQuestion();
				}
			}
			
			System.out.println("Papers are checked, marks obtained is " + totalMarks);
		}
		else {
			System.out.println("You need to login first");
		}
	}

	
}
