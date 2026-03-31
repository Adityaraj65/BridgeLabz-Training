import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter base of triangle ");
        int base =sc.nextInt();
        System.out.println("Enter height of triangle :");
        int height=sc.nextInt();
        double areaInInch=0.5*base*height;  // area of triangle in square inches.
        double heightInCm=height*2.54;
        double baseInCm=base*2.54;
        double AreaInCm=0.5*heightInCm*baseInCm; // area of triangle in square centimetre
        System.out.println("Area of traingle with height "+height+" and base "+base+" in square inches is "+areaInInch+"and area in cm is "+AreaInCm);
        sc.close();
    }
}
