package junit;

public class UserRegistration {

    // register user
    public void registerUser(String username, String email, String password) {

        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("invalid username");
        }

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("invalid email");
        }

        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("invalid password");
        }
    }
}

