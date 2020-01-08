//an eg. of static vars
class Prog33
{
	//instance member
	int no1=10;
	int no2=no1*5;
	
	public static void main(String args[])
	{
		//Solution 1, Declare vars in main()
		//System.out.println("no1 contains:- " +no1);
		//System.out.println("no2 contains:- " +no2);
		//Solution 2, declare vars as static
		//Solution 3, create an object of class Prog33
		Prog33 obj=new Prog33();
		System.out.println("no1 contains:- " +obj.no1);
		System.out.println("no2 contains:- " +obj.no2);
	}
}
		
