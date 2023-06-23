package updatedNewSchool;

public class Pointsheet {
	private int id;
	private Student student;
	private ExamSemesterSubject examSemesterSubject;
	private double point;
	public Pointsheet(int id, Student student, ExamSemesterSubject examSemesterSubject, double point) {
		super();
		this.id = id;
		this.student = student;
		this.examSemesterSubject = examSemesterSubject;
		this.point = point;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public ExamSemesterSubject getExamSemesterSubject() {
		return examSemesterSubject;
	}
	public void setExamSemesterSubject(ExamSemesterSubject examSemesterSubject) {
		this.examSemesterSubject = examSemesterSubject;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
	
	
}
