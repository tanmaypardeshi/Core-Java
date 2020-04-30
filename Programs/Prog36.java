//an eg-1 of method overloading

class Overload
{
	void test()
	{
		System.out.println("Invocation of parameterless test()");
	}

	void test(int i)
	{
		System.out.println("Invocation of test() with 1 int pararmeter");
	}

	void test(int i1,int i2)
	{
		System.out.println("Invocation of test() with 2 int pararmeters");
	}

	//error test(int) already defined 
	/*int test(int x)
	{
		return x;
	}*/

	double test(double number)
	{
		System.out.println("Given no. is " + number);
		return number*number;
	}
}

class Prog36
{
	public static void main(String args[])
	{
		Overload obj = new Overload();

		obj.test();
		obj.test(10);
		obj.test(10,20);
		System.out.println("Square of 2.5 is " + obj.test(2.5));
	}
}