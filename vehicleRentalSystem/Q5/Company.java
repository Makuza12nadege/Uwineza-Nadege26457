package vehicleRentalSystem.Q5;

import java.time.LocalDate;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;

    public Company(int id, LocalDate createdDate, LocalDate updatedDate,
                   String companyName, String address, String phoneNumber)
            throws RentalDataException {
        super(id, createdDate, updatedDate);
        if (companyName == null || companyName.isEmpty()) {
            throw new RentalDataException("Company name cannot be empty");
        }
        if (address == null || address.isEmpty()) {
            throw new RentalDataException("Address cannot be empty");
        }
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new RentalDataException("Phone number must be 10 digits");
        }
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) throws RentalDataException {
        if (companyName == null || companyName.isEmpty()) {
            throw new RentalDataException("Company name cannot be empty");
        }
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws RentalDataException {
        if (address == null || address.isEmpty()) {
            throw new RentalDataException("Address cannot be empty");
        }
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws RentalDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new RentalDataException("Phone number must be 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
}
