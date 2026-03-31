package OnlineShoppingPlatform;

public class PremiumDiscount implements Discount {
    @Override
    public double calculatePriceById(double amount) {
        return amount * 0.60; // 40% discount
    }
}
