//to sort the names of students in an array

class Prog72
{
	public static void main(String args[])
	{
		String names[] = {"rushikesh","priyal","tanmay","saloni","abhay","parth"};
		
		int i,j;
		
		System.out.println("Before sorting,names are:- ");
		
		for(i=0;i<names.length;i++)
			System.out.println(names[i] + " ");
		
		//bubble sort
		for(i=0;i<names.length;i++)
		{
			for(j=0;j<names.length-1;j++)
			{
				if(names[j].compareToIgnoreCase(names[j+1])>0)
				{
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1]=temp;
				}
			}
		}
		
		System.out.println("After sorting,names are:- ");
		
		for(i=0;i<names.length;i++)
			System.out.println(names[i] + " ");
	}
}
