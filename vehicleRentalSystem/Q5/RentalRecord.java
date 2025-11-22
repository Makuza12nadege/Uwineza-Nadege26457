package vehicleRentalSystem.Q5;

import java.time.LocalDate;

public final class RentalRecord extends Invoice {

    public RentalRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                        String companyName, String address, String phoneNumber,
                        String branchName, String locationCode,
                        String vehicleType, String registrationNumber, double dailyRate,
                        String customerName, String licenseNumber, String contactNumber,
                        LocalDate rentalDate, LocalDate returnDate, int rentalDays,
                        double rentalCharge, double penaltyCharge,
                        String paymentMode, String transactionId)
            throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
                branchName, locationCode,
                vehicleType, registrationNumber, dailyRate,
                customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays,
                rentalCharge, penaltyCharge,
                paymentMode, transactionId,
                rentalCharge + penaltyCharge);
    }

    public double calculateTotalCharge() {
        return getRentalCharge() + getPenaltyCharge();
    }
}
