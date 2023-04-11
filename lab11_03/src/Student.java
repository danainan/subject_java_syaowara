
public class Student {
	private String name;
	private String studentID;
	private String major;
	private Card card;
	
	public Student(String n,String id,String m) {
		this.name = n;
		this.studentID = id;
		this.major = m;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card c) {
		this.card = c;
	}
	public String toString() {
		return "ID: "+this.studentID+" Name: "+this.name+" Major: "+this.major;
	}
}
