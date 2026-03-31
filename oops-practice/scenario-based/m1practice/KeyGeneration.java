package m1practice;

import java.util.Scanner;

public class KeyGeneration {
    public static String validateString(String str) {
        if(str.length()==0){
            return "Invalid Input (empty string)";
        }
        if(str.length()<6){
            return "Invalid Input (length < 6)";
        }
        if(str.contains(" ")){
            return "Invalid Input (contains space)";
        }
        if(str.matches(".*[0-9].*")){
            return "Invalid Input (contains digits)";
        }

        if(!str.matches("[A-Za-z]+")){
            return "Invalid Input (contains special character)";
        }
        String lowerCase=str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<lowerCase.length();i++){
            char ch=lowerCase.charAt(i);
            if(ch%2!=0){
                sb.append(ch);
            }
        }
        if(sb.isEmpty()){
            return "Invalid Input (empty string)";
        }
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            if(i%2==0){
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            }

        }
       return "The generated key is - "+sb.toString();


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str=sc.nextLine();
            System.out.println(validateString(str));
        }
    }
}
