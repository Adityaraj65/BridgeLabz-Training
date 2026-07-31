package day1;

import java.util.Scanner;

public class JavaStringToken {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String s = sc.nextLine().trim();
        // if string is empty simply return 0
        if(s.isEmpty()){
            System.out.println(0);
            return;
            
        }
        //splitting string 
        String[] arr=s.split("[^A-Za-z]+");
        System.out.println(arr.length);
        for(String a:arr){
            System.out.println(a);
        }
        sc.close();
    }
}

