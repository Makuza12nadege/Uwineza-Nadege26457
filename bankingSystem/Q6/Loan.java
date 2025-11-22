package bankingSystem.Q6;

import java.time.LocalDate;

public class Loan extends Withdrawal {
    private double loanAmount;
    private double interestRate;
    private int duration;

    public Loan(int id, LocalDate createdDate, LocalDate updatedDate,
                String bankName, String branchCode, String address,
                String accountNumber, String accountType, double balance,
                String customerName, String email, String phoneNumber,
                String transactionId, String transactionType, double amount,
                double withdrawalAmount, LocalDate withdrawalDate,
                double loanAmount, double interestRate, int duration)
            throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance,
                customerName, email, phoneNumber,
                transactionId, transactionType, amount,
                withdrawalAmount, withdrawalDate);
        if (loanAmount <= 0 || interestRate <= 0 || duration <= 0) {
            throw new BankingDataException("Loan amount, interest rate and duration must be greater than 0");
        }
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) throws BankingDataException {
        if (loanAmount <= 0) {
            throw new BankingDataException("Loan amount must be greater than 0");
        }
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) throws BankingDataException {
        if (interestRate <= 0) {
            throw new BankingDataException("Interest rate must be greater than 0");
        }
        this.interestRate = interestRate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) throws BankingDataException {
        if (duration <= 0) {
            throw new BankingDataException("Duration must be greater than 0");
        }
        this.duration = duration;
    }
}
