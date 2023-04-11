
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
public class MovableLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        ArrayList<Point2D> o = new ArrayList<>();
        System.out.print("Please enter number of line: ");
        count = input.nextInt();
        System.out.println("You need " + (count*2) + " Points to formed " + count + " Lines");
        for(int i = 0; i < count*2; i++) {
            o.add(new Point2D((int)(Math.random()*100), (int)(Math.random()*100)));
        }
        displayp(o);
        System.out.println("After Move Point");        
        o.get(2).moveLeft(10);
        o.get(2).moveUp(20);
        o.get(3).moveLeft(10);
        o.get(3).moveUp(20);       
        o.get(4).moveRight(30);
        o.get(4).moveDown(100);
        o.get(5).moveRight(30);
        o.get(5).moveDown(100);      
        displayp(o);       
    }
    
    public static void displayp(ArrayList<Point2D> p) {
        for(int i = 0, j = 1, k = 1; k <= p.size() / 2; i += 2, j+= 2, k++) {
            System.out.println("Line No. " + k + " . From " + p.get(i).toString() + " to " + p.get(j).toString());
            System.out.format("Slope is %.2f Distant is %.6f\n", calSlope(p.get(i), p.get(j)), calDistant(p.get(i), p.get(j)));
            System.out.println();
        }
        System.out.println("=======================");
    }
    public static double calSlope(Point2D o1, Point2D o2) {
        double x1 = o1.getX(), x2 = o2.getX();
        double y1 = o1.getY(), y2 = o2.getY();
        return (y1-y2)/(x1-x2);
    }
    public static double calDistant(Point2D o1, Point2D o2) {
        double x1 = o1.getX(), x2 = o2.getX();
        double y1 = o1.getY(), y2 = o2.getY();
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }
}