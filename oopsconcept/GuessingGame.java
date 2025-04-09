package asthakunwar.assignments_feb2025.oopsconcept;
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String args[]) {
        int n, guess;
        final int MAX = 100;

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        boolean correct = true;
        n = rand.nextInt(MAX) + 1;
        System.out.println(n);
        while (correct) {
            System.out.println("Guess a number between 1 to 100: ");
            guess = sc.nextInt();

                if (guess < n)
                {
                    System.out.println("Too low! ");
                }
                else if(guess > n)
                {
                    System.out.println("Too high!");
                }
                else
                {
                    System.out.println("Correct! The number was " + guess);
                    correct = false;
                }
            }
            System.exit(0);

        }

    }
