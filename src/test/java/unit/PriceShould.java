package unit;

import implementationChange.Price;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PriceShould {
    @Test
    public void cannot_be_negative() throws Exception {
        var exception = assertThrows(ArithmeticException.class, () -> new Price(-1));
        Assertions.assertEquals("Price cannot be negative", exception.getMessage());
    }
}
