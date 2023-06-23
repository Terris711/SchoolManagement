package updatedNewSchool;

public class Student {
	private int id;
	private int code;
	private String name;
	private Class classes;
	
	public Student(int id, int code, String name, Class classes) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.classes = classes;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Class getClasses() {
		return classes;
	}

	public void setClasses(Class classes) {
		this.classes = classes;
	}


}
