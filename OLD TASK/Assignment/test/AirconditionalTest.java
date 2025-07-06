package test;

import FileAirconditional.Airconditioner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirconditionalTest {

     private Airconditioner theoAc;

     @BeforeEach
     public  void setUpClassBeforeEachInTest() {
         theoAc = new Airconditioner();
     }

    @Test
    public void testAirconditionalIsOn() {
        theoAc = new Airconditioner();
        assertFalse(theoAc.getPowerStatus());
        theoAc.turnOn();
        assertTrue(theoAc.getPowerStatus());
    }

    @Test
    public void testAirconditionalIsOff() {
        theoAc = new Airconditioner();
        assertFalse(theoAc.getPowerStatus());
        theoAc.turnOff();
        assertFalse(theoAc.getPowerStatus());
    }

   @Test
    public void testWhenIIncreaseTemperatureAirconditionerIncrease() {

       assertFalse(theoAc.getPowerStatus());
       theoAc.turnOn();
       assertTrue(theoAc.getPowerStatus());
       assertEquals(16, theoAc.getTemperature());
       theoAc.increaseTemperature();
       assertEquals(17, theoAc.getTemperature());
   }

    @Test
     public void testWhenIDecreaseTemperatureTemperatureDecrease(){
        assertFalse(theoAc.getPowerStatus());
        theoAc.turnOn();
        assertTrue(theoAc.getPowerStatus());
        assertEquals(16, theoAc.getTemperature());
        theoAc.decreaseTempt();
        assertEquals(15, theoAc.getTemperature());



   }


}


