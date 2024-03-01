package implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Price> prices = new ArrayList<>();

    public void add(Price price) {
        this.prices.add(price);
    }

    public int numberOfProducts() {
        return prices.size();
    }

    public int calculateTotalPrice() {
        return this.getTotalPrice().value;
    }

    public boolean hasDiscount() {
        final int discountThreshold = 100;
       return calculateTotalPrice() >= discountThreshold;
    }

    private Price getTotalPrice() {
        return new Price(prices.stream().mapToInt(price -> price.value).sum());
    }
}
