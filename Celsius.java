package temperatureConverter;

public class Celsius {
	private double celsius;
	
	public Celsius(double celsius) {
		this.celsius = celsius;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double celsiusToFahrenheit(double celsius) {
		return celsius * 1.8 + 32;
	}
	
	public double celsiusToKelvin(double celsius) {
		return celsius + 273.15;
	}
}
