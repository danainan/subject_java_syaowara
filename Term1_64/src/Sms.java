
public class Sms {
	private String number;

	public Sms(String number) {
		this.number = number;
	}
		
	public void readAs() {
		String read= " ";
		String[] n = this.number.split("");
		String[] arr = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		
		for(int i =0;i < this.number.length();i++) {
			int x = Integer.parseInt(n[i]);
			read = read + arr[x]+" ";
		}
		System.out.println("Read as: "+read);
	}

}