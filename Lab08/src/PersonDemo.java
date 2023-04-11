
public class PersonDemo {

	public static void main(String[] args) {
		
		Student[] std = new Student[3];
		Employee[] emp = new Employee[3];
		
		int avg =0;
		int sumSal=0;
		
		std[0] = new Student("Aaa bbb",1996,"60100010","SWE");
		std[1] = new Student("Bbb ccc",1997,"60100009","SWE");
		std[2] = new Student("Cdd eee",1998,"60100008","SWE");
		
		emp[0] = new Employee("zzz zzz",1980,false,28000);
		emp[1] = new Employee("ddd fff",1970,true,40000);
		emp[2] = new Employee("ggg ggg",1960,true,50000);		
		
		for(int i=0;i<3;i++) {
			sumSal+=emp[i].salary;
		}
		
		System.out.println("No. of Student = "+std.length);
		displayAllPerson(std);
		
		avg =calAverageAge(std);
		System.out.println("Average Age of Student = "+avg);
		System.out.println("=======================================");
		
		System.out.println("No. of Employee = "+emp.length);
		displayAllPerson(emp);
		
		avg =calAverageAge(emp);
		System.out.println("Average Age of Student = "+avg+" Average Salary = "+sumSal);
		System.out.println("=======================================");
		
		avg = (calAverageAge(std)+calAverageAge(emp))/ 2;
		
		System.out.println("Average Age of "+(std.length+emp.length)+" Peson = "+avg);
	}
	
	public static int calAverageAge(Person[] o) {
		int avg = 0;
		int sum = 0;
		for(int i = 0;i< o.length;i++) {
			sum = sum + o[i].getAge();
		}
		avg = sum / 3;
		return avg;
	}
	public static void displayAllPerson(Person[] o) {
		for(int i = 0;i < o.length;i++) {
			System.out.println(i+1+". "+o[i].toString());
		}
	}
}
