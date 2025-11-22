package libraryManagementSystem.Q8;

    public final class LibraryRecord extends Record {

        public LibraryRecord(int id, double totalFine) {
            super(id, totalFine);
        }

        public double calculateFine(Fine fine) {
            if (fine == null) throw new IllegalArgumentException("fine cannot be null");
            double computed = fine.getFineAmount() * fine.getDaysLate();
            if (computed <= 0) throw new IllegalArgumentException("calculated fine must be > 0");
            setTotalFine(computed); // uses Record validation (totalFine > 0)
            return computed;
        }

        @Override
        public String toString() {
            return "LibraryRecord{" + "totalFine=" + getTotalFine() + "} " + super.toString();
        }
    }
