import java.util.Scanner;
public class PassFail {

 public static void main(String[] args) {
  int num;
  Scanner reader = new Scanner(System.in);
  System.out.println("Enter marks: ");
  num = reader.nextInt();
  
  if (num>=40)
  {
   System.out.println("PASS!");
  }
  else
   System.out.println("FAIL!");
 }

}
