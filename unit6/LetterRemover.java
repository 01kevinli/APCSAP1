//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	//add in second constructor
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		for (int i = 0;i<cleaned.length();i++) {
			if(cleaned.charAt(i) == lookFor) {
				clean.charAt(i) = "";
			}
		}





		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + " = "+ removeLetters();
	}
}