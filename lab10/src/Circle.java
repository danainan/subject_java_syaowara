
public class Circle extends Shape{
 
	private int radius;
	
	public Circle(String c,int r) {
		super.setColor(c);
		this.radius = r;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	
	public String toString() {
		return super.toString()+" radius : "+this.radius+ " Area : "+this.getArea()+" Circumference : "+this.getCircumference();
	}
	@Override
	public int compareTo(Object object) {
		if(this.getArea() > ((Square)object).getArea()){
			return 1;
		}
		else if(this.getArea() < ((Circle)object).getArea()) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	public void resize(int percent) {
		this.radius = this.radius * percent/100;
	}
}
