package updatedNewSchool;

public class SalaryRate {
	private Teacher teacher;
	private Year year;
	private double salaryRate;
	public SalaryRate(Teacher teacher, Year year, double salaryRate) {
		super();
		this.teacher = teacher;
		this.year = year;
		this.salaryRate = salaryRate;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public double getSalaryRate() {
		return salaryRate;
	}
	public void setSalaryRate(double salaryRate) {
		this.salaryRate = salaryRate;
	}
	
	

}
