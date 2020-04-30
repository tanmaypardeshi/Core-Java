//to prove that both interfaces as well as abstract classes can inherit


interface X
{
    void methX();
}

/*error as interface is only a list of abstract method.
How can 1 interface implement another */

/* interface Y implmenets X
{

}*/

interface Y extends X
{
    void methY();
}

abstract class A implements Y
{
    //as class A is abstract, it is not compulsory
    //for this class to provide implementation for
    //either methX() ot methY()
    abstract void methA();
}

abstract class B extends A
{
    //not compulsory
    public final void methY()
    {
        System.out.println("B's implementation of methY()");
    }
}

class C extends B
{
    // compulsory to override remianing abstract methods
    //i.e. methA() and methX()

    void methA()
    {
        System.out.println("C's implementation of methA()");
    }

    public void methX()
    {
        System.out.println("C's implementation of methX()");
    }

    //error, cannot override final methY()

    /*public void methY()
    {
        System.out.println("C's implementation of methY()");
    }*/
}

class Prog58
{
    public static void main(String[] args) 
    {
        C obj = new C();
        
        obj.methX();    //C's implementation    
        obj.methY();    //B's implementation
        obj.methA();    //C's implementation
    }
}
