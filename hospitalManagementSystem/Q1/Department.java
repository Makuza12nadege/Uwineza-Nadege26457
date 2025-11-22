package hospitalManagementSystem.Q1;

import java.time.LocalDate;

public class Department extends Hospital {
    private String departmentName;
    private String departmentCode;

    public Department(int id, LocalDate createdDate, LocalDate updatedDate,
                      String hospitalName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);
        if (departmentName == null || departmentName.isEmpty()) {
            throw new HospitalDataException("Department name cannot be empty");
        }
        if (departmentCode == null || !departmentCode.matches("[A-Za-z0-9]{3,}")) {
            throw new HospitalDataException("Department code must be alphanumeric and at least 3 characters");
        }
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) throws HospitalDataException {
        if (departmentName == null || departmentName.isEmpty()) {
            throw new HospitalDataException("Department name cannot be empty");
        }
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) throws HospitalDataException {
        if (departmentCode == null || !departmentCode.matches("[A-Za-z0-9]{3,}")) {
            throw new HospitalDataException("Department code must be alphanumeric and at least 3 characters");
        }
        this.departmentCode = departmentCode;
    }
}
