//an eg. of double literal

class Prog10
{
	public static void main(String args [])
	{
		float f1=9;	//OK
		//float f2=9.0;	//compile error, possible loss of precision
					//found-double,reqd-float
		float f2=9.0F;	//OK
		double d=123.123456789012;	//OK
		
		System.out.println("f1 contains "+f1);	//9.0
		System.out.println("f2 contains "+f2);	//9.0
		System.out.println("d contains "+d);	//same as assigned
	}
}		
