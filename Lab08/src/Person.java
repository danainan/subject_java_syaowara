import java.util.*;
public class Person {
	protected String name;
	protected int birthYear;
	
	public Person(String n,int b) {
		 this.name = n;
		 this.birthYear = b;
	}
	public int getAge() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return (year-543) - this.birthYear;
	}
	public String toString() {
		return "Name: "+this.name+", Birth Year "+this.birthYear+", Age :"+getAge();
	}
}
