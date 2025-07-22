package PhoneBookAss;

public class Contacts {
    private String phoneNumber;
    private String firstName;
    private String lastName;


    public Contacts(String phoneNumber, String firstName, String lastName){
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void validatePhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 11) {
            throw new IllegalArgumentException("Phone number must be 11 digits long");
        }

        if(phoneNumber.startsWith("0")) {
            throw new IllegalArgumentException("Phone number must start with 0");
        }


    }

    public String getFirstName(String firstName) {
        return firstName;
    }

    public void validateFirstName(String firstName) {
        if(firstName.)

        this.firstName = firstName;
    }

    public String getLastName(String lastName) {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
}
