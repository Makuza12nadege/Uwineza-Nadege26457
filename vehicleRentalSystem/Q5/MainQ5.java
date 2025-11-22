package vehicleRentalSystem.Q5;

import java.time.LocalDate;
import java.util.Scanner;

public class MainQ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Entity ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            LocalDate today = LocalDate.now();

            System.out.print("Enter Company Name: ");
            String companyName = scanner.nextLine();
            System.out.print("Enter Company Address: ");
            String companyAddress = scanner.nextLine();
            System.out.print("Enter Company Phone (10 digits): ");
            String companyPhone = scanner.nextLine();

            System.out.print("Enter Branch Name: ");
            String branchName = scanner.nextLine();
            System.out.print("Enter Location Code (>=3 chars): ");
            String locationCode = scanner.nextLine();

            System.out.print("Enter Vehicle Type: ");
            String vehicleType = scanner.nextLine();
            System.out.print("Enter Registration Number: ");
            String registrationNumber = scanner.nextLine();
            System.out.print("Enter Daily Rate (>0): ");
            double dailyRate = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter License Number: ");
            String licenseNumber = scanner.nextLine();
            System.out.print("Enter Customer Contact: ");
            String customerContact = scanner.nextLine();

            LocalDate rentalDate = today;
            LocalDate returnDate = today;

            System.out.print("Enter Rental Days (>0): ");
            int rentalDays = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Rental Charge (>=0): ");
            double rentalCharge = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Penalty Charge (>=0): ");
            double penaltyCharge = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Payment Mode: ");
            String paymentMode = scanner.nextLine();
            System.out.print("Enter Transaction ID: ");
            String transactionId = scanner.nextLine();

            RentalRecord record = new RentalRecord(
                    id, today, today,
                    companyName, companyAddress, companyPhone,
                    branchName, locationCode,
                    vehicleType, registrationNumber, dailyRate,
                    customerName, licenseNumber, customerContact,
                    rentalDate, returnDate, rentalDays,
                    rentalCharge, penaltyCharge,
                    paymentMode, transactionId
            );

            double totalCharge = record.calculateTotalCharge();

            System.out.println("\n--- Rental Record ---");
            System.out.println("Company: " + companyName + ", Address: " + companyAddress + ", Phone: " + companyPhone);
            System.out.println("Branch: " + branchName + " (" + locationCode + ")");
            System.out.println("Vehicle: " + vehicleType + ", Reg#: " + registrationNumber + ", Daily Rate: " + dailyRate);
            System.out.println("Customer: " + customerName + ", License: " + licenseNumber + ", Contact: " + customerContact);
            System.out.println("Rental Date: " + rentalDate + ", Return Date: " + returnDate + ", Rental Days: " + rentalDays);
            System.out.println("Rental Charge: " + rentalCharge + ", Penalty Charge: " + penaltyCharge);
            System.out.println("Payment Mode: " + paymentMode + ", Transaction ID: " + transactionId);
            System.out.println("Total Charge (calculated): " + totalCharge);

        } catch (RentalDataException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter numeric values where required.");
        } finally {
            scanner.close();
        }
    }
}
