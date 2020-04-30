//Define a method to accept 'n' int parameters and return its sum


class Overload	//not overloading as such
{
	int test(int ... nos)
	{
		int sum = 0;

		for(int i=0;i<nos.length;i++)
			sum+=nos[i];

		return sum;
	}
}

class Prog39
{
	public static void main(String args[])
	{
		Overload obj = new Overload();

		System.out.println("Sum of 10 and 20 is " + obj.test(10,20));
		System.out.println("Sum of 10, 20 and 30 is " + obj.test(10,20,30));
		System.out.println("Sum of 10,20,30 and 40 is " + obj.test(10,20,30,40));
		System.out.println("Sum of 10,20,30,40 and 50 is " + obj.test(10,20,30,40,50));
		System.out.println("Sum of 10,20,30,40,50 and 60 is " + obj.test(10,20,30,40,50,60));

		int arr[] = {1,2,3,4,5,6,7,8,9};

		System.out.println("Sum of the array is:- " + obj.test(arr));
	}
}