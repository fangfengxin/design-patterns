package observer.weather;

public class WeatherStation {
    public static void main(String[] args) {
        // 建立一个 WeatherData 对象
        WeatherData weatherData = new WeatherData();
        // 建立三个布告板，将 WeatherData 对象传给它们
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        // 模拟新的气象测量
        weatherData.setMeasurements(80, 65, 30.4);
        weatherData.setMeasurements(82, 70, 29.2);
        weatherData.setMeasurements(78, 90, 29.2);
    }
}
