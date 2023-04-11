import java.util.Scanner;

public class MethodCalGPA {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int count, i, score, gp = 0;
		double unit, gpa = 0, sum_unit = 0;
		char grade;
		
		System.out.print("Enter number of subject : ");
		count = input.nextInt();
		for(i = 0; i < count; i++) {
			System.out.print("Enter Score of subject "+(i+1)+": ");
			score = input.nextInt();
			System.out.print("Enter course unit : ");
			unit = input.nextDouble();
			
			grade = grading(score);
			System.out.print("Grade "+grade+"\n");
			if (grade == 'A') gp = 4;
			else if (grade == 'B') gp = 3;
			else if (grade == 'C') gp = 2;
			else if (grade == 'D') gp = 1;
			else gp = 0;
			
			gpa = gpa + (gp * unit);
			sum_unit+=unit;
		}
		gpa=gpa/sum_unit;
		System.out.printf("GPA %.2f " ,gpa);
	}
	
	public static char grading(int n) {
		char grade;
		
		if (n >= 80) grade = 'A';
		else if (n >= 70) grade = 'B';
		else if (n >= 60) grade = 'C';
		else if (n >= 50) grade = 'D';
		else grade = 'F';
		
		return grade;
	}
}
