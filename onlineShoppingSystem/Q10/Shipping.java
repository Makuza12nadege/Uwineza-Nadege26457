package onlineShoppingSystem.Q10;

    public class Shipping extends Entity {
        private String shippingAddress;
        private double shippingCost;

        public Shipping(int id, String createdDate, String updatedDate,
                        String shippingAddress, double shippingCost) {

            super(id, createdDate, updatedDate);

            if (shippingCost < 0)
                throw new IllegalArgumentException("Shipping cost must be ≥ 0");

            this.shippingAddress = shippingAddress;
            this.shippingCost = shippingCost;
        }

        public double getShippingCost() { return shippingCost; }
    }


