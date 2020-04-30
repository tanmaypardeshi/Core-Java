//an example of "this" keyword

class Point
{
	private int x,y;
	private String colour;
	
	public Point(int x,int y,String c)
	{
		this.x=x;
		this.y=y;
		this.colour=c;
		//OK, but "this" not reqd as names of args and
		//member differ
	}
	
	public void display()
	{
		System.out.print("Coordinates of point are:- " + x + " and ");
		System.out.println(y);
		System.out.println("Colour of point is " + colour);
	}
}

class Prog31
{
	public static void main(String args[])
	{
		//error,no such method
		//Point p=new Point();
		
		Point p=new Point(100,200,"Red");
		p.display();
	}
}	
