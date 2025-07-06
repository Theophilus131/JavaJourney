import BikeAssignment.Bike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


    public class BikeTest {

        private Bike theoBike;

        @BeforeEach
        public void StartWithThisInEachTesting(){
            theoBike = new Bike();
        }

    @Test
    public void TestThatBikeCanBeOn() {
        assertFalse(theoBike.getBikeStatus());
        theoBike.bikeOn();
        assertTrue(theoBike.getBikeStatus());
    }

    @Test
    public void TestThatBikeCanBeOff() {
         theoBike = new Bike();
        assertFalse(theoBike.getBikeStatus());
        theoBike.bikeOff();
        assertFalse(theoBike.getBikeStatus());
    }

    @Test
    public void TestBikeCanBeAcceleratedWhenTurnOn() {
        theoBike = new Bike();
        theoBike.getBikeStatus();
        theoBike.bikeOn();
        theoBike.accelerate( 1);
        assertEquals(2,theoBike.accelerate(1));





    }


}
