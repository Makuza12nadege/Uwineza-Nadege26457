package bankingSystem.Q6;

import java.time.LocalDate;
import java.util.Scanner;

public class MainQ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Entity ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            LocalDate today = LocalDate.now();

            System.out.print("Enter Bank Name: ");
            String bankName = scanner.nextLine();
            System.out.print("Enter Branch Code (>=3 chars): ");
            String branchCode = scanner.nextLine();
            System.out.print("Enter Bank Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Account Number: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Enter Account Type: ");
            String accountType = scanner.nextLine();
            System.out.print("Enter Opening Balance (>=0): ");
            double balance = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter Customer Email: ");
            String email = scanner.nextLine();
            System.out.print("Enter Customer Phone (10 digits): ");
            String phone = scanner.nextLine();

            System.out.print("Enter Transaction ID: ");
            String transactionId = scanner.nextLine();
            System.out.print("Enter Transaction Type: ");
            String transactionType = scanner.nextLine();
            System.out.print("Enter Transaction Amount (>0): ");
            double amount = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Withdrawal Amount (>0): ");
            double withdrawalAmount = Double.parseDouble(scanner.nextLine());
            LocalDate withdrawalDate = today;

            System.out.print("Enter Loan Amount (>0): ");
            double loanAmount = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Interest Rate (>0): ");
            double interestRate = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Duration in years (>0): ");
            int duration = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Payment Amount (>0): ");
            double paymentAmount = Double.parseDouble(scanner.nextLine());
            LocalDate paymentDate = today;

            AccountRecord record = new AccountRecord(
                    id, today, today,
                    bankName, branchCode, address,
                    accountNumber, accountType, balance,
                    customerName, email, phone,
                    transactionId, transactionType, amount,
                    withdrawalAmount, withdrawalDate,
                    loanAmount, interestRate, duration,
                    paymentAmount, paymentDate
            );

            double interest = record.calculateInterest();

            System.out.println("\n--- Account Record ---");
            System.out.println("Bank: " + bankName + ", Branch Code: " + branchCode + ", Address: " + address);
            System.out.println("Account: " + accountNumber + " (" + accountType + "), Balance: " + balance);
            System.out.println("Customer: " + customerName + ", Email: " + email + ", Phone: " + phone);
            System.out.println("Transaction: ID=" + transactionId + ", Type=" + transactionType + ", Amount=" + amount);
            System.out.println("Withdrawal: Amount=" + withdrawalAmount + ", Date=" + withdrawalDate);
            System.out.println("Loan: Amount=" + loanAmount + ", Rate=" + interestRate + ", Duration=" + duration + " years");
            System.out.println("Payment: Amount=" + paymentAmount + ", Date=" + paymentDate);
            System.out.println("Calculated Interest: " + interest);

        } catch (BankingDataException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter numeric values where required.");
        } finally {
            scanner.close();
        }
    }
}
