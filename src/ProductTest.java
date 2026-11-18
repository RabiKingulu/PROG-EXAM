import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void GetTotalProductsSold_WithValidData_ReturnsCorrectValue() {
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = {
                {25, 18, 20},
                {15, 10, 12},
                {18, 15, 20}
        };
        Product product = new Product(products, sales);
        assertEquals(153, product.GetTotalProductsSold());
    }

    @Test
    public void GetAverageProductsSold_WithValidData_ReturnsCorrectValue() {
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = {
                {25, 18, 20},
                {15, 10, 12},
                {18, 15, 20}
        };
        Product product = new Product(products, sales);
        assertEquals(17.0, product.GetAverageProductsSold(), 0.01);
    }
}
