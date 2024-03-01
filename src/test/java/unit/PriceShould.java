package unit;

import implementationChange.Price;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PriceShould {
    @Test
    public void cannot_be_negative() throws Exception {
        var exception = assertThrows(ArithmeticException.class, () -> new Price(-1));

        Assertions.assertEquals("Price cannot be negative", exception.getMessage());
    }

    @Test
    public void create_a_price_with_value() throws Exception {
        var price = new Price(10);

        Assertions.assertNotNull(price);
        Assert.assertEquals(10, price.value);
    }
}
