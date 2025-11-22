package libraryManagementSystem.Q8;

import java.time.LocalDate;

public class Payment extends Entity {
        private LocalDate paymentDate;
        private String paymentMode; // e.g., Cash, Mobile Money, Card
        private double amount;

        public Payment(int id, LocalDate paymentDate, String paymentMode, double amount) {
            super(id);
            setPaymentDate(paymentDate);
            setPaymentMode(paymentMode);
            setAmount(amount);
        }

        public LocalDate getPaymentDate() {
            return paymentDate;
        }

        public void setPaymentDate(LocalDate paymentDate) {
            if (paymentDate == null) throw new IllegalArgumentException("paymentDate cannot be null");
            this.paymentDate = paymentDate;
            touchUpdated();
        }

        public String getPaymentMode() {
            return paymentMode;
        }

        public void setPaymentMode(String paymentMode) {
            if (paymentMode == null || paymentMode.isBlank()) throw new IllegalArgumentException("paymentMode cannot be empty");
            this.paymentMode = paymentMode;
            touchUpdated();
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            if (amount < 0) throw new IllegalArgumentException("amount cannot be negative");
            this.amount = amount;
            touchUpdated();
        }

        @Override
        public String toString() {
            return "Payment{" + "date=" + paymentDate + ", mode='" + paymentMode + '\'' + ", amount=" + amount + "} " + super.toString();
        }
    }


