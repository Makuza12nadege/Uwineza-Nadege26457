package airlineTicketingSystem.Q9;
    public class Invoice extends Entity {
        private double totalFare;

        public Invoice(int id, String createdDate, String updatedDate, double totalFare) {
            super(id, createdDate, updatedDate);
            setTotalFare(totalFare);
        }

        public void setTotalFare(double fare) {
            if (fare <= 0) throw new IllegalArgumentException("Total fare must be > 0");
            this.totalFare = fare;
        }

        public double getTotalFare() {
            return totalFare;
        }
    }


