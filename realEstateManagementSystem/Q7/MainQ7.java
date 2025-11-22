package realEstateManagementSystem.Q7;

import java.time.LocalDate;
import java.util.Scanner;

public class MainQ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Entity ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            LocalDate today = LocalDate.now();

            System.out.print("Enter Agency Name: ");
            String agencyName = scanner.nextLine();
            System.out.print("Enter Agency Location: ");
            String location = scanner.nextLine();
            System.out.print("Enter Agency Phone (10 digits): ");
            String agencyPhone = scanner.nextLine();

            System.out.print("Enter Agent Name: ");
            String agentName = scanner.nextLine();
            System.out.print("Enter Agent Email: ");
            String agentEmail = scanner.nextLine();
            System.out.print("Enter Agent License Number: ");
            String licenseNumber = scanner.nextLine();

            System.out.print("Enter Property Code: ");
            String propertyCode = scanner.nextLine();
            System.out.print("Enter Property Type: ");
            String propertyType = scanner.nextLine();
            System.out.print("Enter Property Price (>0): ");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Seller Name: ");
            String sellerName = scanner.nextLine();
            System.out.print("Enter Seller Contact: ");
            String sellerContact = scanner.nextLine();

            System.out.print("Enter Buyer Name: ");
            String buyerName = scanner.nextLine();
            System.out.print("Enter Buyer Email: ");
            String buyerEmail = scanner.nextLine();

            LocalDate agreementDate = today;
            System.out.print("Enter Agreement Terms: ");
            String terms = scanner.nextLine();

            System.out.print("Enter Payment Amount (>0): ");
            double paymentAmount = Double.parseDouble(scanner.nextLine());
            LocalDate paymentDate = today;

            System.out.print("Enter Commission Rate (>=0): ");
            double commissionRate = Double.parseDouble(scanner.nextLine());

            RealEstateRecord record = new RealEstateRecord(
                    id, today, today,
                    agencyName, location, agencyPhone,
                    agentName, agentEmail, licenseNumber,
                    propertyCode, propertyType, price,
                    sellerName, sellerContact,
                    buyerName, buyerEmail,
                    agreementDate, terms,
                    paymentAmount, paymentDate,
                    commissionRate
            );

            double commission = record.calculateCommission();

            System.out.println("\n--- Real Estate Record ---");
            System.out.println("Agency: " + agencyName + ", Location: " + location + ", Phone: " + agencyPhone);
            System.out.println("Agent: " + agentName + ", Email: " + agentEmail + ", License: " + licenseNumber);
            System.out.println("Property: Code=" + propertyCode + ", Type=" + propertyType + ", Price=" + price);
            System.out.println("Seller: " + sellerName + ", Contact: " + sellerContact);
            System.out.println("Buyer: " + buyerName + ", Email: " + buyerEmail);
            System.out.println("Agreement: Date=" + agreementDate + ", Terms=" + terms);
            System.out.println("Payment: Amount=" + paymentAmount + ", Date=" + paymentDate);
            System.out.println("Commission Rate: " + commissionRate + "%");
            System.out.println("Calculated Commission: " + commission);

        } catch (RealEstateDataException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter numeric values where required.");
        } finally {
            scanner.close();
        }
    }
}
