//implement Multi-level inheritance
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
class Result extends Test
{
	int total_marks;
	void get_total_marks()
	{
		total_marks=marks1+marks2;
	}
	void disp_total_marks()
	{	
		System.out.println("Total Marks:"+total_marks);
	}
	
	 public static void main(String args[])
	 {
		 Result r1=new Result();
		 r1.get_stud_info();
		 r1.get_stud_marks();
		 r1.get_total_marks();
		 System.out.println("********STUDENT INFORMATION**********");
		 r1.disp_stud_info();
		 r1.disp_stud_Marks();
		 r1.disp_total_marks();
	 }

}