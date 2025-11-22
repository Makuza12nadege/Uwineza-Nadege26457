package hotelReservationSystem.Q4;

import java.time.LocalDate;

public class Bill extends Payment {
    private double roomCharge;
    private double serviceCharge;
    private double totalBill;

    public Bill(int id, LocalDate createdDate, LocalDate updatedDate,
                String hotelName, String address, String phoneNumber, String email,
                String roomNumber, String roomType, double pricePerNight,
                String customerName, String customerEmail, String contactNumber,
                LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate,
                String serviceName, double serviceCost,
                String paymentMethod, LocalDate paymentDate,
                double roomCharge, double serviceCharge, double totalBill)
            throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost,
                paymentMethod, paymentDate);
        if (roomCharge <= 0 || serviceCharge <= 0 || totalBill <= 0) {
            throw new HotelDataException("Bill amounts must be greater than 0");
        }
        this.roomCharge = roomCharge;
        this.serviceCharge = serviceCharge;
        this.totalBill = totalBill;
    }

    public double getRoomCharge() {
        return roomCharge;
    }

    public void setRoomCharge(double roomCharge) throws HotelDataException {
        if (roomCharge <= 0) {
            throw new HotelDataException("Room charge must be greater than 0");
        }
        this.roomCharge = roomCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) throws HotelDataException {
        if (serviceCharge <= 0) {
            throw new HotelDataException("Service charge must be greater than 0");
        }
        this.serviceCharge = serviceCharge;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) throws HotelDataException {
        if (totalBill <= 0) {
            throw new HotelDataException("Total bill must be greater than 0");
        }
        this.totalBill = totalBill;
    }
}
