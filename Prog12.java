// eg-1 of type promotion in expression

class Prog12
{
	public static void main(String args [])
	{
		byte a=2,b=5,c;
		
		//c = a+b;	//error,possible loss of precision
					//found-int,reqd-byte
		c = (byte)(a+b);
		System.out.println("Container c "+c);
		
		char ch='a';
		//ch++;	//OK
		//ch = ch + 1;	//error, possible loss of precision
					//found-int,reqd-char
		ch = (char)(ch+1);
		
		System.out.println("ch contains "+ch);	//b		
	}
}
