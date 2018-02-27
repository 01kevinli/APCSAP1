//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
		getNumber();
		



	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
		toString();
		


	}

	public void setNumber(Integer num)
	{
		number = num;





	}

	public void setRoman(String rom)
	{
		roman = rom;


	} 

	public Integer getNumber()
	{
		int output = 0;
		for(int i = 0;i<LETTERS.length;i++) {
			if(roman.startsWith(LETTERS[i])) {
				output = output+NUMBERS[i];
				roman.replaceFirst(LETTERS[i], "");
			}
			
		}
		
		
		return output;
	}

	public String toString()
	{
		String output = "";
		
		while(number>=1000) {
			output = output+"M";
			number = number-1000;
		}
		while(number>=900) {
			output = output+"CM";
			number = number - 900;
		}
		while(number>=500) {
			output = output+"D";
			number = number-500;
		}
		while(number>=400) {
			output = output+"CD";
			number = number-400;
		}
		while(number>=100) {
			output = output+"C";
			number = number-100;
		}
		while(number>=90) {
			output = output+"XC";
			number = number -90;
		}
		while(number>=50) {
			output = output+"L";
			number = number - 50;
		}
		while(number>=10) {
			output = output+"X";
			number = number - 10;
		}
		while(number>=9) {
			output = output+"IX";
			number = number - 9;
		}
		while(number >=5) {
			output = output+"V";
			number = number -5;
		}
		while(number>=4) {
			output= output+"IV";
			number = number - 4;
		}
		while(number>=1) {
			output = output+"I";
			number = number -1 ;
		}	
		return output + "\n";
	}
}