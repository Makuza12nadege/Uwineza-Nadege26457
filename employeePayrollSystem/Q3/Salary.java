package employeePayrollSystem.Q3;

import java.time.LocalDate;

public class Salary extends Deduction {
    private double basicSalary;
    private double grossSalary;
    private double netSalary;

    public Salary(int id, LocalDate createdDate, LocalDate updatedDate,
                  String companyName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String managerName, String managerEmail, String phone,
                  String employeeName, int employeeId, String designation, String contactNumber,
                  int totalDays, int presentDays, int leaveDays,
                  double housingAllowance, double transportAllowance,
                  double taxDeduction, double loanDeduction,
                  double basicSalary, double grossSalary, double netSalary)
            throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode,
                managerName, managerEmail, phone,
                employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance,
                taxDeduction, loanDeduction);
        if (basicSalary <= 0 || grossSalary <= 0 || netSalary <= 0) {
            throw new PayrollDataException("Salary values must be greater than 0");
        }
        this.basicSalary = basicSalary;
        this.grossSalary = grossSalary;
        this.netSalary = netSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) throws PayrollDataException {
        if (basicSalary <= 0) {
            throw new PayrollDataException("Basic salary must be greater than 0");
        }
        this.basicSalary = basicSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) throws PayrollDataException {
        if (grossSalary <= 0) {
            throw new PayrollDataException("Gross salary must be greater than 0");
        }
        this.grossSalary = grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) throws PayrollDataException {
        if (netSalary <= 0) {
            throw new PayrollDataException("Net salary must be greater than 0");
        }
        this.netSalary = netSalary;
    }
}
