import java.util.*;
class employee
{
	int emp_id;
	double salary;
	String name;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee name :");
		name = sc.next();
		System.out.print("Enter Employee ID :");
		emp_id = sc.nextInt();
		System.out.print("Enter Employee salary:");
		salary = sc.nextDouble();
	}
	void putdata()
	{
		System.out.println(name+"\t"+emp_id+"\t"+salary);
	}
}
class tender
{
	public static void main(String args[])
	{
		employee e[] = new employee[3];
		int i;
		for(i=0;i<3;i++)
		{
			e[i]=new employee();
			e[i].getdata();
		}
		System.out.println("NAME\tID\tSALARY");
		for(i=0;i<3;i++)
		{
			e[i].putdata();
		}
	}
}