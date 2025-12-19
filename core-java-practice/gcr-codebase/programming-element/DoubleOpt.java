import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value a :");
        double a =sc.nextDouble();
        System.out.println("Enter value b");
        double b=sc.nextDouble();
        System.out.println("Enter value c");
        double c=sc.nextDouble();
        double operation1=a+b*c; //computing operation1
        double operation2=a*b+c;  //computing operation2
        double operation3=c+a/b;  //computing operation3
        double operation4=a%b+c;   //computing operation4
        System.out.println("The result of Int Operation are"+operation1+","+operation2+","+operation3 +"and"+operation4);
    }
}

