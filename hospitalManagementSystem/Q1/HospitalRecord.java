package hospitalManagementSystem.Q1;

import java.time.LocalDate;

public final class HospitalRecord extends Bill {

    public HospitalRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                          String hospitalName, String address, String phoneNumber, String email,
                          String departmentName, String departmentCode,
                          String doctorName, String specialization, String doctorEmail, String phone,
                          String nurseName, String shift, int yearsOfExperience,
                          String patientName, int age, String gender, String contactNumber,
                          LocalDate admissionDate, String roomNumber, double roomCharges,
                          String diagnosis, String treatmentGiven, double treatmentCost,
                          double doctorFee, double medicineCost)
            throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
                nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber,
                admissionDate, roomNumber, roomCharges,
                diagnosis, treatmentGiven, treatmentCost,
                doctorFee, medicineCost,
                roomCharges + treatmentCost + doctorFee + medicineCost);
    }

    public double generateBill() {
        return getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
    }
}
