package hospitalManagementSystem.Q1;

import java.time.LocalDate;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hospital(int id, LocalDate createdDate, LocalDate updatedDate,
                    String hospitalName, String address, String phoneNumber, String email)
            throws HospitalDataException {
        super(id, createdDate, updatedDate);
        if (hospitalName == null || hospitalName.isEmpty()) {
            throw new HospitalDataException("Hospital name cannot be empty");
        }
        if (address == null || address.isEmpty()) {
            throw new HospitalDataException("Address cannot be empty");
        }
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new HospitalDataException("Phone number must be 10 digits");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new HospitalDataException("Invalid email format");
        }
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) throws HospitalDataException {
        if (hospitalName == null || hospitalName.isEmpty()) {
            throw new HospitalDataException("Hospital name cannot be empty");
        }
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws HospitalDataException {
        if (address == null || address.isEmpty()) {
            throw new HospitalDataException("Address cannot be empty");
        }
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws HospitalDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new HospitalDataException("Phone number must be 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws HospitalDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new HospitalDataException("Invalid email format");
        }
        this.email = email;
    }
}
