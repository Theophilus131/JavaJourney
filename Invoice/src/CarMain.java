import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
    Car theoCar = new Car("toyota", "2015", 2000.00);

    Car jamesCar = new Car("honda", "2025", 1000.00);

    System.out.println(theoCar.getModel());
    System.out.println(theoCar.getPrice());

    theoCar.getDiscount(5);

    System.out.println(theoCar.getModel());
    System.out.println(theoCar.getPrice());

    //System.out.println(theoCar.getDiscount5(2000));



    }
}
