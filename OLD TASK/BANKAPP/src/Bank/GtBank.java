package Bank;

import java.util.ArrayList;

public class GtBank {
        private ArrayList<Account> myAccounts = new ArrayList<>();

        public Account createAccount(String firstName, String lastName, String correctPin) {
        Account myAccount = new Account(firstName, lastName, correctPin);
        myAccounts.add(myAccount);
        return myAccount;
                        }
}
