//An eg. of jagged array

class Prog18
{
	public static void main(String args[])
	{
		int [][] nos=new int[3][]; 	//allowed in Java
		
		nos[0]=new int[2];
		nos[1]=new int[4];
		nos[2]=new int[1];
		
		int r,c,no=10;
		
		for(r=0;r<3;r++)
		{
			for(c=0;c<nos[r].length;c++)
			{
				nos[r][c]=no;
				no+=10;
			}
		}
		System.out.println("Elements of jagged array are:- ");
		for(r=0;r<3;r++)
		{
			for(c=0;c<nos[r].length;c++)
				System.out.print(nos[r][c] + "\t");
			System.out.println();
		}
	}
}
