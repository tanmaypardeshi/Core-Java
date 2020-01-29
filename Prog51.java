//Eg. 1 of abstract class

abstract class A
{
	//non-abstract method - normal
	void callMe()
	{
		System.out.println("A's implementation of callMe()");
	}
	
	abstract void callMeToo();
}


class B extends A
{
	//compulsory to override abstract method of super class
	void callMeToo()
	{
		System.out.println("B's implementation of callMeToo()");
	}
}

class Prog51
{
	public static void main(String args[])
	{
		//error, abstract class A cannot be instantiated
		//A obj = new A();
		B obj = new B();
		obj.callMe();	//A's implementation
		obj.callMeToo();	//B's implentation
	}
}
