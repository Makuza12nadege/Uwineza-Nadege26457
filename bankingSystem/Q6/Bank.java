package bankingSystem.Q6;

import java.time.LocalDate;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;

    public Bank(int id, LocalDate createdDate, LocalDate updatedDate,
                String bankName, String branchCode, String address) throws BankingDataException {
        super(id, createdDate, updatedDate);
        if (bankName == null || bankName.isEmpty()) {
            throw new BankingDataException("Bank name cannot be empty");
        }
        if (branchCode == null || branchCode.length() < 3) {
            throw new BankingDataException("Branch code must be at least 3 characters");
        }
        if (address == null || address.isEmpty()) {
            throw new BankingDataException("Address cannot be empty");
        }
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) throws BankingDataException {
        if (bankName == null || bankName.isEmpty()) {
            throw new BankingDataException("Bank name cannot be empty");
        }
        this.bankName = bankName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) throws BankingDataException {
        if (branchCode == null || branchCode.length() < 3) {
            throw new BankingDataException("Branch code must be at least 3 characters");
        }
        this.branchCode = branchCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws BankingDataException {
        if (address == null || address.isEmpty()) {
            throw new BankingDataException("Address cannot be empty");
        }
        this.address = address;
    }
}
