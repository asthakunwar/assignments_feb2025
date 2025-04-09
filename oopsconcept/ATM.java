package asthakunwar.assignments_feb2025.oopsconcept;
import java.util.Scanner;

class ATM {


        double balance;

        private void checkBalance ()
        {
            System.out.println("Current Balance is: "+ this.balance );
        }

        private void deposit ()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter deposit amount: ");
            double amount = sc.nextDouble();
            this.balance = this.balance + amount;
            System.out.println("Deposit Successful!");
        }
        private void withdraw ()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            if (amount <= this.balance) {
                this.balance = this.balance - amount;
            } else {
                System.out.println("Insufficient Balance");
            }

        }
        public void showMenu ()
        {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Welcome to ATM Machine\n" +
                        "1. Check Balance\n" +
                        "2. Deposit Money\n" +
                        "3. Withdraw Money\n" +
                        "4. Exit\n" +
                        "Enter your choice:");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        this.checkBalance();
                        break;

                    case 2:
                        this.deposit();
                        break;

                    case 3:
                        this.withdraw();
                        break;

                    case 4:
                        System.out.println("Thank you for using the ATM Machine!");
                        return;


                }

            }

        }
    }
class Tester
{
    public static void main(String args[])
    {
      ATM a = new ATM();
      a.showMenu();

    }
}