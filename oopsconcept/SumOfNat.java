


















































































































































































































































































































































































































































































































































































































































































































package asthakunwar.assignments_feb2025.oopsconcept;
import java.util.Scanner;
public class SumOfNat
{

    public static void main(String args[])
    {
        String yn;
       do {
           {
               Scanner sc = new Scanner(System.in);
               System.out.println(" Enter a number: ");
               int n = sc.nextInt();
               int sum = 0;
               for (int i = 1; i<= n ;i++)
               {
                   sum = sum + i;
               }
               System.out.println(" The sum of first " + n + " natural numbers is:" + sum);
               System.out.println("Do you want to continue:y/n");
               yn = sc.next();

           }

           }
       while (yn.equals("Y")||yn.equals("y"));

       }
}



