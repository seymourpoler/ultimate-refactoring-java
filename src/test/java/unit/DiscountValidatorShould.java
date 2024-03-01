package unit;

import implementationChange.DiscountValidator;
import implementationChange.Price;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiscountValidatorShould {

    @Test
    public void not_have_discount() throws Exception {
        var discountValidator = new DiscountValidator(new Price(0));
        Assertions.assertEquals(false, discountValidator.hasDiscount100());
    }

    @Test
    public void have_discount() throws Exception {
        var discountValidator = new DiscountValidator(new Price(100));
        Assertions.assertEquals(true, discountValidator.hasDiscount100());
    }
}
