package onlineShoppingSystem.Q10;

public class Entity {
        protected int id;
        protected String createdDate;
        protected String updatedDate;

        public Entity(int id, String createdDate, String updatedDate) {
            if (id <= 0) throw new IllegalArgumentException("ID must be > 0");
            this.id = id;
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
        }

        public int getId() { return id; }
    }


