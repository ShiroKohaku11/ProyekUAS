package cinema.service;

import cinema.model.User;

public class AuthService {
    private User user;

    public AuthService(User user) {
        this.user = user;
    }

    public boolean login(String username, String password) {
        return user.login(username, password);
    }

    public void logout() {
        user.logout();
    }
}
