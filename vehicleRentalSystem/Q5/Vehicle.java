package vehicleRentalSystem.Q5;

import java.time.LocalDate;

public class Vehicle extends Branch {
    private String vehicleType;
    private String registrationNumber;
    private double dailyRate;

    public Vehicle(int id, LocalDate createdDate, LocalDate updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate)
            throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
                branchName, locationCode);
        if (vehicleType == null || vehicleType.isEmpty()) {
            throw new RentalDataException("Vehicle type cannot be empty");
        }
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            throw new RentalDataException("Registration number cannot be empty");
        }
        if (dailyRate <= 0) {
            throw new RentalDataException("Daily rate must be greater than 0");
        }
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) throws RentalDataException {
        if (vehicleType == null || vehicleType.isEmpty()) {
            throw new RentalDataException("Vehicle type cannot be empty");
        }
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) throws RentalDataException {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            throw new RentalDataException("Registration number cannot be empty");
        }
        this.registrationNumber = registrationNumber;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) throws RentalDataException {
        if (dailyRate <= 0) {
            throw new RentalDataException("Daily rate must be greater than 0");
        }
        this.dailyRate = dailyRate;
    }
}
