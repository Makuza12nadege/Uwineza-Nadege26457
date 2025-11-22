package realEstateManagementSystem.Q7;

import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws RealEstateDataException {
        if (id <= 0) {
            throw new RealEstateDataException("Id must be greater than 0");
        }
        if (createdDate == null || updatedDate == null) {
            throw new RealEstateDataException("Dates cannot be null");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws RealEstateDataException {
        if (id <= 0) {
            throw new RealEstateDataException("Id must be greater than 0");
        }
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) throws RealEstateDataException {
        if (createdDate == null) {
            throw new RealEstateDataException("Created date cannot be null");
        }
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) throws RealEstateDataException {
        if (updatedDate == null) {
            throw new RealEstateDataException("Updated date cannot be null");
        }
        this.updatedDate = updatedDate;
    }
}
