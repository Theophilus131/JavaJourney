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

    @Test
    public void testPhoneBookIsNotEmpty_ContactsCanBeAdded() {
        phoneBook.addContact("theo","umar", "08104116411");
        assertFalse(phoneBook.isEmpty());

    }

    @Test
    public void testTwoContactsCanBeAdded() {
        phoneBook.addContact("theo","umar", "08104116411");
        phoneBook.addContact("umar","umar", "08108106411");
        assertEquals(2,phoneBook.Size());
    }
    @Test
    public void testIfIAddContact_ICanFindContactByFirstName(){
        phoneBook.addContact("theo","umar", "08104116411");
        phoneBook.findContactByFirstName("theo");
        assertEquals("theo",phoneBook.findContactByFirstName("theo"));
    }

    @Test
    public void testIfIAddContact_ICanFindContactByLastName(){
        phoneBook.addContact("theo","umar", "08104116411");
        assertEquals("umar",phoneBook.findContactByLastName("umar"));
    }

    @Test
    public void testIfIAddContact_ICanFindContactByPhoneNumber(){
        phoneBook.addContact("theo","umar", "08104116411");
        assertEquals("08104116411",phoneBook.findContactByPhoneNumber("08104116411"));
    }
}


