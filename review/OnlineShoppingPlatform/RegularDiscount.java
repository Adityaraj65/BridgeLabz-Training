package OnlineShoppingPlatform;

public class RegularDiscount implements Discount {
    @Override
    public double calculatePriceById(double amount) {
        return amount * 0.80; // 20% discount
    }
}
