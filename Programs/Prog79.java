//an eg. of special methods of StringBuffer class

class Prog79 {
	public static void main(String args[]) {
		StringBuffer s = new StringBuffer("Welcome Java");

		System.out.println("Initially,s contains " + s);

		s.insert(8, "to ");
		System.out.println("After insert(), s contains " + s);

		s.setCharAt(8, 'T');
		System.out.println("After setCharAt(), s contains " + s);

		s.append("Programming");
		System.out.println("After append(), s contains " + s);

		s.reverse();
		System.out.println("After reverse(), s contains " + s);

		String s1 = s.toString();
		System.out.println("String representation of s is " + s1);
	}
}