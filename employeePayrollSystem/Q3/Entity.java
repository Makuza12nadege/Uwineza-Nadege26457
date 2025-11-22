package employeePayrollSystem.Q3;

import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws PayrollDataException {
        if (id <= 0) {
            throw new PayrollDataException("Id must be greater than 0");
        }
        if (createdDate == null || updatedDate == null) {
            throw new PayrollDataException("Dates cannot be null");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws PayrollDataException {
        if (id <= 0) {
            throw new PayrollDataException("Id must be greater than 0");
        }
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) throws PayrollDataException {
        if (createdDate == null) {
            throw new PayrollDataException("Created date cannot be null");
        }
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) throws PayrollDataException {
        if (updatedDate == null) {
            throw new PayrollDataException("Updated date cannot be null");
        }
        this.updatedDate = updatedDate;
    }
}
