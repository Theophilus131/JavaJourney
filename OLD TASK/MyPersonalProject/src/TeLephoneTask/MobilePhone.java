package TeLephoneTask;

public class MobilePhone implements Telephone{
    private String myNumber;
    private boolean isRinging;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("mobile phone is always powered on");
    }
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + "on mobile phone");
    }
    @Override
    public void answer() {
        if(isRinging){
            System.out.println("answering mobile phone");
            isRinging = false;
        }else {
            System.out.println("mobile phone is not ringing");
        }
    }
    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("mobile phone is ringing");;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
