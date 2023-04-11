import java.util.Scanner;
import java.util.ArrayList;


public class GradePrediction {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		String[] sweCourse = {"SWE62-202","SWE62-205","SWE62-211","SWE62-212 ","SWE62-213","SWE62-231"};
		int[] sweUnit = {2,3,4,3,3,2};
		ArrayList<Course> course = new ArrayList<>();
		
		System.out.println("Welcome to SWE Grade Prediction");
		System.out.println("Course list in 1/64");
		for(int i =0;i < sweCourse.length;i++) {
			System.out.println((i+1)+". "+sweCourse[i]+"\t"+sweUnit[i]);
		}
		
		
		System.out.print("Please enter number of course [1-6]: ");
		n = input.nextInt();
		int[] select = new int[n]; 
		System.out.print("Please select "+n+" course: ");
		int j =0;
		while(j < n) {
			select[j] = input.nextInt();
			j++;
		}
		String[] enterGrade = new String[n];
		System.out.print("Please enter grade of "+n+" courses: ");
		
		for (int k=0;k < n;k++) {
			enterGrade[k] = input.next();
		}
		for(int l=0;l < n;l++) {
			if (select[l] == 1) course.add(new Course(sweCourse[0],2, enterGrade[l]));
			else if (select[l] == 2) course.add(new Course(sweCourse[1], 3, enterGrade[l]));
			else if (select[l] == 3) course.add(new Course(sweCourse[2], 4, enterGrade[l]));
			else if (select[l] == 4) course.add(new Course(sweCourse[3], 3, enterGrade[l]));
			else if (select[l] == 5) course.add(new Course(sweCourse[4], 3, enterGrade[l]));
			else if (select[l] == 6) course.add(new Course(sweCourse[5], 2, enterGrade[l]));
		}
		System.out.println("=====================================");
		Student std = new Student("AAA","SWE","60100000");
		std.enroll(course);
		displayCourse(std);
	}
	
	public static void displayCourse(Student std) {
		System.out.println(std.toString()+" enrolls "+std.course.size()+" courses in 1/64");
		System.out.println("No.\tID\t\tUnit\tGrade");
		for(int i=0;i < std.course.size();i++) {
			System.out.println((i+1)+"\t"+std.course.get(i).toString());
		}
		System.out.format("GPA: %.2f",calGPA(std));
	}
	public static double calGPA(Student std) {
		int unit,sumUnit=0;
		double gpa=0;
		String grade =" ";
		for(int i=0;i<std.course.size();i++) {
			grade = std.course.get(i).getGrade();
			unit = std.course.get(i).getUnit();
			sumUnit+=unit;
			if(!grade.equals("W")) {
				if(grade.equals("A")) gpa +=unit*4;
				else if(grade.equals("B+")) gpa += unit*3.5;
				else if(grade.equals("B"))  gpa += unit*3;
				else if(grade.equals("C+")) gpa += unit*2.5;
				else if(grade.equals("C"))  gpa += unit*2;
				else if(grade.equals("D+")) gpa += unit*1.5;
				else if(grade.equals("D"))  gpa += unit*1;
				else gpa += unit*0;
			}
		}
		return gpa/sumUnit;
	}
}
