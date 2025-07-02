package test;

import FileAirconditional.Airconditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirconditionalTest {

    @Test
    public void testAirconditionalIsOn() {
        Airconditioner theoAc = new Airconditioner();
        assertFalse(theoAc.getPowerStatus());
        theoAc.turnOn();
        assertTrue(theoAc.getPowerStatus());
    }

    @Test
    public void testAirconditionalIsOff() {
        Airconditioner theoAc = new Airconditioner();
        assertFalse(theoAc.getPowerStatus());
        theoAc.turnOff();
        assertFalse(theoAc.getPowerStatus());
    }

   @Test
    public void testWhenIIncreaseTemperatureAirconditionerIncrease() {
       Airconditioner theoAc = new Airconditioner();
       assertFalse(theoAc.getPowerStatus());
       theoAc.turnOn();
       assertTrue(theoAc.getPowerStatus());
       assertEquals(16, theoAc.getTemperature());
       theoAc.increaseTemperature();
       assertEquals(17, theoAc.getTemperature());
   }

    @Test
     public void testWhenIDecreaseTemperatureTemperatureDecrease(){
        Airconditioner theoAc = new Airconditioner();
        assertFalse(theoAc.getPowerStatus());
        theoAc.turnOn();
        assertTrue(theoAc.getPowerStatus());
        assertEquals(16, theoAc.getTemperature());
        theoAc.decreaseTempt();
        assertEquals(15, theoAc.getTemperature());



   }


}


