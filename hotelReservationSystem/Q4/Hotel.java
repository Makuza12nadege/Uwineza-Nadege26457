package hotelReservationSystem.Q4;

import java.time.LocalDate;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hotel(int id, LocalDate createdDate, LocalDate updatedDate,
                 String hotelName, String address, String phoneNumber, String email)
            throws HotelDataException {
        super(id, createdDate, updatedDate);
        if (hotelName == null || hotelName.isEmpty()) {
            throw new HotelDataException("Hotel name cannot be empty");
        }
        if (address == null || address.isEmpty()) {
            throw new HotelDataException("Address cannot be empty");
        }
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new HotelDataException("Phone number must be 10 digits");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new HotelDataException("Invalid email format");
        }
        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) throws HotelDataException {
        if (hotelName == null || hotelName.isEmpty()) {
            throw new HotelDataException("Hotel name cannot be empty");
        }
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws HotelDataException {
        if (address == null || address.isEmpty()) {
            throw new HotelDataException("Address cannot be empty");
        }
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws HotelDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new HotelDataException("Phone number must be 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws HotelDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new HotelDataException("Invalid email format");
        }
        this.email = email;
    }
}
