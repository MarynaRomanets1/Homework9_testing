public class TemperatureConverter {
    public double convertFtoC(double degreesFahrenheit) {
            return (degreesFahrenheit - 32.0) / 9.0 * 5.0;
    }
    public double convertCtoF(double degreesCelsius) {
        return (degreesCelsius / 5.0 * 9.0 + 32.0);
    }
    public double convertCtoK(double degreesCelsius) {
        if (degreesCelsius < -273.2) {
            throw new IllegalArgumentException("C to K: Negative Kelvin degrees are not possible!");
        }
        return (degreesCelsius + 273.2);
    }
    public double convertKtoC(double degreesKelvin) {
        if (degreesKelvin < 0) {
            throw new IllegalArgumentException("K to C: Negative Kelvin degrees are not possible!");
        }
            return (degreesKelvin - 273.2);
    }
    public double convertFtoK(double degreesFahrenheit) {
        if (degreesFahrenheit < -459.71) {
            throw new IllegalArgumentException("F to K: Negative Kelvin degrees are not possible!");
        }
            return ((degreesFahrenheit + 459.7) / 9.0 * 5.0);
    }
    public double convertKtoF(double degreesKelvin) {
        if (degreesKelvin < 0) {
            throw new IllegalArgumentException("K to F: Negative Kelvin degrees are not possible!");
        }
            return (degreesKelvin / 5.0 * 9.0 - 459.7);
    }
}
