import Bank.Account;

import Exceptions.InsufficentsFundsException;
import Exceptions.InvalidPinException;
import Exceptions.NegativeAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTesting {

    private Account myAccount;

    @BeforeEach
    public void doThisFirst(){
        myAccount = new Account("theophilus","umar", "0000");
    }

    @Test
    public void testbalanceIsZero(){
        assertEquals(0, myAccount.getBalance());
    }

    @Test
    public void testThatIDeposit2KInMyAccount(){
        myAccount.deposit(2_000);
        assertEquals(2_000, myAccount.getBalance());
    }

    @Test
    public void testThatIWithdraw2KInMyAccount(){
        myAccount.deposit(5_000);
        myAccount.withdraw(2_000, "0000");
        assertEquals(3_000, myAccount.getBalance());
    }

    @Test
    public void testAccountCanWithdrawZeroBalance(){
        myAccount.withdraw(0, "0000");
        assertEquals(0, myAccount.getBalance());
    }

    @Test
    public void testAccountCanWithdrawWithCorrectPin(){
        myAccount.deposit(5_000);
        myAccount.withdraw(2_000, "0000");
        assertEquals(3_000, myAccount.getBalance());
    }

    @Test
    public void testThatwithdrawExceedAmount_balanceException(){
        myAccount.deposit(5_000);
        assertThrows(InsufficentsFundsException.class, () -> myAccount.withdraw(6_000, "0000"));
    }

    @Test
    public void testNegativeDeposit_ThrowsException(){
        assertThrows(NegativeAmountException.class, () -> myAccount.deposit(-1_000));
    }

    @Test
    public void testAccountCannotWithdrawWithWrongPin(){
    myAccount.deposit(5_000);
    assertThrows(InvalidPinException.class, () -> myAccount.withdraw(1000,"wrongPin"));
   }

    @Test
    public void testNegativeWithdraw_ThrowsException(){
        assertThrows(NegativeAmountException.class, () -> myAccount.withdraw(-1_000, "0000"));
    }


       @Test
      public void testAccountNameIsCorrect(){
        assertEquals("theophilus umar", myAccount.getName());
      }



}
