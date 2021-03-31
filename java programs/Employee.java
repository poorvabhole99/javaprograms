
//WAP to create class Employee having data member as name & salary. Accept the information of too employee and display it

import java.io.*;

public class Employee
{
    float salary;
    String name;

    InputStreamReader input = new InputStreamReader ( System.in);
    BufferedReader buff = new BufferedReader(input);

    void accept ()
    {
        try
        {
            System.out.print("\n Enter name"); 
            name = buff.readLine();
            System.out.print("\n Enter Salary"); 
            salary = Float.parseFloat(buff.readLine());

        }
        
        catch (Exception e)
        {
            System.out.println("\n Error");
        }
    }

    void display ()
    {
        System.out.println("\n Name = "+name);
        System.out.println("\n Salary = "+salary);
    }

    public static void main(String abc[])
    {
        Employee E1 = new Employee(); 
        Employee E2 = new Employee();
        System.out.println("\n Accept Employee Information ");
        E1.accept();
        E2.accept();
        System.out.println("in Displaying employee information");
        
        E1.display(); 
        E2.display() ;
    }
}