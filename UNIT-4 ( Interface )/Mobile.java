import java.util.*;
interface Loader
{
	void LoadOS();
}
class Device
{
	String Vendername;
	int Ramsize;
	int OSVersion;
	void get_device_info()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vender Name:");
		Vendername=sc.next();
		System.out.println("Enter RAM Size:");
		Ramsize=sc.nextInt();
		System.out.println("Enter OS Version:");
		OSVersion=sc.nextInt();
	}
}
class Mobile extends Device implements Loader
{
	public void LoadOS()
	{
		System.out.println("***** Device Details *******");
		System.out.println("Vender Name   :"+Vendername);
		System.out.println("RAM Size 	  :"+Ramsize);
		System.out.println("OS Version	  :"+OSVersion);
	}
	public static void main(String args[])
	{
		Mobile m1=new Mobile();
		m1.get_device_info();
		m1.LoadOS();
	}
}