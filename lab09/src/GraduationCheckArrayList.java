import java.util.ArrayList;

public class GraduationCheckArrayList {
	public static void main(String[] args) {
		
		ArrayList<Course> List = new ArrayList<Course>();
		List.add(new GenEdCourse("Gen61-127",3,"C"," School of Liberal Arts"));
		List.add(new GenEdCourse("Gen61-152",4,"D"," School of Science"));
		List.add(new GenEdCourse("Gen61-153",2,"C+"," School of Science"));
		List.add(new MajorCourse("SWE62-123",2,"W",1));
		List.add(new MajorCourse("SWE62-205",3,"F",2));
		List.add(new MajorCourse("SWE62-214",3,"C+",2));
		List.add(new MajorCourse("SWE62-215",2,"F",2));
		
		
		displayGraduation(List);
	}
	public static void displayGraduation (ArrayList<Course> o) {
		int Gpass = 0, Mpass =0;
		System.out.println("General Education Course :");
		for (Course c : o){
			if( c instanceof GenEdCourse){
				System.out.println(c.toString());
				if(c.getGrade() != "F") {
					Gpass++;
				}
			}
		}
		System.out.println("Enroll : 3 Pass :"+Gpass);
		System.out.println("==============================");
		System.out.println("Major Course :");
		for (Course c : o){
			if( c instanceof MajorCourse){
				System.out.println(c.toString());
				if(c.getGrade() != "F" && c.getGrade() != "W") {
					Mpass++;
				}
			}
		}
		System.out.println("Enroll : 4 Pass :"+Mpass);
		System.out.println("==============================");
		System.out.println("Total enroll 7 courses; Pass "+(Gpass+Mpass)+" courses");
		System.out.println("GPA ="+calGPA(o));
	}
	public static double calGPA(ArrayList<Course> o) {
		double gpa = 0.0,unit = 0.0,sum =0.0;
		for(Course c : o) {
			if(!c.getGrade().equals("W")) {
				if(c.getGrade().equals("A")) {unit = 4; }
				else if(c.getGrade().equals("B+")) {unit = 3.5; }
				else if(c.getGrade().equals("B")) {unit = 3; }
				else if(c.getGrade().equals("C+")) {unit = 2.5; }
				else if(c.getGrade().equals("C")) {unit = 2; }
				else if(c.getGrade().equals("D+")) {unit = 1.5; }
				else if(c.getGrade().equals("D")) {unit = 1; }
				else {unit = 0; }
				sum+=c.getUnit();
				gpa+=c.getUnit()*unit;
			}
		}
		gpa=gpa/sum;
		return gpa;
	}
	

}
