package day18;

import java.util.Scanner;
import java.util.Stack;
public class JavaStackProblem{
	public static boolean isBalanced(String input){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<input.length();i++){
                
                if(input.charAt(i)=='{'||input.charAt(i)=='('
                ||input.charAt(i)=='['){
                    s.push(input.charAt(i));
                }else if(input.charAt(i)==')'
                ||input.charAt(i)==']'
                ||input.charAt(i)=='}'){
                    if(s.isEmpty()){
                        return false;
                    }else{
                       if( isMatching(input.charAt(i), s.peek())){
                            s.pop();
                        }
                    }
                }
                
            }
            if(s.isEmpty()){
                return true;
           }else{
              return false;
           }
    }
    public static boolean isMatching(char c,char top){
        return (c==')'&& top=='(')
                ||(c==']'&& top=='[')
                ||(c=='}'&& top=='{');
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println(isBalanced(input));
            
            
            
            
		}
        
		
	}
    
}



