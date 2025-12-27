import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            boolean isDuplicate = false;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == ch) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result = result + ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}


