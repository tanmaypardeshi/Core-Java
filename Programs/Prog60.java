//An eg. of caught exception

class Prog60
{
    public static void main(String[] args) 
    {
        int numer = 12, denom = 0;
        try
        {
            int result = numer/denom;
            System.out.println("Result of division is " + result);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Division by ZERO not possible");
            return;
        }

        finally
        {
            System.out.println("This code is in finally");
        }
    }
}