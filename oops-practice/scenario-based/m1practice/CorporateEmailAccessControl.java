package m1practice;

import java.util.Scanner;

public class CorporateEmailAccessControl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str=sc.nextLine();
            if(str.contains(" ")){
                System.out.println("Access denied");
                return;
            }
            String[] arr=str.split("@");
            String part1=arr[0];
            String part2=arr[1];
            String[] arr1=part1.split("\\.");
            String firstName=arr1[0];
            String secondNameWithDigit=arr1[1];
            String digit=secondNameWithDigit.replaceAll("[^0-9]","");
            String lastName=secondNameWithDigit.replaceAll("[0-9]","");
            String[] arr3=part2.split("\\.");
            String department=arr3[0];
            String domain=arr3[1]+"."+arr3[2];
            if(firstName.matches("[A-Z]")){
                System.out.println("Access Denied");
                continue;
            }
            if(firstName.length()<3&&lastName.length()<3){
                System.out.println("Access Denied");
                continue;
            }
            if(digit.length()<4){
                System.out.println("Access denied");
                continue;
            }
            if(!(department.equals("sales")||department.equals("marketing")||department.equals("IT")||department.equals("product"))){
                System.out.println("Access Denied");
                continue;
            }
            if(!domain.equals("company.com")){
                System.out.println("Access Denied");
                continue;
            }
            System.out.println("access granted");

        }
    }
}
