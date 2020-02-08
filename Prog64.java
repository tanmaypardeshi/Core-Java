/*Accept the age of a person to be insured between 10-60 years only and
displayi t. Handle the following exceptions:

if age<10 throw "AgeTooSmallException"
if age>50 throw "AgeTooLargeException"
handle standard exceptions if any

/*logic:- As behaviour of both exceptions is ame and only messages differ,
so a good idea is to manage both of them using a single class with parameterised
constructor */


class AgeException extends Exception
{
	AgeException(String msg)
	{
		super(msg);
	}
}

class Prog64
{
	public static void main(String args[])
	{
		try
		{
			int age = Integer.parseInt(args[0]);
		
			if(age<10)
				throw new AgeException("AgeTooSmallException");
			if(age>50)
				throw new AgeException("AgeTooLargeException");
		
			System.out.println("Age is OK and processing continues...");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please enter your age");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter your age in figures only");
		}
		catch(AgeException e)
		{
			System.out.println(e.getMessage());
		}		
	}
}

