package onlineShoppingSystem.Q10;

    public class Category extends Entity {
        private String categoryName;
        private String categoryCode;

        public Category(int id, String createdDate, String updatedDate,
                        String categoryName, String categoryCode) {

            super(id, createdDate, updatedDate);

            if (categoryCode.length() < 3)
                throw new IllegalArgumentException("Category Code must be ≥ 3 chars");

            this.categoryName = categoryName;
            this.categoryCode = categoryCode;
        }
    }


