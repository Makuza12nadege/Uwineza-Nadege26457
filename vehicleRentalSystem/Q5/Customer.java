package vehicleRentalSystem.Q5;

import java.time.LocalDate;

public class Customer extends Vehicle {
    private String customerName;
    private String licenseNumber;
    private String contactNumber;

    public Customer(int id, LocalDate createdDate, LocalDate updatedDate,
                    String companyName, String address, String phoneNumber,
                    String branchName, String locationCode,
                    String vehicleType, String registrationNumber, double dailyRate,
                    String customerName, String licenseNumber, String contactNumber)
            throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
                branchName, locationCode,
                vehicleType, registrationNumber, dailyRate);
        if (customerName == null || customerName.isEmpty()) {
            throw new RentalDataException("Customer name cannot be empty");
        }
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            throw new RentalDataException("License number cannot be empty");
        }
        if (contactNumber == null || contactNumber.isEmpty()) {
            throw new RentalDataException("Contact number cannot be empty");
        }
        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) throws RentalDataException {
        if (customerName == null || customerName.isEmpty()) {
            throw new RentalDataException("Customer name cannot be empty");
        }
        this.customerName = customerName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) throws RentalDataException {
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            throw new RentalDataException("License number cannot be empty");
        }
        this.licenseNumber = licenseNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) throws RentalDataException {
        if (contactNumber == null || contactNumber.isEmpty()) {
            throw new RentalDataException("Contact number cannot be empty");
        }
        this.contactNumber = contactNumber;
    }
}
