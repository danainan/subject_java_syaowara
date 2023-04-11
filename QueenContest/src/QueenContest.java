import java.util.Scanner;

public class QueenContest {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        char check;
        int feet,inch,cm;
        double total1,total2;
        
        System.out.print("No. 1 Enter height : ");
        check = sc.next().charAt(0);
        
        if (check == 'f') {
            feet = sc.nextInt();
            inch = sc.nextInt();
            total1 = feet * 12 * 2.54 + inch * 2.54;
        }
        else{
            cm = sc.nextInt();
            total1 = cm;
        }
        System.out.print("No. 2 Enter height : ");
        check = sc.next().charAt(0);
        if (check=='f') {
            feet = sc.nextInt();
            inch = sc.nextInt();
            total2 = feet * 12 * 2.54 + inch * 2.54;
        }
        else{
            cm = sc.nextInt();
            total2 = cm;
        }
        System.out.printf("No. 1 is "+total1+" cm and No. 2 is "+total2+" cm." );
        System.out.println();
        
        if (total1>total2) {
            System.out.print("No. 1 is taller. ");
        }
        else {
            System.out.print("No. 2 is taller. ");
        }
    }
}
