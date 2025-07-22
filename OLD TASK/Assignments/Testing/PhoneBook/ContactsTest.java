package PhoneBook;

import PhoneBookAss.Contacts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactsTest {

    @Test
    public void testFirstNameCanBeAdded() {
        Contacts myContact = new Contacts("090232911", "theo", "umar");

    }

    @Test
    public void test_PhoneNumberLengthIs11_ThrowException(){
        assertThrows(IllegalArgumentException.class, () ->
    }



}


}