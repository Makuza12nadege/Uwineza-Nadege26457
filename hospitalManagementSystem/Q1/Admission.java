package hospitalManagementSystem.Q1;

import java.time.LocalDate;

public class Admission extends Patient {
    private LocalDate admissionDate;
    private String roomNumber;
    private double roomCharges;

    public Admission(int id, LocalDate createdDate, LocalDate updatedDate,
                     String hospitalName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String phone,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     LocalDate admissionDate, String roomNumber, double roomCharges)
            throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
                nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber);
        if (admissionDate == null) {
            throw new HospitalDataException("Admission date cannot be null");
        }
        if (roomCharges <= 0) {
            throw new HospitalDataException("Room charges must be greater than 0");
        }
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) throws HospitalDataException {
        if (admissionDate == null) {
            throw new HospitalDataException("Admission date cannot be null");
        }
        this.admissionDate = admissionDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) throws HospitalDataException {
        if (roomCharges <= 0) {
            throw new HospitalDataException("Room charges must be greater than 0");
        }
        this.roomCharges = roomCharges;
    }
}
