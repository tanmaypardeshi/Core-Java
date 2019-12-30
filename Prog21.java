//Accept a character from user from cmd and dispplay its category.

class Prog21
{
	public static void main(String args[])
	{
		char ch=args[0].charAt(0);
		
		//error,no such method in class Character
		//char ch = Character.parseChar(args[0]);
		
		if(Character.isUpperCase(ch))
			System.out.println("Capital Letter"); 
		
		else if(Character.isLowerCase(ch))
			System.out.println("Small Letter");
		
		else if(Character.isDigit(ch))
			System.out.println("Digit");
		else
			System.out.println("Symbol");
	}
}
		
