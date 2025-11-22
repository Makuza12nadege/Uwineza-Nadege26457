package schoolManagementSystem.Q2;

import java.time.LocalDate;

public class Department extends School {
    private String departmentName;
    private String departmentCode;

    public Department(int id, LocalDate createdDate, LocalDate updatedDate,
                      String schoolName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);
        if (departmentName == null || departmentName.isEmpty()) {
            throw new SchoolDataException("Department name cannot be empty");
        }
        if (departmentCode == null || !departmentCode.matches("[A-Za-z0-9]{3,}")) {
            throw new SchoolDataException("Department code must be alphanumeric and at least 3 characters");
        }
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) throws SchoolDataException {
        if (departmentName == null || departmentName.isEmpty()) {
            throw new SchoolDataException("Department name cannot be empty");
        }
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) throws SchoolDataException {
        if (departmentCode == null || !departmentCode.matches("[A-Za-z0-9]{3,}")) {
            throw new SchoolDataException("Department code must be alphanumeric and at least 3 characters");
        }
        this.departmentCode = departmentCode;
    }
}
