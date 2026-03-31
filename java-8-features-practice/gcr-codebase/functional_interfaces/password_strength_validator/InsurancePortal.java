package functional_interfaces.password_strength_validator;

public class InsurancePortal {

    public static void main(String[] args) {

        String password = "Secure@123";
        // Calling static method using interface name
        boolean isValid = SecurityUtils.isStrongPassword(password);
        if (isValid) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak.");
        }
    }
}

