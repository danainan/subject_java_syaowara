import java.util.Scanner;

public class NumberOfHour {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of seconds :");
		int Ensec = sc.nextInt();
		
		int hour = Ensec/3600;
		int min = Ensec%3600/60;
		int sec = Ensec%60;
		
		System.out.println(Ensec+" seconds is approximately "+hour+" hours, "+min+" minute "+sec+" seconds");
	
	}
}
