import java.util.Scanner;

public class AverageOfQuizzes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int QUIT = 999;
        final int MAX = 10;

        // Fixed: Allocate proper memory capacity up to MAX
        int[] scores = new int[MAX];
        int count = 0;
        int total = 0;

        System.out.println("Enter quiz score or " + QUIT + " to quit >>");
        int score = sc.nextInt();

        // Fixed: Validate both sentinel condition and array capacity
        while (score != QUIT && count < MAX) {
            scores[count] = score; // Fixed: Correct array reference
            total += scores[count];
            count++;

            if (count < MAX) {
                System.out.println("Enter next quiz score or " + QUIT + " to quit >>");
                score = sc.nextInt();
            }
        }

        System.out.println("\nThe scores entered were:");
        for (int x = 0; x < count; x++) {
            System.out.print(scores[x] + " ");
        }
        System.out.println();

        if (count != 0) {
            // Fixed: Explicit double casting for precision division
            System.out.println("The average is " + ((double) total / count));
        } else {
            System.out.println("No scores were entered.");
        }

        sc.close();
    }
}