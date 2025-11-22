package libraryManagementSystem.Q8;
    public class Fine extends Entity {
        private double fineAmount; // per-day or total depending on design; here interpreted as per-day
        private int daysLate;
        private Payment payment; // may be null until paid

        public Fine(int id, double fineAmount, int daysLate) {
            super(id);
            setFineAmount(fineAmount);
            setDaysLate(daysLate);
        }

        public double getFineAmount() {
            return fineAmount;
        }

        public void setFineAmount(double fineAmount) {
            if (fineAmount < 0) throw new IllegalArgumentException("fineAmount must be >= 0");
            this.fineAmount = fineAmount;
            touchUpdated();
        }

        public int getDaysLate() {
            return daysLate;
        }

        public void setDaysLate(int daysLate) {
            if (daysLate < 0) throw new IllegalArgumentException("daysLate must be >= 0");
            this.daysLate = daysLate;
            touchUpdated();
        }

        public Payment getPayment() {
            return payment;
        }

        public void setPayment(Payment payment) {
            this.payment = payment;
            touchUpdated();
        }

        /**
         * Convenience: compute total for this fine (per-day * daysLate)
         */
        public double totalFine() {
            return fineAmount * daysLate;
        }

        @Override
        public String toString() {
            return "Fine{" + "fineAmount=" + fineAmount + ", daysLate=" + daysLate + ", paid=" + (payment != null) + "} " + super.toString();
        }
    }

