//Accept a year from user as comman line argument and determine whether
//its a leap year or not

class Prog19
{
	public static void main(String args [])
	{
		//int year = (int)args[0];	//error
		//inconvertible types reqd-int,found-String
		//typecasting is applicable only with primitive data
		//types not between object type and primitive data type
		int year = Integer.parseInt(args[0]);	//OK
		//this conversion requires to call a special method called
		//parseInt() of Integer class
		if((year%4==0 && year%100!=0) ||(year%400==0))
			System.out.println("Leap year");
		else
			System.out.println("Not a leap year");
	}
}
