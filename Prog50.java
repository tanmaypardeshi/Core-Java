/* To prove in inheritance, even the parameterised constructor of sub class
can invoke the default constructor of super class provided they do not
invoke the parameterised constructor of super class
*/

class A
{
	A()
	{
		System.out.println("Invocation of default constructor of A");
	}
}

class B extends A
{
	B(int x)
	{
		//super();	//Invoked automatically by compiler
		System.out.println("Invocation of parameterised constructor of B");
	}
}

class C extends B
{
	C(int x)
	{
		super(x);		//super() is not inserted
		System.out.println("Invocation of parameterised constructor of C");
	}
}

class Prog50
{
	public static void main(String args[])
	{
		C objc = new C(10);
	}
}
