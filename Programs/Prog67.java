//to create records of customers for a banking application

import Programs.test.*;

class Prog67
{
	public static void main(String args[])
	{
		Customer arr[] = new Customer[5];
		
		arr[0] = new Customer(1,"mahesh",-90000.66);
		arr[1] = new Customer(2,"ramesh",90000.66);
		arr[2] = new Customer(3,"suresh",60000.66);
		arr[3] = new Customer(4,"nilesh",-780000.66);
		arr[4] = new Customer(5,"jinesh",20000.66);		
		
		System.out.println("Details of the customers with -ve balance in their account are:- ");
		for(int i=0;i<arr.length;i++)
			arr[i].display();
	}
}
