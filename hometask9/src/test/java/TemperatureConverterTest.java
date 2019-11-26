import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {
        TemperatureConverter result = new TemperatureConverter();

    @Test
    public void convertFtoC() {
        assertEquals(-5.556, result.convertFtoC(22.0),0.001);
    }

    @Test
    public void convertCtoF() {
        assertEquals(130.100, result.convertCtoF(54.5),0.001);
    }

    @Test
    public void convertCtoK() {
        assertEquals(0.050, result.convertCtoK(-273.15),0.001);
    }

    @Test
    public void convertKtoC() {
        assertEquals(-173.200, result.convertKtoC(100.0),0.001);
    }

    @Test
    public void convertFtoK() {
        assertEquals(360.389, result.convertFtoK(189.0),0.001);
    }

    @Test
    public void convertKtoF() {
        assertEquals(-459.700, result.convertKtoF(0.0),0.001);
    }

    @Test (expected = RuntimeException.class)
    public void convertKtoCNegative()throws RuntimeException {
        assertEquals(-173.200, result.convertKtoC(-20.0),0.001);
    }

    @Test (expected = RuntimeException.class)
    public void convertKtoFNegative() throws RuntimeException {
        assertEquals(-459.700, result.convertKtoF(-350.0),0.001);
    }

    @Test (expected = RuntimeException.class)
    public void convertCtoKNegative()throws RuntimeException {
        assertEquals(-0.1, result.convertCtoK(-273.3),0.001);
    }

    @Test (expected = RuntimeException.class)
    public void convertFtoKNegative()throws RuntimeException {
        assertEquals(-0.0111, result.convertFtoK(-459.72),0.001);
    }
}