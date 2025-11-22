package hotelReservationSystem.Q4;

import java.time.LocalDate;
import java.util.Scanner;

public class MainQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Entity ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            LocalDate today = LocalDate.now();

            System.out.print("Enter Hotel Name: ");
            String hotelName = scanner.nextLine();
            System.out.print("Enter Hotel Address: ");
            String hotelAddress = scanner.nextLine();
            System.out.print("Enter Hotel Phone (10 digits): ");
            String hotelPhone = scanner.nextLine();
            System.out.print("Enter Hotel Email: ");
            String hotelEmail = scanner.nextLine();

            System.out.print("Enter Room Number: ");
            String roomNumber = scanner.nextLine();
            System.out.print("Enter Room Type: ");
            String roomType = scanner.nextLine();
            System.out.print("Enter Price Per Night (>0): ");
            double pricePerNight = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter Customer Email: ");
            String customerEmail = scanner.nextLine();
            System.out.print("Enter Customer Contact (10 digits): ");
            String customerContact = scanner.nextLine();

            System.out.print("Enter Booking Date (use today, press Enter to accept today): ");
            String bookingInput = scanner.nextLine();
            LocalDate bookingDate = bookingInput.isEmpty() ? today : today; // simplified

            System.out.print("Enter Check-in Date (use today, press Enter to accept today): ");
            String checkInInput = scanner.nextLine();
            LocalDate checkInDate = checkInInput.isEmpty() ? today : today; // simplified

            System.out.print("Enter Check-out Date (use today, press Enter to accept today): ");
            String checkOutInput = scanner.nextLine();
            LocalDate checkOutDate = checkOutInput.isEmpty() ? today : today; // simplified

            System.out.print("Enter Service Name: ");
            String serviceName = scanner.nextLine();
            System.out.print("Enter Service Cost (>0): ");
            double serviceCost = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Payment Method: ");
            String paymentMethod = scanner.nextLine();
            LocalDate paymentDate = today;

            System.out.print("Enter Room Charge (>0): ");
            double roomCharge = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Service Charge (>0): ");
            double serviceCharge = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Rating (1-5): ");
            int rating = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Comments: ");
            String comments = scanner.nextLine();

            ReservationRecord record = new ReservationRecord(
                    id, today, today,
                    hotelName, hotelAddress, hotelPhone, hotelEmail,
                    roomNumber, roomType, pricePerNight,
                    customerName, customerEmail, customerContact,
                    bookingDate, checkInDate, checkOutDate,
                    serviceName, serviceCost,
                    paymentMethod, paymentDate,
                    roomCharge, serviceCharge,
                    rating, comments
            );

            double finalBill = record.generateBill();

            System.out.println("\n--- Reservation Record ---");
            System.out.println("Hotel: " + hotelName + ", Address: " + hotelAddress + ", Phone: " + hotelPhone + ", Email: " + hotelEmail);
            System.out.println("Room: " + roomNumber + " (" + roomType + "), Price Per Night: " + pricePerNight);
            System.out.println("Customer: " + customerName + ", Email: " + customerEmail + ", Contact: " + customerContact);
            System.out.println("Booking Date: " + bookingDate + ", Check-in: " + checkInDate + ", Check-out: " + checkOutDate);
            System.out.println("Service: " + serviceName + ", Cost: " + serviceCost);
            System.out.println("Payment Method: " + paymentMethod + ", Payment Date: " + paymentDate);
            System.out.println("Room Charge: " + roomCharge + ", Service Charge: " + serviceCharge);
            System.out.println("Rating: " + rating + ", Comments: " + comments);
            System.out.println("Total Bill (calculated): " + finalBill);

        } catch (HotelDataException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter numeric values where required.");
        } finally {
            scanner.close();
        }
    }
}
