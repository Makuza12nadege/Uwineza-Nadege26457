package onlineShoppingSystem.Q10;

    public class Invoice extends Entity {
        private double totalAmount;

        public Invoice(int id, String createdDate, String updatedDate, double totalAmount) {
            super(id, createdDate, updatedDate);

            if (totalAmount <= 0)
                throw new IllegalArgumentException("Total amount must be > 0");

            this.totalAmount = totalAmount;
        }

        public double getTotalAmount() {
            return totalAmount;
        }
    }


