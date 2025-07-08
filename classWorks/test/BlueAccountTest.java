import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlueAccountTest {


    @Test
    public void testGetAccountID(){
        MyAccount blue =  new MyAccount();
        assertEquals(blue.getId(),"12345678");
    }
}
