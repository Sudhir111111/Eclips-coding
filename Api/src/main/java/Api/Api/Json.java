package Api.Api;

public class Json {
	String Name;
	String Course;
	String RollNumber;
	public Json(String name, String course, String rollNumber) {
		super();
		Name = name;
		Course = course;
		RollNumber = rollNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(String rollNumber) {
		RollNumber = rollNumber;
	}
	

}
