//non executable class(seperate java file)
class MathUtil
{
	static int SumOfDigits(int x)
	{
		int s=0;
		
		while(x!=0)
		{
			s+=x%10;
			x/=10;
		}
		return s;
	}
	
	static boolean isPrime(int x)
	{
		for(int i=2;i<x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
	
	static boolean isMagic(int x)
	{
		int sum=SumOfDigits(x);
		
		while(sum>9)
			sum = SumOfDigits(sum);
		if(sum==1)
			return true;
		return false;
	}
}
	
