package implementationChange;


public class LocalCartClient {

    public static void main(String[] args) {
        var shoppingCart = new ShoppingCart();
        shoppingCart.add(new Price(10));
        System.out.println("shoppingCart.numberOfProducts() = " + shoppingCart.numberOfProducts());
        System.out.println("shoppingCart.calculateTotalPrice() = " + shoppingCart.calculateTotalPrice());
        System.out.println("shoppingCart.hasDiscount() = " + shoppingCart.hasDiscount());
    }
}
