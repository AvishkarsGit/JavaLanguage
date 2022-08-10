//Write a program to implement bufferreader class
class bufferreader
{
	public static void main(String args[])
	{
		int no;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Any Number :");
		no = Integer.parseInt(br.readline());
		System.out.print("Number you have entered :"+no);
	}
}