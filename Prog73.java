/* an example of split methodto convert a string into an array of Strings
based on a delimiter(seperator)*/

class Prog73
{
	public static void main(String args[])
	{
		String name = "databyte computer training center";
		
		String arr[] = name.split(" ");
		//delimiter in space
		
		System.out.println("Elements of arr[] are:- ");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
