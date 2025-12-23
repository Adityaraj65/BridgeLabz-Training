import java.util.Scanner;

public class SubstringCompare {

    // Create substring using charAt()
    static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    // Compare two strings using charAt()
    static boolean compareStrings(String a, String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Using charAt()
        String manualSub = createSubstring(text, start, end);

        // Using built-in substring()
        String builtInSub = text.substring(start, end);

        // Compare both substrings
        boolean result = compareStrings(manualSub, builtInSub);

        System.out.println("Substring using charAt(): " + manualSub);
        System.out.println("Substring using substring(): " + builtInSub);
        System.out.println("Both substrings are equal: " + result);

        sc.close();
    }
}
