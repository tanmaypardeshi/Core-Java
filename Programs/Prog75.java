/* an example of indexOf() which returns position of character in a string*/

class Prog75
{
	public static void main(String args[])
	{
		String name = "databyte";
		
		int pos_1a = name.indexOf('a');	//1
		int pos_2a = name.indexOf('a',pos_1a+1);	//3
		
		//default position of start of search is 0
		//again, indexOf is overloaded
		
		int pos_3a = name.indexOf('a',pos_2a+1);	//-1
		
		System.out.println("Position of 1st a is " + pos_1a);
		System.out.println("Position of 2nd a is " + pos_2a);
		System.out.println("Position of 3rd a is " + pos_3a);				
		
	}
}
