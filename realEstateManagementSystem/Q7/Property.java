package realEstateManagementSystem.Q7;

import java.time.LocalDate;

public class Property extends Agent {
    private String propertyCode;
    private String propertyType;
    private double price;

    public Property(int id, LocalDate createdDate, LocalDate updatedDate,
                    String agencyName, String location, String phoneNumber,
                    String agentName, String email, String licenseNumber,
                    String propertyCode, String propertyType, double price)
            throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, email, licenseNumber);
        if (propertyCode == null || propertyCode.isEmpty()) {
            throw new RealEstateDataException("Property code cannot be empty");
        }
        if (propertyType == null || propertyType.isEmpty()) {
            throw new RealEstateDataException("Property type cannot be empty");
        }
        if (price <= 0) {
            throw new RealEstateDataException("Price must be greater than 0");
        }
        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) throws RealEstateDataException {
        if (propertyCode == null || propertyCode.isEmpty()) {
            throw new RealEstateDataException("Property code cannot be empty");
        }
        this.propertyCode = propertyCode;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) throws RealEstateDataException {
        if (propertyType == null || propertyType.isEmpty()) {
            throw new RealEstateDataException("Property type cannot be empty");
        }
        this.propertyType = propertyType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws RealEstateDataException {
        if (price <= 0) {
            throw new RealEstateDataException("Price must be greater than 0");
        }
        this.price = price;
    }
}
