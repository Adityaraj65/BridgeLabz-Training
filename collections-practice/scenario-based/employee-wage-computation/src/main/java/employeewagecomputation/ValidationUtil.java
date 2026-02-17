package employeewagecomputation;

/*
 * Utility class for input validation using Regex
 */
public class ValidationUtil {

    // Company name must start with capital letter and have min 3 characters
    private static final String COMPANY_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

    // Only positive numbers allowed
    private static final String POSITIVE_NUMBER_REGEX = "^[1-9][0-9]*$";

    // Validate company name
    public static void validateCompanyName(String companyName) {
        if (!companyName.matches(COMPANY_NAME_REGEX)) {
            throw new IllegalArgumentException(
                    "Invalid company name: " + companyName
            );
        }
    }

    // Validate numeric values like wage, days, hours
    public static void validatePositiveNumber(int value, String fieldName) {
        if (!String.valueOf(value).matches(POSITIVE_NUMBER_REGEX)) {
            throw new IllegalArgumentException(
                    fieldName + " must be a positive number"
            );
        }
    }
}
