package examples.oops;

public class MainClass {

	public static void main(String[] args) {
		Exam mathsExam = new Exam("Maths", 3, 10);
		Teacher t = new Teacher(123, "112", "John");
		Student s = new Student(87, "hello123", "Moss");
		
		t.login();
		t.setQuestions(mathsExam);
		t.logout();
		
		s.login();
		s.takeTest(mathsExam);
		s.logout();
		
		t.login();
		t.checkPaper(mathsExam);
		t.logout();
		
	}
	
	
}
