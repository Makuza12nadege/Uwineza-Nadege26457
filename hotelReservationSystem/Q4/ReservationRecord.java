package hotelReservationSystem.Q4;

import java.time.LocalDate;

public final class ReservationRecord extends Feedback {

    public ReservationRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                             String hotelName, String address, String phoneNumber, String email,
                             String roomNumber, String roomType, double pricePerNight,
                             String customerName, String customerEmail, String contactNumber,
                             LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate,
                             String serviceName, double serviceCost,
                             String paymentMethod, LocalDate paymentDate,
                             double roomCharge, double serviceCharge,
                             int rating, String comments)
            throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost,
                paymentMethod, paymentDate,
                roomCharge, serviceCharge,
                roomCharge + serviceCharge,
                rating, comments);
    }

    public double generateBill() {
        return getRoomCharge() + getServiceCharge();
    }
}
