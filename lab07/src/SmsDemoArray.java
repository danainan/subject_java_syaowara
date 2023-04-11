import java.util.Scanner;

public class SmsDemoArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		String number;
		
		System.out.print("Enter number of SMS:  ");
		int count = sc.nextInt();
		
		Sms[] arr = new Sms[count];
		
		for(i=0;i<count;i++) {
			System.out.print((i+1)+". SMS Number:  ");
			number = sc.next();
			arr[i] = new Sms(number);
		}
		System.out.print("==========================================");
		for(i=0;i<arr.length;i++) {
			System.out.println();
			System.out.print("SMS Number "+(i+1)+" :");
			Sms getNum = new Sms(arr[i].getNumber());
			System.out.println();
			System.out.print("Read as :");
			getNum.readAs();
		}
		System.out.println();
		System.out.println("==========================================");
		System.out.println("Digit Summary");
		Sms.DisplayFreq();
		System.out.println("Bye Bye!!!");
	}
}