//an eg. of final method

class A
{
	final void meth()
	{
		System.out.println("A's implementation of meth()");
	}
}

class B extends A
{
	//error, cannot override meth() of class A()
	//overriden method is final
	
	void meth()
	{
		System.out.println("B's implementation of meth()");
	}
}


