package TeLephoneTask;

public class DeskPhone implements Telephone{
    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("desk phone is always powered on");

    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + "on desk phone");

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("answering desk phone");
            isRinging = false;

        }else {
            System.out.println("desk phone is not ringing");
        }

    }

    @Override
    public boolean callPhone(String phoneNumber) {
       if(phoneNumber == myNumber){
           isRinging = true;
           System.out.println("desk phone is ringing");;
       }else {
           isRinging = false;
       }
       return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
