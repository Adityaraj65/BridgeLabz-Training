public class ProfitLoss {
    public static void main(String[] args) {
        int costprice=129;
        int sellingprice=191;
        int profit=sellingprice-costprice; //calculating profit.
        double ProfitPercentage=(profit/(double)costprice)*100; //calculating profit percentage
        System.out.println("The Cost price is INR"+costprice+"and selling price is INR"+sellingprice);
        System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+ProfitPercentage);

    }
}
