//an eg. of inheritance
//A.java and B.java has been deleted but it still runs
//because A.class and B.class are used
class Prog40
{
	
	public static void main(String[] args) 
	{

		B obj = new B();
		obj.i=10;
		obj.j=20;
		obj.k=30;
		obj.showij();
		obj.showk();
		obj.sumijk();
	}
}