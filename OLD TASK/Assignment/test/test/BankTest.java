package test;

import BankApplication.MyAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.MyBank;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class BankTest {

    MyBank bank;
    MyAccount theoAccount;

    @BeforeEach
    public void dothisFirst(){
    bank = new MyBank();
    }


    @Test
    public void testBankCanWithdraw() {
        MyBank bank = new MyBank();
        bank.createAccount("theophilus", "umar", "1234");
    }


    @Test
    void testBankCanCreateAccount(){
    assertEquals("1234", bank.getCorrectPin());
            }


}

