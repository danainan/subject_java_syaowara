import java.util.Scanner;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		char input;
		char check;
		
		do {
			System.out.println("Select Your Choice");
			System.out.println("[1] CIRCLE");
			System.out.println("[2] RECTANGLE");
			System.out.println("[3] SQUARE");
			System.out.println("[4] TRIANGLE");
		
			input = sc.next().charAt(0);
			ShapeFactory shapeFactory = new ShapeFactory();
			if(input == '1') {
				Shape shape1 = shapeFactory.getShape("CIRCLE");
				shape1.draw();
			}else if(input == '2') {
				Shape shape2 = shapeFactory.getShape("RECTANGLE");
				shape2.draw();
			}else if(input == '3') {
				Shape shape3 = shapeFactory.getShape("SQUARE");
				shape3.draw();
			}else if(input == '4') {
				Shape shape4 = shapeFactory.getShape("TRIANGLE");
				shape4.draw();
			}else {
				System.out.println("Invalid choice must be 1-4");
			}
			System.out.println("\nDo you want to select another [y]");
			check = sc.next().charAt(0);
		}while(check =='y');
		
		
	}
}
