
public class Score {
	int lab;
	int attend;
	int mid;
	int Final;
	char grade;

	public Score(int l,int a,int m,int f) {
		this.lab = l;
		this.attend = a;
		this.mid = m;
		this.Final = f;
		setGrade();
	}
	
	public void setGrade() {
		int sum = this.lab+this.attend+this.mid+this.Final;
		if(sum >= 80) this.grade = 'A';
		else if(sum >= 70) this.grade = 'B';
		else if(sum >= 60) this.grade = 'C';
		else if(sum >= 50) this.grade = 'D';
		else this.grade = 'F';
	}
	
	public String toString() {
		String data = "";
		
		int sum = this.lab+this.attend+this.mid+this.Final;
		data = "\t"+this.lab+"\t\t"+this.attend+"\t"+this.mid+"\t"+this.Final+"\t\t"+sum+"\t"+this.grade;
		return data;
	}
	
}
