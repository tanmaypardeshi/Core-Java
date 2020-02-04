//an eg. of multiple catch blocks

class Prog62
{
    public static void main(String[] args) 
    {
        int denom[] = {2,0,3,0,4};
        int numer = 12; 
        
        for(int i=0;i<10;i++)
        {
            try
            {
                int result = numer/denom[i];

                System.out.println(numer + "/" + denom[i] + " = " + result);

            }

            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index out of range");
                break;  //adding behaviour to exception

            }

            catch(ArithmeticException e)
            {
                System.out.println("Division by ZERO not possible");
            }
        }
    }
}