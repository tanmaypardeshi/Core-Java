//an eg. of parameterised constructor

class Point
{
	private int x,y;
	private String colour;
	
	//parameterised constructor
	public Point(int a,int b,String c)
	{
		x=a;
		y=b;
		colour=c;
		System.out.println("Parameterised constructor called");
	}
	public void display()
	{
		System.out.print("Coordinates of point are:- " + x + " and ");
		System.out.println(y);
		System.out.println("Colour of point is " + colour);
	}
}

class Prog30
{

	public static void main(String args[])
	{
		//error,no such method
		//Point p=new Point();
		
		Point p=new Point(100,200,"Red");
		p.display();
	}
}	
