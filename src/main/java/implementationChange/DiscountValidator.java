package implementationChange;

public class DiscountValidator {

    private final Price price;
    public DiscountValidator(Price price) {
        this.price = price;
    }

    public boolean hasDiscountMoreThan100() {
        final int DISCOUNT_100 = 100;
        return price.isMoreOrEqualThan(new Price(DISCOUNT_100));
    }
}
