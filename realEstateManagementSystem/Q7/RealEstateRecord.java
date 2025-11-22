package realEstateManagementSystem.Q7;

import java.time.LocalDate;

public final class RealEstateRecord extends Commission {

    public RealEstateRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                            String agencyName, String location, String phoneNumber,
                            String agentName, String agentEmail, String licenseNumber,
                            String propertyCode, String propertyType, double price,
                            String sellerName, String sellerContact,
                            String buyerName, String buyerEmail,
                            LocalDate agreementDate, String terms,
                            double paymentAmount, LocalDate paymentDate,
                            double commissionRate)
            throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, sellerContact,
                buyerName, buyerEmail,
                agreementDate, terms,
                paymentAmount, paymentDate,
                commissionRate,
                (price * commissionRate) / 100.0);
    }

    public double calculateCommission() {
        return (getPrice() * getCommissionRate()) / 100.0;
    }
}
