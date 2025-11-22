package hotelReservationSystem.Q4;

import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws HotelDataException {
        if (id <= 0) {
            throw new HotelDataException("Id must be greater than 0");
        }
        if (createdDate == null || updatedDate == null) {
            throw new HotelDataException("Dates cannot be null");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws HotelDataException {
        if (id <= 0) {
            throw new HotelDataException("Id must be greater than 0");
        }
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) throws HotelDataException {
        if (createdDate == null) {
            throw new HotelDataException("Created date cannot be null");
        }
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) throws HotelDataException {
        if (updatedDate == null) {
            throw new HotelDataException("Updated date cannot be null");
        }
        this.updatedDate = updatedDate;
    }
}
