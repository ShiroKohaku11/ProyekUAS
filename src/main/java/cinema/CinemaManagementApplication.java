package cinema;

import cinema.model.Film;
import cinema.model.User;
import cinema.service.AuthService;
import cinema.service.FilmService;

public class CinemaManagementApplication {
    public static void main(String[] args) {
        User admin = new User("admin", "password123");
        AuthService authService = new AuthService(admin);

        if (authService.login("admin", "password123")) {
            System.out.println("User logged in successfully!");

            FilmService filmService = new FilmService();
            Film film = new Film("Inception", 148, "Sci-Fi", "PG-13", true);
            filmService.addFilm(film);

            System.out.println("Films available:");
            filmService.listFilms().forEach(f -> System.out.println(f.getTitle()));
        } else {
            System.out.println("Invalid credentials!");
        }
    }
}


//public class CinemaManagementApplication {
//    public static <Film> void main(String[] args) {
//        User admin = new User("admin", "password123");
//        AuthService authService = new AuthService(admin);
//
//        if (authService.login("admin", "password123")) {
//            System.out.println("User logged in successfully!");
//
//            FilmService filmService = new FilmService();
//            Film film = new Film("Inception", 148, "Sci-Fi", "PG-13", true);
//            filmService.addFilm(film);
//
//            System.out.println("Films available:");
//            filmService.listFilms().forEach(f -> System.out.println(f.getTitle()));
//        } else {
//            System.out.println("Invalid credentials!");
//        }
//    }
//}
