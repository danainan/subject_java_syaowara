import java.util.Scanner;

public class GPA {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter of course:");
		int count = sc.nextInt();
		String id,g;
		int u;
		Course course[] = new Course[count];
		
		
		for(int i = 0;i < count;i++) {
			System.out.print("Enter information of course no."+(i+1)+":");
			id = sc.next();
			u = sc.nextInt();
			g = sc.next();
			course[i] = new Course(id,u,g);
		}
		System.out.println("You enroll "+count+" course:");
		displayGPA(course);
		calGPA(course);
		
	}
	public static void displayGPA(Course[] course) {
		for(int i =0;i < course.length;i++) {
			System.out.println(course[i].toString());
		}
	}
	
	public static void calGPA(Course[] course) {
		double gpa = 0.0,unit = 0.0,sum =0.0;
		for(int i =0;i < course.length;i++) {
			if(course[i].getGrade().equals("A"))
			{
				unit = 4;
						
			}
			else if(course[i].getGrade().equals("B+"))
			{
				unit = 3.5;
				
			}
			else if(course[i].getGrade().equals("B"))
			{
				unit = 3;
			}
			else if(course[i].getGrade().equals("C+"))
			{
				unit = 2.5;
			}
			else if(course[i].getGrade().equals("C"))
			{
				unit = 2;
			}
			else if(course[i].getGrade().equals("D+"))
			{
				unit = 1.5;
			}
			else if(course[i].getGrade().equals("D"))
			{
				unit = 1;
			}
			else {
				unit = 0;
			}
			sum+=course[i].getUnit();
			gpa+=course[i].getUnit()*unit;
		}
		gpa /= sum;
		System.out.print("GPA = "+gpa);
	}
	
}
