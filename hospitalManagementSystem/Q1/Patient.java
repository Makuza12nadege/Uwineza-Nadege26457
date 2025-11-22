package hospitalManagementSystem.Q1;

import java.time.LocalDate;

public class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;

    public Patient(int id, LocalDate createdDate, LocalDate updatedDate,
                   String hospitalName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String doctorName, String specialization, String doctorEmail, String phone,
                   String nurseName, String shift, int yearsOfExperience,
                   String patientName, int age, String gender, String contactNumber)
            throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
                nurseName, shift, yearsOfExperience);
        if (patientName == null || patientName.isEmpty()) {
            throw new HospitalDataException("Patient name cannot be empty");
        }
        if (age <= 0) {
            throw new HospitalDataException("Age must be greater than 0");
        }
        if (!"Male".equalsIgnoreCase(gender) && !"Female".equalsIgnoreCase(gender)
                && !"Other".equalsIgnoreCase(gender)) {
            throw new HospitalDataException("Gender must be Male, Female or Other");
        }
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new HospitalDataException("Contact number must be 10 digits");
        }
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) throws HospitalDataException {
        if (patientName == null || patientName.isEmpty()) {
            throw new HospitalDataException("Patient name cannot be empty");
        }
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws HospitalDataException {
        if (age <= 0) {
            throw new HospitalDataException("Age must be greater than 0");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws HospitalDataException {
        if (!"Male".equalsIgnoreCase(gender) && !"Female".equalsIgnoreCase(gender)
                && !"Other".equalsIgnoreCase(gender)) {
            throw new HospitalDataException("Gender must be Male, Female or Other");
        }
        this.gender = gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) throws HospitalDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new HospitalDataException("Contact number must be 10 digits");
        }
        this.contactNumber = contactNumber;
    }
}
