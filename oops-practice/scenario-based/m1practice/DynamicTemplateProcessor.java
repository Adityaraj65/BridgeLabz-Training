package m1practice;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DynamicTemplateProcessor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str=sc.nextLine();
            System.out.println(processLine(str));


        }
    }
    public static String processLine(String line){
        Pattern pattern=Pattern.compile("\\$\\{(.*?):(.*?)\\}");
        Matcher m=pattern.matcher(line);
        StringBuffer result=new StringBuffer();
        while(m.find()){
            String type=m.group(1);
            String value=m.group(2);
            String replacement=process(type,value);
            m.appendReplacement(result,replacement);

        }
        m.appendTail(result);
        return result.toString();
    }
    public static String process(String type,String value ){
        switch(type){
            case "UPPER":
                return value.toUpperCase();
            case "LOWER":
                return value.toLowerCase();
            case "DATE":
                return formatDate(value);
            case "REPEAT":
                return repeat(value);
            default:
                return "INVALID";
        }

    }
    public static String formatDate(String value){
        try{
            String[] arr=value.split("-");
            int days=Integer.parseInt(arr[0]);
            int month=Integer.parseInt(arr[1]);
            int year=Integer.parseInt(arr[2]);
            if(days<1||days>31||month<1||month>12){
                return "INVALID";
            }
            return String.format("%04d/%02d/%02d",year,month,days);
        }catch(Exception e){
            return "INVALID";
        }


    }
    public static String repeat(String value) {
        try {
            String[] parts = value.split(",");
            if (parts.length != 2) return "INVALID";

            String word = parts[0];
            int count = Integer.parseInt(parts[1]);

            if (count < 0) return "INVALID";

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count; i++) {
                sb.append(word);
            }

            return sb.toString();

        } catch (Exception e) {
            return "INVALID";
        }
    }
}

