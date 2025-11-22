package libraryManagementSystem.Q8;

import java.time.LocalDate;
import java.util.Objects;

public class Borrow extends Entity {
        private LocalDate borrowDate;
        private LocalDate returnDate;
        private Book book;
        private Member member;
        private Fine fine; // may be null until calculated

        public Borrow(int id, LocalDate borrowDate, LocalDate returnDate, Book book, Member member) {
            super(id);
            setBorrowDate(borrowDate);
            setReturnDate(returnDate);
            setBook(book);
            setMember(member);

            // link back: add this borrow to member
            this.member.addBorrow(this);
        }

        public LocalDate getBorrowDate() {
            return borrowDate;
        }

        public void setBorrowDate(LocalDate borrowDate) {
            if (borrowDate == null) throw new IllegalArgumentException("borrowDate cannot be null");
            this.borrowDate = borrowDate;
            touchUpdated();
        }

        public LocalDate getReturnDate() {
            return returnDate;
        }

        public void setReturnDate(LocalDate returnDate) {
            if (returnDate == null) throw new IllegalArgumentException("returnDate cannot be null");
            this.returnDate = returnDate;
            touchUpdated();
        }

        public Book getBook() {
            return book;
        }

        public void setBook(Book book) {
            if (book == null) throw new IllegalArgumentException("book cannot be null");
            this.book = book;
            touchUpdated();
        }

        public Member getMember() {
            return member;
        }

        public void setMember(Member member) {
            if (member == null) throw new IllegalArgumentException("member cannot be null");
            this.member = member;
            touchUpdated();
        }

        public Fine getFine() {
            return fine;
        }

        public void setFine(Fine fine) {
            this.fine = fine;
            touchUpdated();
        }

        @Override
        public String toString() {
            return "Borrow{" + "borrowDate=" + borrowDate + ", returnDate=" + returnDate +
                    ", book=" + book.getTitle() + ", member=" + member.getMemberName() +
                    ", fine=" + (fine == null ? "none" : fine.getFineAmount()) + "} " + super.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Borrow)) return false;
            Borrow borrow = (Borrow) o;
            return getId() == borrow.getId();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId());
        }
    }

