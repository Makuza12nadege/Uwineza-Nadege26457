package realEstateManagementSystem.Q7;

import java.time.LocalDate;

public class Seller extends Property {
    private String sellerName;
    private String contactNumber;

    public Seller(int id, LocalDate createdDate, LocalDate updatedDate,
                  String agencyName, String location, String phoneNumber,
                  String agentName, String email, String licenseNumber,
                  String propertyCode, String propertyType, double price,
                  String sellerName, String contactNumber)
            throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, email, licenseNumber,
                propertyCode, propertyType, price);
        if (sellerName == null || sellerName.isEmpty()) {
            throw new RealEstateDataException("Seller name cannot be empty");
        }
        if (contactNumber == null || contactNumber.isEmpty()) {
            throw new RealEstateDataException("Seller contact cannot be empty");
        }
        this.sellerName = sellerName;
        this.contactNumber = contactNumber;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) throws RealEstateDataException {
        if (sellerName == null || sellerName.isEmpty()) {
            throw new RealEstateDataException("Seller name cannot be empty");
        }
        this.sellerName = sellerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) throws RealEstateDataException {
        if (contactNumber == null || contactNumber.isEmpty()) {
            throw new RealEstateDataException("Seller contact cannot be empty");
        }
        this.contactNumber = contactNumber;
    }
}
