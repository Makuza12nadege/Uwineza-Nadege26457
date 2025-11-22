package realEstateManagementSystem.Q7;

import java.time.LocalDate;

public class Agreement extends Buyer {
    private LocalDate agreementDate;
    private String terms;

    public Agreement(int id, LocalDate createdDate, LocalDate updatedDate,
                     String agencyName, String location, String phoneNumber,
                     String agentName, String agentEmail, String licenseNumber,
                     String propertyCode, String propertyType, double price,
                     String sellerName, String sellerContact,
                     String buyerName, String buyerEmail,
                     LocalDate agreementDate, String terms)
            throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
                agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, sellerContact,
                buyerName, buyerEmail);
        if (agreementDate == null) {
            throw new RealEstateDataException("Agreement date cannot be null");
        }
        if (terms == null || terms.isEmpty()) {
            throw new RealEstateDataException("Agreement terms cannot be empty");
        }
        this.agreementDate = agreementDate;
        this.terms = terms;
    }

    public LocalDate getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(LocalDate agreementDate) throws RealEstateDataException {
        if (agreementDate == null) {
            throw new RealEstateDataException("Agreement date cannot be null");
        }
        this.agreementDate = agreementDate;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) throws RealEstateDataException {
        if (terms == null || terms.isEmpty()) {
            throw new RealEstateDataException("Agreement terms cannot be empty");
        }
        this.terms = terms;
    }
}
