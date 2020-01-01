//Define a recursive method to return the factorial value
//of any given int no. Write this function in a seperate class but in same
//.java file

//executable class
class Prog24
{
	public static void main(String args[])
	{
		int no=Integer.parseInt(args[0]);
		int fv=Fact.calcFv(no);
		System.out.println("Factorial value of " + no + " is " + fv);
	}
}

class Fact
{
	static int calcFv(int x)
	{
		int y;
		if(x==1)
			return 1;
		y=x*calcFv(x-1);
		return y;
	}
}
