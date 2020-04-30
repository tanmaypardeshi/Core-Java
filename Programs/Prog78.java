//to prove that Strings created using StringBuffer class can be modified

class Prog78
{
	public static void main(String args[])
	{
		//StringBuffer s1 = "hello";	//error, incompatible
		//types found - String, require stringBuffer
		
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = s1;
		
		System.out.println("Before s1 contains " + s1 + " and s2 contains " + s2);
		System.out.println("Are the references same?" + (s1==s2));	//true;
		
		s1.append("sir");	//no concat()
		
		System.out.println("After s1 contains " + s1 + " and s2 contains " + s2);
		System.out.println("Are the references same?" + (s1==s2));	//true;
	}
}
