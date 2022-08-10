import java.util.*;
interface Exam
{
	void cal_per();
}
class Student
{
	String name;
	int rollno,m1,m2;
	void get_stud_info()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name:");
		name=sc.next();
		System.out.println("Enter student Roll NO:");
		rollno=sc.nextInt();
		System.out.println("Enter Student Marks-1:");
		m1=sc.nextInt();
		System.out.println("Enter Student Marks-2:");
		m2=sc.nextInt();
	}
}
class Result extends Student implements Exam
{
	float percentage;
	public void cal_per()
	{
		percentage=(float)(m1+m2)/2;
	}
	void display()
	{
		System.out.println("******* Student Result System ********");
		System.out.println("Name	:"+name);
		System.out.println("Roll NO :"+rollno);
		System.out.println("Marks-1 :"+m1);
		System.out.println("Marks-2 :"+m2);
		System.out.println("==========================");
		System.out.println("Percentage	:"+percentage);
	}
	public static void main(String args[])
	{
		Result r1=new Result();
		r1.get_stud_info();
		r1.cal_per();
		r1.display();
	}
}