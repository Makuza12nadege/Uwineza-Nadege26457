package bankingSystem.Q6;

import java.time.LocalDate;

public final class AccountRecord extends Payment {

    public AccountRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                         String bankName, String branchCode, String address,
                         String accountNumber, String accountType, double balance,
                         String customerName, String email, String phoneNumber,
                         String transactionId, String transactionType, double amount,
                         double withdrawalAmount, LocalDate withdrawalDate,
                         double loanAmount, double interestRate, int duration,
                         double paymentAmount, LocalDate paymentDate)
            throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance,
                customerName, email, phoneNumber,
                transactionId, transactionType, amount,
                withdrawalAmount, withdrawalDate,
                loanAmount, interestRate, duration,
                paymentAmount, paymentDate);
    }

    public double calculateInterest() {
        return (getLoanAmount() * getInterestRate() * getDuration()) / 100.0;
    }
}
