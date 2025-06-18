package test.java.bank;

import bank.Bank;
import bank.BankAccount;
import bank.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


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

    @Test
    public void testAddAndRemoveAccount() {
        Bank bank = new Bank();
        BankAccount acc = new BankAccount("123456", "John", 5000, "saving");

        bank.addAccount(acc);
        assertEquals(1, bank.bankAccountList.size());

        bank.removeAccount(acc);
        assertEquals(0, bank.bankAccountList.size());
    }

    @Test
    public void testAddAndRemoveCustomer() {
        Bank bank = new Bank();
        Customer c = new Customer("123456789012", "John", "john@example.com", "+94771234567");

        bank.addCustomers(c);
        assertEquals(1, bank.customerList.size());

        bank.removeCustomers(c);
        assertEquals(0, bank.customerList.size());
    }



}
