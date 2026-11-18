import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductCalculationsTest {

    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calculations = new ProductCalculations(3500.0);
        double expectedVat = 525.0;
        double actualVat = calculations.GetVat();
        assertEquals(expectedVat, actualVat, 0.01);
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calculations = new ProductCalculations(3500.0);
        double expectedTotal = 4200.0;
        double actualTotal = calculations.GetTotal();
        assertEquals(expectedTotal, actualTotal, 0.01);
    }
}


