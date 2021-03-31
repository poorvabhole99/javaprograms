
/*Program to demonstrate the use of "super" keyword 
to call constructors of super classes [ parameterised constructor]*/

class A
{
    int a;
    A (int x)
    {
        a=x;
    }
}
class B extends A
{
    int b;
    B( int x, int y)
    {
        super(x);
        b=y;
    }
}

class C extends B
{
    int c;
    C(int x, int y , int z)
    {
        super(x,y); 
        c = z;
    }

    void display( )
    {
        System.out.println("\n A: "+a);
        System.out.println("\n B "+b); 
        System.out.println("\n C "+c);
    }
}

public class SuperKeyword
{
    public static void main(String []args)
    {
        C obj = new C(30,10,20);
        obj.display();
    }
}
