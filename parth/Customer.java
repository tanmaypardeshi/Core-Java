/*Define a non executable class to record the customers of a bank. Define a 
method to display the records of customers with negative balance in their 
account*/

package parth;

public class Customer
{
	private int acctno;
	private String name;
	private double bal;
	
	public Customer(int a,String n,double b)
	{
		name = n;
		acctno = a;
		bal = b;
	}
	
	public void display()
	{
		if(bal<0)
			System.out.println(acctno + "\t" + name + "\t" + bal);
	}
}


