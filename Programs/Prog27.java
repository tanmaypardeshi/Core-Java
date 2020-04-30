//Design a class "Circle" with suitable attributes and methods to 
//calculate area and circumference

//non executable class
class Circle
{
     int x,y,r;
     
     double area()
     {
          return 3.14*r*r;
     }
     
     double circum()
     {
     	return 2*3.14*r;
     }
}

//exectuable class
class Prog27
{
	public static void main(String args [])
	{
		Circle c1,c2;
	
		c1 = new Circle();
		c2 = new Circle();
	
		c1.x=100;
		c1.y=200;
		c1.r=10;
	
		System.out.println("Centre of c1 is " + c1.x + " and " + c1.y);

		double ac=c1.area();
		double cc=c1.circum();

		System.out.println("Area of c1 is " + ac + " and circumference is " + cc);
		System.out.println("Centre of c2 is " + c2.x + " and " + c2.y);
	}
}
