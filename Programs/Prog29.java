//an eg. of Default Constructor

class Dconstructor
{
	public Dconstructor()
	{
		System.out.println("A new object is created");
	}
}

class Prog29
{
	public static void main(String args[])
	{
		//declaration,memory allocation,invoking constructor
		//explicity
		Dconstructor d1=new Dconstructor();
		Dconstructor d2;	//constructor not called
		//d1.Dconstructor();	//error, constrcutors cannot
		//be invoked manually
		
	}
}
