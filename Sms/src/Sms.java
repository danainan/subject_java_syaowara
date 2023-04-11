
public class Sms {
	private String number;

	public Sms(String number) {
		this.number = number;
	}
	
	public void readAs2() {
		char result = ' ';
		for(int k = 0;k < this.number.length();k++) {
			result = this.number.charAt(k);
			switch(result) {
			case '0' :
				System.out.print("Zero ");
				break;
			case '1' :
				System.out.print("One ");
				break;
			case '2' :
				System.out.print("Two ");
				break;
			case '3' :
				System.out.print("Three ");
				break;
			case '4' :
				System.out.print("Four ");;
				break;
			case '5' :
				System.out.print("Five ");
				break;
			case '6' :
				System.out.print("Six ");
				break;
			case '7' :
				System.out.print("Seven ");
				break;
			case '8' :
				System.out.print("Eight ");
				break;
			default :
				System.out.print("Nine ");
				break;
			}
		}
	}
}
