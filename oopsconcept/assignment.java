package asthakunwar.assignments_feb2025.oopsconcept;

import java.util.Scanner;
class Calculator
{


    public static void main(String args[]) {
        String yn;
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your marks: ");
            int marks = sc.nextInt();
            switch (marks / 10) {
                case 10:
                case 9:
                    System.out.println("Your grade is: A");
                    break;
                case 8:
                    System.out.println("Your grade is: B");
                    break;
                case 7:
                    System.out.println("Your grade is: C");
                    break;
                case 6:
                    System.out.println("Your grade is: D");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                    System.out.println("Your grade is:F");
                    break;
                default:
                    System.out.println("Invalid marks");
                    break;

            }
            System.out.println("Do you want to continue: y/n");
             yn = sc.next();
        }

        while (yn.equals("Y") || yn.equals("y")) ;

    }
        }
