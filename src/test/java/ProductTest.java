import com.DLDev.Chefcito.models.Product;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

	@Test
    public void testtoCamelCaseWithOnlyName() {
        Product producto = new Product("leche");
        String expectedOutput = "Product [name=Leche, stringUnit=null, unit=null, format=null]";
        assertEquals(expectedOutput, producto.toString());
    }

    @Test
    public void testtoCamelCaseWithNameAndUnit() {
        Product producto2 = new Product("LeCHe", "Litre");
        String expectedOutput = "Product [name=Leche, stringUnit=LITRE, unit=null, format=null]";
        assertEquals(expectedOutput, producto2.toString());
    }
}
