package hotelReservationSystem.Q4;

import java.time.LocalDate;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;

    public Service(int id, LocalDate createdDate, LocalDate updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate,
                   String serviceName, double serviceCost)
            throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate);
        if (serviceName == null || serviceName.isEmpty()) {
            throw new HotelDataException("Service name cannot be empty");
        }
        if (serviceCost <= 0) {
            throw new HotelDataException("Service cost must be greater than 0");
        }
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) throws HotelDataException {
        if (serviceName == null || serviceName.isEmpty()) {
            throw new HotelDataException("Service name cannot be empty");
        }
        this.serviceName = serviceName;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) throws HotelDataException {
        if (serviceCost <= 0) {
            throw new HotelDataException("Service cost must be greater than 0");
        }
        this.serviceCost = serviceCost;
    }
}
