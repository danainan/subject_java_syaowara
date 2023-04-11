import java.util.Scanner;

public class DisplayGradeArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Score[] std = new Score[5];
		int l, a, m, f;
		System.out.println("No.  LAB(30)|Attend(5)|Mid(30)|Final(35)");
		for(int i = 0;i < std.length;i++) {
			System.out.print((i+1)+": ");
			l = sc.nextInt();
			a = sc.nextInt();
			m = sc.nextInt();
			f = sc.nextInt();
			std[i] = new Score(l,a,m,f);
		}
		display(std);
		int[] freq = calGradeSummary(std);
		displayGradeSummary(freq);
	}
	
	public static void display(Score[] score) {
		System.out.println("Display Grade");
		System.out.println("No.    LAB(30)   Attend(5)  Mid(30)  Final(100)   Total(100)  Grade");
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1)+ score[i].toString());
		}
	}
	
	public static int[] calGradeSummary(Score[] score) {
		int[] freq = new int[5];
		for(int i = 0; i < 5; i++) {
			switch(score[i].grade) {
			case 'A':
				freq[0]+=1;
				break;
			case 'B':
				freq[1]+=1;
				break;
			case 'C':
				freq[2]+=1;
				break;
			case 'D':
				freq[3]+=1;
				break;
			case 'F':
				freq[4]+=1;
			}
		}
		
		return freq;
	}
	public static void displayGradeSummary(int[] freq) {
		System.out.println("Grade Summary");
		char[]  grade = {'A','B','C','D','F'};
		for(int i =0;i<5;i++) {
			System.out.print(grade[i]+"  ");
			for(int j = 0; j < freq[i]; j++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
	}
	
}

		

	

