public class WordReplacer {

    //  method to replace word 
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        int index = 0;

        while (index < sentence.length()) {
            int matchIndex = 0;

            // Check if oldWord matches at current index
            while (index + matchIndex < sentence.length()
                    && matchIndex < oldWord.length()
                    && sentence.charAt(index + matchIndex) == oldWord.charAt(matchIndex)) {
                matchIndex++;
            }

            // If full word matched, replace it
            if (matchIndex == oldWord.length()) {
                result += newWord;
                index += oldWord.length();
            } else {
                result += sentence.charAt(index);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String sentence = "Java is powerful and Java is popular";
        System.out.println(replaceWord(sentence, "Java", "Python"));
    }
}

