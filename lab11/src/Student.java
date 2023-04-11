import java.util.ArrayList;
public class Student {
	private String name;
	private String major;
	private String studentID;
	ArrayList<Course> course = new ArrayList<>();
	
	public Student(String n, String m, String id) {
		this.name = n;
		this.major = m;
		this.studentID = id;
	}
	public String toString() {
		return "ID: "+this.studentID+" Name: "+this.name+" Major: "+this.major;
	}
	public void enroll(ArrayList<Course> course) {
		this.course = course;
	}
	
}
