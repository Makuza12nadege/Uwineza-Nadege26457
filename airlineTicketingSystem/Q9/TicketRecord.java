package airlineTicketingSystem.Q9;

    public final class TicketRecord {
        private Ticket ticket;
        private Baggage baggage;

        public TicketRecord(Ticket ticket, Baggage baggage) {
            this.ticket = ticket;
            this.baggage = baggage;
        }

        public double generateInvoice() {
            return ticket.getPrice() + baggage.getBaggageFee();
        }
    }


