package test.TestBankApp;

import BankApplication.InsufficientFundsException;
import BankApplication.MyAccount;
import Exceptions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AccountTest {
    MyAccount theoAccount;

    @BeforeEach
    public void doTheseFirst() {
        theoAccount = new MyAccount("theophilus", "umar", "correctPin");
    }
    @Test
    public void testThatAccountBalanceIsZero() {
        assertEquals(0, theoAccount.getBalance());
    }

    @Test
    public void testThatIDeposited2KInMyAccount() {
        assertEquals(0, theoAccount.getBalance());
        theoAccount.deposit(2_000);
        assertEquals(2_000, theoAccount.getBalance());
    }

    @Test
    public void testThatIHave5kBalanceInMyAccount() {
        assertEquals(0, theoAccount.getBalance());
        theoAccount.deposit(5_000);
       assertEquals(5_000, theoAccount.getBalance());
        theoAccount.withdraw(2_000, "correctPin");
        assertEquals(3_000, theoAccount.getBalance());
    }

    @Test
    public void testNegativeDeposit_ThrowsException() {
        assertEquals(0, theoAccount.getBalance());

        assertThrows(NegativeAmountException.class, () -> theoAccount.deposit(-5_000));
    }

    @Test
    public void testThatIDeposited5KInAccountIWithdraw6KBalanceShouldBe5k() {
        assertEquals(0, theoAccount.getBalance());
        theoAccount.deposit(5_000);
        assertEquals(5_000, theoAccount.getBalance());

        theoAccount.withdraw(6_000, "correctPin");
        assertEquals(5_000, theoAccount.getBalance());
    }

    @Test
    public void testCannotWithdrawWithIncorrectPin() {
        assertEquals(0, theoAccount.getBalance());
        theoAccount.deposit(5_000);

        assertEquals(5_000, theoAccount.getBalance());
        theoAccount.withdraw(2_000, "incorrectPin");

        assertEquals(5_000, theoAccount.getBalance());
    }


    @Test
    public void testThatwithdrawExceedAmount_balanceException(){
        theoAccount.deposit(5_000);
        assertEquals(5_000, theoAccount.getBalance());
        assertThrows(InsufficientFundsException.class, () -> theoAccount.withdraw(6_000,"correctPin"));
    }


    @Test
    public void testThatNegativeAmountWithdrawal_throwsException() {
        assertEquals(0, theoAccount.getBalance());
        theoAccount.deposit(5_000);
        assertEquals(5_000, theoAccount.getBalance());
        assertThrows(NegativeAmountException.class, () -> theoAccount.withdraw(-2000, "correctPin"));

    }

    @Test
    void testAccountNameIsCorrect(){
        assertEquals("theophilus umar", theoAccount.getName());
    }

    @Test
    public void testAccount_can_withdraw_with_correctPin(){
        theoAccount.deposit(5_000);
        theoAccount.withdraw(3_000, "correctPin");
        assertEquals(theoAccount.getBalance(), 2_000);

    }

    








}
