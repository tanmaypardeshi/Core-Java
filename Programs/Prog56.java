//An eg. of toString() of Object class

class Emp
{
	private int empid;
	private String name;
	private double sal;
	
	public Emp(int id,String n,double s)
	{
		empid=id;
		name=n;
		sal=s;
	}
	
	//override toString() of object class
	
	public String toString()
	{
		return "Empid:- " + empid + ", Name:- " + name + ", Salary:- " + sal;
	}
}

class Prog56
{
	public static void main(String args[])
	{	
		Emp e1 = new Emp(1, "mahesh", 10000.35);
		Emp e2 = new Emp(2, "suresh", 20000.00);
		Emp e3 = new Emp(3, "sandesh", 56000.75);
		
		
		System.out.println("e1 contains " + e1.toString());
		/* when we call an object to user defined type, we are already
		callng toString() of superclass object */
		System.out.println("e2 contains " + e2);
		System.out.println("e3 contains " + e3);
	}
}	
