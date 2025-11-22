package libraryManagementSystem.Q8;
    public class Record extends Entity {
        private double totalFine;

        public Record(int id, double totalFine) {
            super(id);
            setTotalFine(totalFine);
        }

        public double getTotalFine() {
            return totalFine;
        }

        public void setTotalFine(double totalFine) {
            if (totalFine <= 0) throw new IllegalArgumentException("totalFine must be > 0");
            this.totalFine = totalFine;
            touchUpdated();
        }

        @Override
        public String toString() {
            return "Record{totalFine=" + totalFine + "} " + super.toString();
        }
    }

