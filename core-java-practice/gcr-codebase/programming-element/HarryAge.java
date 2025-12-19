import java.util.Scanner;
public class HarryAge {
    public static void main(String[] args) {
        int birthyear=2000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current year :");
        int currentYear=sc.nextInt(); //taking current year as input
        int currentAge=currentYear-birthyear; // calculating current age of Harry
        System.out.println("Harry's age in 2024 is "+currentAge);
    }
}
