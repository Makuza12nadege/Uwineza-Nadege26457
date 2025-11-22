package airlineTicketingSystem.Q9;

public class Entity {
        protected int id;
        protected String createdDate;
        protected String updatedDate;

        public Entity(int id, String createdDate, String updatedDate) {
            setId(id);
            this.createdDate = createdDate;
            this.updatedDate = updatedDate;
        }

        public void setId(int id) {
            if (id <= 0) throw new IllegalArgumentException("ID must be > 0");
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }


