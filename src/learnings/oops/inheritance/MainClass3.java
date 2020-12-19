package learnings.oops.inheritance;

public class MainClass3 {

	public static void main(String[] args) {
		
		Exam e = new Exam("GK", 30);
		
		Teacher t = new Teacher("Potato", 12345, "123");
		t.login(12345, "123");

		t.prepareQuestion(e);
		
		t.logout();
		
		
		
		Student s = new Student("Ariya", 258, "987");
		s.login(258, "987");
		
		s.takeExam(e);
		
		s.logout();
		
		
		t.login(12345, "123");

		t.checkAnswerSheet(e);
		
		t.logout();
		
		
		System.out.println(s.getName() + " has obtained " + e.getObtainedMarks() + " in the " + e.getName() + " exam");
	}
}
