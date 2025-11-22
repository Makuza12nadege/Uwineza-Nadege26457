package airlineTicketingSystem.Q9;

import java.util.Scanner;

public class MainQ9 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("===== AIRLINE TICKETING SYSTEM INPUT =====");

            // Airline
            System.out.print("Enter Airline Name: ");
            String airlineName = sc.nextLine();

            System.out.print("Enter Airline Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Airline Contact Email: ");
            String email = sc.nextLine();

            Airline airline = new Airline(1, "2025-01-01", "2025-01-01",
                    airlineName, address, email);

            // Flight
            System.out.print("Enter Flight Number: ");
            String flightNumber = sc.nextLine();

            System.out.print("Enter Destination: ");
            String destination = sc.nextLine();

            System.out.print("Enter Departure Time: ");
            String departureTime = sc.nextLine();

            Flight flight = new Flight(2, "2025-01-01", "2025-01-01",
                    flightNumber, destination, departureTime);

            // Passenger
            System.out.print("Enter Passenger Name: ");
            String passengerName = sc.nextLine();

            System.out.print("Enter Passport Number: ");
            String passport = sc.nextLine();

            System.out.print("Enter Nationality: ");
            String nationality = sc.nextLine();

            Passenger passenger = new Passenger(3, "2025-01-01", "2025-01-01",
                    passengerName, passport, nationality);

            // Seat
            System.out.print("Enter Seat Number: ");
            String seatNumber = sc.nextLine();

            System.out.print("Enter Seat Type (Economy/Business): ");
            String seatType = sc.nextLine();

            Seat seat = new Seat(4, "2025-01-01", "2025-01-01",
                    seatNumber, seatType);

            // Ticket
            System.out.print("Enter Ticket Number: ");
            String ticketNum = sc.nextLine();

            System.out.print("Enter Ticket Price: ");
            double price = sc.nextDouble();

            Ticket ticket = new Ticket(5, "2025-01-01", "2025-01-01",
                    ticketNum, price);

            // Baggage
            System.out.print("Enter Baggage Weight: ");
            double weight = sc.nextDouble();

            System.out.print("Enter Baggage Fee: ");
            double fee = sc.nextDouble();

            Baggage baggage = new Baggage(6, "2025-01-01", "2025-01-01",
                    weight, fee);

            // Calculate Invoice
            TicketRecord record = new TicketRecord(ticket, baggage);
            double totalFare = record.generateInvoice();

            Invoice invoice = new Invoice(7, "2025-01-01", "2025-01-01",
                    totalFare);

            // OUTPUT
            System.out.println("\n===== FINAL OUTPUT =====");
            System.out.println("Passenger: " + passengerName);
            System.out.println("Flight: " + flightNumber + " to " + destination);
            System.out.println("Seat: " + seatNumber + " (" + seatType + ")");
            System.out.println("Ticket Price: $" + price);
            System.out.println("Baggage Fee: $" + fee);
            System.out.println("--------------------------------");
            System.out.println("TOTAL FARE: $" + totalFare);
            System.out.println("================================");
        }
    }
