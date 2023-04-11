import java.util.ArrayList;

public class TestShapeObject {

	public static void main(String[] args) {
		
		ArrayList<Shape> List = new ArrayList<Shape>();
		
		List.add(new Square("Orange",4));
		List.add(new Square("Orange",10));
		List.add(new Square("Orange",5));
		
		List.add(new Circle("Violet",3));
		List.add(new Circle("Violet",6));
		List.add(new Circle("Violet",10));
		
		displayAllShape(List);
		
		System.out.println("Square");
		System.out.println("Max Perimeter is "+findMaxS(List));
		System.out.println("Min Perimeter is "+findMinS(List));
		System.out.println("Circle");
		System.out.println("Max Circumference is "+findMaxC(List));
		System.out.println("Min Circumference is "+findMinC(List));

	}
	public static int findMaxC(ArrayList<Shape> o) {
		double max = 0;
		for(Shape s : o) {
			if(s instanceof Circle) {
				if(((Circle) s).getCircumference() > max) {
					max = ((Circle) s).getCircumference();
				}
			}
		}
		return (int)max;
	}
	public static int findMaxS(ArrayList<Shape> o) {
		double max = 0;
		for(Shape s : o) {
			if(s instanceof Square) {
				if(((Square) s).getParimeter() > max) {
					max = ((Square) s).getParimeter();
				}
			}
		}
		return (int)max;
	}
	public static int findMinC(ArrayList<Shape> o) {
		double min = 1000;
		for(Shape s : o) {
			if(s instanceof Circle) {
				if (((Circle) s).getCircumference() < min) {
					min = ((Circle) s).getCircumference();
				}
			}
		}
		return (int)min;
	}
	public static int findMinS(ArrayList<Shape> o) {
		double min = 1000;;
		for(Shape s : o) {
			if(s instanceof Square) {
				if (((Square) s).getParimeter() < min) {
					min = ((Square) s).getParimeter();
				}
			}
		}
		return (int)min;
	}
	public static void displayAllShape(ArrayList<Shape> o) {
		System.out.println("class Square");
		for(Shape s : o) {
			if(s instanceof Square) {
				System.out.println(s.toString());
				System.out.println("Area: "+s.getArea()+" Perimeter:"+(((Square)s).getParimeter()));
			}
		}
		
		System.out.println("===========================");
		System.out.println("class Circle");
		
		for(Shape s : o) {
			if(s instanceof Circle) {
				System.out.println(s.toString());
				System.out.println("Area: "+s.getArea()+" Circumference: "+(((Circle)s).getCircumference()));
			}
		}
		System.out.println("===========================");
	}
}
