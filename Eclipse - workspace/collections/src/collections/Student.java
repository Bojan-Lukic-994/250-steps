package collections;

public class Student implements Comparable<Student> {

	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// gets student's id
	public int getId() {
		return id;
	}

	// sets student's id
	public void setId(int id) {
		this.id = id;
	}

	// gets student's name
	public String getName() {
		return name;
	}

	// sets student's id
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

	@Override
	public int compareTo(Student that) {
		return Integer.compare(this.id, that.id);
	}

}
