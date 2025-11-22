package bankingSystem.Q6;

import java.time.LocalDate;

public class Payment extends Loan {
    private double paymentAmount;
    private LocalDate paymentDate;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
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
                loanAmount, interestRate, duration);
        if (paymentAmount <= 0) {
            throw new BankingDataException("Payment amount must be greater than 0");
        }
        if (paymentDate == null) {
            throw new BankingDataException("Payment date cannot be null");
        }
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) throws BankingDataException {
        if (paymentAmount <= 0) {
            throw new BankingDataException("Payment amount must be greater than 0");
        }
        this.paymentAmount = paymentAmount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) throws BankingDataException {
        if (paymentDate == null) {
            throw new BankingDataException("Payment date cannot be null");
        }
        this.paymentDate = paymentDate;
    }
}
