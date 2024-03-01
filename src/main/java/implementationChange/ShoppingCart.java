package implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int price;
    private List<Price> prices = new ArrayList<>();

    public void add(int price) {
        this.price = price;
    }

    public void add(Price price) {
        this.prices.add(price);
    }

    public int numberOfProducts() {
        return 1;
    }

    public int productsNumber() {
        return prices.size();
    }

    public int calculateTotalPrice() {
        return prices.stream().mapToInt(price -> price.value).sum();
    }

    public boolean hasDiscount() {
       return calculateTotalPrice() >= 100;
    }
}
