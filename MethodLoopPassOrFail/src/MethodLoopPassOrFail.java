import java.util.Scanner;

public class MethodLoopPassOrFail {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0, s1, s2, s3;
		double avg;
		char check = 'y',grade;
		boolean ans;
		do {
			System.out.print("Enter score1 (1-100) : ");
			s1 = input.nextInt();
			System.out.print("Enter score2 (1-100) : ");
			s2 = input.nextInt();
			System.out.print("Enter score3 (1-100) : ");
			s3 = input.nextInt();
		
			sum = s1 + s2 + s3;
			avg = sum / 3;
			ans = PassOrFail(s1,s2,s3);
			
			if(ans) 
			{
				grade = getGrade(avg);
				System.out.println("Mean = "+(int)avg);
				System.out.println("Grade " +grade);
			}else System.out.println("Fail");
			
			
			System.out.print("Do you want to continue [y/n]: ");
			check = input.next().charAt(0);
		}while(check == 'y');
		System.out.print("Bye Bye !!!");
	}
	
	public static boolean PassOrFail(int s1,int s2,int s3) {
		boolean ans;
		if (s1 >= 50 && s2 >= 50 && s3 >= 50) ans = true;
		else ans = false;
		
		return ans;
	}
	public static char getGrade(double avg) {
		char grade;
		if (avg >= 80) grade = 'A';
		else if (avg >= 70) grade = 'B';
		else if (avg >= 60) grade = 'C';
		else if (avg >= 50) grade = 'D';
		else grade = 'F';
		
		return grade;
	}
}
