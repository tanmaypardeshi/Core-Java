//to prove that strings cannot be modified


class Prog71
{
	public static void main(String args[])
	{
		String s1 = "hello";
		String s2 = s1;
		
		System.out.println("Before, s1 contains " +s1+ " and s2 contains " +s2);	//hello,hello
		System.out.println("Are the references of s1 and s2 same? " + (s1==s2));	//true
		
		s1 = s1.concat("sir"); //s1+="sir";
		
		System.out.println("After, s1 contains " +s1+ " and s2 contains " +s2);	//hellosir,hello
		System.out.println("Are the references of s1 and s2 same? " + (s1==s2));	//false
		
		
	}
}
