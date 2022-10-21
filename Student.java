package Day6;

public class Student {
	private int id;
	private int classID;
	private String email;
	private String fullName;

	public Student() {

	}

	public Student(int id, String email, String fullName) {
		super();
		this.id = id;
		this.email = email;
		this.fullName = fullName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassID() {
		return classID;
	}

	public void setClassID(int classID) {
		this.classID = classID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
