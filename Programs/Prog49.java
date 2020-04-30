/* To prove that in a class hierarchy i.e inheritance, the default
constructor of super class are automatically invoked by sub class
constructor */

class A
{
	A()
	{
		System.out.println("Invocation of default constructor of A");
	}
}

class B extends A
{
	B()
	{
		//super();	//Invoked automatically by compiler
		System.out.println("Invocation of default constructor of B");
	}
}

class C extends B
{
	C()
	{
		//super();	//Invoked automatically by compiler
		System.out.println("Invocation of default constructor of C");
		//super();	//error, it should be the first statement of 
					//subclass constructor
	}
}

class Prog49
{
	public static void main(String args[])
	{
		C objc = new C();
	}
}
