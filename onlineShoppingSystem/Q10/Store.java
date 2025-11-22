package onlineShoppingSystem.Q10;

    public class Store extends Entity {
        private String storeName;
        private String address;
        private String email;

        public Store(int id, String createdDate, String updatedDate,
                     String storeName, String address, String email) {

            super(id, createdDate, updatedDate);

            if (!email.contains("@"))
                throw new IllegalArgumentException("Invalid email");

            this.storeName = storeName;
            this.address = address;
            this.email = email;
        }
    }


