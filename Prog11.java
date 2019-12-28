//an eg. of explicit conversion

class Prog11
{
	public static void main(String args [])
	{
		byte b1 = 100;	//OK
		int i = 100;	//OK
		//byte b2 = i;	//compile error
		//possible lack of precision
		//found-int,reqd-byte
		byte b2 = (byte)i;	//OK
		//byte b3 = 130;	//error, same as above
		byte b3 = (byte)130;	//OK
		byte b4 = (byte)300;	//OK
		// if no>256, result is no%256
		byte b5 = (byte)400;
		
		System.out.println("b1 contains " + b1);	//100
		System.out.println("b2 contains " + b2);	//100
		System.out.println("b3 contains " + b3);	//-126
		System.out.println("b4 contains " + b4);	//44						
		System.out.println("b5 contains " + b5);	//-112		
	}
}
