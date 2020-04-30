//eg2 on boolean literal

class Prog7
{
	public static void main(String args [])
	{
		//to print "Hello" 5 times
		boolean b=true;
		int cntr=0;
		
		while(b)
		{
			System.out.println("Hello");
			cntr++;
			if(cntr==5)
				b=false;
		}
	}
}
