package onlineShoppingSystem.Q10;

    public class Payment extends Entity {
        private String paymentMethod;
        private String paymentStatus;

        public Payment(int id, String createdDate, String updatedDate,
                       String paymentMethod, String paymentStatus) {

            super(id, createdDate, updatedDate);

            if (paymentMethod.isEmpty() || paymentStatus.isEmpty())
                throw new IllegalArgumentException("Payment fields must not be empty");

            this.paymentMethod = paymentMethod;
            this.paymentStatus = paymentStatus;
        }
    }


