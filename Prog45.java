/* Write a method to increment 2 variables from main()
by 2 different values say 3 and 5. Process is known as
"Call by Value". Result not achieved */

class Test
{
	int a,b;
}

class Prog45
{
	public static void main(String[] args) 
	{
		Test obj = new Test();
		obj.a=10;
		obj.b=20;
		System.out.print("Before calling incr(), a= " + obj.a);
		System.out.println(" and b= " + obj.b);	
		incr(obj.a,obj.b);		
		System.out.print("After calling incr(), a= " + obj.a);
		System.out.println(" and b= " + obj.b);
	}

	static void incr(int a, int b)
	{
		a+=3;
		b+=5;
	}
}