import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CylinderTest {
        private Cylinder cylinder;
    @BeforeEach
    public void doThisFirst(){         cylinder = new Cylinder();}



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



}