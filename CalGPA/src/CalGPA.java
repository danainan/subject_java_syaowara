import java.util.Scanner;

public class CalGPA {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double gpa = 0.0;
		int i = 0;
		char letter;
		
		while (i<5) {
			System.out.print("Enter Grade no. "+(i+1)+" :");
			letter = sc.next().charAt(0);
			
			if (letter == 'A') {
				gpa = gpa + 4;
			}else if (letter == 'B') {
				gpa = gpa + 3;
			}else if (letter == 'C') {
				gpa = gpa + 2;
			}else if (letter == 'D') {
				gpa = gpa + 1;
			}i++;
		}
		gpa = gpa/5;
		System.out.print("GPA = "+gpa);
	}
}
