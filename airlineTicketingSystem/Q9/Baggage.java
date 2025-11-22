package airlineTicketingSystem.Q9;

    public class Baggage extends Entity {
        private double baggageWeight;
        private double baggageFee;

        public Baggage(int id, String createdDate, String updatedDate,
                       double baggageWeight, double baggageFee) {
            super(id, createdDate, updatedDate);
            setBaggageWeight(baggageWeight);
            setBaggageFee(baggageFee);
        }

        public void setBaggageWeight(double w) {
            if (w < 0) throw new IllegalArgumentException("Weight cannot be negative");
            this.baggageWeight = w;
        }

        public void setBaggageFee(double f) {
            if (f < 0) throw new IllegalArgumentException("Fee cannot be negative");
            this.baggageFee = f;
        }

        public double getBaggageFee() {
            return baggageFee;
        }
    }

