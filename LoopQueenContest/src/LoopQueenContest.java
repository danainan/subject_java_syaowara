import java.util.Scanner;

public class LoopQueenContest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char height;
		double max = 0,cm,cen;
		int i = 0,feet,inch,no = 0;
		char check = 'y';
		
		do {
			System.out.print("No. "+(i+1)+" Enter height : ");
			height = input.next().charAt(0);
			
			if (height == 'f') {
				feet = input.nextInt();
				inch = input.nextInt();
				cm = ((feet * 12) + inch) * 2.54;
			}else cm = input.nextDouble();
			
			System.out.println("No. "+(i+1)+" is "+cm+" cm");
			if (max < cm)
			{
				max = cm;
				no = i;
			}
			i++;
			System.out.print("Do you want to continue [y/n]: ");
			check = input.next().charAt(0);
		}while(check == 'y');
		
		System.out.println("No. "+(no+1)+" is tallest");
		System.out.print("Bye Bye !!!");
	}
}
