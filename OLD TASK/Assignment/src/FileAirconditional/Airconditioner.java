package FileAirconditional;

public class Airconditioner {

    private boolean power;
    private int temperature;


    public boolean getPowerStatus() {
        return power;
    }

    public void turnOn() {
        power = true;
        temperature = 16;
    }

    public void turnOff() {
        power = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        temperature++;
    }

    public void decreaseTempt() {
        temperature--;
    }
}

