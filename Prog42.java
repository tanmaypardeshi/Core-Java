//an eg. of hidden member of superclass

class A
{
	int i;
}

class B extends A
{
	int i;	//OK but hides member
	//"i" of super class

	B(int x,int y)
	{
		i=x;	//will initialise var "i"
		//of sub class
		super.i=y;	//will initialise var "i" of
		//super class
	}

	void display()
	{
		System.out.print("i of superclass is " + super.i);
		System.out.println(" and of subclass is " + i);
	}
}

class Prog42
{
	public static void main(String[] args)
	{
		B obj = new B(10,20);
		obj.display();	
	}
}