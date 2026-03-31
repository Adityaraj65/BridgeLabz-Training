package document.redaction.engine;
import java.util.Scanner;
public class DocumentProcessor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<5;i++){
            String str=sc.nextLine();
            System.out.println(performOperation(str));

        }
    }
    public static String performOperation(String str){
        String line=str;
        line =line.replaceAll("ID:[A-Z]{3}[0-9]{6}","xxx******");
        line =line.replaceAll("ACCT-\\d{4}-\\d{4}-(\\d{4})","ACCT---$1");
        line=line.replaceAll("(?i)\\b(\\w+)\\s+\\1\\b","$1");
        line =line.replaceAll("([!?.])\\1{2,}$","$1");
        return line;
    }
}
