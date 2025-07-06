import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZoneTest {

    @Test
    public void testZone() {
        assertEquals("NORTHWEST", enumTask.GeoPoliticalZones.getZone("kaduna"));

    }
}
