package hotelReservationSystem.Q4;

import java.time.LocalDate;

public class Feedback extends Bill {
    private int rating;
    private String comments;

    public Feedback(int id, LocalDate createdDate, LocalDate updatedDate,
                    String hotelName, String address, String phoneNumber, String email,
                    String roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber,
                    LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate,
                    String serviceName, double serviceCost,
                    String paymentMethod, LocalDate paymentDate,
                    double roomCharge, double serviceCharge, double totalBill,
                    int rating, String comments)
            throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost,
                paymentMethod, paymentDate,
                roomCharge, serviceCharge, totalBill);
        if (rating < 1 || rating > 5) {
            throw new HotelDataException("Rating must be between 1 and 5");
        }
        this.rating = rating;
        this.comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) throws HotelDataException {
        if (rating < 1 || rating > 5) {
            throw new HotelDataException("Rating must be between 1 and 5");
        }
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
