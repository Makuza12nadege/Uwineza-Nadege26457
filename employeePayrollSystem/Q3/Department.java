package employeePayrollSystem.Q3;

import java.time.LocalDate;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(int id, LocalDate createdDate, LocalDate updatedDate,
                      String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);
        if (departmentName == null || departmentName.isEmpty()) {
            throw new PayrollDataException("Department name cannot be empty");
        }
        if (departmentCode == null || !departmentCode.matches("[A-Za-z0-9]{3,}")) {
            throw new PayrollDataException("Department code must be alphanumeric and at least 3 characters");
        }
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) throws PayrollDataException {
        if (departmentName == null || departmentName.isEmpty()) {
            throw new PayrollDataException("Department name cannot be empty");
        }
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) throws PayrollDataException {
        if (departmentCode == null || !departmentCode.matches("[A-Za-z0-9]{3,}")) {
            throw new PayrollDataException("Department code must be alphanumeric and at least 3 characters");
        }
        this.departmentCode = departmentCode;
    }
}
