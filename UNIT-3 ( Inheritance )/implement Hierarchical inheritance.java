//implement Hierarchical inheritance
import java.util.Scanner;
class Student
{
	Scanner sc = new Scanner(System.in);
	int rollno;
	String name;
	void get_stud_info()
	{
		System.out.println("Enter Student Roll NO:");
		rollno=sc.nextInt();
		System.out.println("Enter Student Name:");	
		name=sc.next();
	}
	void disp_stud_info()
	{
		System.out.println("Student Name:"+name);
		System.out.println("Student RollNO:"+rollno);
	}
}
class Test extends Student
{
	int marks1,marks2;
	 void get_stud_marks()
	 {
		 System.out.println("Enter Test-1 Matrks:");
		 marks1 = sc.nextInt();
		 System.out.println("Enter Test-2 Matrks:");
		 marks2 = sc.nextInt();
	 }
	 void disp_stud_Marks()
	 {
		 System.out.println("Test-1 Marks:"+marks1);
		 System.out.println("Test-2 Marks:"+marks2);
	 }
}
class sport extends Student
{
	double sport_wt;
	void get_sport_weightage()
	{
		sport_wt=8.9;
	}
	void disp_sport_weightage()
	{	
		System.out.println("Sport Marks:"+sport_wt);
	}
	
	 public static void main(String args[])
	 {
		 Test t1=new Test();
		 System.out.println("********Implementation of Test class********");
		 t1.get_stud_info();
		 t1.get_stud_marks();
		 t1.disp_stud_info();
		 t1.disp_stud_Marks();
		 //t1.disp_sport_weightage();
		 
		 
		 sport s1=new sport();
		 System.out.println("********Implementation of sport class********");
		 s1.get_stud_info();
		 s1.get_sport_weightage();	
		 s1.disp_stud_info();
		 s1.disp_sport_weightage();
	 }
}