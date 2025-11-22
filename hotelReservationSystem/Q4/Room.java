package hotelReservationSystem.Q4;

import java.time.LocalDate;

public class Room extends Hotel {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, LocalDate createdDate, LocalDate updatedDate,
                String hotelName, String address, String phoneNumber, String email,
                String roomNumber, String roomType, double pricePerNight)
            throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);
        if (roomNumber == null || roomNumber.isEmpty()) {
            throw new HotelDataException("Room number cannot be empty");
        }
        if (roomType == null || roomType.isEmpty()) {
            throw new HotelDataException("Room type cannot be empty");
        }
        if (pricePerNight <= 0) {
            throw new HotelDataException("Price per night must be greater than 0");
        }
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) throws HotelDataException {
        if (roomNumber == null || roomNumber.isEmpty()) {
            throw new HotelDataException("Room number cannot be empty");
        }
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) throws HotelDataException {
        if (roomType == null || roomType.isEmpty()) {
            throw new HotelDataException("Room type cannot be empty");
        }
        this.roomType = roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) throws HotelDataException {
        if (pricePerNight <= 0) {
            throw new HotelDataException("Price per night must be greater than 0");
        }
        this.pricePerNight = pricePerNight;
    }
}
