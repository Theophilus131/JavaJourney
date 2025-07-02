package BikeAssignment;

public class Bike {
    private boolean bikeOn;
    private int speed;

    public boolean getBikeStatus() {
        return bikeOn;
    }

    public void bikeOn() {
        bikeOn = true;

    }

    public void bikeOff() {
        bikeOn = false;
    }

    public int getSpeed( int s) {
        if (speed > 0 && speed <= 20 ) {
            speed += speed;}
            return speed;
    }


    public void accelerate() {

    }
}
