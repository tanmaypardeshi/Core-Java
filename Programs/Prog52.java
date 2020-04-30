/* Eg-2 of abstract class. Define a class "Shape" to manage 2D shapes
with suitable attributes and a method to calculate area of any given 2D shape.
Define a class "Rectangle" which inherits "Shape". Define "Triangle" which 
inherits "Shape". Accept n shapes from user and display their area.
Logic:- As the formula/expression to calculate area of different shapes is
different, we have to declare getArea() as abstract */

import java.util.Scanner;

abstract class Shape
{
	protected int dim1,dim2;
	
	public Shape(int x,int y)
	{
		dim1=x;
		dim2=y;
	}
	
	public abstract double getArea();
}

class Rectangle extends Shape
{
	public Rectangle(int l,int b)
	{
		super(l,b);	//very important, a) avoid redundancy
					//b) we get error because super will be invoked
					//automatically unless we invoke super(l,b);
	}
	
	public double getArea()
	{
		return dim1*dim2;
	}
}

class Triangle extends Shape
{
	public Triangle(int b,int ht)
	{
		super(b,ht);
	}
	
	public double getArea()
	{
		return 0.5*dim1*dim2;
	}
}


class Prog52
{
	public static void main(String args[])
	{
		int nos;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the no. of Shapes:- ");
		nos = sc.nextInt();
		
		char type;
		int i;
		
		Shape arr[] = new Shape[nos];	//OK
		
		for(i=0;i<nos;i++)
		{
			System.out.print("Enter r/R for Rectangle and t/T for Triangle:- ");
			type = sc.next().charAt(0);
			
			if(type=='R' || type=='r')
			{
				System.out.print("Enter length:- ");
				int l = sc.nextInt();
				System.out.print("Enter breadth:- ");
				int b = sc.nextInt();
				arr[i] = new Rectangle(l,b);
			}
			else
			{
				System.out.print("Enter base:- ");
				int b = sc.nextInt();
				System.out.print("Enter height:- ");
				int ht = sc.nextInt();
				arr[i] = new Triangle(b,ht);
			}
			
			
		}
		System.out.println("Details are:- ");
		for(i=0;i<nos;i++)
		{
			System.out.println(arr[i].getArea());
		}
	}
}		
