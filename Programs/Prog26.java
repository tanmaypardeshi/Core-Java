//Accept records of an employee and then displat details

import java.util.Scanner;	//Scanner class is a part of util 
//package and not lang package and hence we need to import it

class Prog26
{
	public static void main(String args[])
	{
		//create an object of Scanner class
		Scanner sc= new Scanner(System.in);
		//System.in represents input from keyboard
		System.out.print("Enter empid:- ");
		int empid = sc.nextInt();
		System.out.print("Enter first name:- ");
		String fn = sc.next();
		System.out.print("Enter salary:- ");
		double sal = sc.nextDouble();
		System.out.print("Enter designation:- ");
		sc.nextLine();	//clear buffer
		String desgn = sc.nextLine();
		//to accept a string with spaces
		
		System.out.println(empid + "," + fn + "," + sal + "," + desgn);
	}
}
