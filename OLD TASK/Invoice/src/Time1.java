public class Time1 {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        if(hour<0 || hour>=24 || minute<0 || minute>=60 || second<0 || second>=60) {
            throw new IllegalArgumentException(
                    "hour, minute and second are invalid");

        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d", hour, minute);

    }

    public String toString(){
        return String.format("%d:%02d:%02d", ((hour==0 || hour==12) ? 12 : hour % 12), minute, second,(hour < 12? "AM" : "PM"));

    }



}
