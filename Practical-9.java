//Display addition of two numbers//
import java.util.Scanner;
class AddNumbers
{
   public static void main(String args[])
   {
      int a, b, c;

      System.out.println("Enter two integers to calculate their sum");
      Scanner in = new Scanner(System.in);
     
      a = in.nextInt();
      b = in.nextInt();
      c = a + b;
     
      System.out.println("Sum of the integers = " + c);
   }
