
public class Card {
	private String cardNo;
	private char type;
	private String pin;
	public Card() {
	
	}
	public Card(String no, char type, String pin) {
		this.cardNo = no;
		this.type = type;
		this.pin = pin;
	}
	public char getType() {
		return this.type;
	}
	public boolean isValid(String no, String pin) {
		if(this.cardNo.equals(no) && this.pin.equals(pin)) return true;
		else return false;
	}
	public void setPin(String pin) {
		this.pin=pin;
	}
	public String toString() {
		return "Card No."+this.cardNo+" is ";
	}
}
