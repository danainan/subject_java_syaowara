import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] score = new int[5][4];
		
		for(int i = 0;i < score.length;i++)
		{
			System.out.print("Enter score of student "+(i+1)+" : ");
			for(int j = 0;j < score[i].length;j++)
			{
				score[i][j] = input.nextInt();
			}
		}
		System.out.print("Display Grade");
		System.out.println();
		
		System.out.print("No. LAB(30) Attend(5) Mid(30) Final(35) Total(100) Grade");
		System.out.println();

		for(int i = 0; i < score.length;i++) {
			int sum = 0;
			System.out.print(" "+(i+1));
			for (int j = 0;j < score[i].length;j++) {
				System.out.print("\t"+score[i][j]);
				sum+=score[i][j];
			}
			System.out.print("\t"+sum);
			System.out.print("\t    "+getGrede(sum));
			System.out.println();
		}
	}
	
	public static char getGrede(int score){
		char grade;
		
		if (score >= 80) grade = 'A';
		else if (score >= 70) grade = 'B';
		else if (score >= 60) grade = 'C';
		else if (score >= 50) grade = 'D';
		else grade = 'F';
		
		return grade;
	}

}
