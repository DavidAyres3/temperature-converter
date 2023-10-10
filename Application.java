package temperatureConverter;

public class Application {

	public static void main(String[] args) {
		Celsius c = new Celsius(20);

		System.out.println("Celsius");
		System.out.println(c.getCelsius() + " Celsius para Fahrenheit: " + c.celsiusToFahrenheit(c.getCelsius()));
		System.out.println(c.getCelsius() + " Celsius para Kelvin: " + c.celsiusToKelvin(c.getCelsius()));

		
		Fahrenheit f = new Fahrenheit(68);
		
		System.out.println("Fahrenheit");
		System.out.println(f.getFahrenheit() + " Fahrenheit para Celsius: " + f.fahrenheitToCelsius(f.getFahrenheit()));
		System.out.println(f.getFahrenheit() + " Fahrenheit para Kelvin: " + f.fahrenheitToKelvin(f.getFahrenheit()));
		
		Kelvin k = new Kelvin(293.15);

		System.out.println("Kelvin");
		System.out.println(k.getKelvin() + " Kelvin para Celsius: " + k.kelvinToCelsius(k.getKelvin()));
		System.out.println(k.getKelvin() + " Kelvin para Fahrenheit: " + k.kelvinToFahrenheit(k.getKelvin()));
	}

}
