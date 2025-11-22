package airlineTicketingSystem.Q9;

    public class Payment extends Entity {
        private String paymentDate;
        private String paymentMode;

        public Payment(int id, String createdDate, String updatedDate,
                       String date, String mode) {
            super(id, createdDate, updatedDate);
            setPaymentDate(date);
            setPaymentMode(mode);
        }

        public void setPaymentDate(String d) {
            if (d.isEmpty()) throw new IllegalArgumentException("Payment date cannot be empty");
            this.paymentDate = d;
        }

        public void setPaymentMode(String m) {
            if (m.isEmpty()) throw new IllegalArgumentException("Payment mode cannot be empty");
            this.paymentMode = m;
        }
    }


