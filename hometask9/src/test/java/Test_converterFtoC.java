import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class Test_converterFtoC {
    private double expected;
    private double value;
    private double delta;

    public Test_converterFtoC(double expected, double value, double delta) {
        this.expected = expected;
        this.value = value;
        this.delta = delta;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {-5.556, 22.0, 0.001},
                {0.0, 32.0, 0.001}
        });
    }

    TemperatureConverter result = new TemperatureConverter();

    @Test
    public void converterFtoC() {assertEquals(expected, result.convertFtoC(value),delta);}
}