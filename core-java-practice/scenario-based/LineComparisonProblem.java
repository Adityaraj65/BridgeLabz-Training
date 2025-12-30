import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Conputation Program");
        //create scanner object
        Scanner sc =  new Scanner(System.in);
        //taking input for the first coordinate
        System.out.println("enter coordinates for 1st line");
        System.out.println("Enter x1 co-ordinate");
        double x1=sc.nextDouble();
        
        System.out.println("Enter y1 co-ordinate");
        double y1=sc.nextDouble();
        System.out.println("Enter x2 co-ordinate");
        double x2=sc.nextDouble();
        System.out.println("Enter y2 co-ordinates");
        double y2=sc.nextDouble();
        //taking input for 2nd coordinate
            
        System.out.println("enter coordinates for 2nd line to compute UC2 and UC3 ");
        System.out.println("Enter x3 co-ordinate");
        double x3=sc.nextDouble();
        System.out.println("Enter y3 co-ordinate");
        double y3=sc.nextDouble();
        System.out.println("Enter x4 co-ordinate");
        double x4=sc.nextDouble();
        System.out.println("Enter y4 co-ordinates");
        double y4=sc.nextDouble();
       // calling length method to compute length of 2 points
        Double lengthOfLine1=length(x1, y1, x2, y2);
        Double lengthOfLine2=length(x3,y3,x4,y4);

        // printing the result of UC1
        System.out.println("result of UC1 :");
        System.out.println("Length of 2 points(x1,y1)and (x2,y2) is "+lengthOfLine1);
        

        //uc2
        boolean equality=lineEquality(lengthOfLine1,lengthOfLine2);
        System.out.println("Result of UC2 :");
        if (equality) {
            System.out.println("Line are equal ");
            
        }else{
            System.out.println("Line are not equal");
        }
        

        //uc 3
        int result = checkEqualGreaterOrLess(lengthOfLine1, lengthOfLine2);
        System.out.println("Result of UC3 :");
        if (result == 0) {
           System.out.println("Both lines are equal");
        } else if (result > 0) {
             System.out.println("First line is greater than second line");
        } else {
            System.out.println("First line is less than second line");
        }

    }

    //UC 1: method to calculate length of 2 points 
    static double length(double x1,double y1,double x2,double y2){
        double lengthOfLine=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1), 2));
        return lengthOfLine;

    }
    //UC2 :method to check line equality
    static boolean lineEquality(Double length1,Double length2){
        return length1.equals(length2);
    }

    //UC3: method to check 2 lines are eual greater or less 
    static int  checkEqualGreaterOrLess(Double length1,Double length2){
        return length1.compareTo(length2);
    }
}
