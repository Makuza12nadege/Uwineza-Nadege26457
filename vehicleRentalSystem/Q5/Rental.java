package vehicleRentalSystem.Q5;

import java.time.LocalDate;

public class Rental extends Customer {
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private int rentalDays;

    public Rental(int id, LocalDate createdDate, LocalDate updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  LocalDate rentalDate, LocalDate returnDate, int rentalDays)
            throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
                branchName, locationCode,
                vehicleType, registrationNumber, dailyRate,
                customerName, licenseNumber, contactNumber);
        if (rentalDate == null || returnDate == null) {
            throw new RentalDataException("Rental and return dates cannot be null");
        }
        if (rentalDays <= 0) {
            throw new RentalDataException("Rental days must be greater than 0");
        }
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDays = rentalDays;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) throws RentalDataException {
        if (rentalDate == null) {
            throw new RentalDataException("Rental date cannot be null");
        }
        this.rentalDate = rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) throws RentalDataException {
        if (returnDate == null) {
            throw new RentalDataException("Return date cannot be null");
        }
        this.returnDate = returnDate;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) throws RentalDataException {
        if (rentalDays <= 0) {
            throw new RentalDataException("Rental days must be greater than 0");
        }
        this.rentalDays = rentalDays;
    }
}
