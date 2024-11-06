package cinema.service;

import cinema.model.Film;

import java.util.ArrayList;
import java.util.List;

public class FilmService {
    private List<Film> films = new ArrayList<>();

    public void addFilm(Film film) {
        films.add(film);
    }

    public void editFilm(Film film, String newTitle, int newDuration, String newGenre, String newRating) {
        film = new Film(newTitle, newDuration, newGenre, newRating, film.isStatus());
    }

    public void toggleFilmStatus(Film film) {
        film.toggleStatus();
    }

    public List<Film> listFilms() {
        return films;
    }
}
