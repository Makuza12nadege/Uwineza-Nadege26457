package realEstateManagementSystem.Q7;

import java.time.LocalDate;

public class Agency extends Entity {
    private String agencyName;
    private String location;
    private String phoneNumber;

    public Agency(int id, LocalDate createdDate, LocalDate updatedDate,
                  String agencyName, String location, String phoneNumber)
            throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        if (agencyName == null || agencyName.isEmpty()) {
            throw new RealEstateDataException("Agency name cannot be empty");
        }
        if (location == null || location.isEmpty()) {
            throw new RealEstateDataException("Location cannot be empty");
        }
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new RealEstateDataException("Phone number must be 10 digits");
        }
        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) throws RealEstateDataException {
        if (agencyName == null || agencyName.isEmpty()) {
            throw new RealEstateDataException("Agency name cannot be empty");
        }
        this.agencyName = agencyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) throws RealEstateDataException {
        if (location == null || location.isEmpty()) {
            throw new RealEstateDataException("Location cannot be empty");
        }
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws RealEstateDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new RealEstateDataException("Phone number must be 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
}
