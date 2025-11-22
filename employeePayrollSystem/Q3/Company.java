package employeePayrollSystem.Q3;

import java.time.LocalDate;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;

    public Company(int id, LocalDate createdDate, LocalDate updatedDate,
                   String companyName, String address, String phoneNumber, String email)
            throws PayrollDataException {
        super(id, createdDate, updatedDate);
        if (companyName == null || companyName.isEmpty()) {
            throw new PayrollDataException("Company name cannot be empty");
        }
        if (address == null || address.isEmpty()) {
            throw new PayrollDataException("Address cannot be empty");
        }
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new PayrollDataException("Phone number must be 10 digits");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new PayrollDataException("Invalid email format");
        }
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) throws PayrollDataException {
        if (companyName == null || companyName.isEmpty()) {
            throw new PayrollDataException("Company name cannot be empty");
        }
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws PayrollDataException {
        if (address == null || address.isEmpty()) {
            throw new PayrollDataException("Address cannot be empty");
        }
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws PayrollDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new PayrollDataException("Phone number must be 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws PayrollDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new PayrollDataException("Invalid email format");
        }
        this.email = email;
    }
}
