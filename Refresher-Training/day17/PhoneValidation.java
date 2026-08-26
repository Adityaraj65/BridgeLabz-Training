package day17;

import java.util.Scanner;

public class PhoneValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String phone = sc.nextLine();
        System.out.println(isValidPhone(phone));
    }

    public static boolean isValidPhone(String phone) {
        return phone.matches("^(\\+\\d{1,3}[- .]?)?\\(?\\d{3}\\)?[- .]?\\d{3}[- .]?\\d{4}$");
    }
}