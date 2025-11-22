package employeePayrollSystem.Q3;

import java.time.LocalDate;

public final class PayrollRecord extends Salary {

    public PayrollRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                         String companyName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode,
                         String managerName, String managerEmail, String phone,
                         String employeeName, int employeeId, String designation, String contactNumber,
                         int totalDays, int presentDays, int leaveDays,
                         double housingAllowance, double transportAllowance,
                         double taxDeduction, double loanDeduction,
                         double basicSalary)
            throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode,
                managerName, managerEmail, phone,
                employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance,
                taxDeduction, loanDeduction,
                basicSalary,
                basicSalary + housingAllowance + transportAllowance,
                basicSalary + housingAllowance + transportAllowance - (taxDeduction + loanDeduction));
    }

    public double calculateNetSalary() {
        double allowances = getHousingAllowance() + getTransportAllowance();
        double deductions = getTaxDeduction() + getLoanDeduction();
        return getBasicSalary() + allowances - deductions;
    }
}
