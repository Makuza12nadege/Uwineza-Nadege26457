package realEstateManagementSystem.Q7;

import java.time.LocalDate;

public class Agent extends Agency {
    private String agentName;
    private String email;
    private String licenseNumber;

    public Agent(int id, LocalDate createdDate, LocalDate updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String email, String licenseNumber)
            throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);
        if (agentName == null || agentName.isEmpty()) {
            throw new RealEstateDataException("Agent name cannot be empty");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new RealEstateDataException("Invalid email format");
        }
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            throw new RealEstateDataException("License number cannot be empty");
        }
        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) throws RealEstateDataException {
        if (agentName == null || agentName.isEmpty()) {
            throw new RealEstateDataException("Agent name cannot be empty");
        }
        this.agentName = agentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws RealEstateDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new RealEstateDataException("Invalid email format");
        }
        this.email = email;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) throws RealEstateDataException {
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            throw new RealEstateDataException("License number cannot be empty");
        }
        this.licenseNumber = licenseNumber;
    }
}
