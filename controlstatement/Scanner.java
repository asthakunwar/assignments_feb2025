package asthakunwar.assignments_feb2025.controlstatement;
import java.util.Scanner;
class Scan {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = s.next();

        System.out.println("Enter Gender");
        char gender = s.next().charAt(0);

        System.out.println("Enter Age");
        int age = s.nextInt();

        System.out.println("Enter Phone N0.");
        long phno = s.nextLong();

        System.out.println("Name: " + name);
        System.out.println("Gender " + gender);
        System.out.println("Age " + age);
        System.out.println("Phone No. " + phno );


    }
}
