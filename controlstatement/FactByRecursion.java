
package asthakunwar.assignments_feb2025.controlstatement;
import java.util.Scanner;

public class FactByRecursion {
    static int Fact=1;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new number:- ");
        int no = sc.nextInt(), Fact = 1;
        FactByRecursion ob = new FactByRecursion();
        int result = ob.calFact(no);
        System.out.println(result);
    }

    int calFact(int no) {
        if (no > 1) {
            Fact = Fact * no;
            calFact(no - 1);
        }
        return Fact;

    }


}
