package realEstateManagementSystem.Q7;

import java.time.LocalDate;

public class Commission extends Payment {
    private double commissionRate;
    private double commissionAmount;

    public Commission(int id, LocalDate createdDate, LocalDate updatedDate,
                      String agencyName, String location, String phoneNumber,
                      String agentName, String agentEmail, String licenseNumber,
                      String propertyCode, String propertyType, double price,
                      String sellerName, String sellerContact,
                      String buyerName, String buyerEmail,
                      LocalDate agreementDate, String terms,
                      double paymentAmount, LocalDate paymentDate,
                      double commissionRate, double commissionAmount)
            throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, sellerContact,
                buyerName, buyerEmail,
                agreementDate, terms,
                paymentAmount, paymentDate);
        if (commissionRate < 0 || commissionAmount < 0) {
            throw new RealEstateDataException("Commission rate and amount cannot be negative");
        }
        this.commissionRate = commissionRate;
        this.commissionAmount = commissionAmount;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) throws RealEstateDataException {
        if (commissionRate < 0) {
            throw new RealEstateDataException("Commission rate cannot be negative");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(double commissionAmount) throws RealEstateDataException {
        if (commissionAmount < 0) {
            throw new RealEstateDataException("Commission amount cannot be negative");
        }
        this.commissionAmount = commissionAmount;
    }
}
