//Accept a letter from user and change its case

class Prog22
{
	public static void main(String args[])
	{
		char ch= args[0].charAt(0);
		//validation
		if(!Character.isLetter(ch))
			System.out.println("Please enter a letter only");
		else
		{
			if(Character.isLowerCase(ch))
				ch=Character.toUpperCase(ch);
			else
				ch=Character.toLowerCase(ch);
			System.out.println("Converted character is:- " + ch);
		}
	}
}
