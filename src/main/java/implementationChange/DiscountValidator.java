package implementationChange;

import jdk.jshell.spi.ExecutionControl;

public class DiscountValidator {
    private final Price price;
    public DiscountValidator(Price price) {
        this.price = price;
    }

    public boolean hasDiscountMoreThan100() {
        return price.value >= 100;
    }
}
