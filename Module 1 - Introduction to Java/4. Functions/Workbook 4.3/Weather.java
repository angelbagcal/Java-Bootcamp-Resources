public class Weather {
    public static void main(String[] args) {
        double noon = 77.0;          //temperature at noon in fahrenheit.
        double evening = 61.0;       //temperature during the evening in fahrenheit
        double midnight = 55.0;      //temperature at midnight in fahrenheit
        
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
        
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0)*5.0/9.0;
        
    }
    
    public static void printTemperatures(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("F: " + String.format("%.1f", fahrenheit));
        System.out.println("C: " + String.format("%.1f",celsius));
        System.out.println();
    }
}
