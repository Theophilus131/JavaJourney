package LamdasAndStream;

import java.util.stream.IntStream;

public class Sum {
    public static void main(String[] args){
        System.out.println("Sum of 1 through 10 is: " + IntStream.rangeClosed(1,10).sum());

    }
}
