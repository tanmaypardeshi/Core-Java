/* an eg. of substring() to extract a portion of a string */

class Prog74
{
	public static void main(String args[])
	{
		String name = "databyte computers training center";
		
		String s1 = name.substring(9);	//int, start pos
		String s2 = name.substring(9,17);	//Substring method to
									//overloaded
									//int start pos, int length
									//OR int endpos+1
		System.out.println("s1 contains:- " + s1);
		System.out.println("s2 contains:- " + s2);
		
	}
}
