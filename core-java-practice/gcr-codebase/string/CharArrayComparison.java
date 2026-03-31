// String level1 question no 3.
import java.util.Scanner;

public class CharArrayComparison {

    // User-defined method to return characters without toCharArray()
    static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    static boolean compareCharArrays(char[] a, char[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char[] manualArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareCharArrays(manualArray, builtInArray);

        System.out.println("Both character arrays are equal: " + result);

        sc.close();
    }
}

