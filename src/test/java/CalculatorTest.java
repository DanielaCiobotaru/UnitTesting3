import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setUp(){
        System.out.println("BeforeEach is executed");
        calculator = new Calculator();
    }
    @Test
    public void checksum(){
        Calculator calculator = new Calculator();
        double result = calculator.sum(4.5, 2.3);
        Assertions.assertEquals(6.8, "Incorect");
    }
    @Test
    public void checksubstaction() {
        Calculator calculator = new Calculator();
        double result = calculator.substract(10, 5);
    }
    @Test
public void checkdivision() {
        Calculator calculator = new Calculator();
        double result = calculator.division(12, 3);
    }
    @Test
    public void checkmodulo() {
        Calculator calculator = new Calculator();
        double result = calculator.division(7, 5);
    }
}
