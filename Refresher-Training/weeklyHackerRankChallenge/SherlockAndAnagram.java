package weeklyHackerRankChallenge;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;



public class SherlockAndAnagram {
	 public static int sherlockAndAnagrams(String s) {
		    // Write your code here
		    HashMap<String, Integer> map = new HashMap<>();
		    int totalPairs = 0;
		    for (int i = 0; i < s.length(); i++) {
		        for (int j = i + 1; j <= s.length(); j++) {
		            String sub = s.substring(i, j);
		            char[] charArray = sub.toCharArray();
		            Arrays.sort(charArray);
		            String sortedSub = new String(charArray);
		            int occurrence = map.getOrDefault(sortedSub, 0);
		            totalPairs += occurrence;
		            map.put(sortedSub, occurrence + 1);
		        }
		    }
		    return totalPairs;

		    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
