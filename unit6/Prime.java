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
		setPrime(24);

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
		int total = 0
		for(int i = 1; i<=number; i++) {
			if(number%1 ==0) {
				total++;
			}
		}
		if (total == 2) {
			return false;
		}







		return true;
	}

	public String toString()
	{
		if(isPrime()) {
			return number + " is not prime";
		}

		return number + "is prime";
	}
}