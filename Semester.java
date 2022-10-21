package Day6;

public class Semester {
	private int id;
	private int subjectID;
	private int multiple;
	private double GPA;
	
	public Semester() {
		
	}

	public Semester(int id, int multiple) {
		super();
		this.id = id;
		this.multiple = multiple;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public int getMultiple() {
		return multiple;
	}

	public void setMultiple(int multiple) {
		this.multiple = multiple;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	
	
	
}
