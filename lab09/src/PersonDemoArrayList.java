import java.util.ArrayList;

public class PersonDemoArrayList {
	public static void main(String[] args) {
		
		ArrayList<Person> List = new ArrayList<Person>();
		
		List.add(new Student("Aaa bbb",1996,"60100010","SWE"));
		List.add(new Student("Bbb ccc",1997,"60100009","SWE"));
		List.add(new Student("Cdd eee",1998,"60100008","SWE"));
		List.add(new Employee("zzz zzz",1980,false,28000));
		List.add(new Employee("ddd fff",1970,true,40000));
		List.add(new Employee("ggg ggg",1960,true,50000));
		
		displayAllPerson(List);
		
	}	
	public static double calAverageAge(ArrayList<Person> o) {
		double avg = 0;
		int sum = 0;
			
		for(Person p : o) {
			sum+=p.getAge();
		}
		avg = sum / 6;
		return avg;
	}
	public static double calAverageAgeStd(ArrayList<Person> o) {
		double avgStd = 0;
		int sum = 0;
			
		for(Person p : o) {
			if(p instanceof Student) {
				sum+=p.getAge();
			}
		avgStd = sum / 3;
		}
		return avgStd;
	}
	public static double calAverageAgeEmp(ArrayList<Person> o) {
		double avgEmp = 0;
		int sum = 0;
			
		for(Person p : o) {
			if(p instanceof Employee) {
				sum+=p.getAge();
			}
		avgEmp = sum / 3;
		}
		return avgEmp;
	}
	
	
	public static void displayAllPerson(ArrayList<Person> o) {
		
		int std = 0,emp = 0;
		double sumSal = 0;
		System.out.println("No. of Student = 3");
		for(Person p : o) {
			if(p instanceof Student) {
				System.out.println((std+1)+". "+p.toString());
				std++;
			}
		}
		System.out.println("Average Age of Student = "+calAverageAgeStd(o));
		System.out.println("=======================================");
		System.out.println("No. of Employee = 3");
		
		for(Person p : o) {
			if(p instanceof Employee) {
				System.out.println((emp+1)+". "+p.toString());
				emp++;
				sumSal+=((Employee) p).salary;
			}
			
		}
		System.out.println("Average Age of Employee = "+calAverageAgeEmp(o)+", Average Salary = "+sumSal);
		System.out.println("=======================================");
		System.out.println("Average Age of 6 Person = "+calAverageAge(o));
		
	}
}
