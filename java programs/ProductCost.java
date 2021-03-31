interface ProductCost
{

int cost =10; 
String name = "Pen";
}

interface ProductMethods extends ProductCost
{

    void display();
}
class MultipleDemo implements ProductCost,ProductMethods
{
    public void display()
    {
        System.out.println(" Product Cost "+cost); 
        System.out.println("In Product Name"+name);
    }

    public static void main ( String args[])
    {
        MultipleDemo M = new MultipleDemo();
        System.out.println(" Displaying Product Information");
        M.display();
    }
}
