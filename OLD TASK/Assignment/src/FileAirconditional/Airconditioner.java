package FileAirconditional;

public class Airconditioner {

    private boolean power;
    private int temperature;
    private int minimumTemperature =16  ;
    private int maximumTemperature =30;


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
        if (power && temperature < maximumTemperature) {
            temperature++;
        }
    }

    public void decreaseTemperature() {
        if (power && temperature > minimumTemperature) {
            temperature--;
        }

    }
}

