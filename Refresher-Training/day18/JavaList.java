package day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<N;i++){
            int m=sc.nextInt();
            list.add(m);
        }
        int Q=sc.nextInt();
        for(int i=0;i<Q;i++){
            String str=sc.next();
            if(str.equals("Insert")){
                int a=sc.nextInt();
                int b=sc.nextInt();
                list.add(a,b);
            }else{
                int x=sc.nextInt();
                list.remove(x);
            }
        }
        for(int i=0;i<list.size()-1;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.print(list.get(list.size()-1));
    }
}

