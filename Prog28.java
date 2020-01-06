//Design class "Rectangle" with suitable attributes and methods
//to calculate area and perimeter

class Rectangle
{
	int length,breadth;
	
	
	/*In java, we have only 2 types of methods, getter and setter
	Setter methods are also called as "mutator methods" and with
	return type void and an argument list*/
	//setter method
	public void setDim(int l,int b)
	{
		length=l;
		breadth=b;
	}
	
	/*getter methods are also called as "accessor method" and with
	return type non void. Generally, w/o an argument list and operate on
	data of fields of objects. */
	//getter method
	public int getArea()
	{
		return length*breadth;
	}
	public int getPeri()
	{
		return 2*(length+breadth);
	}
}

class Prog28
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		
		//error,length has private access in class Rectangle
		//r.length=20;
		r.setDim(20,10);	//OK
		System.out.println("Area:- " + r.getArea());
		System.out.println("Perimeter:- " + r.getPeri());
	
	}
}
