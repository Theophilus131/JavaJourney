import java.util.Scanner;

public class EvenIndexInArray {
    public static void evenIndex() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int length = input.nextInt();
        int[] numbers = new int[length];

        System.out.println("Enter " + length + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            if (i % 2 == 0) {
                System.out.println("Index " + i + ": " + numbers[i]);
            }
        }
    }

    public static void main(String[] args) {
        evenIndex();
    }
}
