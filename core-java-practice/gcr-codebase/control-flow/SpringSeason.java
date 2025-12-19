import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month in digit");
        int month=sc.nextInt();
        System.out.println("Enter days");
        int day=sc.nextInt();
        // checking input is in spring season range or not 
        boolean isSpring=(month==3&& day>=20)||(month==4)||(month==5)||(month==6)&&(day<=20);
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        sc.close();
    }
}
