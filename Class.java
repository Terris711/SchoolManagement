package updatedNewSchool;

public class Class {
	private int id;
	private String name;
	private Room room;
	private Teacher teacher;
	private Year year;
	
	public Class(int id, String name, Room room, Teacher teacher, Year year) {
		super();
		this.id = id;
		this.name = name;
		this.room = room;
		this.teacher = teacher;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
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
	
	

}
