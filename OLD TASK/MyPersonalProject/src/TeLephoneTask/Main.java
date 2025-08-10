package TeLephoneTask;

public class Main {
    public static void main(String[] args) {

//        DeskPhone myDeskPhone = new DeskPhone("111-111-1111");
//        myDeskPhone.powerOn();
//        myDeskPhone.callPhone( "111-111-1111");
//        myDeskPhone.answer();

        MobilePhone myMobilePhone = new MobilePhone("222-222-2222");
        myMobilePhone.dial( "222-222-2222");
        myMobilePhone.answer();
    }
}
