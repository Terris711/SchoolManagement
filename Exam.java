package Day6;

public class Exam {
	private int id;
	private int resultID;
	private String name;
	private int multiple;
	
	public Exam() {
		// TODO Auto-generated constructor stub
	}

	public Exam(int id, String name, int multiple) {
		super();
		this.id = id;
		this.name = name;
		this.multiple = multiple;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getResultID() {
		return resultID;
	}

	public void setResultID(int resultID) {
		this.resultID = resultID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMultiple() {
		return multiple;
	}

	public void setMultiple(int multiple) {
		this.multiple = multiple;
	}

	
	
}
