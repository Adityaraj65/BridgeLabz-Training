import java.util.Scanner;
public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a =sc.nextInt();
        System.out.println("Enter number 2 :");
        int b=sc.nextInt();
        System.out.println(lcm(a,b));
        System.out.println(gcd(a, b));
    }
    public static int lcm(int a, int b){
        int res=Math.max(a,b);
        while(true){
            if(res%a==0&&res%b==0){
                break;
            }res++;
        }
        return res;
    }
    public static int gcd(int a,int b){
        return a*b/lcm(a, b);
    }
}
