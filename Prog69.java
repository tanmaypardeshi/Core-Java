//eg2 of String class constuctor

class Prog69
{
	public static void main(String args[])
	{	
		byte nos[] = {65,66,67,68,69,70,71,72};
		
		String s1 = new String(nos);
		String s2 = new String(nos,2,5);
		
		System.out.println("s1 contains:- "+ s1);
		System.out.println("s2 contains:- "+ s2);		
	}
}
