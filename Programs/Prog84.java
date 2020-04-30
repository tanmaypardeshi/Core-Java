class Prog84
{
	public static void main(String args[])
	{	
		String line = "Please stop now";
		
		int pos_stop = line.indexOf("stop");
		
		if(pos_stop == -1)
			System.out.println("Stop not present");
		else
			System.out.println("Stop present");
	}
}
