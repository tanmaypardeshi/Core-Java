//an eg. of int literal

class Prog9
{
	public static void main(String args [])
	{
		byte b=100;	//OK
		short s=30000;	//OK
		long l1=2147483647;	//OK
		//long l2=2147483647; //error,int no. too large
		//long l2=(long)2147483647; //same error
		//typecasting is done before assignment
		long l2=2147483648L;	//here int literal is
		//treated as long literal and then assigned to l2
		
		System.out.println("b contains "+b);	//100
		System.out.println("s contains "+s);	//30000
		System.out.println("l1 contains "+l1);	//2147483647						
		System.out.println("l2 contains "+l2);	//2147483648				
	}
}
