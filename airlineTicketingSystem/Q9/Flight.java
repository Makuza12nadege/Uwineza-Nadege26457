package airlineTicketingSystem.Q9;
    public class Flight extends Entity {
        private String flightNumber;
        private String destination;
        private String departureTime;

        public Flight(int id, String createdDate, String updatedDate,
                      String flightNumber, String destination, String departureTime) {
            super(id, createdDate, updatedDate);
            setFlightNumber(flightNumber);
            setDestination(destination);
            setDepartureTime(departureTime);
        }

        public void setFlightNumber(String f) {
            if (f.isEmpty()) throw new IllegalArgumentException("Flight number cannot be empty");
            this.flightNumber = f;
        }

        public void setDestination(String d) {
            if (d.isEmpty()) throw new IllegalArgumentException("Destination cannot be empty");
            this.destination = d;
        }

        public void setDepartureTime(String dt) {
            if (dt.isEmpty()) throw new IllegalArgumentException("Departure time cannot be empty");
            this.departureTime = dt;
        }
    }

