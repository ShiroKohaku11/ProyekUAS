package cinema.model;

//import cinema.model.Film;

//import java.util.Scanner;

public class Film {
    private String title;
    private int duration; // in minutes
    private String genre;
    private String rating;
    private boolean status; // active or inactive

    public Film(String title, int duration, String genre, String rating, boolean status) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.rating = rating;
        this.status = status;
    }

    // Getter & Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Toggle the status of the film
    public void toggleStatus() {
        this.status = !this.status;
    }
}
