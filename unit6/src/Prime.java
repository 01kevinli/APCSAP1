//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		setPrime(17);

	}

	public Prime(int num)
	{
	setPrime(num);	

	}

	public void setPrime(int num)
	{
		number = num;

	}

	public boolean isPrime()
	{
		int primetotal = 0;
		for (int i = 1; i<= number; i++) {
			if (number%i == 0) {
				primetotal++;
			}
		}
		if(primetotal == 2) {
			return true;
		}







		return false;
	}

	public String toString()
	{
		if(isPrime()) {
			return number + " is a prime number.";
		}







		return number + " is not a prime number.";
	}
}