
//Program for heirarchical inheritance


class A
{
    void displayA()
    {
        System.out.println("In Display of class A");
    }
}
class B extends A
{
    void displayB()
    {
        System.out.println("In Display of class B");
    }
}
class C extends A
{
    void displayC()
    {
        System.out.println("In Display of class C");
    }
}

public class Inheritance
{
    public static void main(String []args)
    {
        System.out.println("\n Properties of class A inhents in class B");
        B ob = new B();
        
        ob.displayA(); 
        ob.displayB();
        
        System.out.println("\n Properties of class A inherited in class C");
        
        C obj = new C();
        
        obj.displayA(); 
        obj.displayC();
    }
}

