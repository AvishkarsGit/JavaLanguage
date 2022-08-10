//implement Multiple inheritance
interface Student
{
	final int rollno=1010;
	final String name="Avishkar";
	void disp_stud_info();
}
interface Test
{
	final int marks1=98;
	final int marks2=78;
	void disp_stud_Marks();
}
class sport implements Student,Test
{
	public void disp_stud_info()
	{
		System.out.println("Student Name:"+name);
		System.out.println("Student RollNO:"+rollno);
	}
	public void disp_stud_Marks()
	{
		System.out.println("Test-1 Marks:"+marks1);
		System.out.println("Test-2 Marks:"+marks2);
	}
	public static void main(String args[])
	{
		sport s1=new sport();
		s1.disp_stud_info();
		s1.disp_stud_Marks();
	}
}