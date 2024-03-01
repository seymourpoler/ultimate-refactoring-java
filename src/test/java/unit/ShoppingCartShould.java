package unit;

import implementationChange.Price;
import implementationChange.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartShould {

    @Test
    public void count_number_of_products_2() throws Exception {
        var shoppingCart = new ShoppingCart();

        shoppingCart.add(new Price(10));

        Assert.assertEquals(1, shoppingCart.numberOfProducts());
    }

    @Test
    public void more_than_one_product() throws Exception {
        var shoppingCart = new ShoppingCart();

        shoppingCart.add(new Price(10));
        shoppingCart.add(new Price(20));

        Assert.assertEquals(2, shoppingCart.numberOfProducts());
    }

    @Test
    public void calculate_total_price2() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.add(new Price(10));

        Assert.assertEquals(10, shoppingCart.calculateTotalPrice());
    }

    @Test
    public void calculate_total_price_with_more_than_one_product() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.add(new Price(10));
        shoppingCart.add(new Price(20));

        Assert.assertEquals(30, shoppingCart.calculateTotalPrice());
    }

    @Test
    public void know_when_is_discount_applicable2() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Price(100));

        Assert.assertTrue(shoppingCart.hasDiscount());
    }

    @Test
    public void no_discount_applicable() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Price(99));

        Assert.assertFalse(shoppingCart.hasDiscount());
    }
}
