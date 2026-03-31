import java.util.Scanner;
public class CountVowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        s = s.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // ensures only alphabets
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels count: " + vowelCount);
        System.out.println("Consonants count : " + consonantCount);

        sc.close();
    }
}

