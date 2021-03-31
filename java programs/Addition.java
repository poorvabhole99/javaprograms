import java.io.*;

public class Addition
{
   public static void main(String[] args)
    {
      int x=0, y=0;
      int sum=0;
      
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader buff = new BufferedReader(input);

      try 
      {
          System.out.println("Enter no");
          x= Integer.parseInt(buff.readLine());

          System.out.println("Enter no");
          y= Integer.parseInt(buff.readLine());

          sum= x+y;

          System.out.println("Sum ="+sum);


      } 
      catch (IOException e) 
      {
          //TODO: handle exception
          System.out.println("Error :IOException ");
      }
      /*catch(NumberFormatException e)
      {
        System.out.println("Enter only interger no");
      }*/

     
    }
}
    

