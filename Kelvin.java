package temperatureConverter;

public class Kelvin {
	private double kelvin;

	public Kelvin(double kelvin) {
		this.kelvin = kelvin;
	}

	public double getKelvin() {
		return kelvin;
	}

	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}
	
	public double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}
	
	public double kelvinToFahrenheit(double kelvin) {
		return kelvinToCelsius(kelvin) * 1.8000 + 32;
	}
}
