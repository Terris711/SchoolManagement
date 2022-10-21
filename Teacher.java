package Day6;

public class Teacher {
	private int id;
	private int attendantID;
	private String email;
	private String fullName;
	
	public Teacher() {
		
	}

	public Teacher(int id, String email, String fullName) {
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

	public int getAttendantID() {
		return attendantID;
	}

	public void setAttendantID(int attendantID) {
		this.attendantID = attendantID;
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
