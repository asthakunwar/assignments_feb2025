package asthakunwar.assignments_feb2025.oopsconcept;

import java.util.Scanner;

class StudentsGrades {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = sc.nextInt();
        int[] score = new int[n];
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Enter scores of " + n + " students:");
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            total += score[i];
            if (score[i] > max) max = score[i];
            if (score[i] < min) min = score[i];
        }

        double average = (double) total / n;

        System.out.println("Sum of all the scores: " + total);
        System.out.println("Average score: " + average);
        System.out.println("Maximum score: " + max);
        System.out.println("Minimum score: " + min);
    }
}



