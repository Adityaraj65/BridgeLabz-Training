public class PenDistribution {
    public static void main(String[] args) {
        int pens=14;
        int student=3;
        int PenQuantity=pens/student;  //calculating pen quantity
        int RemainingPen=pens%student;  // calculating remaining pen after distribution
        System.out.println("The Pen Per Student is "+PenQuantity+"and the remaining  pen distribution is "+RemainingPen);
    }
}
