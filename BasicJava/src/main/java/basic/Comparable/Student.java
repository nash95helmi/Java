package basic.Comparable;

public class Student implements Comparable<Student> {

	private Integer Id;
	private String firstName;
	private String lastName;
	private Float score;
	private Integer age;

	public Student() {
		super();
	}

	public Student(Integer id, String firstName, String lastName, Float score, Integer age) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
		this.age = age;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Id:"+Id+" FName:"+firstName+" LName:"+lastName+" Score:"+score+" Age:"+age;
	}
	
	public int compareTo(Student student) {
		if(student.getScore().compareTo(this.score) == 0) {
			return 0;
		}else if(student.getScore().compareTo(this.score) > 0) {
			return 1;
		}else if(student.getScore().compareTo(this.score) < 0) {
			return -1;
		}
		return 0;
	}

}
