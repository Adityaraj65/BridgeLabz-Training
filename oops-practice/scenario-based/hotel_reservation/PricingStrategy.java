package hotel_reservation;

// Different pricing logic can be applied
public interface PricingStrategy {
    double calculatePrice(double basePrice, int days);
}
