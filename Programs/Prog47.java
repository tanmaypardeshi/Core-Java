//eg of dynamic method allocation
class A
{
	void meth()
	{
		System.out.println("A's implementation of meth()");
	}
}

class B extends A
{
	//method overriding
	void meth()
	{
		System.out.println("B's implementation of meth()");
	}
}

class C extends B
{
	//subsequent overriding
	void meth()
	{
		System.out.println("C's implementation of meth()");
	}
}

class Prog47
{
	public static void main(String[] args) 
	{
		A super_ref;
		super_ref = new A();
		super_ref.meth();	//A's meth()

		super_ref = new B();
		super_ref.meth();	//B's meth()
		
		super_ref = new C();
		super_ref.meth();	//C's meth()
			
	}
}