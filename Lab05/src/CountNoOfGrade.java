import java.util.Scanner;

public class CountNoOfGrade {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of student : ");
		int n = input.nextInt();
		
		
		int[] Sumgrade = new int[5];
		char grade;
		for(int i = 0;i < n;i++) 
		{
			System.out.print("Enter grade of student "+(i+1)+": ");
			grade = input.next().charAt(0); 	
			switch(grade) {
			case 'A' :
				Sumgrade[0]+=1;
				break;
			case 'B' :
				Sumgrade[1]+=1;
				break;
			case 'C' :
				Sumgrade[2]+=1;
				break;
			case 'D' :
				Sumgrade[3]+=1;
				break;
			default :
				Sumgrade[4]+=1;
			}
		}
		System.out.print("Grade Summary");
		
		System.out.println();
		System.out.print("A ");
		printChar(Sumgrade[0]);
		System.out.println();
		
		System.out.print("B ");
		printChar(Sumgrade[1]);
		System.out.println();
		
		System.out.print("C ");
		printChar(Sumgrade[2]);
		System.out.println();
		
		System.out.print("D ");
		printChar(Sumgrade[3]);
		System.out.println();
		
		System.out.print("F ");
		printChar(Sumgrade[4]);
	}
	
	public static void printChar(int n) {
		for(int i = 0;i < n;i++) System.out.print("*");
	}

}
