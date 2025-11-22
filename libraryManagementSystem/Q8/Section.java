package libraryManagementSystem.Q8;

import java.util.ArrayList;
import java.util.List;

    public class Section extends Entity {
        private String sectionName;
        private String sectionCode;
        private final List<Book> books = new ArrayList<>();

        public Section(int id, String sectionName, String sectionCode) {
            super(id);
            setSectionName(sectionName);
            setSectionCode(sectionCode);
        }

        public String getSectionName() {
            return sectionName;
        }

        public void setSectionName(String sectionName) {
            if (sectionName == null || sectionName.isBlank())
                throw new IllegalArgumentException("sectionName cannot be empty");
            this.sectionName = sectionName;
            touchUpdated();
        }

        public String getSectionCode() {
            return sectionCode;
        }

        public void setSectionCode(String sectionCode) {
            if (sectionCode == null || sectionCode.length() < 3)
                throw new IllegalArgumentException("sectionCode must be at least 3 characters");
            this.sectionCode = sectionCode;
            touchUpdated();
        }

        public List<Book> getBooks() {
            return books;
        }

        public void addBook(Book b) {
            if (b == null) throw new IllegalArgumentException("book cannot be null");
            books.add(b);
            touchUpdated();
        }

        public void removeBook(Book b) {
            books.remove(b);
            touchUpdated();
        }

        @Override
        public String toString() {
            return "Section{" + "name='" + sectionName + '\'' + ", code='" + sectionCode + '\'' +
                    ", books=" + books.size() + "} " + super.toString();
        }
    }

