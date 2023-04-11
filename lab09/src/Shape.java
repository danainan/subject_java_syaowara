
abstract class Shape {
	protected String color;
	
	public abstract double getArea();
	
	public void setColor(String c) {
		this.color = c;
	}
	public String getColor() {
		return this.color;
	}
	
	public String toString() {
		return "Color: "+this.color;
	}
}
