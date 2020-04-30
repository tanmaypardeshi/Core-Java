//Write your own method which returns absolute value of any given
//int value. Define this method in the same class as that of main()

class Prog23
{
	public static void main(String args[])
	{
		int no=Integer.parseInt(args[0]);
		no=abs(no);
		//same as no=Prog23.abs(no);
		//OK, class name is optional
		System.out.println("Absolute value of given no. is "+ no);
	}
	//as method is called using classname, use static keyword
	static int abs(int x)
	{
		if(x<0)
			return -x;
		return x;
	}
}
