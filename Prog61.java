/*accept a few int values from user as command line arguments and
display them. At the end, display the total number of valid and invalid ages*/

class Prog61
{
    public static void main(String[] args)
    {
        int cntr = 0;
        //counter to valid arguments
        
        for (int i=0;i<args.length;i++)
        {
            try
            {
                int no = Integer.parseInt(args[i]);
                cntr++;
                System.out.println("Valid argument -> " + no);
            }

            catch(NumberFormatException e)
            {
                System.out.println("Invalid argument -> " + args[i]);
            }
        }

    }
}