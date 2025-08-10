package TeLephoneTask;

public class MobilePhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean isPoweredOn;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPoweredOn = true;
        System.out.println("power is on");
    }
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + "on mobile phone");
    }
    @Override
    public void answer() {
        if(isRinging && isPoweredOn){
            System.out.println("answering mobile phone");
            isRinging = false;
        }else {

        }
    }
    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myNumber && isPoweredOn){
            isRinging = true;
            System.out.println("either the phone is not ringing or the phone is not powered on");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
