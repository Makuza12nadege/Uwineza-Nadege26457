package schoolManagementSystem.Q2;

import java.time.LocalDate;

public class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    public School(int id, LocalDate createdDate, LocalDate updatedDate,
                  String schoolName, String address, String phoneNumber, String email)
            throws SchoolDataException {
        super(id, createdDate, updatedDate);
        if (schoolName == null || schoolName.isEmpty()) {
            throw new SchoolDataException("School name cannot be empty");
        }
        if (address == null || address.isEmpty()) {
            throw new SchoolDataException("Address cannot be empty");
        }
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new SchoolDataException("Phone number must be 10 digits");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new SchoolDataException("Invalid email format");
        }
        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) throws SchoolDataException {
        if (schoolName == null || schoolName.isEmpty()) {
            throw new SchoolDataException("School name cannot be empty");
        }
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws SchoolDataException {
        if (address == null || address.isEmpty()) {
            throw new SchoolDataException("Address cannot be empty");
        }
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws SchoolDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new SchoolDataException("Phone number must be 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws SchoolDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new SchoolDataException("Invalid email format");
        }
        this.email = email;
    }
}
