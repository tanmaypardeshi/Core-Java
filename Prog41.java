//an eg. of provate members of super class

class A
{
	int i;
	private int j;

	void showij()
	{
		System.out.println("Values in i and j are " + i + " and " +j);

	}

	int getj()
	{
		return j;
	}
	void setj(int x)
	{
		j=x;
	}
}

class B extends A
{
	/* i and j and showij() are available
	i and showij() are accessible but j is not*/

	int k;

	void showk()
	{
		System.out.println("Value of k is " + k);
	}

	void sumijk()
	{
		/* error, j is having private access
		in class A*/
		//System.out.println("Sum of i,j and k is " + (i+j+k));
		System.out.println("Sum of i,j and k is " + (i+getj()+k));
	}
}


class Prog41
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.i=10;
		//obj.j=20;	//error, same as above
		obj.setj(20);
		obj.k=30;
		obj.showij();
		obj.showk();
		obj.sumijk();
	}
}
