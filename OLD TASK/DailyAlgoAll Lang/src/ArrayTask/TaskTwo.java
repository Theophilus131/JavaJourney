package ArrayTask;

//Write a program to remove the first element of an array.

public class TaskTwo {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int [] newArray= new int[numbers.length];

        for (int i = 1; i < numbers.length; i++) {

            newArray[i-1] = numbers[i];
            System.out.println(newArray[i-1]);
        }




    }
}
