package libraryManagementSystem.Q8;
    public class Book extends Entity {
        private String title;
        private String author;
        private String ISBN; // validation: length >= 10

        public Book(int id, String title, String author, String ISBN) {
            super(id);
            setTitle(title);
            setAuthor(author);
            setISBN(ISBN);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            if (title == null || title.isBlank()) throw new IllegalArgumentException("title cannot be empty");
            this.title = title;
            touchUpdated();
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            if (author == null || author.isBlank()) throw new IllegalArgumentException("author cannot be empty");
            this.author = author;
            touchUpdated();
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            if (ISBN == null || ISBN.length() < 10) throw new IllegalArgumentException("ISBN must be >= 10 chars");
            this.ISBN = ISBN;
            touchUpdated();
        }

        @Override
        public String toString() {
            return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", ISBN='" + ISBN + '\'' + "} " + super.toString();
        }
    }

