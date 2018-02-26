//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{

		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;


	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int gcf = 0;
		if(a >= b && a>= c) {
			max = a;
		}
		else if(b >= a && b >= c) {
			max = b;
		}
		else {
			max = c;
		}
		for(int i = 1;i<=max;i++) {
			if(a%i==0 && b%i == 0 && c%i ==0) {
				gcf = i;
			}
		}
		
		return gcf;
	}

	public String toString()
	{
		int a;
		int b;
		int c;
		
		String output = "";
		for (a = 1;a <= number;a++) {
			for(b = a;b<=number; b++) {
				for (c = b; c<=number;c++) {
					if(greatestCommonFactor(a,b,c)==1) {
						if(a*a + b*b == c*c) {
							output = output + a+" "+b+" "+c+"\n";
						}
					}
				
				}
			}
		}
		return output;
	}
}