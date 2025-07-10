import Cylinder.Cylinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


    public class CylinderTest {
        private Cylinder cylinder;

    @BeforeEach
    public void doThisFirst(){

        cylinder = new Cylinder();}


     @Test
    public void testRadiusIsSet(){

    cylinder.setRadius(10);
    assertEquals(10,cylinder.getRadius());
}

    @Test
    public void testHeightIsSet(){
    cylinder.setHeight(10.6);
    assertEquals(10.6,cylinder.getHeight());
}

    @Test
    public void testCalculatedVolume(){
    cylinder.setRadius(10);
    assertEquals(10, cylinder.getRadius());
    cylinder.setHeight(10.6);
    assertEquals(10.6, cylinder.getHeight());
    assertEquals(3330.088212805181, cylinder.calculateVolume());

    }


    @Test
    public void testRadiusCannnotBeNegative(){
    assertThrows(IllegalArgumentException.class ,() -> cylinder.setRadius(-10));

}

    @Test
    public void testHeightCannnotBeNegative(){

        assertThrows(IllegalArgumentException.class, () -> cylinder.setHeight(-20));
    }

}