import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int operation1=a+b*c; //computing operation1
        int operation2=a*b+c;  //computing operation2
        int operation3=c+a/b;  //computing operation3
        int operation4=a%b+c; // computing operatio4;
        System.out.println("The result of Int Operation are"+operation1+","+operation2+","+operation3+" and "+operation4);
    }
}
