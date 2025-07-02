package ProblemAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {

        ArrayList<Problem> persons = new ArrayList<Problem>();
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Welcome to the Person Program");
            String menu = """
                    1. Add new Problem
                    2. view Solve problem
                    3. UnSolve problem
                    4. Exit program
                    """;
            System.out.println(menu);
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter problem name:");
                    String problemName = input.next();

            }



        }







    }





}
