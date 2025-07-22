package PhoneBookAss;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contacts> contacts = new ArrayList<Contacts>();


    public void addContact(String firstName, String lastName, String phoneNumber) {
        contacts.add(new Contacts(firstName, lastName, phoneNumber));

    }

    public String findContactByFirstName(String firstName) {

    }

    public String findContactByLastName(String lastName) {
       for(int i = 0; i < contacts.size(); i++) {
           if(contacts.get(i).getLastName().equals(lastName)){
               return lastName;
           }
       }
       return null;

        }

    public String findContactByPhoneNumber(String phoneNumber) {
        for( int i = 0; i < contacts.size(); i++ ) {
            if(contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                return phoneNumber;
            }
        }
        return null;
    }




    public void deleteContact(Contacts contact) {
        for (int index = 0; index < contacts.size(); index++) {
            if (contacts.get(index).equals(contact)) {
                contacts.remove(index);
            }
        }
    }






}
