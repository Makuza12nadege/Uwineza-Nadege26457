package airlineTicketingSystem.Q9;
    public class Airline extends Entity {
        private String airlineName;
        private String address;
        private String contactEmail;

        public Airline(int id, String createdDate, String updatedDate,
                       String airlineName, String address, String contactEmail) {
            super(id, createdDate, updatedDate);
            this.airlineName = airlineName;
            this.address = address;
            setContactEmail(contactEmail);
        }

        public void setContactEmail(String email) {
            if (!email.contains("@")) throw new IllegalArgumentException("Invalid email!");
            this.contactEmail = email;
        }
    }

