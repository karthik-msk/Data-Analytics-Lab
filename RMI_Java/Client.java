//CLIENT
import java.rmi.*;
import java.util.Scanner;

public class Client
{
  public static void main (String[] argv) 
  {
    try {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter First Number : ");
      int x = scan.nextInt();
      System.out.print("Enter Second Number : ");
      int y = scan.nextInt();
      Calculator calci = (Calculator) Naming.lookup("//localhost/myCalci");
      System.out.println("Result from remote Object = " + calci.add(x,y));
      scan.close();
    }
    
    catch (Exception e) {
      System.out.println ("CalculatorClient exception: " + e);
    }
  }
}

