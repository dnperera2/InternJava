package test.java.bank;

import bank.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("123", "John", 1000, "saving");
        account.bankDeposit(500);
        assertEquals(1500, account.getAccountBalance());
    }

    @Test
    public void testWithdrawValid() {
        BankAccount account = new BankAccount("123", "John", 1000, "saving");
        account.bankWithdraw(300);
        assertEquals(700, account.getAccountBalance());
    }

    @Test
    public void testWithdrawInvalid() {
        BankAccount account = new BankAccount("123", "John", 1000, "saving");
        account.bankWithdraw(1500);
        assertEquals(1000, account.getAccountBalance()); // should not change
    }

    @Test
    public void testNegativeDeposit() {
        BankAccount account = new BankAccount("123", "John", 1000, "saving");
        account.bankDeposit(-200);
        assertEquals(1000, account.getAccountBalance()); // should not change
    }


}
