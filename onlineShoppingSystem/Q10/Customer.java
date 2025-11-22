package onlineShoppingSystem.Q10;

    public class Customer extends Entity {
        private String customerName;
        private String contactNumber;
        private String address;

        public Customer(int id, String createdDate, String updatedDate,
                        String customerName, String contactNumber, String address) {

            super(id, createdDate, updatedDate);

            if (customerName.isEmpty() || contactNumber.isEmpty() || address.isEmpty())
                throw new IllegalArgumentException("Fields cannot be empty");

            this.customerName = customerName;
            this.contactNumber = contactNumber;
            this.address = address;
        }
    }


