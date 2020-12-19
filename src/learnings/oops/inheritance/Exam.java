package learnings.oops.inheritance;

public class Exam {

	private String name;
	private String[] questions;
	private String[] answers;
	private int fullMarks;
	private int obtainedMarks;
	
	public Exam(String name, int fullMarks) {
		this.name = name;
		this.questions = null;
		this.fullMarks = fullMarks;
		this.obtainedMarks = -1;
	}
	
	public void setQuestions(String[] questions) {
		this.questions = questions;
	}
	
	public String[] getQuestions() {
		return questions;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setFullMarks(int fullMarks) {
		this.fullMarks = fullMarks;
	}

	public void setObtainedMarks(int obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}

	public String[] getAnswers() {
		return answers;
	}

	public int getFullMarks() {
		return fullMarks;
	}

	public int getObtainedMarks() {
		return obtainedMarks;
	}

	public void setAnswers(String[] answers) {
		this.answers = answers;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
	
}
