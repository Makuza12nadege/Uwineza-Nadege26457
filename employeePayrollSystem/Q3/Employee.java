package employeePayrollSystem.Q3;

import java.time.LocalDate;

public class Employee extends Manager {
    private String employeeName;
    private int employeeId;
    private String designation;
    private String contactNumber;

    public Employee(int id, LocalDate createdDate, LocalDate updatedDate,
                    String companyName, String address, String phoneNumber, String email,
                    String departmentName, String departmentCode,
                    String managerName, String managerEmail, String phone,
                    String employeeName, int employeeId, String designation, String contactNumber)
            throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode,
                managerName, managerEmail, phone);
        if (employeeName == null || employeeName.isEmpty()) {
            throw new PayrollDataException("Employee name cannot be empty");
        }
        if (employeeId <= 0) {
            throw new PayrollDataException("Employee id must be greater than 0");
        }
        if (designation == null || designation.isEmpty()) {
            throw new PayrollDataException("Designation cannot be empty");
        }
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new PayrollDataException("Contact number must be 10 digits");
        }
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
        this.contactNumber = contactNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) throws PayrollDataException {
        if (employeeName == null || employeeName.isEmpty()) {
            throw new PayrollDataException("Employee name cannot be empty");
        }
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) throws PayrollDataException {
        if (employeeId <= 0) {
            throw new PayrollDataException("Employee id must be greater than 0");
        }
        this.employeeId = employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) throws PayrollDataException {
        if (designation == null || designation.isEmpty()) {
            throw new PayrollDataException("Designation cannot be empty");
        }
        this.designation = designation;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) throws PayrollDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new PayrollDataException("Contact number must be 10 digits");
        }
        this.contactNumber = contactNumber;
    }
}
