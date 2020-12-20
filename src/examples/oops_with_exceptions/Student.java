package examples.oops_with_exceptions;

import java.util.Scanner;

public class Student extends User {

	public Student(int userid, String password, String name) {
		super(userid, password, name, 'S');
	}
	
	public void takeTest(Exam e) throws NoQuestionsFoundException {
		
		if (this.isLoginStatus()) {
			
			if (e.getQuestions()[0] == null)
				throw new NoQuestionsFoundException();
			
			System.out.println("Taking " + e.getSubject() + " test");
			int totalQuestions = e.getTotalQuestions();
			String[] questions = e.getQuestions();
			String[] answers = new String[totalQuestions];
			
			Scanner scanner = new Scanner(System.in);
			
			for (int i = 0; i < totalQuestions; i++) {
				System.out.print("Q" + (i+1) + " : " + questions[i] + " ");
				answers[i] = scanner.nextLine();
			}
			
			e.setAnswers(answers);
			System.out.println("Answers registered successfully");
		}
		else {
			System.out.println("You need to login first");
		}
	}

}
