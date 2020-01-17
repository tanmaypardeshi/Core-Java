//example on method overloading

class A
{
	void show()
	{

		System.out.println("A's implementation of show()");
	}
}


class B extends A
{
	void show(String msg)
	{
		System.out.println(msg);
	}
}

class Prog44
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.show();	//A's show
		obj.show("B's implementation of show()");	
		//B's show
	}
}