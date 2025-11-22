package airlineTicketingSystem.Q9;

    public class Seat extends Entity {
        private String seatNumber;
        private String seatType;

        public Seat(int id, String createdDate, String updatedDate,
                    String seatNumber, String seatType) {
            super(id, createdDate, updatedDate);
            this.seatNumber = seatNumber;
            setSeatType(seatType);
        }

        public void setSeatType(String type) {
            if (!type.equals("Economy") && !type.equals("Business"))
                throw new IllegalArgumentException("Seat type must be Economy or Business");
            this.seatType = type;
        }
    }


