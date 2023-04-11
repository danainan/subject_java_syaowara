public class Sms {
	private String number;
	public static int[] noOfnum = new int [10];
	
	public Sms(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void readAs() {
		String  num = this.number;
		char result = ' ';
		for(int i = 0;i<num.length();i++) {
			this.number.charAt(i);
			result = num.charAt(i);
			switch(result) {
			case '0':
				System.out.print(" Zero ");
				noOfnum[0]++;
				break;
			case '1':
				System.out.print(" One ");
				noOfnum[1]++;
				break;
			case '2':
				System.out.print(" Two ");
				noOfnum[2]++;
				break;
			case '3':
				System.out.print(" Three ");
				noOfnum[3]++;
				break;
			case '4':
				System.out.print(" Four ");
				noOfnum[4]++;
				break;
			case '5':
				System.out.print(" Five ");
				noOfnum[5]++;
				break;
			case '6':
				System.out.print(" six ");
				noOfnum[6]++;
				break;
			case '7':
				System.out.print(" Seven ");
				noOfnum[7]++;
				break;
			case '8':
				System.out.print(" Eight ");
				noOfnum[8]++;
				break;
			default:
				System.out.print(" Nine ");
				noOfnum[9]++;
				break;
			}
		}
	}
	
	public static void DisplayFreq() {
		String[] transNum = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		for(int i = 0;i<noOfnum.length;i++) {
			if(noOfnum[i] != 0) {
				System.out.printf(transNum[i]+"  ");
				for(int j = 0;j < noOfnum[i];j++) {
					System.out.printf("*");
				}
				System.out.println();
			}
		}
	}
}