package junit;

public class StringUtils {

    // reverse given string
    public String reverse(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }
    // check palindrome
    public boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    // convert to uppercase
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
