//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		celsius = (fahrenheit-32)*.5556;
		return celsius;
	}

	public void print()
	{
		System.out.println(fahrenheit + " Fahrenheit = "+getCelsius()+" Celsius");
	}
}