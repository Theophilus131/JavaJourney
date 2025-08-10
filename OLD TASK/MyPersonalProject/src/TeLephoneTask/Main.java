package TeLephoneTask;

public class Main {
    public static void main(String[] args) {

        DeskPhone myDeskPhone = new DeskPhone("111-111-1111");
        myDeskPhone.powerOn();
        myDeskPhone.callPhone( "111-111-1111");
        myDeskPhone.answer();
    }
}
