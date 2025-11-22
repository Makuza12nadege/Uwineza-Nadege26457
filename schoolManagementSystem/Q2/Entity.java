package schoolManagementSystem.Q2;

import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws SchoolDataException {
        if (id <= 0) {
            throw new SchoolDataException("Id must be greater than 0");
        }
        if (createdDate == null || updatedDate == null) {
            throw new SchoolDataException("Dates cannot be null");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws SchoolDataException {
        if (id <= 0) {
            throw new SchoolDataException("Id must be greater than 0");
        }
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) throws SchoolDataException {
        if (createdDate == null) {
            throw new SchoolDataException("Created date cannot be null");
        }
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) throws SchoolDataException {
        if (updatedDate == null) {
            throw new SchoolDataException("Updated date cannot be null");
        }
        this.updatedDate = updatedDate;
    }
}
