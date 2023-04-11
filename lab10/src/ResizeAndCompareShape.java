import java.util.ArrayList;

public class ResizeAndCompareShape {
	public static void main(String[] args) {
		
		ArrayList<Shape> List = new ArrayList<Shape>();
		
		List.add(new Square("Orange",4));
		List.add(new Square("Orange",10));
		List.add(new Square("Orange",5));
		
		List.add(new Circle("Violet",3));
		List.add(new Circle("Violet",6));
		List.add(new Circle("Violet",10));
		
		displayAllShape(List);
		for(int i = 0;i < List.size();i++) {
			if(List.get(i) instanceof Square) {
				((Square)List.get(i)).resize(200);
			}
			else {
				((Circle)List.get(i)).resize(50);
			}
		}
		System.out.println("===========================");
		System.out.println("After resize");
		displayAllShape(List);
		System.out.println("===========================");
		String[] size = {"smaller","bigger"};
		int a = List.get(0).compareTo(List.get(1));
		System.out.println("Compare 2 Square after resize");
		System.out.println("Square 1 is "+size[a+1]+" than Square 2");
		int b = List.get(0).compareTo(List.get(1));
		System.out.println("Compare 2 Circle after resize");
		System.out.println("Circle 2 is "+size[b+1]+" than Circle 1");
	}
	
	public static void displayAllShape(ArrayList<Shape> o) {
		System.out.println("class Square");
		int i = 0;
		for(Shape s : o) {
			if(s instanceof Square) {
				System.out.println(s.toString());
				System.out.println((i+1)+". Area: "+s.getArea()+" Perimeter:"+(((Square)s).getParimeter()));
				i++;
			}
		}
		System.out.println("===========================");
		System.out.println("class Circle");
		System.out.println();
		int j = 0;
		for(Shape s : o) {
			if (s instanceof Circle) {
				System.out.println(s.toString());
				System.out.println((j+1)+". Area: "+s.getArea()+" Circumference: "+(((Circle)s).getCircumference()));
				j++;
			}
		}

	}
	
	
}
