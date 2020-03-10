/* Accept some text from the user and display it line by line till word 
"stop" is not encountered */

/* Here we make the use of BufferedReader class vecause this class
contains a method "readline()" which can read each liine sent from buffer
to out program(more efficient)*/

import java.io.*;

class Prog83
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter some text:- ");
		
		while(true)
		{
			String line = br.readLine();
			
			if(line.contains("stop"))
				break;
			System.out.print(line);
		}
		
		br.close();
	}
}
