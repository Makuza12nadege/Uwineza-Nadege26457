package hotelReservationSystem.Q4;

import java.time.LocalDate;

public class Payment extends Service {
    private String paymentMethod;
    private LocalDate paymentDate;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate,
                   String serviceName, double serviceCost,
                   String paymentMethod, LocalDate paymentDate)
            throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost);
        if (paymentMethod == null || paymentMethod.isEmpty()) {
            throw new HotelDataException("Payment method cannot be empty");
        }
        if (paymentDate == null) {
            throw new HotelDataException("Payment date cannot be null");
        }
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) throws HotelDataException {
        if (paymentMethod == null || paymentMethod.isEmpty()) {
            throw new HotelDataException("Payment method cannot be empty");
        }
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) throws HotelDataException {
        if (paymentDate == null) {
            throw new HotelDataException("Payment date cannot be null");
        }
        this.paymentDate = paymentDate;
    }
}
