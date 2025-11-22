package bankingSystem.Q6;

import java.time.LocalDate;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(int id, LocalDate createdDate, LocalDate updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance)
            throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new BankingDataException("Account number cannot be empty");
        }
        if (accountType == null || accountType.isEmpty()) {
            throw new BankingDataException("Account type cannot be empty");
        }
        if (balance < 0) {
            throw new BankingDataException("Balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) throws BankingDataException {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new BankingDataException("Account number cannot be empty");
        }
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) throws BankingDataException {
        if (accountType == null || accountType.isEmpty()) {
            throw new BankingDataException("Account type cannot be empty");
        }
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws BankingDataException {
        if (balance < 0) {
            throw new BankingDataException("Balance cannot be negative");
        }
        this.balance = balance;
    }
}
