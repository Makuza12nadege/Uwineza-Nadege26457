package airlineTicketingSystem.Q9;

    public class Passenger extends Entity {
        private String passengerName;
        private String passportNumber;
        private String nationality;

        public Passenger(int id, String createdDate, String updatedDate,
                         String name, String passport, String nationality) {
            super(id, createdDate, updatedDate);
            setPassengerName(name);
            setPassportNumber(passport);
            this.nationality = nationality;
        }

        public void setPassengerName(String name) {
            if (name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
            this.passengerName = name;
        }

        public void setPassportNumber(String p) {
            if (p.isEmpty()) throw new IllegalArgumentException("Passport cannot be empty");
            this.passportNumber = p;
        }
    }

