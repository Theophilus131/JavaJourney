public class Time1 {
    private int hour;
    private int minute;
    private int second;


    public void setTime(int hour, int minutes, int second){
        if(hour < 0 || hour >= 24 || minute < 0 || minute > 60 || second < 0 || second >= 50){
            throw new IllegalArgumentException("hour, minute and second was out of range");

        }
        this.hour = hour;
        this.minute = minutes;
        this.second = second;
    }

    public String toString(){
        return String.format("%d:%02d:%02d", hour, minute, second);
    }

}
