import java.util.Scanner;

public class LexicalTwist {

    // check if character is vowel
    static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();

        // validation: only one word allowed
        if (first.contains(" ")) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String second = sc.nextLine();

        if (second.contains(" ")) {
            System.out.println(second + " is an invalid word");
            return;
        }

        // reverse first word
        String reversed = new StringBuilder(first).reverse().toString();

        // CASE 1: second word is reverse of first (case-insensitive)
        if (reversed.equalsIgnoreCase(second)) {

            StringBuilder result = new StringBuilder();

            // reverse already done, now transform
            for (char ch : reversed.toLowerCase().toCharArray()) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    result.append('@');
                } else {
                    result.append(ch);
                }
            }

            System.out.println(result.toString());
        }

        // CASE 2: not a reverse
        else {

            String combined = (first + second).toUpperCase();

            int vowels = 0, consonants = 0;

            // count vowels and consonants
            for (char ch : combined.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    if (isVowel(ch)) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            // track printed characters (A-Z)
            boolean[] used = new boolean[26];
            StringBuilder output = new StringBuilder();

            // vowels more
            if (vowels > consonants) {
                for (char ch : combined.toCharArray()) {
                    if (isVowel(ch) && !used[ch - 'A']) {
                        output.append(ch);
                        used[ch - 'A'] = true;
                    }
                    if (output.length() == 2) break;
                }
                System.out.println(output.toString());
            }

            // consonants more
            else if (consonants > vowels) {
                for (char ch : combined.toCharArray()) {
                    if (!isVowel(ch) && ch >= 'A' && ch <= 'Z' && !used[ch - 'A']) {
                        output.append(ch);
                        used[ch - 'A'] = true;
                    }
                    if (output.length() == 2) break;
                }
                System.out.println(output.toString());
            }

            // equal
            else {
                System.out.println("Vowels and consonants are equal");
            }
        }

        sc.close();
    }
}
