package implementationChange;

public class Price {
    public final int value;

    public Price(int value) {
        if(value < 0) {
            throw new ArithmeticException("Price cannot be negative");
        }
        this.value = value;
    }

    public boolean isEqual(Price price) {
        return price.value == value;
    }
}
