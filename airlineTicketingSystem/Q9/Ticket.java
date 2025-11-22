package airlineTicketingSystem.Q9;

    public class Ticket extends Entity {
        private String ticketNumber;
        private double price;

        public Ticket(int id, String createdDate, String updatedDate,
                      String ticketNumber, double price) {
            super(id, createdDate, updatedDate);
            setTicketNumber(ticketNumber);
            setPrice(price);
        }

        public void setTicketNumber(String n) {
            if (n.isEmpty()) throw new IllegalArgumentException("Ticket number cannot be empty");
            this.ticketNumber = n;
        }

        public void setPrice(double price) {
            if (price <= 0) throw new IllegalArgumentException("Price must be > 0");
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }


