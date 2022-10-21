package Day6;

public class PointSheet {
	private int semesterID;
	private String studentName;
	private String teacherName;
	private String year;
	private String className;
	private double GPA;
	
	public PointSheet() {
		
	}

	public PointSheet(String studentName, String teacherName, String year, String className,
			double gPA) {
		super();
		this.studentName = studentName;
		this.teacherName = teacherName;
		this.year = year;
		this.className = className;
		GPA = gPA;
	}

	public int getSemesterID() {
		return semesterID;
	}

	public void setSemesterID(int semesterID) {
		this.semesterID = semesterID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	
}
