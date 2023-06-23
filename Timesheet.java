package updatedNewSchool;

public class Timesheet {
	private int id;
	private Teacher teacher;
	private int day;
	private int month;
	private int year;
	private boolean isPresent;
	
	public Timesheet(int id, Teacher teacher, int day, int month, int year, boolean isPresent) {
		super();
		this.id = id;
		this.teacher = teacher;
		this.isPresent = isPresent;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	

}
