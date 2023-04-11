import java.util.Scanner;
public class MethodLoopQueenContest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		char height;
		double max = Integer.MIN_VALUE ,cm,cen;
		int i = 0 , foot , inch , no = 0;
		char check = 'y';
		
		do {
			System.out.print("No. "+(i+1)+" Enter height : ");
			height = input.next().charAt(0);
			if (height == 'f') {
				foot = input.nextInt();
				inch = input.nextInt();
				cm = Foot2Cm(foot , inch);
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
		
	public static double Foot2Cm(int foot , int inch) {
		double cm;
		cm = ((foot * 12) + inch) * 2.54;
		return cm;
	}
}
