package PhoneBook;

import PhoneBookAss.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    private PhoneBook phoneBook;

    @BeforeEach
    public void setThisFirst(){
       phoneBook = new PhoneBook();
    }


    @Test
    public void testPhoneBookIsEmpty() {
        assertTrue(phoneBook.isEmpty());

    }
}


