package ArrayTask;

//Write a program to replace the second element of an array with a new value.


public class TaskThree {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int [] newArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (i == 1) {
                newArray[i] = 12;
            } else {
                newArray[i] = numbers[i];
            }
            System.out.println(newArray[i]);

        }






    }

}
