//An eg. of overloading of constructors

class Room
{
	int length,breadth;

	//constructor for Recatangular room
	Room(int l,int b)
	{
		length = l;
		breadth = b;
	}

	//constructor for Square room
	Room(int s)
	{
		length=breadth=s;
	} 

	//common methods to calculate area and perimeter
	int getArea()
	{
		return length*breadth;
	}

	int getPeri()
	{
		return 2*(length+breadth);
	}
}


class Prog38
{
	public static void main(String args[])
	{
		Room hall =  new Room(14,11);
		Room balcony = new Room(9);

		System.out.print("Area of perimeter of my hall is ");
		System.out.println(hall.getArea() + " and " + hall.getPeri());

		System.out.print("Area of perimeter of my balcony is ");
		System.out.println(balcony.getArea() + " and " + balcony.getPeri());

	}
}