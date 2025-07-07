public class Tv {
    private boolean on = false;
    private int volume = 1;
    private double channel = 1;


    public  boolean isOff() {
      return false;
    }

    public boolean isOn() {
        return true;
    }

    public void setVolume(int newVolume) {
       if(on && newVolume >= 1 && newVolume <= 7){
           volume = newVolume;
       }
    }

    public void setChannel(double newChannel) {
        if(on && newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    }

    public void ChannelUp(){
        if(on && channel < 120)
            channel++;
    }

    public void ChannelDown(){
        if(on && channel > 1)
            channel--;
    }

    public void volumeUp(){
        if( on && volume < 7)
            volume++;
    }

    public void volumeDown(){
        if(on && volume > 1)
            volume--;
    }

    public int getVolumeUp(){
        return volume;
    }
    public int getVolumeDown(){
        return volume;
    }



}
