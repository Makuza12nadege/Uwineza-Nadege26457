package realEstateManagementSystem.Q7;

import java.time.LocalDate;

public class Buyer extends Seller {
    private String buyerName;
    private String email;

    public Buyer(int id, LocalDate createdDate, LocalDate updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String agentEmail, String licenseNumber,
                 String propertyCode, String propertyType, double price,
                 String sellerName, String sellerContact,
                 String buyerName, String email)
            throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, sellerContact);
        if (buyerName == null || buyerName.isEmpty()) {
            throw new RealEstateDataException("Buyer name cannot be empty");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new RealEstateDataException("Invalid buyer email format");
        }
        this.buyerName = buyerName;
        this.email = email;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) throws RealEstateDataException {
        if (buyerName == null || buyerName.isEmpty()) {
            throw new RealEstateDataException("Buyer name cannot be empty");
        }
        this.buyerName = buyerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws RealEstateDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new RealEstateDataException("Invalid buyer email format");
        }
        this.email = email;
    }
}
