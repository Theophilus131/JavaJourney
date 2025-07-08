package BankApplication;

import Exceptions.*;

public class MyAccount {
    private int balance;
    private String correctPin;
    private String name;

    public MyAccount(String firstName, String lastName, String correctPin) {
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
        validateNegativeAmount(amount);

        balance += amount;
    }

    public void withdraw(int amount, String pin) {

        validate(amount, pin);

    }

    private void validate(int amount, String pin) {
        validateAmount(amount);

        validateNegativeAmount(amount);

        validatePin(pin);
    }

    public Object getName(){
        return name;
}

private void validateAmount(int amount) {
    boolean amountExceedBalance = amount > balance;
    if (amountExceedBalance) {
        throw new InsufficientFundsException();
    }
}

private void validateNegativeAmount(int amount) {
    boolean amountisNegative = amount < 0;
    if (amountisNegative) {
        throw new NegativeAmountException();
    }
}

private void validatePin(String pin) {
    boolean pinIsInvalid = !pin.equals(correctPin);

    if (pinIsInvalid) {
        throw new InvalidPinException();
    }
}


}
