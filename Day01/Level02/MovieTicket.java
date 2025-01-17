class MovieTicket {
    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null; // Initially, no seat is booked
        this.price = 0.0;       // Initially, the price is 0
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        if (this.seatNumber != null) {
            System.out.println("Seat " + this.seatNumber + " is already booked.");
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket booked successfully for '" + movieName + "' at seat " + seatNumber + " for $" + price);
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (seatNumber != null) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("No ticket booked for the movie '" + movieName + "'.");
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket("Interstellar");

        // Display ticket details before booking
        ticket.displayTicketDetails();

        // Book the ticket
        ticket.bookTicket("A12", 15.50);

        // Display ticket details after booking
        ticket.displayTicketDetails();

        // Try booking the same ticket again
        ticket.bookTicket("B15", 20.00);
    }
}

