//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private double random;
	private double percent;

	public GuessingGame(int upper)
	{
		upperBound = upper;
		

	}
	public GuessingGame()
	{
		upperBound = 0;
	}

	public int playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int answer;
		int guessnum = 1;
		double mysterynum = Math.floor(Math.random()*upperBound + 1);
		random = mysterynum;
		System.out.println("you're going to guess a number between 1 and " + upperBound+". Start Guessing!");
		answer = keyboard.nextInt();
		while(answer != mysterynum) {
			out.println("Nope! Guess again!");
			guessnum++;
			answer = keyboard.nextInt();
			
		}
		
		return guessnum;

	}

	public String toString()
	{
		String output="It took you "+playGame() + " tries to get "+random;
		return output;
	}
}