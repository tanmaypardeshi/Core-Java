//An example of nested try block

class Prog63
{
	public static void main(String args[])
	{
		int numer = 12, denom[] = {2,0,4,0,3};
		
		//outer try
		try
		{
			for(int i=0;i<10;i++)
			{
				//inner try
				try
				{
					int result = numer/denom[i];
					System.out.println(numer + "/" + denom[i] + "=" +result);
				}
				catch(ArithmeticException e)
				{
					System.out.println("Divsion by ZERO not possible");
				}	//end of inner try catch
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index out of array range");
		}//end of outer try catch
	}
}
		
