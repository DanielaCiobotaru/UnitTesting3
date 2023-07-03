import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class IsPositiveTest {
    @Test
    public void checkISPositive() {
        IsPositive number = new IsPositive();
        number.isPositive(3.5);
        boolean result = number.isPositive(3.5);
        //System.out.println(result);
        Assertions.assertTrue(result, "ai dat-o in bara");
    }
@Test
    public void checkISPositiveFalse() {
        IsPositive number = new IsPositive();
        number.isPositive(-4.7);
        boolean result = number.isPositive(-4.7);
        Assertions.assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource(doubles = {1.5, 4.6, 8.9, Double.MAX_VALUE})
    public void checkisPositiveParametrezed(double numberFromValues) {
        IsPositive numberToCheck = new IsPositive();
        boolean result = numberToCheck.isPositive(numberFromValues);
        Assertions.assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource (doubles = {-4, -3})
    public void checkNegativeParametrezed (double numberFromValues) {
        IsPositive numberToCheck = new IsPositive();
        boolean result = numberToCheck.isPositive(numberFromValues);
        Assertions.assertTrue(result);
    }
}
