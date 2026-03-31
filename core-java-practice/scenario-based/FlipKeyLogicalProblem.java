import java.util.Scanner;

public class FlipKeyLogicalProblem {
    // method given in question
    public static String CleanseAndInvert(String input) {
        // null or length check
        if (input == null || input.length() < 6) {
            return "";
        }
        // allow only alphabets
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // anything other than A-Z or a-z is invalid
            if (!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z')) {
                return "";
            }
        }
        // convert to lowercase as per requirement
        input = input.toLowerCase();
        StringBuilder temp = new StringBuilder();
        // remove characters with even ASCII values
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // keep only odd ASCII characters
            if ((int) ch % 2 != 0) {
                temp.append(ch);
            }
        }
        // reverse remaining characters
        temp.reverse();
        // convert even index characters to uppercase
        for (int i = 0; i < temp.length(); i++) {
            if (i % 2 == 0) {
                temp.setCharAt(i,
                        Character.toUpperCase(temp.charAt(i)));
            }
        }
        return temp.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();
        String result = CleanseAndInvert(input);
        if (result.isEmpty()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + result);
        }
        sc.close();
    }
}

