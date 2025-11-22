package vehicleRentalSystem.Q5;

import java.time.LocalDate;

public class Branch extends Company {
    private String branchName;
    private String locationCode;

    public Branch(int id, LocalDate createdDate, LocalDate updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode)
            throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);
        if (branchName == null || branchName.isEmpty()) {
            throw new RentalDataException("Branch name cannot be empty");
        }
        if (locationCode == null || locationCode.length() < 3) {
            throw new RentalDataException("Location code must be at least 3 characters");
        }
        this.branchName = branchName;
        this.locationCode = locationCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) throws RentalDataException {
        if (branchName == null || branchName.isEmpty()) {
            throw new RentalDataException("Branch name cannot be empty");
        }
        this.branchName = branchName;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) throws RentalDataException {
        if (locationCode == null || locationCode.length() < 3) {
            throw new RentalDataException("Location code must be at least 3 characters");
        }
        this.locationCode = locationCode;
    }
}
