package BikeAssignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BikeTest {

    @Test
    public void TestThatBikeCanBeOn() {
        Bike theoBike = new Bike();
        assertFalse(theoBike.getBikeStatus());
        theoBike.bikeOn();
        assertTrue(theoBike.getBikeStatus());
    }

    @Test
    public void TestThatBikeCanBeOff() {
        Bike theoBike = new Bike();
        assertFalse(theoBike.getBikeStatus());
        theoBike.bikeOff();
        assertFalse(theoBike.getBikeStatus());
    }
    
    @Test
    public void TestWhenBikeIsOnGear1BikeSpeedIncreaseBy1() {
        Bike theoBike = new Bike();
        theoBike.getBikeStatus();
        theoBike.bikeOn();

        theoBike.accelerate();

        
    }


}
