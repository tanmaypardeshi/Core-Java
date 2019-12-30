//Accept a few nos. from user from cmd and display their sum

class Prog20
{
	public static void main(String []x)
	{
		double sum=0;	//running total
		for(int i=0;i<x.length;i++)
			sum+=Double.parseDouble(x[i]);
		
		System.out.println("Sum of given numbers is:- " + sum);
	}
}
