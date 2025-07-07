import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Televisiontest {
    Tv myTv;

    @BeforeEach
    public void SetUpTheseObjectInAllTest(){
        myTv = new Tv();
    }


    @Test
    public void TelevisionISoff(){
        myTv.isOff();
        assertFalse(myTv.isOff());
    }

    @Test
    public void TelevisionISon(){
        myTv.isOn();
        assertTrue(!myTv.isOff());
    }

    @Test
    public void VolumeCanBeIncreasedWhenTvIsOn(){
       myTv.isOn();
       assertEquals(1,myTv.getVolumeUp());

    }

    @Test
    public void VolumeCanBeDecreasedWhenTvIsOff(){
//       myTv.isOn();
        assertEquals(1,myTv.getVolumeDown());

    }




}
