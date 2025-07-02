package test;

import Account.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testAccount() {
       Account theoAccount = new Account();

       assertEquals(theoAccount.getBalance(), 0);

    }


}
