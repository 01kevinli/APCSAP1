//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
			

	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	
	}

	public void setChar(char c)
	{
		theChar = c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if ((int)theChar >=65 && (int)theChar <= 90 ) {
			return true;
		}

		return false;
	}

	public boolean isLower( )
	{
		if((int)theChar >= 97 && (int)theChar <=122) {
			return true;
		}



		return false;
	}
	
	public boolean isNumber( )
	{
		if((int)theChar >= 48 && (int)theChar <=57) {
			return true;
		}



		return false;
	}	

	public int getASCII( )
	{
		return (int)theChar;
	}

	public String toString()
	{
		if(isUpper()) {
			return ""+getChar() + " is an Uppercase character. ASCII == " + getASCII() + "\n";
		}
		if(isLower()) {
			return ""+getChar() + " is an Lowercase character. ASCII == " + getASCII() + "\n";
		}

		if(isNumber()) {
			return ""+getChar() + " is a Number. ASCII == " + getASCII() + "\n";	  
		}
		return getChar() + "is not valid";
			
	}
}