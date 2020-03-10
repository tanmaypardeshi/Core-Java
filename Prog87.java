/* Accept a filename from user and display its contents along with no. of 
lines,words and vowels it contains. Accept filename as cmd line argument*/

import java.io.*;

class Prog87
{
	public static void main(String args[]) throws IOException
	{
		try
		{	
			/*String fn = args[0]
			get the file contents in BufferedReader so that we can access
			to the file data line by line */
			
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			int nol=0,now=0,nov=0;
			
			while(true)
			{
				String line = br.readLine();
				
				if(line == null)
				//null means adr not assigned i.e. EOF
					break;
				nol++;
				now+= countWords(line);
				nov+=countVowels(line);
			}
			
			System.out.println("No. of lines:- "+nol);
			System.out.println("No. of words:- "+now);
			System.out.println("No. of vowels:- "+nov);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	
			System.out.println("Please specify filename");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Please specify existing filename");
		}
	}//end of main()
	
	static int countWords(String line)
	{	
		int now = 1;
		int pos_sp = line.indexOf(" ");//looks for 1st space
		
		while(pos_sp != -1)
		{
			now++;
			//look for next soace
			pos_sp = line.indexOf(" ",pos_sp+1);
		}
		return now;
	}
	
	
	static int countVowels(String line)
	{	
		int nov = 0;
		
		for(int i=0;i<line.length();i++)
		{
			char ch = line.charAt(i);
			ch = Character.toUpperCase(ch);
			
			switch(ch)
			{
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					nov++;
			}
		}
		return nov;
	}
}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
