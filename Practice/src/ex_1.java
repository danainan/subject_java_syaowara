import java.util.Scanner;

public class ex_1 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int price = 0;
		System.out.print("1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน (6 วัน 5 คืน)\n"
				+ "2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 45,000 บาท / คน (6 วัน 5 คืน)\n"
				+ "3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 46,000 บาท / คน (6 วัน 5 คืน)\n"
				+ "4) แพคเกจทัวร์ประเทศโมนาโก ราคา 51,000 บาท / คน (6 วัน 5 คืน)\n"
				+ "5) แพคเกจทัวร์ประเทศสเปน ราคา 55,000 บาท / คน (6 วัน 5 คืน)\n"
				+ "เลือกแพคเกจที่ต้องการ ==> ");
		int choice = sc.nextInt();	
		System.out.print("จำนวนคนที่จะเดินทาง");
		int count = sc.nextInt();
		switch (choice) {
		case 1:
			price = count*50000;
			break;
		case 2:
			price = count*45000;
			break;
		case 3:
			price = count*46000;
			break;
		case 4:
			price = count*51000;
			break;
		default:
			price = count*55000;
		}
		char check = ' ';
		System.out.print("ต้องการเช่ารถเพิ่มเติมหรือไม่ [y/n]");
		if(check == 'y') {
			System.out.print("ต้องการเช่ารถกี่วัน (วันละ 2000) ==> ");
			int day = sc.nextInt();
			price = day*2000;
		}
		System.out.print("ต้องการเช่าห้องพักเพิ่มเติมหรือไม่ [y/n]");
	}
}
