import java.util.Scanner;

public class LongestWord{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Longest word: " + longestWord);

        sc.close();
    }
}

