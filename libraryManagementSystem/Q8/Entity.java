package libraryManagementSystem.Q8;

import java.time.LocalDateTime;

public class Entity {
        private int id;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;

        public Entity(int id) {
            setId(id);
            this.createdDate = LocalDateTime.now();
            this.updatedDate = LocalDateTime.now();
        }

        public int getId() {
            return id;
        }

        public final void setId(int id) {
            if (id <= 0) throw new IllegalArgumentException("id must be > 0");
            this.id = id;
            touchUpdated();
        }

        public LocalDateTime getCreatedDate() {
            return createdDate;
        }

        protected void setCreatedDate(LocalDateTime createdDate) {
            this.createdDate = createdDate;
        }

        public LocalDateTime getUpdatedDate() {
            return updatedDate;
        }

        protected void touchUpdated() {
            this.updatedDate = LocalDateTime.now();
        }

        @Override
        public String toString() {
            return "Entity{id=" + id + ", created=" + createdDate + ", updated=" + updatedDate + '}';
        }
    }

