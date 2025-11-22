package hospitalManagementSystem.Q1;

import java.time.LocalDate;
import java.util.Scanner;

public class MainQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Entity ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            LocalDate today = LocalDate.now();

            System.out.print("Enter Hospital Name: ");
            String hospitalName = scanner.nextLine();
            System.out.print("Enter Hospital Address: ");
            String hospitalAddress = scanner.nextLine();
            System.out.print("Enter Hospital Phone (10 digits): ");
            String hospitalPhone = scanner.nextLine();
            System.out.print("Enter Hospital Email: ");
            String hospitalEmail = scanner.nextLine();

            System.out.print("Enter Department Name: ");
            String departmentName = scanner.nextLine();
            System.out.print("Enter Department Code (>=3 alphanumeric): ");
            String departmentCode = scanner.nextLine();

            System.out.print("Enter Doctor Name: ");
            String doctorName = scanner.nextLine();
            System.out.print("Enter Doctor Specialization: ");
            String specialization = scanner.nextLine();
            System.out.print("Enter Doctor Email: ");
            String doctorEmail = scanner.nextLine();
            System.out.print("Enter Doctor Phone (10 digits): ");
            String doctorPhone = scanner.nextLine();

            System.out.print("Enter Nurse Name: ");
            String nurseName = scanner.nextLine();
            System.out.print("Enter Nurse Shift (Day/Night): ");
            String shift = scanner.nextLine();
            System.out.print("Enter Nurse Years of Experience: ");
            int yearsExperience = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Patient Name: ");
            String patientName = scanner.nextLine();
            System.out.print("Enter Patient Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Patient Gender (Male/Female/Other): ");
            String gender = scanner.nextLine();
            System.out.print("Enter Patient Contact Number (10 digits): ");
            String patientContact = scanner.nextLine();

            System.out.print("Enter Admission Room Number: ");
            String roomNumber = scanner.nextLine();
            System.out.print("Enter Room Charges: ");
            double roomCharges = Double.parseDouble(scanner.nextLine());

            LocalDate admissionDate = today;

            System.out.print("Enter Diagnosis: ");
            String diagnosis = scanner.nextLine();
            System.out.print("Enter Treatment Given: ");
            String treatmentGiven = scanner.nextLine();
            System.out.print("Enter Treatment Cost: ");
            double treatmentCost = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Doctor Fee: ");
            double doctorFee = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Medicine Cost: ");
            double medicineCost = Double.parseDouble(scanner.nextLine());

            HospitalRecord record = new HospitalRecord(
                    id, today, today,
                    hospitalName, hospitalAddress, hospitalPhone, hospitalEmail,
                    departmentName, departmentCode,
                    doctorName, specialization, doctorEmail, doctorPhone,
                    nurseName, shift, yearsExperience,
                    patientName, age, gender, patientContact,
                    admissionDate, roomNumber, roomCharges,
                    diagnosis, treatmentGiven, treatmentCost,
                    doctorFee, medicineCost
            );

            double finalBill = record.generateBill();

            System.out.println("\n--- Hospital Record ---");
            System.out.println("Hospital: " + hospitalName + ", Address: " + hospitalAddress + ", Phone: " + hospitalPhone + ", Email: " + hospitalEmail);
            System.out.println("Department: " + departmentName + " (" + departmentCode + ")");
            System.out.println("Doctor: " + doctorName + ", Specialization: " + specialization + ", Email: " + doctorEmail + ", Phone: " + doctorPhone);
            System.out.println("Nurse: " + nurseName + ", Shift: " + shift + ", Experience: " + yearsExperience + " years");
            System.out.println("Patient: " + patientName + ", Age: " + age + ", Gender: " + gender + ", Contact: " + patientContact);
            System.out.println("Admission Date: " + admissionDate + ", Room: " + roomNumber + ", Room Charges: " + roomCharges);
            System.out.println("Diagnosis: " + diagnosis + ", Treatment: " + treatmentGiven + ", Treatment Cost: " + treatmentCost);
            System.out.println("Doctor Fee: " + doctorFee + ", Medicine Cost: " + medicineCost);
            System.out.println("Total Bill (calculated): " + finalBill);

        } catch (HospitalDataException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter numeric values where required.");
        } finally {
            scanner.close();
        }
    }
}
