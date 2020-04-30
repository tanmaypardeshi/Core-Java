/* Accept a binary expression from user as cmd argument and evaluate it. 
Handle the following exceptions:- 
1. if no. of arguments are not valid
    throw "InvalidNoOfArgsException"
2. if opertor is invalid
    throw "InvalidOperatorException"
3. if result is -ve 
    thorw "NegativeResultException"
4. Handle other standard exceptions if any

Logic:- We will handle the first two exceptions using a single class and hence in
this case, the last exception can be handled. However, the last exception can be handled
seperately by using a different class, and hence using a default constructor*/

class GeneralException extends Exception
{
    GeneralException(String msg)
    {
        super(msg);
    }
}

class NegativeResultException extends Exception
{
    NegativeResultException()
    {
        super("NegativeResultException");   
    }
}

class Prog65
{
    public static void main(String args[])
    {
        try
        {
            if(args.length!=3)
            {
                throw new GeneralException("InvalidNoOfArgsException");
            }
            int no1 = Integer.parseInt(args[0]);
            int no2 = Integer.parseInt(args[2]);
            char op = args[1].charAt(0);

            if(op != '+' && op != '-' && op != '*' && op != '/' && op != '$' && op!='%')
            {
                throw new GeneralException("InvalidOperatorException");
            }
            int result = 0;

            switch(op)
            {
                case '+':
                    result = no1+no2;
                    break;
                case '-':
                    result = no1-no2;
                    break;
                case '*':
                    result = no1*no2;
                    break;
                case '/':
                    result = no1/no2;
                    break;
                case '$':
                    result = (int)(Math.pow(no1,no2));
                    //return type of pow is double so typecasted
                    break;
                default:
                    result = no1 % no2;
                    break;
            }
            if(result <0)
                throw new NegativeResultException();
			System.out.println("Result is " + result);	
        }
        catch(GeneralException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NegativeResultException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e)
        {
            System.out.println("The first and the third arguments must be int values");
        }
        /*to handle unknows exceptions which may occur @runtime. This exceptiom handler should
        be @the end of other catch statements, otherwise we get compile error. Based on Dynamic method
        Dispatch */
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
