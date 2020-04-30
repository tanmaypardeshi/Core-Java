//to access a class kept in a package

import Programs.test.*;

class Prog66
{
	public static void main(String args[])
	{
		int no = Integer.parseInt(args[0]);
		no = MathOpns.getAbs(no);
		
		/*if import statement is not used @ top,
		then use full qualifier*/
		//no = parth.MathOpns.getAbs(no);
		System.out.println("Absolute value of given no. is " + no);
	}
}
