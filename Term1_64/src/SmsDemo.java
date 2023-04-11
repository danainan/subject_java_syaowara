import java.util.Scanner;
public class SmsDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sms;
		
		System.out.print("Enter number of SMS: ");
		int number = sc.nextInt();
		for(int i = 0;i < number;i++) {
			System.out.print((i+1)+". SMS Number: ");
			sms = sc.next();
			
			System.out.println((i+1)+". SMS Number "+(i+1)+":");
			Sms sms2 = new Sms(sms);
			sms2.readAs();
		}
		System.out.print("Bye Bye!!!");
	}

}
