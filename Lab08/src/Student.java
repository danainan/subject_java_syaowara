
public class Student extends Person {
	protected String studentID;
	protected String major;
	
	public Student(String n,int b,String id,String m) {
		super(n,b);
		this.studentID=id;
		this.major=m;
	}
	public String toString() {
		return super.toString()+", Student ID: "+this.studentID+" Major: "+this.major;
	}
}
