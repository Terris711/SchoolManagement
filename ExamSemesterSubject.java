package updatedNewSchool;

public class ExamSemesterSubject {
	private int id;
	private Subject subject;
	private Semester semester;
	private Exam exam;
	private Year year;
	private double multiPerExam;
	private double multiPerSemester;
	private double multiPerSubject;
	public ExamSemesterSubject(int id, Exam exam, Subject subject, Semester semester, Year year, double multiPerExam,
			double multiPerSemester, double multiPerSubject) {
		super();
		this.id = id;
		this.subject = subject;
		this.semester = semester;
		this.exam = exam;
		this.year = year;
		this.multiPerExam = multiPerExam;
		this.multiPerSemester = multiPerSemester;
		this.multiPerSubject = multiPerSubject;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Semester getSemester() {
		return semester;
	}
	public void setSemester(Semester semester) {
		this.semester = semester;
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public double getMultiPerExam() {
		return multiPerExam;
	}
	public void setMultiPerExam(double multiPerExam) {
		this.multiPerExam = multiPerExam;
	}
	public double getMultiPerSemester() {
		return multiPerSemester;
	}
	public void setMultiPerSemester(double multiPerSemester) {
		this.multiPerSemester = multiPerSemester;
	}
	public double getMultiPerSubject() {
		return multiPerSubject;
	}
	public void setMultiPerSubject(double multiPerSubject) {
		this.multiPerSubject = multiPerSubject;
	}
	
	
	
	
}
