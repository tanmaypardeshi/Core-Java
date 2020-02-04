//an eg. of interface

interface Area
{
    double PI = 3.1;    //automatically becomes 
    //public static final double PI = 3.14;

    double getArea();   //automatically becomes
    //public abstract double getArea();
}

interface Circumference
{
    double getCircumference();
}

class Circle implements Area,Circumference
{
    int r;
    Circle(int r)
    {
        this.r = r;
    }

    /* compulsory to override all abstract methods from interface
    use "public" keyword */

    public double getArea()
    {
        return PI*r*r;
    }

    public double getCircumference()
    {
        return 2*PI*r;
    }
}

class Prog57
{
        public static void main(String args[])
        {
            Circle c = new Circle(10);
            System.out.println("Area of circle is " + c.getArea());
            System.out.println("Circumference of circle is " + c.getCircumference());
        }
}