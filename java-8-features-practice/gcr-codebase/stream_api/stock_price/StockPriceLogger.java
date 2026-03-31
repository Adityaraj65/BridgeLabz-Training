package stream_api.stock_price;

import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        // creating list of stock prices
        List<Double> stockPrices = new ArrayList<>();
        stockPrices.add(2450.50);
        stockPrices.add(2475.75);
        stockPrices.add(2460.00);
        stockPrices.add(2488.25);
        stockPrices.add(2501.90);

        // printing stock price updates
        stockPrices.forEach(price ->
                System.out.println("Stock Price: " + price)
        );
    }
}

