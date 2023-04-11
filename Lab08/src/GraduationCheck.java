
public class GraduationCheck {
	public static void main(String[] args) {
		
	
		


		int Gpass = 0, Mpass = 0;
		
		MajorCourse[] Mcourse = new MajorCourse[4];
		GenEdCourse[] Gcourse = new GenEdCourse[3];
		

		System.out.println("General Education Course :");
		
		Gcourse[0] = new GenEdCourse("Gen61-127",3,"C"," School of Liberal Arts");
		Gcourse[1] = new GenEdCourse("Gen61-152",4,"D"," School of Science");
		Gcourse[2] = new GenEdCourse("Gen61-153",2,"C+"," School of Science");
		Mcourse[0] = new MajorCourse("SWE62-123",2,"W",1);
		Mcourse[1] = new MajorCourse("SWE62-205",3,"F",2);
		Mcourse[2] = new MajorCourse("SWE62-214",3,"C+",2);
		Mcourse[3] = new MajorCourse("SWE62-215",2,"F",2);
		
		for(int i = 0;i<Gcourse.length;i++) {
			if (Gcourse[i].getGrade() != "F") {
				Gpass++;
			}
		}
		for(int i = 0;i<Mcourse.length;i++) {
			if (Mcourse[i].getGrade() != "F" && Mcourse[i].getGrade() != "W") {
				Mpass++;
			}
			
		}
		displayGcourse(Gcourse);
		System.out.println("Enroll "+Gcourse.length+" Pass :"+Gpass);
		System.out.println("==============================");
		
		System.out.println("Major Course :");
		displayMcourse(Mcourse);
		System.out.println("Enroll "+Mcourse.length+" Pass :"+Mpass);
		System.out.println("==============================");
		System.out.println("Total enroll 7 courses; Pass "+(Gpass+Mpass)+" courses");
		
		calGPA(Gcourse,Mcourse);
		
	}
	public static void displayGcourse(GenEdCourse[] Gcourse) {
		for(int i =0;i < Gcourse.length;i++) {
			System.out.println(Gcourse[i].toString());
		}
	}
	public static void displayMcourse(MajorCourse[] Mcourse) {
		for(int i =0;i < Mcourse.length;i++) {
			System.out.println(Mcourse[i].toString());
		}
	}
	
	public static void calGPA(GenEdCourse[] Gcourse,MajorCourse[] Mcourse) {
		double gpa = 0.0,unit = 0.0,sum =0.0;
		for(int i =0;i < Gcourse.length;i++) {
			if(Gcourse[i].getGrade() != "W") {
				if(Gcourse[i].getGrade().equals("A"))
				{
					unit = 4;
				}
				else if(Gcourse[i].getGrade().equals("B+"))
				{
					unit = 3.5;
				}
				else if(Gcourse[i].getGrade().equals("B"))
				{
					unit = 3;
				}	
				else if(Gcourse[i].getGrade().equals("C+"))
				{
					unit = 2.5;
				}
				else if(Gcourse[i].getGrade().equals("C"))
				{
					unit = 2;
				}
				else if(Gcourse[i].getGrade().equals("D+"))
				{
					unit = 1.5;
				}
				else if(Gcourse[i].getGrade().equals("D"))
				{
					unit = 1;
				}
				else {
					unit = 0;
				}
				sum+=Gcourse[i].getUnit();
				gpa+=Gcourse[i].getUnit()*unit;
				}
			}
			for(int i =0;i < Mcourse.length;i++) {
				if(Mcourse[i].getGrade() != "W") {
					if(Mcourse[i].getGrade().equals("A"))
					{
						unit = 4;	
					}
					else if(Mcourse[i].getGrade().equals("B+"))
					{
						unit = 3.5;
					
					}
					else if(Mcourse[i].getGrade().equals("B"))
					{
						unit = 3;
					}
					else if(Mcourse[i].getGrade().equals("C+"))
					{
						unit = 2.5;
					}
					else if(Mcourse[i].getGrade().equals("C"))
					{
						unit = 2;
					}
					else if(Mcourse[i].getGrade().equals("D+"))
					{
						unit = 1.5;
					}
					else if(Mcourse[i].getGrade().equals("D"))
					{
						unit = 1;
					}
					else {
						unit = 0;
					}
				
					sum+=Mcourse[i].getUnit();
					gpa+=Mcourse[i].getUnit()*unit;
					}
				}
		gpa = gpa / sum;
		System.out.print("GPA = "+gpa);
	}
}

