public class Main {
    public static void main(String[] args) {
        TemperatureConverter counter =  new TemperatureConverter();
        double result;
        result = counter.convertFtoC(22.0);
        System.out.print("F to C: ");
        System.out.printf("%6.3f", result);
        System.out.println();
        System.out.print("C to F: ");
        result = counter.convertCtoF(54.5);
        System.out.printf("%6.3f", result);
        System.out.println();
        try {
            result = counter.convertCtoK(-273.15);
            System.out.print("C to K: ");
            System.out.printf("%6.3f", result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            result = counter.convertKtoC(-5.000);
            System.out.print("K to C: ");
            System.out.printf("%6.3f" , result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            result = counter.convertFtoK(189.0);
            System.out.print("F to K: ");
            System.out.printf("%6.3f", result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            result = counter.convertKtoF(-350.0);
            System.out.print("K to F: ");
            System.out.printf("%6.3f", result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
