package bankingSystem.Q6;

import java.time.LocalDate;

public class Deposit extends Transaction {
    private double depositAmount;
    private LocalDate depositDate;

    public Deposit(int id, LocalDate createdDate, LocalDate updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, LocalDate depositDate)
            throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance,
                customerName, email, phoneNumber,
                transactionId, transactionType, amount);
        if (depositAmount <= 0) {
            throw new BankingDataException("Deposit amount must be greater than 0");
        }
        if (depositDate == null) {
            throw new BankingDataException("Deposit date cannot be null");
        }
        this.depositAmount = depositAmount;
        this.depositDate = depositDate;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) throws BankingDataException {
        if (depositAmount <= 0) {
            throw new BankingDataException("Deposit amount must be greater than 0");
        }
        this.depositAmount = depositAmount;
    }

    public LocalDate getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(LocalDate depositDate) throws BankingDataException {
        if (depositDate == null) {
            throw new BankingDataException("Deposit date cannot be null");
        }
        this.depositDate = depositDate;
    }
}
