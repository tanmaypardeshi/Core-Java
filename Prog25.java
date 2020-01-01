//Sum of digits, prime number check and magic number check program 
//Write the methods in seperate class called MathUtil so that new class file 
//is created.

class Prog25
{
	public static void main(String args[])
	{
		int no=Integer.parseInt(args[0]);
		
		//int sum=MathUtil.SumOfDigits(no);
		//System.out.println("Sum of digits of number is " +sum);
		
		//using nested method call
		System.out.println("Sum of digits of number is " +MathUtil.SumOfDigits(no));
		
		//IMP:- do not use nested method call for void and boolean methods
		if(MathUtil.isPrime(no))
			System.out.println("Prime number");
		else
			System.out.println("Composite number");
		if(MathUtil.isMagic(no))
			System.out.println("Magic number");
		else
			System.out.println("Not Magic number");
	}
}
	
	
	
