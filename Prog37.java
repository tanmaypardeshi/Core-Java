//an eg, of type promotion in overloading

class Overload
{
	void test(float f)
	{
		System.out.println("Invocation of test(float)");
	}

	void test(byte b)
	{
		System.out.println("Invocation of test(byte)");
	}
	void test(long l)
	{
		System.out.println("Invocation of test(long)");
	}
}

class Prog37
{
		public static void main(String args[])
		{
			byte b=10;
			short s=10;
			int i=10;
			long l=10;
			float f=10;
			double d=10;

			Overload obj = new Overload();

			obj.test(b);	//byte
			obj.test(s);	//long
			obj.test(i);	//long
			obj.test(l);	//long
			obj.test(f);	//float
			//obj.test(d);	//error
			obj.test((float)d);	//explicit typecast
		}
}