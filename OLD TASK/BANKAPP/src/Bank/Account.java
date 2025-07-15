package Bank;

import Exceptions.InsufficentsFundsException;
import Exceptions.InvalidPinException;
import Exceptions.NegativeAmountException;

public class Account {
    private int balance;
    private String correctPin;
    private String name;

    public Account(String firstName, String lastName, String correctPin) {
        this.correctPin = correctPin;
        this.name = firstName + " " + lastName;
    }


    public String getCorrectPin() {
            return correctPin;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        validateAmount(amount);
        balance += amount;

    }

    public void withdraw(int amount, String correctPin) {

        validateAmount(amount);
        validatePin(correctPin);
        validateAmountExceed(amount);
        balance -= amount;
    }

    private void validateAmount(int amount) {

        if  ( amount < 0) {
            throw new NegativeAmountException();


        }
    }

    private void validateAmountExceed(int amount) {
        if(amount > balance) {
             throw new InsufficentsFundsException();
         }
    }

    private void validatePin(String pin) {
        boolean pinIsvalid = pin.equals(correctPin);
        if (!pinIsvalid) {
            throw new InvalidPinException();
            }
        }

    public String getName(){
        return name;

    }


}









