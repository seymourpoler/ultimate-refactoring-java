package implementationChange;

public class ExternalCartClient {
    public String formattedTotalPrice(int price) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Price(price));
        return String.format(
                "Total price is %d euro",
                shoppingCart.calculateTotalPrice());
    }
}
