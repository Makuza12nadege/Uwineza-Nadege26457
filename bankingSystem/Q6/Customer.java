package bankingSystem.Q6;

import java.time.LocalDate;

public class Customer extends Account {
    private String customerName;
    private String email;
    private String phoneNumber;

    public Customer(int id, LocalDate createdDate, LocalDate updatedDate,
                    String bankName, String branchCode, String address,
                    String accountNumber, String accountType, double balance,
                    String customerName, String email, String phoneNumber)
            throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance);
        if (customerName == null || customerName.isEmpty()) {
            throw new BankingDataException("Customer name cannot be empty");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new BankingDataException("Invalid email format");
        }
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new BankingDataException("Phone number must be 10 digits");
        }
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) throws BankingDataException {
        if (customerName == null || customerName.isEmpty()) {
            throw new BankingDataException("Customer name cannot be empty");
        }
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws BankingDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new BankingDataException("Invalid email format");
        }
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws BankingDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new BankingDataException("Phone number must be 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
}
