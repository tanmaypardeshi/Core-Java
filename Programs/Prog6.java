//an eg. of boolean literal

class Prog6
{
	public static void main(String args [])
	{
		//boolean b=1;	//compile error, incompatible types
		//fount-int reqd-boolean
		boolean b=true;	//OK
		
		if(b)	//b==true //OK, not preferred
		System.out.println("This statement is executed");
		
		if(!b)	//b==false //OK,not preferred
		System.out.println("This statement is not executed");
		
		//System.out.println("Is 10>5? "+10>5);
		//error
		//Bad operads for binary operator >
		//1st type string,2nd type int
		System.out.println("Is 10>5? "+(10>5));
	}
} 
		
		
