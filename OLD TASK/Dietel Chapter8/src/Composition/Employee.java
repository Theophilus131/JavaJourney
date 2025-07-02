package Composition;

public class Employee {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String hireDate;

    public Employee(String firstName, String lastName, String birthDate, String hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString(){
        return String.format("%s %s  Hired: %s  Birthday: %s", firstName, lastName, birthDate, hireDate);
    }

}

