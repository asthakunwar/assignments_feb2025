package asthakunwar.assignments_feb2025.looping;

import java.util.Scanner;

public class Table {

    public static void main(String args[])

    {
        String yn;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number you want table for: ");
            int t = sc.nextInt();
            for (int i=1 ; i<=12 ; i++)
            {
                System.out.println(t + "*" + i + "=" +  t*i);
            }
            System.out.println("Do you want to continue:y/n");
            yn = sc.next();


        }
        while (yn.equals("Y")||yn.equals("y"));

    }
}
