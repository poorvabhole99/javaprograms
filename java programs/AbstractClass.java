// Abstract class with Abstract and Non-absract methods

abstract class A
{
    //Non-absract method
    void display()
    {
        System.out.println( "\n Non-abstract Display of A");
    }
}

class B extends A
{
    void show()
    {
        System.out.println("\n\n Abstract show of A overided in B");
    }
}

class AbstractClass
{
    public static void main (String args[])
    {
        B obj2 = new B();
        
        obj2.display();
        obj2.show();
    }
}


