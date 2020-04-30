/*an example of a non executable class with a method to return the absolute 
value of any given int no */

package Programs.test;

/*all classes should be declared public otherwise will not be 
accessible to classes outside this package*/

public class MathOpns
{
	//method should be declared "public"
	public static int getAbs(int no)
	{
		if(no<0)
			return -no;
		return no;
	}
	//to acccess a class kept in a package
}
