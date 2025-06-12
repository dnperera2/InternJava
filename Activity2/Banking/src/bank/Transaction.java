package bank;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private String transactionID;
    private LocalDate transactionDate;
    private BigDecimal transactionAmount;
    private String transactionType;

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Transaction(String transactionID, LocalDate transactionDate, BigDecimal transactionAmount, String transactionType) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
    }



}
