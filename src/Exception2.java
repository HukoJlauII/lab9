import java.util.Scanner;

public class Exception2 {
   /* public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString); System.out.println( 2 / i );
    }*/
   /* public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Attempted division by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("Incorrect data format");
        }
    }*/

    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e){
            System.out.println("General Exception");
        } finally {
            System.out.println("выполнился блок finally");
        }
    }

}
