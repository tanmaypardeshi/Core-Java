//Accept some text from user and display it char by char till char 'q' is 
//not encountered

import java.io.*;	//BufferedInputStream, IOException

class Prog82
{
	public static void main(String args[]) throws IOException
	{
		//reserve the memory to accept data
		
		BufferedInputStream bin = new BufferedInputStream(System.in);
		
		//System.in collects the keyboard i/p and is the form of 
		//byte stream
		
		System.out.print("Enter some text(q to exit):- ");
		
		while(true)
		{
			int no = bin.read();	//read() returns ASCII code of char typed
			
			if((char)no == 'q' || (char)no=='Q')
				break;
			
			System.out.print((char)no);
		}
		
		bin.close();	//memory is released
	}
}
