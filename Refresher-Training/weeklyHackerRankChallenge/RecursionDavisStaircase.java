package weeklyHackerRankChallenge;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class RecursionDavisStaircase {
	 public static int stepPerms(int n) {
		    int[] dp = new int[n + 1];
		    dp[0] = 1;
		    if (n >= 1) {
				dp[1] = 1;
			}
		    if (n >= 2) {
				dp[2] = 2;
			}
		    for (int i = 3; i <= n; i++) {
		        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		    }
		    return dp[n];
		}
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, s).forEach(sItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int res = stepPerms(n);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
