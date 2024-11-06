package cinema.model;

import java.time.LocalDateTime;

public class Ticket {
    private Film film;
    private LocalDateTime showTime;
    private String seatNumber;
    private double price;

    public Ticket(Film film, LocalDateTime showTime, String seatNumber, double price) {
        this.film = film;
        this.showTime = showTime;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void printTicket() {
        System.out.println("Ticket for " + film + " at " + showTime + ", Seat: " + seatNumber + ", Price: " + price);
    }
}
