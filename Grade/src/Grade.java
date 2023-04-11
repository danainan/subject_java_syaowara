import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] score = new int[4][4];
		String[] part = {"LAB(30)   ","Attend(5) ","Mid(30)   ","Final(35) "};
		
		System.out.println("No.\t\t\t    1  2  3  4");
		for(int i = 0;i < score.length;i++)
		{
			System.out.print("Enter score of "+part[i]+" : ");
			for(int j = 0;j < score[i].length;j++)
			{
				score[i][j] = input.nextInt();
			}
		}
		System.out.print("Display data\n");
		System.out.print("==========================================");
		System.out.println();
		
		System.out.print("No.\t\t1\t2\t3\t4");
		System.out.println();
		for(int i = 0; i < score.length;i++) {
			System.out.print(part[i]+"      ");
			for(int j = 0; j < score.length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.print("==========================================\n");                                                          
	}
}
