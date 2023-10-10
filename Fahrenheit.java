package temperatureConverter;

public class Fahrenheit {
	private double fahrenheit;

	public Fahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}
	
	public double fahrenheitToKelvin(double fahrenheit) {
		return fahrenheitToCelsius(fahrenheit) + 273.15;
	}
}
