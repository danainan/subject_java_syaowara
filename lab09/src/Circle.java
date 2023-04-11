
public class Circle extends Shape{
 
	protected int radius;
	
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
		return super.toString()+" Circumference: "+this.radius;
	}
}
