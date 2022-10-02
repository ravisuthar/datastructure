import com.test.Product;
import com.test.ShoppingCartWithTax;
import com.test.ShoppingCartWithoutTax;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    private ShoppingCartWithoutTax unitUnderTest = new ShoppingCartWithoutTax();
    private ShoppingCartWithTax shoppingCartWithTaxTest = new ShoppingCartWithTax();
    private boolean incldueTax;

    @Test
    void addProduct() {
        Product soap = new Product(1, "Dove", 39.99);
        unitUnderTest.addToCart(soap, 5);
        Assertions.assertEquals(199.95, unitUnderTest.getTotalPrice(), 0.2);
    }

    @Test
    void addMoreProduct() {
        Product soap = new Product(1, "Dove", 39.99);
        unitUnderTest.addToCart(soap, 5);
        unitUnderTest.addToCart(soap, 3);
        Assertions.assertEquals(319.92, unitUnderTest.getTotalPrice(), 0.2);
    }

    @Test
    void testTax() {
        Product soap = new Product(1, "Dove", 39.99);
        shoppingCartWithTaxTest.addToCart(soap, 3);
        Assertions.assertEquals(89.98, shoppingCartWithTaxTest.getTotalPrice(), 0.2);
    }

}
