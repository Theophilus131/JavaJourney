package ArrayTask;

public class SquareDigits {
    public static int squareDigits(int n) {

        String result = "";

        while(n > 0){
            int number = n % 10;
            result = (int)Math.pow(number,2) + result;
            n = n / 10;
            }
        int squareNumber = Integer.parseInt(result);

        return squareNumber; // TODO Implement me
        }

        public static void main(String[] args) {

        System.out.println(squareDigits(123));
        }


    }


