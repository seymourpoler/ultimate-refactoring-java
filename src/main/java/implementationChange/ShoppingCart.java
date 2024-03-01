package implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Price> prices = new ArrayList<>();

    public void add(Price price) {
        this.prices.add(price);
    }

    public int numberOfProducts() {
        return prices.size();
    }

    public int calculateTotalPrice() {
        return prices.stream().mapToInt(price -> price.value).sum();
    }

    public boolean hasDiscount() {
       return calculateTotalPrice() >= 100;
    }
}
