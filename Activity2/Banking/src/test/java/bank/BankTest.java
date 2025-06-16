package test.java.bank;

import bank.Bank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BankTest {

    @Test
    public void testValidName(){
        assertTrue(Bank.isValidName("nemal"));
        assertFalse(Bank.isValidName("3fe"));
    }

    @Test
    public void testValidMail() {
        assertTrue(Bank.isValidMail("john.doe@example.com"));
        assertFalse(Bank.isValidMail("john@example"));
    }

    @Test
    public void testValidPhone(){
        assertFalse(Bank.isValidPhone("2324124244e"));
    }

    @Test
    void testValidAccountType() {
        assertTrue(Bank.isvalidAcc("saving"));
        assertFalse(Bank.isvalidAcc("business"));
    }



}
