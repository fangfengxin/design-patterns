package observer.weather;

public class ForecastDisplay implements Observer, DisplayElement {
	private double currentPressure;  
	private double lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(double temp, double humidity, double pressure) {
        lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same.");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather.");
		}
	}
}
