package OnlineShoppingPlatform;

public class EmployeeDiscount implements Discount {
    @Override
    public double calculatePriceById(double amount) {
        return amount * 0.70; // 30% discount
    }
}
