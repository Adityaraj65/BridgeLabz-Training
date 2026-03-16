package m1practice;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class GlobalShipmentValidator {
    public static boolean isValidCode(String code){
        return code.matches("SHIP-(?!.*(\\d)\\1{3})[1-9][0-9]{5}");

    }
    public static boolean isValidDate(String date){
        try{

            LocalDate parseDate=LocalDate.parse(date);
            int year=parseDate.getYear();
            if(year<2000||year>2099){
                return false;
            }
            return true;
        }catch(DateTimeParseException e){
            return false;
        }

    }
    public static boolean isValidMode(String mode){
        if(mode.equals("AIR")||mode.equals("SEA")||mode.equals("RAIL")||mode.equals("EXPRESS")||mode.equals("FREIGHT")|| mode.equals("ROAD")){
            return true;
        }
        return false;
    }
    public static boolean isValidWeight(String weight){
        return weight.matches("^(0|[1-9]\\d{0,5})(\\.\\d{1,2})?$");
    }
    public static boolean isStatusValid(String str){
        return str.equals("DELIVERED")||str.equals("CANCELLED")||str.equals("IN_TRANSIT");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str= sc.nextLine();

            String[] arr=str.split("\\|");
            String shipCode=arr[0];
            String date=arr[1];
            String mode=arr[2];
            String  weight=arr[3];
            String deliveryStatus=arr[4];
            if(isStatusValid(deliveryStatus)&&isValidMode(mode)&&isValidDate(date)&&isValidCode(shipCode)&&
                    isValidWeight(weight)){
                System.out.println("COMPLIANT RECORD");
            }else{
                System.out.println("NON-COMPLIANT RECORD");
            }
        }


    }
}
