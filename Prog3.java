//An eg. of precedence of operators

class Prog3
{
	public static void main(String args [])
	{
		int a=10;
		System.out.println("a+2= " +a+2);	//102
		System.out.println("a+2= " +(a+2));	//12
		System.out.println("ax5= " +a*5);	//50
		//System.out.println("a-6= "+a-6);	//compile error
		//bad operands for binary operator "-"
		//1st type-string and 2nd type-int
		System.out.print("a-6= "+(a-6));	//4		
	}
}
