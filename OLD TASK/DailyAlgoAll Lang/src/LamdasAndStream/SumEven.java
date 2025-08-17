package LamdasAndStream;

import java.util.stream.IntStream;

public class SumEven {
    public static void main(String[] args){
        System.out.println("Sum of even number froms 2 through 20 is: " + IntStream.rangeClosed(1,10).map((int x) -> {return x * 2;}).sum());
    }
}
