import java.util.Scanner;
public class SmsDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String number;
		
		System.out.print("Enter number of SMS: ");
		int count = sc.nextInt();
		
		for(int i = 0;i < count;i++) {
			System.out.print((i+1)+". SMS Number: ");
			number = sc.next();
			Sms numTxt = new Sms(number);
			System.out.println("SMS Number "+(i+1)+":");
			System.out.print("Read as: ");
			numTxt.readAs2();
			System.out.println();
		}
		System.out.print("Bye Bye!!!");
	}

}
