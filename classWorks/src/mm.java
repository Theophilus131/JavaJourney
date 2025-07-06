public class mm {
    public static void main(String[] args) {

        String a = "hello";
        String b = "he" + "llo";
        String c = new String("hello");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));


    }
}
