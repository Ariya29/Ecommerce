package examples.oops;

public class Exam {

	private String subject;
	private String[] questions;
	private String[] answers;
	private int marksPerQuestion;
	private int totalQuestions;
	
	public Exam(String subject, int totalQuestions, int marksPerQuestion) {
		this.subject = subject;
		this.totalQuestions = totalQuestions;
		this.questions = new String[totalQuestions];
		this.answers = new String[totalQuestions];
		this.marksPerQuestion = marksPerQuestion;
	}

	public String[] getQuestions() {
		return questions;
	}

	public void setQuestions(String[] questions) {
		this.questions = questions;
	}

	public String[] getAnswers() {
		return answers;
	}

	public void setAnswers(String[] answers) {
		this.answers = answers;
	}

	public String getSubject() {
		return subject;
	}

	public int getMarksPerQuestion() {
		return marksPerQuestion;
	}

	public int getTotalQuestions() {
		return totalQuestions;
	}
	
	
}
