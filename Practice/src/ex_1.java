import java.util.Scanner;

public class ex_1 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int price = 0;
		System.out.print("1) ᾤࡨ����������õ��� �Ҥ� 50,000 �ҷ / �� (6 �ѹ 5 �׹)\n"
				+ "2) ᾤࡨ��������Ⱥ������� �Ҥ� 45,000 �ҷ / �� (6 �ѹ 5 �׹)\n"
				+ "3) ᾤࡨ�����������Ź�� �Ҥ� 46,000 �ҷ / �� (6 �ѹ 5 �׹)\n"
				+ "4) ᾤࡨ�������������� �Ҥ� 51,000 �ҷ / �� (6 �ѹ 5 �׹)\n"
				+ "5) ᾤࡨ����������໹ �Ҥ� 55,000 �ҷ / �� (6 �ѹ 5 �׹)\n"
				+ "���͡ᾤࡨ����ͧ��� ==> ");
		int choice = sc.nextInt();	
		System.out.print("�ӹǹ�������Թ�ҧ");
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
		System.out.print("��ͧ������ö�������������� [y/n]");
		if(check == 'y') {
			System.out.print("��ͧ������ö����ѹ (�ѹ�� 2000) ==> ");
			int day = sc.nextInt();
			price = day*2000;
		}
		System.out.print("��ͧ��������ͧ�ѡ�������������� [y/n]");
	}
}
