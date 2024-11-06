package cinema.service;

import cinema.model.User;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AuthServiceTest {

    @Test
    public void testLogin() {
        User user = new User("admin", "password123");
        AuthService authService = new AuthService(user);
        assertTrue(authService.login("admin", "password123"));
    }
}
