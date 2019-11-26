import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class Test_neg_converterKtoC {
    private double expected;
    private double value;
    private double delta;

    public Test_neg_converterKtoC(double expected, double value, double delta) {
        this.expected = expected;
        this.value = value;
        this.delta = delta;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {-173.2, -20, 0.001}
        });
    }

    TemperatureConverter result = new TemperatureConverter();

    @Test (expected = RuntimeException.class)
    public void convertKtoCNegative()throws RuntimeException {
        assertEquals(expected, result.convertKtoC(value),delta);
    }
}


