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

        theoAc.turnOn();
        assertTrue(theoAc.getPowerStatus());
    }

    @Test
    public void testAirconditionalIsOff() {
        theoAc.turnOff();
        assertFalse(theoAc.getPowerStatus());
    }

   @Test
    public void testWhenIIncreaseTemperatureAirconditionerIncrease() {
       theoAc.turnOn();
       assertEquals(16, theoAc.getTemperature());
       theoAc.increaseTemperature();
       assertEquals(17, theoAc.getTemperature());
   }

    @Test
     public void testWhenIDecreaseTemperatureTemperatureDecrease() {
        theoAc.turnOn();
        assertEquals(16, theoAc.getTemperature());
        theoAc.decreaseTemperature();
        assertEquals(16,theoAc.getTemperature());

    }

     @Test
     public void testWhenIIncreaseTemperatureBeyound30TemperatureIsStill30(){
         theoAc.turnOn();
         for(int i = 0; i < 16; i++){
             theoAc.increaseTemperature();
         }
            assertEquals(30, theoAc.getTemperature());
        }

    @Test
    public void testWhenIDecreaseTemperatureBelow16TemperatureIsStill16(){
         theoAc.turnOn();
        for(int i = 0; i < 30; --i){
theoAc.decreaseTemperature();        }
assertEquals(16, theoAc.getTemperature());}

}

