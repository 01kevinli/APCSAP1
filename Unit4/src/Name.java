//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;
	private String subFirst;
	private String subLast;
	public Name()
	{
		setName("John Doe");
		getFirst();
		getLast();
		toString();

	}

	public Name(String s)
	{
		setName(s);
		getFirst();
		getLast();
		toString();
		


	}

   public void setName(String s)
   {
	   name = s;

   }

	public String getFirst()
	{
		subFirst = name.substring(0,name.indexOf(" "));
		return subFirst;
	}
	public String getLast()
	{	
		subLast = name.substring(name.indexOf(" "));
		return subLast;
	}

 	public String toString()
 	{
 		return subFirst + subLast;
	}
}