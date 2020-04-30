//eg-2 on type promotion in expression

class Prog13
{
	public static void main(String args[])
	{
		int r=10;
		
		// error, loss of precision, found-double,reqd-int
		// float ac = 3.14*r*r;
		// float cc = 2*3.14*r;
		
		//float ac = (float)(3.14*r*r);	//OK
		double ac = 3.14*r*r;	//OK
		float cc = 2*3.14F*r;	//OK
		
		System.out.println("Area is "+ ac);
		System.out.println("Circumference is "+cc);
	}
}
