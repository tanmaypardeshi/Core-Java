//an eg of method overriding

class A
{
	void show()
	{
		System.out.println("A's implementation of show()");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("B's implementation of show()");
		//show();	//will result in infinite recursion
		super.show();	//can be anywhere in show()
	}
}

class Prog43
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.show();	//B's show
		//obj.super.show()	//error	
	}
}