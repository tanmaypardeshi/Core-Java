/*Design a class "Student" with attributes rollno,name and percent.
Accept data of a few students and at the end, display their records
along with number of records/objects created. */

class Student
{
	private int rollno;
	private String name;
	private double per;
	private static int cntr;	//auto initialised to 0
	
	public Student(int r,String n,int m1,int m2,int m3)
	{
		rollno=r;
		name=n;
		per=(double)(m1+m2+m3)/3;
		cntr++;
		display();
	}
	
	private void display()
	{
		System.out.print("Roll number:- " + rollno + " ,Name:- ");
		System.out.println(name + " ,Percent:- " + per);
	}
	
	//getter method
	public static int getCntr()
	{
		//error,instance members cannot be referred using static context
		//System.out.print(rollno);
		return cntr;
	}
}

class Prog32
{
	public static void main(String args [])
	{
		Student s1=new Student(1,"Kamal",45,67,88);
		Student s2=new Student(1,"Kamal",85,67,56);
		Student s3=new Student(1,"Kamal",55,97,78);				
		//Student.cntr++;	//error, accidental changes can be avoided
		//in class Student
		//System.out.println("Np. of students are:- ", Student.cntr);
		System.out.println("Np. of students are:- "+ Student.getCntr());
		System.out.println("Np. of students are:- "+ s1.getCntr());
		//Ok ,not preferred
	}
}		
