package onlineShoppingSystem.Q10;

public class OrderRecord {

        private Product product;
        private Shipping shipping;

        public OrderRecord(Product product, Shipping shipping) {
            this.product = product;
            this.shipping = shipping;
        }

        // Formula: price + shippingCost
        public double calculateTotalAmount() {
            return product.getPrice() + shipping.getShippingCost();
        }
    }


