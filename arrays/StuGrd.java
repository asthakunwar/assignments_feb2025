package asthakunwar.assignments_feb2025.arrays;
import java.util.Scanner;

public class StuGrd {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scores of 10 Student are: ");
        int n = sc.nextInt();
        int score[] = new int[10];
        double total = 0;
        double average = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Scores of 10 students are: ");
        for (int i = 0; i < n; i++)
        {
            score[i] = sc.nextInt();
            total += score[i];
            if (score[i] > max) max = score[i];
            if (score[i] < min) min = score[i];
        }
        average = total/10;
        System.out.println("Sum of all the scores are: " + total);
        System.out.println("Average of" + n + " scores are: " + average);


            for (int i =0; i < score.length; i++)
            {
                if (score[i]>max)
                    max = score[i];

                if (score[i]<min)
                    min = score[i];

            }
        System.out.println("Maximum score is: " + max);

        System.out.println("Minimum score is: " + min);

         
    }



    }
