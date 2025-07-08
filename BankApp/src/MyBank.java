import BankApplication.MyAccount;

public class MyBank {
    private MyAccount  account;


    public MyAccount createAccount(String firstName, String lastName, String correctPin) {
        account = new MyAccount(firstName,lastName,correctPin);
return account;
    }
    public String getCorrectPin() {
        return account.getCorrectPin();
    }


}
