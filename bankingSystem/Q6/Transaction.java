package bankingSystem.Q6;

import java.time.LocalDate;

public class Transaction extends Customer {
    private String transactionId;
    private String transactionType;
    private double amount;

    public Transaction(int id, LocalDate createdDate, LocalDate updatedDate,
                       String bankName, String branchCode, String address,
                       String accountNumber, String accountType, double balance,
                       String customerName, String email, String phoneNumber,
                       String transactionId, String transactionType, double amount)
            throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance,
                customerName, email, phoneNumber);
        if (transactionId == null || transactionId.isEmpty()) {
            throw new BankingDataException("Transaction ID cannot be empty");
        }
        if (transactionType == null || transactionType.isEmpty()) {
            throw new BankingDataException("Transaction type cannot be empty");
        }
        if (amount <= 0) {
            throw new BankingDataException("Amount must be greater than 0");
        }
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) throws BankingDataException {
        if (transactionId == null || transactionId.isEmpty()) {
            throw new BankingDataException("Transaction ID cannot be empty");
        }
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) throws BankingDataException {
        if (transactionType == null || transactionType.isEmpty()) {
            throw new BankingDataException("Transaction type cannot be empty");
        }
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) throws BankingDataException {
        if (amount <= 0) {
            throw new BankingDataException("Amount must be greater than 0");
        }
        this.amount = amount;
    }
}
