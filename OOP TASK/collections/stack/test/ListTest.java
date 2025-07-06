import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListTest {

    private MyList myList;

    @BeforeEach
    public void setUpAllBeforeEachTest() {
        myList = new MyList();
    }

    @Test
    public void TestNewListIsEmpty() {
        assertTrue(myList.isEmpty());
    }

    @Test
    public void TestThatICanAddAnItemToTheList(){
        assertTrue(myList.isEmpty());
        String item = "orange";
        myList.add(item);
        assertTrue(myList.add("orange"));
    }


    @Test
    public void TestToChecksWhetherAnItemCanBeContainInTheList(){
        assertTrue(myList.isEmpty());
        String item = "orange";
        myList.add(item);
        assertTrue(myList.contains("orange"));
    }

    @Test
    public void RemoveAllElementFromTheListTest(){
        assertTrue(myList.isEmpty());
        String item = "orange";
        myList.add(item);
        assertEquals(0,myList.noElement());
    }



}
