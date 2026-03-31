package functional_interfaces.password_strength_validator;

public interface SecurityUtils {

    // Static method to validate password strength
    static boolean isStrongPassword(String password) {
        // Null check to avoid runtime exception
        if (password == null) {
            return false;
        }
        // Minimum length check
        if (password.length() < 8) {
            return false;
        }
        //At least one uppercase letter
        boolean hasUpperCase = password.matches(".*[A-Z].*");
        // At least one lowercase letter
        boolean hasLowerCase = password.matches(".*[a-z].*");
        // At least one digit
        boolean hasDigit = password.matches(".*[0-9].*");
        // At least one special character
        boolean hasSpecialChar = password.matches(".*[^a-zA-Z0-9].*");
        // Password is strong only if all rules are satisfied
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }
}

