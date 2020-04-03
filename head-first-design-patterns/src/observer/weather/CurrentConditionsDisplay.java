package observer.weather;

/**
 * 目前状况布告板，实现了 DisplayElement 接口。
 * 同时实现了 Observer 接口，可以从 WeatherData 对象获得改变。
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private Subject weatherData;

    /**
     * 构造器需要 weatherData 对象作为注册之用。
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 当 update 被调用时，把温度和湿度保存起来，然后调用 display 方法。
     */
    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    /**
     * display 方法把温度和湿度显示出来。
     */
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degree and " + humidity + "% humidity.");
    }
}
