//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList <String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();


	}

	public MadLib(String fileName)
	{
		this();
		loadVerbs();
		loadNouns();
		loadAdjectives();
		
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()) {
				String test = file.next();
				if (test.equals("#")){
						out.println(getRandomNoun()+" ");
				}
				else if (test.equals("@")){
					out.print(getRandomVerb()+" ");
				}
				else if (test.equals("&")) {
					out.print(getRandomAdjective()+" ");
				}
				else {
					System.out.print(test +" ");
				}
				
			}
		
		
		
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
		Scanner Nounz = new Scanner(new File("C:/Users/kevinli/Downloads/Unit10-2016/Unit10-Assignments/Lab16d/nouns.dat"));
		while(Nounz.hasNext()) {
			nouns.add(Nounz.next());
		}
		
		
		
		}
		catch(Exception e)
		{
			out.println("woops... Error loading nouns!");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner Verbz = new Scanner(new File("/Users/kevinli/Downloads/Unit10-2016/Unit10-Assignments/Lab16d/verbs.dat"));
			while(Verbz.hasNext()) {
				verbs.add(Verbz.next());
			}
	
	
	
	
	
		}
		catch(Exception e)
		{
			out.println("LOLLLL error loading verbs!");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner Adjz = new Scanner(new File("/Users/kevinli/Downloads/Unit10-2016/Unit10-Assignments/Lab16d/adjectives.dat"));
			while(Adjz.hasNext()) {
				adjectives.add(Adjz.next());
			}
	
	
	
	
		}
		catch(Exception e)
		{
			out.println("error loading adjectives");
		}
	}

	public String getRandomVerb()
	{
		int random = (int)(Math.random()*(verbs.size()-1));
		String verb = verbs.get(random);
		return verb;
	}
	
	public String getRandomNoun()
	{
		int random = (int)(Math.random()*(nouns.size()-1));
		String noun = nouns.get(random);
		return noun;
	}
	
	public String getRandomAdjective()
	{
		int random = (int)(Math.random()*(adjectives.size()-1));
		String Adjectives = adjectives.get(random);
		return Adjectives;
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}