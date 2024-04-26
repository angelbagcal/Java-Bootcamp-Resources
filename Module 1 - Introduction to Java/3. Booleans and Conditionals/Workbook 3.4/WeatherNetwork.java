public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 25;  

        String forecast = "";
        
        if (temp >= 25) {
            forecast = "It's warm. Go outside!";
        } else if (temp > 25 && temp < 0) {
            forecast = "The forecast is Chilly. Wear a coat!";
        } else if (temp >= 0) {
            forecast = "The forecast is FREEZING! Stay home!";
        }
        //IF - ELSE IF - ELSE STATEMENTS HERE!
        
        
        System.out.println(forecast);
    }
}
