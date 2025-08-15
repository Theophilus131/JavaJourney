import java.util.Scanner;

public class CollectScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[10];
        System.out.println("Enter 10 scores:");

        String horizontal = "";

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = input.nextInt();

            System.out.println("Vertical: " + scores[i]);

            horizontal += scores[i] + " ";
        }

        System.out.println("\nHorizontal: " + horizontal);
    }
}
