package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualStacks {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();
	    int n3 = sc.nextInt();

	    List<Integer> h1 = new ArrayList<>();
	    List<Integer> h2 = new ArrayList<>();
	    List<Integer> h3 = new ArrayList<>();

	    for (int i = 0; i < n1; i++) {
	        h1.add(sc.nextInt());
	    }

	    for (int i = 0; i < n2; i++) {
	        h2.add(sc.nextInt());
	    }

	    for (int i = 0; i < n3; i++) {
	        h3.add(sc.nextInt());
	    }

	    int result = equalStacks(h1, h2, h3);
	    System.out.println(result);

	    sc.close();
	}
	public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sumh1=sum(h1);
        int sumh2=sum(h2);
        int sumh3=sum(h3);
        while(true){
            if(sumh1==sumh2&& sumh1==sumh3){
            return sumh1;
           }if(sumh1>=sumh2&&sumh1>=sumh3){
            sumh1=sumh1-h1.remove(0);
           }else if(sumh2>=sumh1&&sumh2>=sumh3){
            sumh2=sumh2-h2.remove(0);
           }else if(sumh3>=sumh1&&sumh3>=sumh2){
            sumh3=sumh3-h3.remove(0);
           }
        }
        
    
    }
    public static int sum(List<Integer> h){
        int sum=0;
        for(int i=0;i<h.size();i++){
            sum+=h.get(i);
        }
        return sum;
    }
}
