package onlineShoppingSystem.Q10;

    public class Order extends Entity {
        private String orderDate;
        private String orderId;

        public Order(int id, String createdDate, String updatedDate,
                     String orderDate, String orderId) {

            super(id, createdDate, updatedDate);

            if (orderDate.isEmpty() || orderId.isEmpty())
                throw new IllegalArgumentException("Order fields must not be empty");

            this.orderDate = orderDate;
            this.orderId = orderId;
        }
    }


