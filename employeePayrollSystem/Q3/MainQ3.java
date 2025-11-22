package employeePayrollSystem.Q3;

import java.time.LocalDate;
import java.util.Scanner;

public class MainQ3 {
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
            System.out.print("Enter Company Email: ");
            String companyEmail = scanner.nextLine();

            System.out.print("Enter Department Name: ");
            String departmentName = scanner.nextLine();
            System.out.print("Enter Department Code (>=3 alphanumeric): ");
            String departmentCode = scanner.nextLine();

            System.out.print("Enter Manager Name: ");
            String managerName = scanner.nextLine();
            System.out.print("Enter Manager Email: ");
            String managerEmail = scanner.nextLine();
            System.out.print("Enter Manager Phone (10 digits): ");
            String managerPhone = scanner.nextLine();

            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.nextLine();
            System.out.print("Enter Employee ID (>0): ");
            int employeeId = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Designation: ");
            String designation = scanner.nextLine();
            System.out.print("Enter Employee Contact (10 digits): ");
            String employeeContact = scanner.nextLine();

            System.out.print("Enter Total Days (>=0): ");
            int totalDays = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Present Days (>=0, <= Total Days): ");
            int presentDays = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Leave Days (>=0): ");
            int leaveDays = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Housing Allowance (>=0): ");
            double housingAllowance = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Transport Allowance (>=0): ");
            double transportAllowance = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Tax Deduction (>=0): ");
            double taxDeduction = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Loan Deduction (>=0): ");
            double loanDeduction = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Basic Salary (>0): ");
            double basicSalary = Double.parseDouble(scanner.nextLine());

            PayrollRecord record = new PayrollRecord(
                    id, today, today,
                    companyName, companyAddress, companyPhone, companyEmail,
                    departmentName, departmentCode,
                    managerName, managerEmail, managerPhone,
                    employeeName, employeeId, designation, employeeContact,
                    totalDays, presentDays, leaveDays,
                    housingAllowance, transportAllowance,
                    taxDeduction, loanDeduction,
                    basicSalary
            );

            double netSalary = record.calculateNetSalary();

            System.out.println("\n--- Payroll Record ---");
            System.out.println("Company: " + companyName + ", Address: " + companyAddress + ", Phone: " + companyPhone + ", Email: " + companyEmail);
            System.out.println("Department: " + departmentName + " (" + departmentCode + ")");
            System.out.println("Manager: " + managerName + ", Email: " + managerEmail + ", Phone: " + managerPhone);
            System.out.println("Employee: " + employeeName + ", ID: " + employeeId + ", Designation: " + designation + ", Contact: " + employeeContact);
            System.out.println("Attendance - Total: " + totalDays + ", Present: " + presentDays + ", Leave: " + leaveDays);
            System.out.println("Allowances - Housing: " + housingAllowance + ", Transport: " + transportAllowance);
            System.out.println("Deductions - Tax: " + taxDeduction + ", Loan: " + loanDeduction);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Net Salary (calculated): " + netSalary);

        } catch (PayrollDataException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter numeric values where required.");
        } finally {
            scanner.close();
        }
    }
}
