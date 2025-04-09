package asthakunwar.assignments_feb2025.controlstatement;

public class Swap1 {
    public static void main(String args[])
    {
        int a = 10,b = 20 ;
        a = a + b ;   // 10 + 20 = 30
        b = a - b ;   // 30 - 20 = 10
        a = a - b;    // 30 - 10 = 20

        System.out.println("a " + a);
        System.out.println("b " + b);
    }
}
