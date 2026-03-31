import java.util.Scanner;
public class PerimeterOfTriangle {
    public static void main(String[] args) {
        // taking scanner as object
        Scanner sc = new Scanner(System.in);
        int perimeter=0;
        //taking input side and calculating perimeter.
        for(int i=0;i<3;i++){
            System.out.println("enter the "+ (i+1)+" side of triangle in metre");
            int side=sc.nextInt();
            perimeter+=side;
        }
        // calculating no of round user need to do 
        int result=calculateRound(perimeter);
        System.out.println("The Number of round user need to do to complete 5 km is "+ result);

    }
        public static int calculateRound(int perimeter){
            int distance=5000;
            int noOfRound=distance/perimeter;
            return noOfRound;
        }
}
