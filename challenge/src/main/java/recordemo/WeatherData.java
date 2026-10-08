package recordemo;

import java.nio.file.Watchable;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
   public double temperatureFahrenheit() {
       return (temperatureCelsius*9/5+32);
  }

    // Instance method to get a formatted summary string
    public String getSummary() {
       return ("Current weather:"+temperatureCelsius+"°C("+temperatureFahrenheit()+"°F) and "+conditions);
   }

   // Static factory method to create a WeatherData record from Fahrenheit
   public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
      double temperatureCelsius= 5*(tempFahrenheit-32)/9;
      WeatherData weatherData= new WeatherData(temperatureCelsius,conditions);
      return weatherData;
  }
  public static void main(String[] args) {
       //the instance method
      WeatherData weatherData= new WeatherData(25.0,"Sunny");
      System.out.println(weatherData.getSummary());
      //the static factory method
      System.out.println(WeatherData.fromFahrenheit(50,"Cloudy").getSummary());


   }
}
