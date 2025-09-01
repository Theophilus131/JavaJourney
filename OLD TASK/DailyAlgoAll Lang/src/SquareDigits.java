public class SquareDigits {
    public int squareDigits(int n) {

        String empty = "";

        while(n > 0){
            int number = n/10;
            empty += Math.pow(number,2);

            }
        int squareNumber = Integer.parseInt(empty);

        return squareNumber; // TODO Implement me
        }

        public static void main(String[] args) {
        SquareDigits s = new SquareDigits();
        System.out.println(s.squareDigits(123));
        }
    }


