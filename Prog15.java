//eg-2 on scope of vars


class Prog15
{
	public static void main(String args [])
	{
		//to print "Hello" 5 times.
		//int cntr;	//preferred if you wish to use this
		//var for multiple loops
		
		//if declared here, we are limiting the var cntr to
		//scope of "for" loop only and next loop gives error
		//var "cntr" not found
		
		for(int cntr=0;cntr<5;cntr++)
			System.out.println("Hello");
			
		//to print "Hi" 6 times,error
		//for(cntr=0;cntr<6;cntr++)
		//	System.out.println("Hi");
	}
}
