/* Write a method to increment 2 variables from main()
by 2 different values say 3 and 5. Process is known as
"Call by Reference". Result achieved */

class Test
{
	int a,b;
}

class Prog46
{
	public static void main(String[] args) 
	{
		Test obj = new Test();
		obj.a=10;
		obj.b=20;
		System.out.print("Before calling incr(), a= " + obj.a);
		System.out.println(" and b= " + obj.b);	
		incr(obj);		
		System.out.print("After calling incr(), a= " + obj.a);
		System.out.println(" and b= " + obj.b);
	}

	static void incr(Test ref)
	{
		ref.a+=3;
		ref.b+=5;
	}
}