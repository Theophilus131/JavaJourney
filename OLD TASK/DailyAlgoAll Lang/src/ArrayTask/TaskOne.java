package ArrayTask;

//Write a program to add a new element at the end of an array.


public class TaskOne {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,6};

        int[] newArray = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
            System.out.println(newArray[i]);
        }

        newArray[numbers.length] = 12;
        System.out.println(newArray[numbers.length]);
    }

        }

