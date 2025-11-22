package onlineShoppingSystem.Q10;


    public class Product extends Entity {
        private String productName;
        private String productCode;
        private double price;

        public Product(int id, String createdDate, String updatedDate,
                       String productName, String productCode, double price) {

            super(id, createdDate, updatedDate);

            if (price <= 0)
                throw new IllegalArgumentException("Price must be > 0");

            this.productName = productName;
            this.productCode = productCode;
            this.price = price;
        }

        public double getPrice() { return price; }
    }


