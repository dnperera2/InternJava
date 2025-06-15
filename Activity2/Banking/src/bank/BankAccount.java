package bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private String accountType;

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountType='" + accountType + '\'' +
                '}';
    }

    public BankAccount(String accountNumber, String accountHolderName, double accountBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    private static int transactionCount = 0;
    private final ArrayList<Transaction> transHistory = new ArrayList<>();



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void bankDeposit(double amt){
        if(amt>0){
            this.accountBalance += amt;

            transHistory.add(new Transaction(
                    UUID.randomUUID().toString(),
                    LocalDate.now(),
                    amt,
                    "Deposit"
            ));
            transactionCount++;

        }
        else{
            System.out.println("This transaction can not be completed.");
            return;
        }

    }

    public void bankWithdraw(double amt){
        if(amt>0 && amt<=accountBalance){
            this.accountBalance -= amt;

            transHistory.add(new Transaction(
                    UUID.randomUUID().toString(),
                    LocalDate.now(),
                    amt,
                    "Withdraw"
            ));

            transactionCount++;


        }
        else{
            System.out.println("This transaction can not be completed.");
            return;
        }
    }


    public void displayTransaction() {
        for (Transaction t : transHistory){
            System.out.println(t);
    }
        System.out.println("Final Balance : " + accountBalance);
    }





}
