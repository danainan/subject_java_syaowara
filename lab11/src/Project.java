import java.util.ArrayList;

public class Project{
	private ArrayList<Member> members;
	private int numMember;
	private int maxMember;
	private String projectName;
	
	public Project(int n,int maxNum, ArrayList<Member> member) {
		this.numMember = n;
		this.maxMember = maxNum;
		this.members = member;
	}
	public void addMember(Member member) {
		this.members.add(member);
	}
	public void deleteMember(Member member) {
		this.members.remove(member);
	}
	public void displayProject() {
		double sumAge=0,avgAge=0;
		String[] positionList = {"chief","deputy chief","secretary","member"};
		int[] count = new int[positionList.length];
		System.out.println("Number of members: "+members.size());
		
		for(int i =0;i < members.size();i++) {
			System.out.println((i+1)+". "+this.members.get(i).toString());
			sumAge+=this.members.get(i).getAge();
			String position =this.members.get(i).getPosition();
			for(int j =0;j < positionList.length;j++) {
				if(position.equals(positionList[j])) {
					count[j]++;
				}
			}
		}
		avgAge=sumAge/this.members.size();
		System.out.println("Project OS Team have "+count[0]+" "+positionList[0]+", "
											      +count[1]+" "+positionList[1]+", "
											      +count[2]+" "+positionList[2]+", "
										   +"and "+count[3]+" "+positionList[3]
		);
		System.out.format("Total age: "+(int)sumAge+" average age: "+avgAge);
	}
}
