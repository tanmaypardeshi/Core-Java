//an eg. of wrapper class

class Prog80 {
    public static void main(String args[]) {
        int i = 10; // primitive datatype-pdt
        Integer obji = new Integer(i); // int pdt wrapped in Integer object

        int ival = obji.intValue(); // Integer obg-->int pdt

        String istr = Integer.toString(ival); // String representation

        int istrval = Integer.parseInt(istr); // String to int pdt

        System.out.println("i contains " + i);
        System.out.println("obji contains " + obji);
        System.out.println("ival contains " + ival);
        System.out.println("istr contains " + istr);
        System.out.println("istrval contains " + istrval);
        System.out.println("ist + istr contains " + (istr + istr));
        System.out.println("istrval+istrval contains " + (istrval + istrval));

    }
}