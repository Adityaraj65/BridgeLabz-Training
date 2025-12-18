import java.util.Scanner;
public class HarryAge {
    public static void main(String[] args) {
        int birthyear=2000;
        Scanner sc = new Scanner(System.in);
        int currentyear=sc.nextInt(); //taking current year as input
        int currentage=currentyear-birthyear; // calculating current age of Harry
        System.out.println("Harry's age in 2024 is "+currentage);
    }
}
