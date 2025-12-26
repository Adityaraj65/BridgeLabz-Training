import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] arr= new double[10][3];
        for(int i=0;i<10;i++){
            System.out.println("Enter the weight of "+(i+1)+" in kg :");
            double weight=sc.nextDouble();
            arr[i][0]=weight;
            System.out.println("Enter the height of "+(i+1)+" in cm :");
            double height=sc.nextDouble();
            double heightInMeter=height/100;
            arr[i][1]=heightInMeter;
            
        }
        String[] status=bmiCalculator(arr);
       System.out.println("\nWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    arr[i][0] + "\t" +
                    arr[i][1] + "\t" +
                    String.format("%.2f", arr[i][2]) + "\t" +
                    status[i]
            );
        }    

    }
    static String[] bmiCalculator(double[][] arr){
        String bmiStatus[]= new String[arr.length];
        for(int i=0;i<arr.length;i++){
            double bmi=(arr[i][0]/(arr[i][1]*arr[i][1]));
            arr[i][2]=bmi;
            if (bmi <= 18.4) {
                bmiStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                bmiStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obese";
            }
        }
        return bmiStatus;
        
    }
}
