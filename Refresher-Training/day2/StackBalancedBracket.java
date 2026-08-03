package day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    // Write your code here
    Stack<Character> stack=new Stack<>();
    for(Character ch:s.toCharArray()){
        if(ch=='('||ch=='{'||ch=='['){
            stack.push(ch);
        }else if(ch==')'||ch=='}'||ch==']'){
            if(stack.isEmpty()){
                return "NO";
            }
            char top=stack.pop();
            if(!isMatch(top,ch)){
                return "NO";
            }
        }
    }
     if(stack.isEmpty()){
        return "YES";
        
     }else{
        return "NO";
     }
    }
    public static boolean isMatch(char open , char close){
        return (open=='('&&close==')')||(open=='{'&&close=='}')||(open=='['&&close==']');
    }

}

public class StackBalancedBracket {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
