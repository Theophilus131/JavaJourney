import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account myAccount;
    @BeforeEach
    public void doThisFirst(){
        myAccount = new Account();
}

    @Test
    public void AccountTest(){
        Account myAccount = new Account();
    }

    @Test
    public void testAccountBalanceIs_Zero(){
        assertEquals(0, myAccount.getBalance());
    }


}
