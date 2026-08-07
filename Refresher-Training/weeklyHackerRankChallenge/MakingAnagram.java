package weeklyHackerRankChallenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class MakingAnagram {
	public static int makeAnagram(String a, String b) {
	    // Write your code here
	    HashMap<Character,Integer>map=new HashMap<>();
	    for(int i=0;i<a.length();i++){
	        char ch=a.charAt(i);
	        map.put(ch, map.getOrDefault(ch, 0)+1);
	    }
	    for(int j=0;j<b.length();j++){
	        char ch=b.charAt(j);
	        map.put(ch,map.getOrDefault(ch, 0)-1);
	    }
	    int count=0;
	    for (int value : map.values()) {
	        count += Math.abs(value);
	    }
	    return count;

	    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

