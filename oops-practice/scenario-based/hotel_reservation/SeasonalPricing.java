package hotel_reservation;

// Price changes based on season
public class SeasonalPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double basePrice, int days) {
        // Example: 20% extra charge in peak season
        return basePrice * days * 1.2;
    }
}

