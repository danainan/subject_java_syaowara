
public class Employee extends Person{
	protected boolean isMarried;
	protected int salary;
	
	public Employee(String n,int b,boolean i,int s) {
		super(n,b);
		this.isMarried=i;
		this.salary=s;
	}
	public String toString() {
		String status;
		if (!this.isMarried) {
			status = "Single";
		} else {
			status = "Married";
		}
		return super.toString()+", Status: "+status+", Salary: "+this.salary;
	}
}
