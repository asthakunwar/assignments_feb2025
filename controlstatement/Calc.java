package asthakunwar.assignments_feb2025.controlstatement;
import java.util.Scanner;
public class Calc {
    public static void main(String args[])
    {
        String yn;
        int result;
        do
        {
          Scanner s = new Scanner(System.in);
          System.out.println("Enter 1st no.=  ");
          int num1 = s.nextInt();
          System.out.println("Enter 2nd no.=  ");
          int num2 = s.nextInt();
          System.out.println("+,-,*,/");
          String sym = s.next();

          switch (sym) {
             case "+":
                result = num1 + num2;
                System.out.println(result);
                break;

             case "-":
                result = num1 - num2;
                System.out.println(result);
                break;

             case "*":
                result = num1 * num2;
                System.out.println(result);
                break;

             case "/":
                result = num1 / num2;
                System.out.println(result);
                break;

             default:
                System.out.println("Invalid Input");
                break;
         }

          System.out.println("Do you want to continue: "  );
          yn = s.next();
        }while (yn.equals("Y")||yn.equals("y"));

    }
}
