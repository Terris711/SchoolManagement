package Day6;

public class Salary {
	private int teacherID;
	private double payrate;

	public Salary() {

	}

	public Salary(double payrate) {
		super();
		this.payrate = payrate;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public double getPayrate() {
		return payrate;
	}

	public void setPayrate(double payrate) {
		this.payrate = payrate;
	}

}
