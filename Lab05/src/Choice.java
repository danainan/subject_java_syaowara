import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] key = {4,2,4,3,3,4,1,5,1,4};
		int[][] StdAns = new int[8][10];
		int sum = 0;
		
		for(int i = 0;i < StdAns.length;i++)
		{
			System.out.print("Student "+(i)+" : ");
			for(int j = 0;j < StdAns[i].length;j++) {
				StdAns[i][j] = input.nextInt();
			}
		}
		System.out.println("-----Score-----");
		for(int i = 0;i < StdAns.length;i++)
		{
			System.out.print("Student "+(i)+" : ");
			for(int j = 0;j < StdAns[i].length;j++) {
				if(StdAns[i][j] == key[j]) sum+=1;
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}
