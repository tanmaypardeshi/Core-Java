//eg-1 on scope of vars

class Prog14
{
	//global scope
	public static void main(String args[])
	{	//outer scope
	
		int out_x=10;
		
		//inner scope
		{
			int in_x=20;
			//errorm var out_x is already defined
			//int out_x=30;
			System.out.println("In inner scope, out_x= " + out_x );
			System.out.println("and in_x= "+ in_x);
		}
		//error, var "in_x" not found
		//System.out.println("In inner scope, out_x= " + out_x );
		//System.out.print(" and in_x= "+ in_x);
	}
}
