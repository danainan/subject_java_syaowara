import java.util.Scanner;
import java.util.ArrayList;

public class ProjectOS {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Member> team = new ArrayList<Member>();
		
		team.add(new Member("AAA", "chief", 30));
        team.add(new Member("BBB", "deputy chief", 29));
        team.add(new Member("CCC", "secretary", 25));
        team.add(new Member("DDD", "member", 22));
        team.add(new Member("FFF", "member", 23));
        
		Project p = new Project(team.size(), 5, team);
		System.out.println("Welcome to Project OS Team");
		p.displayProject();
		
		System.out.println();
		char check = 'y',select;
		do {
			System.out.print("Please select action [C|D|A] : ");
			select = input.next().charAt(0);
			String name,newPos;
			if(select == 'C') {
				System.out.print("Enter name: ");
				name = input.next();
				System.out.print("New position: ");
				newPos = input.next();
				for(int i=0;i < team.size();i++) {
					if(team.get(i).getName().equals(name)) {
						team.get(i).changePosition(newPos);
					}
				}
			}else if(select == 'D') {
				System.out.print("Enter name: ");
				name = input.next();
				for(int j =0;j < team.size();j++) {
					if(team.get(j).getName().equals(name)) {
						p.deleteMember(team.get(j));
					}
				}
			}else {
				System.out.print("Enter name: ");
				name = input.next();
				System.out.print("Enter position: ");
				String position = input.next();
				System.out.print("Enter age: ");
				int age = input.nextInt();
				Member newMember = new Member(name, position, age);
				p.addMember(newMember);;
			}
			p.displayProject();
			System.out.println();  
			System.out.print("Do you want to continue [ y/n ]: ");  
			check = input.next().charAt(0);
		}while(check == 'y');
		 System.out.println("Bye Bye !!!"); 
	}
}
