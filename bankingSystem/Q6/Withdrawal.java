package bankingSystem.Q6;

import java.time.LocalDate;

public class Withdrawal extends Transaction {
    private double withdrawalAmount;
    private LocalDate withdrawalDate;

    public Withdrawal(int id, LocalDate createdDate, LocalDate updatedDate,
                      String bankName, String branchCode, String address,
                      String accountNumber, String accountType, double balance,
                      String customerName, String email, String phoneNumber,
                      String transactionId, String transactionType, double amount,
                      double withdrawalAmount, LocalDate withdrawalDate)
            throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance,
                customerName, email, phoneNumber,
                transactionId, transactionType, amount);
        if (withdrawalAmount <= 0) {
            throw new BankingDataException("Withdrawal amount must be greater than 0");
        }
        if (withdrawalDate == null) {
            throw new BankingDataException("Withdrawal date cannot be null");
        }
        this.withdrawalAmount = withdrawalAmount;
        this.withdrawalDate = withdrawalDate;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(double withdrawalAmount) throws BankingDataException {
        if (withdrawalAmount <= 0) {
            throw new BankingDataException("Withdrawal amount must be greater than 0");
        }
        this.withdrawalAmount = withdrawalAmount;
    }

    public LocalDate getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(LocalDate withdrawalDate) throws BankingDataException {
        if (withdrawalDate == null) {
            throw new BankingDataException("Withdrawal date cannot be null");
        }
        this.withdrawalDate = withdrawalDate;
    }
}
