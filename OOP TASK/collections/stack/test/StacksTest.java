import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StacksTest {
    private MyStack theoStack;

    @BeforeEach
    public void SetUpThisBeforeEachTest() {
        theoStack = new MyStack(10);
    }


    @Test
    public void NewStackIsEmpty() {
        assertTrue(theoStack.isEmpty());
    }

    @Test
    public void pushNewStackElement_isNotEmptyTest() {
        assertTrue(theoStack.isEmpty());
        theoStack.push("G-string");
        assertFalse(theoStack.isEmpty());
    }

    @Test
    public void pushOne_popOne_StackIsEmptyTest() {

        assertTrue(theoStack.isEmpty());
        theoStack.push("G-string");
        assertFalse(theoStack.isEmpty());
        theoStack.pop();
        assertTrue(theoStack.isEmpty());
    }

    @Test
    public void pushTwo_popTwo_StackIsEmptyTest() {
        assertTrue(theoStack.isEmpty());
        theoStack.push("G-string");
        theoStack.push("A-string");
        assertFalse(theoStack.isEmpty());
        theoStack.pop();
        assertFalse(theoStack.isEmpty());

    }

    @Test
    public void pushX_popShouldReturnXTest() {
        theoStack.push("G-string");
        assertEquals("G-string", theoStack.pop());
    }

    @Test
    public void pushXAndY_popShouldReturnYTest() {
        theoStack.push("G-string");
        theoStack.push("A-string");
        assertEquals("A-string", theoStack.pop());

    }
/*
    @Test
    public void shouldThrowUnderFlowException_whenEmptyStackIsPopped() {
        assertTrue(theoStack.isEmpty());
        assertThrows(stackUnderFlowException.class,()->theoStack.pop());

    }
*/
}