package employeePayrollSystem.Q3;

import java.time.LocalDate;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;

    public Manager(int id, LocalDate createdDate, LocalDate updatedDate,
                   String companyName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String managerName, String managerEmail, String phone)
            throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode);
        if (managerName == null || managerName.isEmpty()) {
            throw new PayrollDataException("Manager name cannot be empty");
        }
        if (managerEmail == null || !managerEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new PayrollDataException("Invalid manager email format");
        }
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new PayrollDataException("Phone must be 10 digits");
        }
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.phone = phone;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) throws PayrollDataException {
        if (managerName == null || managerName.isEmpty()) {
            throw new PayrollDataException("Manager name cannot be empty");
        }
        this.managerName = managerName;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) throws PayrollDataException {
        if (managerEmail == null || !managerEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new PayrollDataException("Invalid manager email format");
        }
        this.managerEmail = managerEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws PayrollDataException {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new PayrollDataException("Phone must be 10 digits");
        }
        this.phone = phone;
    }
}
