package realEstateManagementSystem.Q7;

import java.time.LocalDate;

public class Payment extends Agreement {
    private double paymentAmount;
    private LocalDate paymentDate;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                   String agencyName, String location, String phoneNumber,
                   String agentName, String agentEmail, String licenseNumber,
                   String propertyCode, String propertyType, double price,
                   String sellerName, String sellerContact,
                   String buyerName, String buyerEmail,
                   LocalDate agreementDate, String terms,
                   double paymentAmount, LocalDate paymentDate)
            throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, sellerContact,
                buyerName, buyerEmail,
                agreementDate, terms);
        if (paymentAmount <= 0) {
            throw new RealEstateDataException("Payment amount must be greater than 0");
        }
        if (paymentDate == null) {
            throw new RealEstateDataException("Payment date cannot be null");
        }
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) throws RealEstateDataException {
        if (paymentAmount <= 0) {
            throw new RealEstateDataException("Payment amount must be greater than 0");
        }
        this.paymentAmount = paymentAmount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) throws RealEstateDataException {
        if (paymentDate == null) {
            throw new RealEstateDataException("Payment date cannot be null");
        }
        this.paymentDate = paymentDate;
    }
}
