package hotelReservationSystem.Q4;

import java.time.LocalDate;

public class Booking extends Customer {
    private LocalDate bookingDate;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Booking(int id, LocalDate createdDate, LocalDate updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate)
            throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber);
        if (bookingDate == null || checkInDate == null || checkOutDate == null) {
            throw new HotelDataException("Booking and stay dates cannot be null");
        }
        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) throws HotelDataException {
        if (bookingDate == null) {
            throw new HotelDataException("Booking date cannot be null");
        }
        this.bookingDate = bookingDate;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) throws HotelDataException {
        if (checkInDate == null) {
            throw new HotelDataException("Check-in date cannot be null");
        }
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) throws HotelDataException {
        if (checkOutDate == null) {
            throw new HotelDataException("Check-out date cannot be null");
        }
        this.checkOutDate = checkOutDate;
    }
}
